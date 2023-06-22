package abstractAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ActionTester {
    public static void main(String[] args) {
        //here we make runnable object
        Runnable runner = new Runnable() {
            // here we override the method run
            @Override
            public void run() {
                //here we create jFrame object with title
                JFrame frame = new JFrame("Abstraction Action Practice");
                //here we set size of jFrame exitOnClose
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // here is action with final keyWord and define as PrintAction for PrintHelloAction class
                final Action PrintAction = new PrintHelloAction();
                //here we make object for jMenuBar
                JMenuBar menuBar = new JMenuBar();
                // here we create object for JMenu wit string code 1
                JMenu menu = new JMenu("Code 1");
                //her we add menu in menu bar
                menuBar.add(menu);
                menu.add(new JMenuItem(PrintAction));
                JToolBar toolBar = new JToolBar();
                toolBar.add(new JButton(PrintAction));
                JButton enableButton = new JButton("Enable");
                ActionListener enableActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        PrintAction.setEnabled(true);
                    }
                };
                enableButton.addActionListener(enableActionListener);
                JButton disableButton = new JButton("Disable");
                ActionListener disableActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        PrintAction.setEnabled(false);
                    }
                };
                disableButton.addActionListener(disableActionListener);
                JButton relabelButton = new JButton("Change Label");
                ActionListener relabelActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        PrintAction.putValue(Action.NAME,"Label Changed");
                    }
                };
                relabelButton.addActionListener(relabelActionListener);
                JPanel buttonPanel = new JPanel();
                buttonPanel.add(enableButton);
                buttonPanel.add(disableButton);
                buttonPanel.add(relabelButton);
                frame.setJMenuBar(menuBar);
                frame.add(toolBar, BorderLayout.SOUTH);
                frame.add(buttonPanel, BorderLayout.NORTH);
                frame.setSize(300, 150);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}