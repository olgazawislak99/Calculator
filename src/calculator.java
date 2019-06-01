import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.String.valueOf;


public class calculator {
    private JTextField results;
    private JTextField onp;
    private JButton ONPButton;
    private JButton equals;
    private JButton a7Button;
    private JButton leftbracket;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton rightbracket;
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

    String wyr = "";
    StringBuilder sb = new StringBuilder();


    public calculator() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a0Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a1Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a2Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a3Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a4Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a5Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a6Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a7Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a8Button.getText();
                char c = s.charAt(0);
                sb.append(c);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = a9Button.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });

        ONPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wyr = sb.toString();
                results.setText(wyr);
                String tekst = results.getText();
                ONP o = new ONP(tekst);

                String wyrazenie = o.toString();
                onp.setText(wyrazenie);
                double wynik = o.oblicz(wyrazenie);
                String wynik2 = valueOf(wynik);

            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = results.getText();
                ONP o = new ONP(tekst);
                o.toONP();
                String wyrazenie = o.toString();
                double wynik = o.oblicz(wyrazenie);
                String wynik2 = valueOf(wynik);
                onp.setText(wynik2);
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText("");
                onp.setText("");
            }
        });
        leftbracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = leftbracket.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        rightbracket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = rightbracket.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = plus.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = minus.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = times.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = divide.getText();
                char c = s.charAt(0);
                sb.append(c);
                if (onp.getText().length()<15) {
                    onp.setText(onp.getText() + "*");
                } else onp.setText("Za długie wyrażenie");
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
