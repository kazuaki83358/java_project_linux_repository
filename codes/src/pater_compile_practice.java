import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pater_compile_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create a regex string
        System.out.println("type a string that you want search");
        String REGEX = scanner.nextLine();
        //create a string in which you want to search
        System.out.println("type a string in which you want to search previous string");
        String search = scanner.nextLine();
        //compile the regex to create pattern
        //using compile method
        Pattern pattern = Pattern.compile(REGEX);
        //get a matcher object from pattern
        Matcher matcher = pattern.matcher(search);
        //check whether regex string is found in search or not
        boolean matches = matcher.matches();
        System.out.println("search "+"contain REGEX ="+matches);

    }
}
