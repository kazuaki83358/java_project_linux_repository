import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patern2_compile_practice {
    public static void main(String[] args) {
        //create regex string
        String REGEX = "brave";
        //create a string in which you want to search
        String Search = "cat is cute";
        //compile in patter
        Pattern pattern = Pattern.compile(REGEX);
        //let's check REGEX sting found in search
       boolean matches = pattern.matcher(Search).matches();
        System.out.println("REGEX "+"Search String = "+matches);
    }

}
