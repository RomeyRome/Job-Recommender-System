package BLL;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Romesh
 */
public class LinkedinDataHandler {

    private static final int experienceCount = 7;
    private static final int educationCount = 2;
    private static final int skillsCount = 17;
    public static String [] getResults(String link) throws IOException {

        int totalDataCount = experienceCount+educationCount+skillsCount;
        String[] userData = new String[totalDataCount];
        Document doc = Jsoup.connect(link).get();
        Elements elem = doc.select(".profile-section h3");
        Elements formElements = doc.select(".profile-section");
        
        String[] exDetails = getExperience(formElements, experienceCount); 
        
        for(int index=0;index<experienceCount;index++){
            userData[index] = exDetails[index];
        }
        
        String[] eduList = getEducation(formElements, educationCount);
        for(int index=0;index<educationCount;index++){
            userData[index+experienceCount] = eduList[index];        
        }
        
        String[] skillList = getSkills(formElements, skillsCount);
        for(int index=0;index<skillsCount;index++){
            userData[index+experienceCount+educationCount] = skillList[index];        
        }
        
        return userData;

    }

    public static String[] getExperience(Elements formElements, int itemCount) {
        List<String> tempExList = new ArrayList<>();
        String[] expList = new String[itemCount];
        Arrays.fill(expList, "none");
        for (Element element : formElements) {
            Elements formChildren = element.select("h3");
            for (Element pElement : formChildren) {
                if (pElement.text().equals("Experience")) {
                    Element exInformation = pElement.parent();
                    Elements exTitles = exInformation.select("h4.item-title");
                    if (exTitles.size() > 0) {
                        for (int itemIndex = 0;
                                itemIndex < itemCount && itemIndex < exTitles.size();
                                itemIndex++) {
                            expList[itemIndex] = exTitles.get(itemIndex).text();
                        }
                    }
                }
            }
        }
        return expList;
    }

    public static String[] getSkills(Elements formElements, int itemCount) {
        String[] skillList = new String[itemCount];
        Arrays.fill(skillList, "none");
        for (Element element : formElements) {
            Elements formChildren = element.select("h3");
            for (Element pElement : formChildren) {
                if (pElement.text().equals("Skills")) {
                    Element skillInformation = pElement.parent();
                    Elements skillTitles = skillInformation.select("li.skill > a");
                    if (skillTitles.size() > 0) {
                        for (int itemIndex = 0;
                                itemIndex < itemCount && itemIndex < skillTitles.size();
                                itemIndex++) {
                            skillList[itemIndex] = skillTitles.get(itemIndex).text();
                        }
                    }
                }
            }
        }
        return skillList;
    }

    public static String[] getEducation(Elements formElements, int itemCount) {
        String[] eduList = new String[itemCount];
        Arrays.fill(eduList, "none");
        for (Element element : formElements) {
            Elements formChildren = element.select("h3");
            for (Element pElement : formChildren) {
                if (pElement.text().equals("Education")) {
                    Element eduInformation = pElement.parent();
                    Elements eduTitles = eduInformation.select("h5.item-subtitle");
                    if (eduTitles.size() > 0) {
                        for (int itemIndex = 0;
                                itemIndex < itemCount && itemIndex < eduTitles.size();
                                itemIndex++) {
                            eduList[itemIndex] = eduTitles.get(itemIndex).text();
                        }
                    }
                }
            }
        }
        return eduList;
    }

    

//    public static void main(String[] args) throws IOException {
//        
//        
//        NN.trainNet();
//        String[] userData = "Software Engineer Intern,none,none,none,none,none,none,BSc (Hons) Software Engineering,none,OOP,JavaScript,Java,C#,.NET,CSS,none,none,none,none,none,none,none,none,none,none,none,".split(",");
//        List<Double> results = NN.suggestClass(userData);
//        
//        for(double d: results){
//            System.out.println(d);
//        }
//        
////        Document doc = Jsoup.connect(MY_PAGE).get();
////
////        Elements elem = doc.select(".profile-section h3");
////
////        Elements formElements = doc.select(".profile-section");
////
////        for (Element formElem11 : formElements) {
////            Elements formChildren1 = formElem11.select("h3");
////
////            for (Element formElem1 : formChildren1) {
////                if (formElem1.text().equals("Experience")) {
////                    Element data = formElem1.parent();
////                    Elements formChildren = data.select("h4.item-title");
////                    System.out.println(formChildren.size());
////                    
////                    for(int exIndex =0; exIndex<formChildren.size();exIndex++){
////                        System.out.println(formChildren.get(exIndex).text());
////                    }
////                    
////                }
////            }
////        }
////
////        for (Element formElem22 : formElements) {
////            Elements formChildren2 = formElem22.select("h3");
////
////            for (Element formElem2 : formChildren2) {
////                if (formElem2.text().equals("Education")) {
////                    Element data = formElem2.parent();
////                    Elements formChildren = data.select("h5.item-subtitle");
////                    System.out.println(formChildren.size());
////                    
////                    for(int exIndex =0; exIndex<formChildren.size();exIndex++){
////                        System.out.println(formChildren.get(exIndex).text());
////                    }
////                }
////            }
////        }
////
////        for (Element formElem22 : formElements) {
////            Elements formChildren2 = formElem22.select("h3");
////
////            for (Element formElem2 : formChildren2) {
////                if (formElem2.text().equals("Skills")) {
////                    Element data = formElem2.parent();
////                    Elements formChildren = data.select("li.skill > a");
////                    System.out.println(formChildren.size());
////                    
////                    for(int exIndex =0; exIndex<formChildren.size();exIndex++){
////                        System.out.println(formChildren.get(exIndex).text());
////                    }
////                }
////            }
////        }
//
//    }
}
