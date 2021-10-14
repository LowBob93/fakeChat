import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        setTitle("Chinese WhatsUp");
        setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        setBounds(400, 400, 620, 600);
        JPanel mainPanel = new JPanel();
        add(mainPanel);
        setLayout(null);

        //Type text field
        JTextArea typeTextField = new JTextArea();
        typeTextField.setBounds(50, 400, 500, 100);
        add(typeTextField);

        //Print text field
        JTextArea printTextField = new JTextArea();
        printTextField.setBounds(50, 20, 500, 350);
        printTextField.setDisabledTextColor(Color.black);
        printTextField.disable();
        add(printTextField);

        //Send text button
        JButton sendButton = new JButton("Отправить");
        sendButton.setBackground(Color.orange);
        sendButton.setBounds(430, 510, 120, 35);
        add(sendButton);
        setVisible(true);


        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = typeTextField.getText();
                String gt = printTextField.getText();
                String al = text + "\n" + gt;
                if (gt.isEmpty()) {
                    printTextField.setText("Вы написали : " + text);
                } else {
                    printTextField.setText("Вы написали : " + al);
                }
            }


        });


    }


}

