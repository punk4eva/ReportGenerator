
package generator;

import java.util.ArrayList;

/**
 *
 * @author Adam
 * 
 * 
 * This class stores static methods for use in the other classes.
 */
public class Utility{
    
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
    
}
