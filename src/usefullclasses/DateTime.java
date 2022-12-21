package usefullclasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.MINUTE));

        Date date = new Date();

        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy");

        System.out.println(ft.format(date));

        /*
        Pattern                             Example
        dd-MM-yy                            31-01-12
        dd-MM-yyyy	                        31-01-2012
        MM-dd-yyyy	                        01-31-2012
        yyyy-MM-dd	                        2012-01-31
        yyyy-MM-dd HH:mm:ss	                2012-01-31 23:59:59
        yyyy-MM-dd HH:mm:ss.SSS	            2012-01-31 23:59:59.999
        yyyy-MM-dd HH:mm:ss.SSSZ	        2012-01-31 23:59:59.999+0100
        EEEEE MMMMM yyyy HH:mm:ss.SSSZ	    Saturday November 2012 10:45:42.720+0100
        */
    }
}
