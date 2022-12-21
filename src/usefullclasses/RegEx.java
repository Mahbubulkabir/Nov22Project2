package usefullclasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

        //text@text.text
        String email = "my_name12@gmail.com";
        String pattern = "^[A-Za-z0-9+_.-]{8,25}@[A-Za-z0-9+_-]+\\.[A-Za-z]{2,4}$";
        //nnn-nn-nnnn
        String ssn = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);

        System.out.println(m.matches());

    }
}
