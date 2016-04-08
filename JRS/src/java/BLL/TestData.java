/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.IOException;
import static java.lang.System.out;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Romesh
 */
public class TestData {

    public static void main(String[] args) throws IOException {

        MLPCal.trainNet();
        String[] userData = "Software Engineer Intern,none,none,none,none,none,none,BSc (Hons) Software Engineering,none,OOP,JavaScript,Java,C#,.NET,CSS,none,none,none,none,none,none,none,none,none,none,none,".split(",");
        List<Double> results = MLPCal.suggestClass(userData);

        if (results.get(0).doubleValue() > 0.5) {
            out.println("Software Engineer");
        } else if (results.get(1).doubleValue() > 0.5) {
            out.println("Senior Software Engineer");
        } else if (results.get(2).doubleValue() > 0.5) {
            out.println("Project Manager");
        } else if (results.get(3).doubleValue() > 0.5) {
            out.println("Project Manager");
        } else {
            out.println("None");
        }
    }
}
