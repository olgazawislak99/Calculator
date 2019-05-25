import javax.swing.*;

public class calculator {
    private JTextField results;
    private JTextField textField1;
    private JButton ONPButton;
    private JButton button5;
    private JButton a7Button;
    private JButton button6;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button11;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton CEButton;
    private JPanel CalculatorView;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new calculator().CalculatorView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
