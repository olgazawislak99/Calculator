import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.lang.String.valueOf;


public class calculator {
    private JTextField results;
    private JTextField onp;
    private JButton ONPButton;
    private JButton equals;
    private JButton a7Button;
    private JButton leftBracket;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton rightBracket;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton divide;
    private JButton times;
    private JButton plus;
    private JButton minus;
    private JButton CEButton;
    private JPanel CalculatorView;



    private calculator() {
        a0Button.addActionListener(new WriteEquationActionListener(a0Button,results));
        a1Button.addActionListener(new WriteEquationActionListener(a1Button,results));
        a2Button.addActionListener(new WriteEquationActionListener(a2Button,results));
        a3Button.addActionListener(new WriteEquationActionListener(a3Button,results));
        a4Button.addActionListener(new WriteEquationActionListener(a4Button,results));
        a5Button.addActionListener(new WriteEquationActionListener(a5Button,results));
        a6Button.addActionListener(new WriteEquationActionListener(a6Button,results));
        a7Button.addActionListener(new WriteEquationActionListener(a7Button,results));
        a8Button.addActionListener(new WriteEquationActionListener(a8Button,results));
        a9Button.addActionListener(new WriteEquationActionListener(a9Button,results));
        rightBracket.addActionListener(new WriteEquationActionListener(rightBracket,results));
        leftBracket.addActionListener(new WriteEquationActionListener(leftBracket,results));
        plus.addActionListener(new WriteEquationActionListener(plus,results));
        minus.addActionListener(new WriteEquationActionListener(minus,results));
        times.addActionListener(new WriteEquationActionListener(times,results));
        divide.addActionListener(new WriteEquationActionListener(divide,results));

        Action onp_cal = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = results.getText();
                ONP o = new ONP(tekst);
                String wyrazenie = o.toString();
                onp.setText(wyrazenie);
                double wynik = o.oblicz(wyrazenie);
                String wynik2 = valueOf(wynik);

            }
        };

        Action equals_cal = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = results.getText();
                ONP o = new ONP(tekst);
                String wyrazenie = o.toString();
                try {
                    double wynik = o.oblicz(wyrazenie);
                    String wynik2 = valueOf(wynik);
                    onp.setText(wynik2);
                }
                catch (ArithmeticException ae){
                    results.setText("ERROR");
                }



            }
        };
        Action ce_cal = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText("");
                onp.setText("");

            }
        };

        ONPButton.addActionListener(onp_cal);
        equals.addActionListener(equals_cal);
        ONPButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0, false),"enter");
        ONPButton.getActionMap().put("enter", onp_cal);
        ONPButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0, true),"rEnter");
        ONPButton.getActionMap().put("rEnter", equals_cal);
        ONPButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE,0, true),"backspace");
        ONPButton.getActionMap().put("backspace", ce_cal);

        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText("");
                onp.setText("");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new calculator().CalculatorView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
