package generator;

import java.util.ArrayList;

/**
 * @author Adam
 * 
 *  
 * This class is for holding statistics of the tests.
 */
public class Stats{

	
    //Basic statistics for the test including the full set of results.
    protected double range;
    protected double average;
    protected double top, mid, bad;
    protected ArrayList<Double> results;
    
    /**
     * @param marks The results for the test.
     */
    public Stats(ArrayList<Double> marks){
        results = marks;
	range = Utility.range(marks);
	average = Utility.average(marks);
	top = Utility.top(marks);
	mid = Utility.mid(marks);
	bad = Utility.bad(marks);
    }
	
}
