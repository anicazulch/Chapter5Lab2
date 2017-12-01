
public class Probability implements ProbabilityCalc, Comparable<Probability>
{
    // instance variables - replace the example below with your own
    private int favorable;
    private int sampleSpace;
    private double prob;
    
    public Probability(int fav, int sample){
        this.favorable = fav;
        this.sampleSpace = sample;
        prob = ((double)favorable)/sampleSpace;
    }
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 AND p2) = p1 * p2
     */
    public double probabilityAND(Probability p2){
        return this.prob * p2.prob;
    }
   
    /**
     * This uses the current Probability object (this) and a second Probability object
     * to calculate P(p1 OR p2) = p1 + p2 - (p1 AND p2)  where p1 AND p2 is the "overlap"
     */
    public double probabilityOR(Probability p2, double overlap){
        return this.prob + p2.prob - overlap; 
    }
    public int compareTo(Probability other){
        if(this.prob > other.prob){
            return 1;
        }
        else if (this.prob < other.prob){
            return -1;
        }
        else{
            return 0;
        }
    }
}

