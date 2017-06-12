
package generator;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Utility{
    
    protected static double range(ArrayList<Double> vals){
        return vals.stream().max((a, b) -> Double.compare(a, b)).get() - 
                vals.stream().min((a, b) -> Double.compare(a, b)).get();
    }
    
    protected static double average(ArrayList<Double> vals){
        return vals.stream().mapToDouble(d -> d).average().getAsDouble();
    }
    
}
