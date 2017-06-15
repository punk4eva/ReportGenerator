
package generator;

import java.util.ArrayList;
import static generator.Generator.TOPPERCENTILE;
import static generator.Generator.MIDPERCENTILE;
import static generator.Generator.BADPERCENTILE;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Adam
 * 
 * 
 * This class stores static methods for use in the other classes.
 */
public class Utility{
    
    
    protected static Random r;
    protected interface Sort{
        boolean select(StudentEntry student);
    }
            
    
    /**
     * @param vals The ArrayList to find the range of.
     * @since Java 1.8
     * @return The range of values passed into the method.
     */
    protected static double range(ArrayList<Double> vals){
        return vals.stream().max((a, b) -> Double.compare(a, b)).get() - 
                vals.stream().min((a, b) -> Double.compare(a, b)).get();
    }
    
    /**
     * @param vals The ArrayList to find the range of.
     * @since Java 1.8
     * @return The average of values passed into the method.
     */
    protected static double average(ArrayList<Double> vals){
        return vals.stream().mapToDouble(d -> d).average().getAsDouble();
    }
    
    /**
     * @param vals The ArrayList of marks.
     * @return The minimum mark required to get to the top grade.
     */
    protected static double top(ArrayList<Double> vals){
        Collections.sort(vals);
        return vals.get((int)Math.round(((double) vals.size()) * (1.0 - TOPPERCENTILE)))+0.1;
    }
    
    /**
     * @param vals The ArrayList of marks.
     * @return The minimum mark required to get to the mid grade.
     */
    protected static double mid(ArrayList<Double> vals){
        Collections.sort(vals);
        return vals.get((int)Math.round(((double) vals.size()) * (1.0 - MIDPERCENTILE)))+0.1;
    }
    
    /**
     * @param vals The ArrayList of marks.
     * @return The minimum mark required to get to the bad grade.
     */
    protected static double bad(ArrayList<Double> vals){
        Collections.sort(vals);
        return vals.get((int)Math.round(((double) vals.size()) * (1.0 - BADPERCENTILE)))+0.1;
    }
    
    /**
     * @param s Lower bound for the random integer.
     * @param f Upper bound for the random integer.
     * @return A random integer between given integers s and f (inclusive).
     */
    protected static int rand(int s, int f){
        return r.nextInt(1 + f - s) + s;
    }
    
    /**
     * @param f Upper bound for the random integer.
     * @return A random integer between 0 (inclusive) and the given value 
     * (exclusive).
     */
    protected static int rand(int f){
        return r.nextInt(f);
    }
    
    protected static void displayAll(){
        
    }
    
}
