import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class pattern_syntax_checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TestCase = in.nextInt();
        in.nextLine();
        for (int i=0;i<TestCase;i++) {
            String patter = in.nextLine();
            try {
                Pattern.compile(patter);
                System.out.println("Valid");
            }catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
