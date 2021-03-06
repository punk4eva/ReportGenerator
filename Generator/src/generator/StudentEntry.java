package generator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Adam
 * 
 * 
 * This class stores the names of students, their test scores and their reports.
 */
public class StudentEntry{
    
	
    //Basic student data.
    protected String name;
    protected double[] scores;
    protected String report;
    protected Double[] mark = new Double[5];
    
    /**
     * @param nm The name of the student.
     * @param scrs The list of scores that the student got.
     */
    public StudentEntry(String nm, double[] scrs){
        name = nm;
        scores = scrs;
    }
    
    /**
     * @param a The name of the student.
     * @param b The score the student got for their first test. 
     * @param c The score the student got for their second test. 
     * @param d The score the student got for their third test. 
     * @param e The score the student got for their fourth test. 
     * @param f The score the student got for their fifth test. 
     */
    public StudentEntry(String a, String b, String c, String d, String e, 
            String f){
        name = a;
        scores = new double[5];
        scores[0] = Double.parseDouble(b);
        scores[1] = Double.parseDouble(c);
        scores[2] = Double.parseDouble(d);
        scores[3] = Double.parseDouble(e);
        scores[4] = Double.parseDouble(f);
    }
    
    /**
     * @param rep The new report that the student has.
     */
    protected void setReport(String rep){
        report = rep;
    }
    
    /**
     * Prints the student's data.
     */
    protected void print(){
        System.out.println(name + ":\n\tResults: ");
        for(int n=0;n<scores.length-1;n++) System.out.print(scores[n]+", ");
        System.out.print(scores[scores.length-1]+"\n\t"+report+"\n\tFinal mark: "
                + Utility.average(new ArrayList<>(Arrays.asList(mark))));
    }
    
}
