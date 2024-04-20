package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;;

public class AboutUs extends JFrame implements ActionListener {

	JPanel contentPane;
    JButton backButton, exitButton;

        public static void main(String[] args) {
            new AboutUs();			
	}
    
        public AboutUs() {
            
            // f.setBackground(Color.white);
            // f.setLayout(null);
            super("About Us");
            // f=new JFrame("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(350, 150, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/AboutUs.png"));
            Image i2 = i1.getImage().getScaledInstance(i1.getIconWidth(), i1.getIconHeight(),Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Software Personnel");
            l3.setForeground(new Color(0, 0, 255));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
            l3.setBounds(100, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(0, 0, 255));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 28));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            /*JLabel l5 = new JLabel("v5.1");
            l5.setForeground(new Color(255, 0, 0));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);*/


            JLabel l6 = new JLabel("Developed By : RAMPRASATH, SALIESH & SANTHOSH");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Reg NO: [53 , 57, 59]");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            // JLabel l8 = new JLabel("Contact : www.spcevng.ac.in ");
            // l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            // l8.setBounds(70, 290, 600, 34);
            // contentPane.add(l8);

            JLabel l9 = new JLabel("Education: B.Tech (IT) @ AAMEC");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);

            backButton=new JButton(" BACK ");
            backButton.setBounds(420,350,100,40);
            backButton.setFont(new Font("serif",Font.BOLD,15));
            backButton.addActionListener((ActionListener) this);
            contentPane.add(backButton);

            exitButton=new JButton(" EXIT ");
            exitButton.setBounds(530,350,100,40);
            exitButton.setFont(new Font("serif",Font.BOLD,15));
            exitButton.addActionListener(this);
            exitButton.setForeground(Color.red);
            contentPane.add(exitButton);


            // JLabel l10 = new JLabel("Phone - +91 0000000000");
            // l10.setForeground(new Color(47, 79, 79));
            // l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            // l10.setBounds(70, 400, 600, 34);
            // contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==backButton){
            contentPane.setVisible(false);
            new Home();
        }  
        
        if(ae.getSource()==exitButton){
            contentPane.setVisible(false);
            System.exit(0);
        }
    }
}
