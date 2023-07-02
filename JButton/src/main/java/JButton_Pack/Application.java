package JButton_Pack;
import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Default Button");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(2,2,10,10));
                JButton button = new JButton("Text Button");
                frame.add(button);
                String htmButton = "<html><sup>HTML</sup> <sub><em>Button</em></sub><br>"
                        + "<font color=\"#FF0080\"><u>Multi-line</u></font>";
                JButton button1 = new JButton(htmButton);
                frame.add(button1);
                JRootPane rootPane = frame.getRootPane();
                frame.setSize(500,500);
                frame.setResizable(false);
                frame.setVisible(true);

            }
        };
        EventQueue.invokeLater(runner);
    }
}
