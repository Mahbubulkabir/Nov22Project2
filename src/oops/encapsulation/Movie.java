package oops.encapsulation;

public class Movie {

    //data hiding
    private String rate;
    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //getter
    public String getRate(){
        return rate;
    }

    //setter
    public void setRate(String rate){
        this.rate = rate;
    }

}
