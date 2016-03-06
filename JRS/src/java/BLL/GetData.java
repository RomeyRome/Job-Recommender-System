/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Thushani
 */
public class GetData extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("url");
        String MY_PAGE = name;

        Document doc = Jsoup.connect(MY_PAGE).get();

        Elements elem = doc.select(".profile-section h3");

        for (Iterator<Element> iterator1 = elem.iterator(); iterator1.hasNext();) {
            Element element1 = iterator1.next();
            if (element1.text().equals("Experience")) // your comparison  text
            {
                Element tableElement1 = element1.parent(); //Your got the expected table Element as per your requirement

                System.out.println(tableElement1.text() + "\n");
            }
        }

        for (Iterator<Element> iterator2 = elem.iterator(); iterator2.hasNext();) {
            Element element2 = iterator2.next();
            if (element2.text().equals("Education")) // your comparison  text
            {
                Element tableElement2 = element2.parent(); //Your got the expected table Element as per your requirement

                System.out.println(tableElement2.text() + "\n");
            }
        }

        for (Iterator<Element> iterator3 = elem.iterator(); iterator3.hasNext();) {
            Element element3 = iterator3.next();
            if (element3.text().equals("Skills")) // your comparison  text
            {
                Element tableElement3 = element3.parent(); //Your got the expected table Element as per your requirement

                System.out.println(tableElement3.text() + "\n");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
