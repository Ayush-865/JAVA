import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Hello implements ActionListener{
	JFrame f;
	JLabel l1, l2, l3, l4,l5;
	JTextField t1;
	JRadioButton r1, r2;
	JCheckBox c1,c2,c3;
	JComboBox cb1;
	JTextArea a1, a2;
	JButton b1, b2;
	ButtonGroup g1;
	String[] fav={"Mumbai", "Goa", "Hyderabad", "Banglore", "Silicon Valley", "Gudgaon"};	
	Hello(){
		f=new JFrame();
		l1=new JLabel("Name: ");
		l2=new JLabel("Gemder: ");
		l3=new JLabel("Interest: ");
		l4=new JLabel("Place: ");
		l5=new JLabel("Details: ");
		t1=new JTextField(10);
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		g1=new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		c1=new JCheckBox("Music");
		c2=new JCheckBox("Gaming");
		c3=new JCheckBox("Studying");
		a1=new JTextArea(20,20);
		a2=new JTextArea(20,20);
		cb1=new JComboBox(fav);
		b1=new JButton("SUBMIT");
		b2=new JButton("EXIT");
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(r1);
		f.add(r2);
		f.add(l3);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(l4);
		f.add(cb1);
		f.add(l5);
		f.add(a1);
		f.add(b1);
		f.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(200,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		String salutation;
		String[] interest = new String[3];
		if(e.getSource()==b1){
			String name=t1.getText();
			String details = a1.getText();
			if(r1.isSelected()==true){
				salutation="Mr. ";
			}
			else{
				salutation="Ms. ";
			}

			if(c1.isSelected()==true){
				interest[0]="Music, ";
			}
			else if(c2.isSelected()==true){
				interest[1]="Gaming, ";
			}
			else if(c3.isSelected()==true){
				interest[2]="Reading, ";
			}
			
			String place = (String)cb1.getSelectedItem();
			
			a2.setText("Name:"+salutation+name+"\nInterest: "+interest[0]+interest[1]+interest[2]+"\nFav Place:"+place+"\n Details: "+details);
		}
		else if(e.getSource()==b2){
			f.dispose();
		}
	}

}
class C5{
	public static void main(String[] args){
		Hello h = new Hello();
	}
}