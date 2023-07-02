import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> AD = new ArrayDeque<>();
        int [] num = {2,4,6,8,10};
        for (int i : num){
            AD.add(i);
            System.out.println(i);
        }
        AD.addFirst(45);
        System.out.println(AD);
        System.out.println(AD.getFirst());
        System.out.println(AD.getLast());
    }
}
