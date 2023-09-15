import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class VendingMachine extends JFrame {
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel mainWin;
    private JLabel result;

    public VendingMachine() {
    setContentPane(mainWin);
    setTitle("Vendo");
    setSize(400,400);
    setVisible(true);
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
//            System.out.println("button is clicked");
            addTwoNumbers();
        }
    });

        textField1.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                addTwoNumbers();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
                addTwoNumbers();
            }
        });
        textField2.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                addTwoNumbers();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
                addTwoNumbers();
            }
        });
    }
void addTwoNumbers() {
    int a = Integer.parseInt(textField1.getText());
    int b = Integer.parseInt(textField2.getText());
    int sum = a+b;
    result.setText("the sum of two numbers is "+sum);
}
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
    }
}
