package focusPack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Application {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Sample Focus");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ActionListener actionListener = new ActionFocus();
                MouseListener mouseListener = new MouseFocus();
                frame.setLayout(new GridLayout(3,3));
                for (int i = 1 ; i<=10;i++){
                    JButton button = new JButton(Integer.toString(i));
                    button.addActionListener(actionListener);
                    button.addMouseListener(mouseListener);
                    if ((i%2)!=0){
                        button.setFocusable(false);
                    }
                    frame.add(button);
                }
                frame.setSize(300,200);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
