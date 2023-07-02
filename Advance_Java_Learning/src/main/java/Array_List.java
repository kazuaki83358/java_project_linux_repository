import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        int [] num = {2,4,6,8,10};
        //Array list is part of Advance java collection
        ArrayList<Integer> AL = new ArrayList<>();
        for (int i : num){
            AL.add(i);
            System.out.println(i);
        }
        AL.add(45);
        System.out.println(AL);
    }
}
