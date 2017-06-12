
package generator;

/**
 *
 * @author Adam
 */
public class StudentEntry{
    
    protected String name;
    protected double[] scores;
    
    public StudentEntry(String nm, double[] scrs){
        name = nm;
        scores = scrs;
    }
    
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
    
}
