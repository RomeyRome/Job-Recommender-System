package BLL;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LinkedInData {

    public static final String MY_PAGE = "https://www.linkedin.com/in/isuru-jayasooriya-b3055b84";

    public static void main(String[] args) throws IOException {
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
}
