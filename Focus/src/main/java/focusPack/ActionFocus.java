package focusPack;

import java.awt.*;
import java.awt.event.*;
public class ActionFocus implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.focusNextComponent();
        
    }
}
