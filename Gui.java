import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
class Gui{
	public static void main(String args[]){
		Frame frame = new Frame("Log In / Sign up Window");
		Label l1 = new Label("Enter your email",Label.CENTER);
		Label l2 = new Label("Enter your password",Label.CENTER);
		Label l3 = new Label("",Label.CENTER);
		TextField t1 = new TextField(30);
		TextField t2 = new TextField(30);
		TextField l4 = new TextField(20);
		Button b1 = new Button("Log in");
		Button b2 = new Button("Sign Up");
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		l1.setBounds(70,80,120,60);
		l2.setBounds(80,120,120,60);
		t1.setBounds(280,100,90,20);
		t2.setBounds(280,140,90,20);
		b1.setBounds(180,200,150,60);
		frame.add(b1);
		b2.setBounds(180,280,150,90);
		frame.add(b2);
		frame.add(l3);
		frame.add(l4);
		l4.setBounds(200,140,150,20);  
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setLayout(null);
		
		b1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            l4.setText("Successfully logged in!!!");  
        }  
    });  
		frame.add(l4);
	}
}