package oops.inheritance;

public class Father extends GrandFather{
    int height;
    String name;

    Father(int height){
        this.height = height;
    }
    public void education(){
        System.out.println("has bachelor's degree");
    }
}
