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
	protected double top, mid, bad, worse;
	protected ArrayList<Double> results;
	
	public Stats(ArrayList<Double> marks){
		results = marks;
		range = Utility.range(marks);
		average = Utility.average(marks);
		top = Generator.top(marks);
		mid = Generator.mid(marks);
		bad = Generator.bad(marks);
		worse = Generator.worse(marks);
	}
	
}
