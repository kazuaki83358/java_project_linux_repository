package JToggleButtonPack;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Application {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Toggle Button");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JToggleButton toggleButton = new JToggleButton("toggleButton");
                //ActionListener
                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        AbstractButton abstractButton = (AbstractButton)  actionEvent.getSource();
                        boolean selected = abstractButton.getModel().isSelected();
                        System.out.println("action - selected = "+ selected + "\n");
                    }
                };
                //ChangeListener
                ChangeListener changeListener = new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent changeEvent) {
                        AbstractButton abstractButton = (AbstractButton) changeEvent.getSource();
                        ButtonModel buttonModel = abstractButton.getModel();
                        boolean armed = buttonModel.isArmed();
                        boolean pressed = buttonModel.isPressed();
                        boolean selected = buttonModel.isSelected();
                        System.out.println("change" + armed + "/" + pressed + "/" + selected);
                    }
                };
                //ItemListener
                ItemListener itemListener = new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent itemEvent) {
                        int state = itemEvent.getStateChange();
                        if (state == ItemEvent.SELECTED){
                            System.out.println("Selected");
                        }else {
                            System.out.println("Deselected");
                        }
                    }
                };
                //TouchListener
                toggleButton.addActionListener(actionListener);
                toggleButton.addChangeListener(changeListener);
                toggleButton.addItemListener(itemListener);
                frame.add(toggleButton,BorderLayout.NORTH);
                frame.setSize(300,125);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
