import java.util.Scanner;

public class String_Token {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        String [] tokens = str.split("[!,?._'@]+");
        System.out.println(tokens.length);
        for (String token:tokens) {
            System.out.println(token);
        }
    }
}
