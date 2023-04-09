import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton rules , back ;
    JTextField tfname;
    Login(){
        //setting frame colour
        getContentPane().setBackground(Color.cyan);
        setLayout(null);

        //adding images
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image= new JLabel(i1);
      //  image.setSize(1200,1200);
        image.setBounds(0,0,600,470);
        add(image);

        //adding text
        JLabel heading = new JLabel("SCIENCE QUIZ");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font( "",Font.BOLD,40));
        heading.setForeground(Color.black);
        add(heading);

        JLabel name = new JLabel("Enter Your Name :- ");
        name.setBounds(810,150,300,25);
        name.setFont(new Font( "",Font.BOLD,20));
        name.setForeground(Color.BLACK);
        add(name);

        // adding input fields to be filled
        tfname= new JTextField();
        tfname.setBounds(750,200,300,25);
        tfname.setFont(new Font("",Font.BOLD,20));
        add(tfname);

        //adding buttons
        rules = new JButton("RULES");
        rules.setBounds(750,270,120,30);
        rules.setBackground(Color.green);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("BACK");
        back.setBounds(925,270,120,30);
        back.setBackground(Color.red);
        back.addActionListener(this);
        add(back);

        //setting frame
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    //overriding all the unimplemented methods of action listener
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if (ae.getSource()==back){
            setVisible(false);
        }
    }
    public static  void main(String[] args){
        new Login();
    }
}
