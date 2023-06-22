package abstractAction;
import javax.swing.*;
import java.awt.event.*;
//here is the PrintHelloAction class which extends AbstractAction class
public class PrintHelloAction extends AbstractAction {
    //there is constructor with super key word
    PrintHelloAction(){
        super("Print");
        // here we're putting value ActionSHortDescription
        putValue(Action.SHORT_DESCRIPTION,"Hello World");
    }
    // here is one override method from abstractAction which take actionEvent e and print helloWorld
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello World");
    }
}
