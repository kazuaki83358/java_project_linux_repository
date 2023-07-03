package JRadioButtonPack;
import javax.swing.*;
import java.awt.*;
public class Application {
    private static final String numberOfItems[] = {"2 Items","4 Items","6 Items", "8 Items"};
    private static final String foodType[] = {"samosa","french fries","momo","pizza"};

    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Item Grouping");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Container itemContainer = JRadioUntilClass.createRadioButtonGrouping(numberOfItems,"Items Count");
                Container foodContainer = JRadioUntilClass.createRadioButtonGrouping(foodType,"food types");
                frame.add(itemContainer,BorderLayout.WEST);
                frame.add(foodContainer,BorderLayout.EAST);
                frame.setSize(300,200);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
