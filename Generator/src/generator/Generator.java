
package generator;

import java.util.ArrayList;

/**
 *
 * @author Adam
 * but my real name is obviously "Adam'); DROP TABLE Students;".
 * 
 * 
 * This class is the main executable class.
 */
public class Generator{
    
    
    //Averages and ranges for each test.
    protected static double rng1, avg1, rng2, avg2, rng3, avg3, rng4, avg4, rng5, avg5;
    //The comments for each performance level
    //Use <s> for the name of the student.
    protected static String[] comment1 = new String[] {"<s>'s recent perfomance has been very disappointing. They should start revising basic material or expect the worst grades.", "<s>'s grades have fallen harder than Bran Stark."/**If you actually say this I'll give you money*/, "If java was magic, <s> would be a muggle at Hogwarts.", "https://xkcd.com/1513/", "https://xkcd.com/1695/", "https://xkcd.com/1833/", "<s> is worse at computing than Green Lantern is at being a movie."};
    protected static String[] comment2 = new String[] {"", "", "", "", ""};
    protected static String[] comment3 = new String[] {"", "", "", "", ""};
    protected static String[] comment4 = new String[] {"", "", "", "", ""};
    protected static String[] comment5 = new String[] {"<s> is good.", "", "", "", ""};
    //The array of students and their test scores.
    protected static StudentEntry[] students;

    
    /**
     * @param str The comma-separated String inputted from Excel.
     * @return The array of Student profiles. The method also sets the averages
     * and ranges for each of the tests.
     */
    protected static StudentEntry[] interpret(String str){
        String[] l = str.split(str);
        ArrayList<StudentEntry> ret = new ArrayList<>();
        ArrayList<Double> s1 = new ArrayList<>(),
                s2 = new ArrayList<>(),
                s3 = new ArrayList<>(),
                s4 = new ArrayList<>(),
                s5 = new ArrayList<>();
        for(int n=0;n<l.length;n+=6){
            StudentEntry st = new StudentEntry(l[n], l[n+1], l[n+2], l[n+3], 
                    l[n+4], l[n+5]);
            ret.add(st);
            s1.add(st.scores[0]);
            s2.add(st.scores[1]);
            s3.add(st.scores[2]);
            s4.add(st.scores[3]);
            s5.add(st.scores[4]);
        }
        rng1 = Utility.range(s1);
        avg1 = Utility.average(s1);
        rng2 = Utility.range(s2);
        avg2 = Utility.average(s2);
        rng3 = Utility.range(s3);
        avg3 = Utility.average(s3);
        rng4 = Utility.range(s4);
        avg4 = Utility.average(s4);
        rng5 = Utility.range(s5);
        avg5 = Utility.average(s5);
        return ret.toArray(new StudentEntry[ret.size()]);
    }
    
    /**
     * @param args The command line arguments. The first one is the 
     * comma-separated String that contains the data.
     */
    public static void main(String[] args){
        students = interpret(args[0]);
    }
    
}
