import java.util.Scanner;

public class Main {
    public static String longprefix(String [] str){
        if (str==null&&str.length==0){
            return "";
        }
        String prifix = str[0];
        for (int i=1;i< str.length;i++) {
            while (str[i].indexOf(prifix)!=0){
                prifix = prifix.substring(0,prifix.length()-1);
                if (prifix.isEmpty()){
                    return "";
                }
            }
        }
        return prifix;
    }
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("Enter number of string");
        int num = nr.nextInt();
        nr.next();
        String [] str = new String[num];
        for (int i=0;i<num;i++) {
            System.out.println("enter string "+(i+1)+":");
            str [i] = nr.next();
        }
        String result = longprefix(str);
        System.out.println("the longest string is: "+result);
    }
}