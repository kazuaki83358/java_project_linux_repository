package JRadioButtonPack;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class JRadioUntilClass {
   private JRadioUntilClass(){

   }
    public static Container createRadioButtonGrouping(String elements[],String title){
        JPanel panel = new JPanel(new GridLayout(0,1));
        if (title != null){
            Border border = BorderFactory.createTitledBorder(title);
            panel.setBorder(border);
        }
        //Create group
        ButtonGroup group = new ButtonGroup();
        JRadioButton aRadioButton;

        for (int i = 0 , n = elements.length;i<n;i++){
            aRadioButton = new JRadioButton(elements[i]);
            panel.add(aRadioButton);
            group.add(aRadioButton);
        }
        return panel;
    }
}
