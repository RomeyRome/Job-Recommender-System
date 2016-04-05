package BLL;

import java.util.ArrayList;

import weka.core.Instance;
import weka.core.Instances;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.List;
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.classifiers.functions.MultilayerPerceptron;

public class MLPCal {

    private static String trainDataPath = "C:\\Users\\Romesh\\Documents\\NetBeansProjects\\JRS 0.3\\data\\trainSet.arff";
    private static String testDataPath = "data/arff/small.arff";
    private static String dataSetTemplate = "C:\\Users\\Romesh\\Documents\\NetBeansProjects\\JRS 0.3\\data\\template.arff";

    private static MultilayerPerceptron nN;

    private static Instances trainSet;
    private static Instances testSet;
    private static Instances template;
    private static boolean trained = false;
    private static boolean tested = false;

    static List<Double> suggestClass(String userData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private MLPCal() {
    }

    //Train the neural netowrk
    public static void trainNet() {
        System.out.println("Starting training....");
        try {
            loadTrainData();
            nN = new MultilayerPerceptron();
            nN.buildClassifier(trainSet);
            System.out.println("Training Completed....");
            trained = true;

        } catch (IOException e) {
            System.err.println("Train file missing....");
            System.err.println(e.toString());
        } catch (Exception e) {
            System.err.println(e.toString());
        }

    }

    //Test the nbeural network
    private static int[] testNet() {
        System.out.println("Starting testing....");
        int[] results = new int[2];
        if (!trained) {
            System.out.println("Neural netowrk is not trained....");
        } else {
            try {
                loadTestData();
                Evaluation tempEvaluator = new Evaluation(testSet);
                tempEvaluator.evaluateModel(nN, testSet);

                results[0] = (int) tempEvaluator.correct();
                results[1] = (int) tempEvaluator.incorrect();
                tested = true;
                System.out.println("Test completed....");

            } catch (IOException e) {
                System.err.println("Test file missing....!");
                System.out.println(e.toString());
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
        return results;
    }

    public static ArrayList<Double> suggestClass(String[] instanceData) {

        ArrayList<Double> predictions = new ArrayList<>();
        if (!trained) {
            System.err.println("Neural netowrk is not trained....");
        } else {
            Instance temp = toInstance(instanceData);
            try {
                temp.setClassValue(nN.classifyInstance(temp));
                for (double d : nN.distributionForInstance(temp)) {
                    predictions.add(d);
                }
                predictions.add(temp.classValue());
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }
        return predictions;
    }

    private static Instance toInstance(String[] instanceData) {
        
        try {
            loadDataTemplate();
            Instance tempInstance = new Instance(template.numAttributes());
            tempInstance.setDataset(template);
            for (int index = 0; index < instanceData.length; index++) {
                try{
                    tempInstance.setValue(index, instanceData[index]);
                }catch(Exception e){
                    tempInstance.setValue(index, "none");
                }
            }
            System.out.println("Done");
            template.add(tempInstance);
        } catch (Exception e) {
            System.err.println("METHSANAA");
            System.err.println(e.toString());
        }
        return template.lastInstance();
    }

    private static void loadDataTemplate() throws IOException {
        //Loading the training data arff
        BufferedReader tempReader
                = new BufferedReader(new FileReader(dataSetTemplate));
        //Converting data in to instances
        template = new Instances(tempReader);
        //Class is last attribute in arff file type
        template.setClassIndex(template.numAttributes() - 1);
    }

    private static void loadTrainData() throws IOException {
        //Loading the training data arff
        BufferedReader tempReader
                = new BufferedReader(new FileReader(trainDataPath));
        //Converting data in to instances
        trainSet = new Instances(tempReader);
        //Class is last attribute in arff file type
        trainSet.setClassIndex(trainSet.numAttributes() - 1);
    }

    private static void loadTestData() throws IOException {
        //Loading the training data arff
        BufferedReader tempReader
                = new BufferedReader(new FileReader(testDataPath));
        //Converting data in to instances
        testSet = new Instances(tempReader);
        //Class is last attribute in arff file type
        testSet.setClassIndex(testSet.numAttributes() - 1);
    }

    public static boolean isTrained() {
        return trained;
    }

    public static boolean isTested() {
        return tested;
    }
}
