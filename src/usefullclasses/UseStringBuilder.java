package usefullclasses;

public class UseStringBuilder {
    public static void main(String[] args) {

        String str = "hello";
        StringBuffer buffer = new StringBuffer(str);
        //buffer.append(" java");

        System.out.println(buffer);

        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        System.out.println(builder);
    }
}
