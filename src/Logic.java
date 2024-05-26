
import javax.swing.*;
import java.awt.*;

public class Logic extends JFrame {


    private JLabel labelOperand1;
    private JLabel labelOperand2;
    public JLabel labelOperator;

    private JTextField fieldOperand1;
    private JTextField fieldOperand2;

    private JButton button;

    private String operator;

    public Logic(String title, String operator) {
        this.operator = operator;

        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        setSize(250, 125);
        setResizable(false);

        initComponents();

        add(labelOperand1);
        add(labelOperand2);
        add(fieldOperand1);
        add(labelOperator);
        add(fieldOperand2);
        add(button);

        setLocationRelativeTo(null);
        setVisible(true);
        System.out.println(" ");
    }

    public void initComponents() {

        labelOperand1 = new JLabel("1. Operand                  ");
        labelOperand2 = new JLabel("2.Operand         ");
        labelOperator = new JLabel(operator);

        fieldOperand1 = new JTextField(8);
        fieldOperand2 = new JTextField(8);

        button = new JButton("calculate");

        button.addActionListener(e -> {
            System.out.println("successfully calculated, next one please..");

            int op1 = Integer.parseInt(fieldOperand1.getText());
            int op2 = Integer.parseInt(fieldOperand2.getText());

            int result;

            if(operator.equals("+")) {
                result = op1 + op2;
            }
            else if(operator.equals("-")) {
                result = op1 - op2;
            }
            else if(operator.equals("*")) {
                result = op1 * op2;
            }
            else if(operator.equals("/")) {
                result = op1 / op2;
            }
            else{
                result = 666;
            }
            JOptionPane.showMessageDialog(Logic.this, "Result : " + result + " \n calculated ! ");
        });
    }
}
