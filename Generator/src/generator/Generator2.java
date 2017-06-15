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
    
    
    //Statistics for each test.
    protected static Stats stat1, stat2, stat3, stat4, stat5;
    //The percentiles to give each grade to. Works cumulatively, i.e: MIDPERCENTILE = 0.7 as everyone in the top 70% gets 1 or 2 as a mark.
    protected static final double TOPPERCENTILE = 0.2, MIDPERCENTILE = TOPPERCENTILE + 0.5, BADPERCENTILE = MIDPERCENTILE + 0.2, WORSEPERCENTILE = 1;
    //The comments for each performance level
    //Use <s> for the name of the student. 
    protected static String[] comment1 = new String[] {"<s>'s recent perfomance has been very disappointing. They should start revising basic material or expect the worst grades.", "<s>'s grades have fallen harder than Bran Stark."/**If you actually say this I'll give you money*/, "If java was magic, <s> would be a muggle at Hogwarts.", "https://xkcd.com/1513/", "https://xkcd.com/1695/", "https://xkcd.com/1833/", "<s> is worse at computing than Green Lantern is at being a movie."};
    protected static String[] comment2 = new String[] {"", "", "", "", ""};
    protected static String[] comment3 = new String[] {"", "", "", "", ""};
    protected static String[] comment4 = new String[] {"<s> is good.", "", "", "", ""};
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
        stat1 = new Stats(s1);
        stat2 = new Stats(s2);
        stat3 = new Stats(s3);
        stat4 = new Stats(s4);
        stat5 = new Stats(s5);
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
