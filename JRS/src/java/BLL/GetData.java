package BLL;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Romesh
 */
public class GetData {

    public static final String MY_PAGE = "https://www.linkedin.com/in/romeyroma";

    public static void main(String[] args) throws IOException {
        
        
        NN.trainNet();
        String[] userData = "Software Engineer Intern,none,none,none,none,none,none,BSc (Hons) Software Engineering,none,OOP,JavaScript,Java,C#,.NET,CSS,none,none,none,none,none,none,none,none,none,none,none,".split(",");
        List<Double> results = NN.suggestClass(userData);
        
        for(double d: results){
            System.out.println(d);
        }
        
//        Document doc = Jsoup.connect(MY_PAGE).get();
//
//        Elements elem = doc.select(".profile-section h3");
//
//        Elements formElements = doc.select(".profile-section");
//        List<String> UData = new ArrayList<String>();
//
//        for (Element formElem11 : formElements) {
//            Elements formChildren1 = formElem11.select("h3");
//
//            for (Element formElem1 : formChildren1) {
//                if (formElem1.text().equals("Experience")) {
//                    Element data = formElem1.parent();
//                    Elements formChildren = data.select("h4.item-title");
//
//                    int y = 7 - formChildren.size();
//
//                    if (formChildren.size() >= 7) {
//                        for (int exIndex = 0; exIndex < 7; exIndex++) {
//
//                            //System.out.print(formChildren.get(exIndex).text()+",");
//                            UData.add(formChildren.get(exIndex).text() + ",");
//                        }
//                    } else {
//
//                        for (int x = y; x > 0; x--) {
//
//                            if (x == y) {
//                                for (int exIndex = 0; exIndex < formChildren.size(); exIndex++) {
//
//                                    // System.out.print(formChildren.get(exIndex).text()+",");
//                                    UData.add(formChildren.get(exIndex).text() + ",");
//                                }
//                            }
//                            String data1 = "None";
//                            // System.out.print(data1+","); 
//                            UData.add(data1 + ",");
//                        }
//
//                    }
//
//                } else if (formElem1.text().equals("Languages")) {
//                    System.out.print("None,None,None,None,None,None,None");//UData.add("None,"); 
//                }
//
//            }
//        }
//
//        for (Element formElem22 : formElements) {
//            Elements formChildren2 = formElem22.select("h3");
//
//            for (Element formElem2 : formChildren2) {
//                if (formElem2.text().equals("Education")) {
//                    Element data = formElem2.parent();
//                    Elements formChildren = data.select("h5.item-subtitle");
//
//                    int y = 2 - formChildren.size();
//                    if (formChildren.size() >= 2) {
//                        for (int exIndex = 0; exIndex < 2; exIndex++) {
//
//                            // System.out.print(formChildren.get(exIndex).text()+",");
//                            if (!formChildren.get(exIndex).text().equals("")) {
//                                UData.add(formChildren.get(exIndex).text() + ",");
//                            } else {
//                                UData.add("None,");
//                            }
//                        }
//                    } else {
//
//                        for (int x = y; x > 0; x--) {
//
//                            if (x == y) {
//                                for (int exIndex = 0; exIndex < formChildren.size(); exIndex++) {
//
//                                    //System.out.print(formChildren.get(exIndex).text()+",");
//                                    UData.add(formChildren.get(exIndex).text() + ",");
//                                }
//                            }
//                            String data1 = "None";
//                            //  System.out.print(data1+","); 
//                            UData.add(data1 + ",");
//                        }
//
//                    }
//
//                }
//            }
//        }
//
//        for (Element formElem22 : formElements) {
//            Elements formChildren2 = formElem22.select("h3");
//
//            for (Element formElem2 : formChildren2) {
//                if (formElem2.text().equals("Skills")) {
//                    Element data = formElem2.parent();
//                    Elements formChildren = data.select("li.skill > a");
//
//                    int y = 17 - formChildren.size();
//
//                    if (formChildren.size() >= 17) {
//                        for (int exIndex = 0; exIndex < 17; exIndex++) {
//
//                            // System.out.print(formChildren.get(exIndex).text()+",");
//                            UData.add(formChildren.get(exIndex).text() + ",");
//                        }
//                    } else {
//
//                        for (int x = y; x > 0; x--) {
//
//                            if (x == y) {
//                                for (int exIndex = 0; exIndex < formChildren.size(); exIndex++) {
//
//                                    //System.out.print(formChildren.get(exIndex).text()+",");
//                                    UData.add(formChildren.get(exIndex).text() + ",");
//                                }
//                            }
//                            String data1 = "None";
//                            //System.out.print(data1+","); 
//                            UData.add(data1 + ",");
//                        }
//
//                    }
//                }
//            }
//        }
//
//        for (String d : UData) {
//            System.out.print(d);
//        }
    }

}
