package oops.inheritance;

public class Son extends Father{
    //Son class cannot inherit from both Father and Mother classes
    //java doesn't support multiple inheritance
    Son(){
        super(6);
    }

    public void higherEducation(){
        super.name = "jack";
        super.education();
    }
}
