import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WriteEquationActionListener implements ActionListener {
    public JButton but;
    public JTextField tex;

    public WriteEquationActionListener(JButton but, JTextField tex){
        this.but=but;
        this.tex=tex;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = but.getText();
        if (tex.getText().length()<50) {
            tex.setText(tex.getText() + s);
        } else tex.setText("Za długie wyrażenie");
    }
}
