package CheckBoxPack;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Application {
    private static final String DESELECTED_LABEL = "Deselected";
    private static final String SELECTED_LABEL = "Selected";
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Selected CheckBox");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JCheckBox checkBox = new JCheckBox(DESELECTED_LABEL);

                //ActionListener
                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                        boolean selected = abstractButton.getModel().isSelected();
                        String newLabel = (selected ? SELECTED_LABEL : DESELECTED_LABEL);
                        abstractButton.setText(newLabel);
                    }
                };
                //changeListener
                ChangeListener changeListener = new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent changeEvent) {
                        AbstractButton abstractButton = (AbstractButton) changeEvent.getSource();
                        ButtonModel buttonModel = abstractButton.getModel();
                        boolean armed = buttonModel.isArmed();
                        boolean pressed = buttonModel.isPressed();
                        boolean selected = buttonModel.isSelected();
                        System.out.println("changed " + armed + "/" + pressed + "/" + selected);

                    }
                };
                //itemListener
                ItemListener itemListener = new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent itemEvent) {
                        AbstractButton abstractButton = (AbstractButton) itemEvent.getSource();
                        Color foreground = abstractButton.getForeground();
                        Color background = abstractButton.getBackground();
                        int state = itemEvent.getStateChange();
                        if (state == ItemEvent.SELECTED){
                             abstractButton.setForeground(background);
                             abstractButton.setBackground(foreground);
                        }
                    }
                };
                //AttachListener
                checkBox.addActionListener(actionListener);
                checkBox.addChangeListener(changeListener);
                checkBox.addItemListener(itemListener);
                checkBox.setMnemonic(KeyEvent.VK_C);
                frame.add(checkBox,BorderLayout.NORTH);
                frame.setResizable(false);
                frame.setSize(300,100);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
