import java.util.Date;

public class Date_TIme {
    public static void main(String[] args) {
        //this mile second save in long data type in java
        //these all methods are deprecated
        System.out.println("number of mile second since 1970");
        System.out.println(System.currentTimeMillis());
        System.out.println("max value of long is ");
        System.out.println(Long.MAX_VALUE);
        System.out.println("current date and time");
        Date date = new Date();
        System.out.println(date);
    }
}
