import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



	class loginFrame extends JFrame implements ActionListener {
	    
	    //variables
	    Container c;
	    JLabel label1, label2, label;
	    JTextField user;
	    JPasswordField pass;
	    JButton btn;
	  
	    
	   loginFrame() {              
	       setTitle("NHU International Airlines");
	       getContentPane().setBackground(new Color(0x0096FF));
	       setSize(600,600);
	       setLocation(100,100);
	       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        
	       setDefaultCloseOperation(EXIT_ON_CLOSE);
	       
	       
	       
	       c=getContentPane();
	       c.setLayout(null);
	       ImageIcon image = new ImageIcon("Plane.png");
	       
	       
	       String imagePath  = "F:\\Hamiz\\Nazeer Hussain University\\OOP'S\\NHU International Airlines\\NHU Airlines\\src\\Plane.png";
	         JLabel labely = new JLabel(new ImageIcon(imagePath) );
	         labely.setHorizontalAlignment(SwingConstants.CENTER); 
	         labely.setBounds(170,50,300,230); 
	         
	         
	         
	         
	         
	         
	         
	         
	       label1 = new JLabel("Username");
	       label2 = new JLabel("Password");
	       
	       label1.setBounds(160,280,100,20); 
	       label2.setBounds(160,330,100,20);
	       label1.setFont(new Font("Boiling Demo Black",Font.PLAIN,15));
	        label2.setFont(new Font("Boiling Demo Black",Font.PLAIN,15));
	        label1.setForeground(Color.BLACK);
	        label2.setForeground(Color.BLACK);
	      
	    
	       
	       
	       c.add(labely);
	       c.add(label1);
	       c.add(label2);
	    
	       user = new JTextField();
	       user.setBounds(260,280,180,30);
	       c.add(user);
	       
	       pass = new JPasswordField();
	       pass.setBounds(260,330,180,30);
	       c.add(pass);
	       
	       btn = new JButton("Login");
	       btn.setBounds(280,400,80,30);
	       btn.setForeground(Color.white);
	       btn.setBackground(Color.black);
	       c.add(btn);
	       btn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	detailsFrame frame = new detailsFrame();
	            	 frame.setVisible(true);
	               
	            	 
	            }
	        });
	       
	       setVisible(true);
	   }
	   
	   public void actionPerformed(ActionEvent e) {
		  
	   }
	}

	public class LoginPage {
	    public static void main(String[] args) {
	       loginFrame frame = new loginFrame();
	    }
	}
	
	
	
	


