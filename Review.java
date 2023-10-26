package DentsOasis;

public class Review
{
    private Dentist dentist;
    private String feedback;
    private int rate;
    
    public Review() {
    	
    }
    public Review(Dentist dentist, int rate, String feedback)
    {
        this.dentist = dentist;
        this.rate = rate;
        this.setFeedback(feedback);
    }
    
    public Dentist getDentist(){
        return dentist; 
    }
    public void setDentist(Dentist dentist)
    {
        this.dentist = dentist;
    }
    public int getRate(){
        return rate;
    }
    public void setRate(int rate)
    {
        this.rate = rate;
    }
    public String getFeedback()
    {
        return feedback;
    }
    public void setFeedback(String feedback)
    {
        this.feedback = feedback;
    }
}
