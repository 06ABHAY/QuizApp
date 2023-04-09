import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton back , start;
    String name;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);

        JLabel heading = new JLabel("WELCOME "+ name +" TO SCIENCE QUIZ.");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font( "",Font.BOLD,20));
        heading.setForeground(Color.blue);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font( "",Font.PLAIN,16));
        rules.setText(
                "<html>"+
                        "1. You have ten question to solve." + "<br><br>" +
                        "2. Do not try to cheat ." + "<br><br>" +
                        "3. You have only fifteen second for each question." + "<br><br>" +
                        "4. Click next to move to next question." + "<br><br>" +
                        "5. Once you move to next question there is no way to back." + "<br><br>" +
                        "6. Do not use any type of electronic gadget." + "<br><br>" +
                        "7. Answer your question responsibly." + "<br><br>" +
                        "8. Give your exam in a calm area, Good Luck." + "<br><br>" +
                        "<html>"
        );
        add(rules);

        back = new JButton("BACK");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.RED);
        back.addActionListener(this);
        add(back);

        start = new JButton("START");
        start.setBounds(400,500,100,30);
        start.setBackground(Color.GREEN);
        start.addActionListener(this);
        add(start);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);

        }else if (ae.getSource()==back){
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args){
        new Rules("USER");
    }
}
