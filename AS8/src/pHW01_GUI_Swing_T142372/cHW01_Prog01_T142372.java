package pHW01_GUI_Swing_T142372;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//234234234
import javax.swing.*;
public class cHW01_Prog01_T142372 extends JFrame {
	//Create Component
	public static JPanel ak = new JPanel(new BorderLayout());
	public static JLabel label1 = new JLabel();
	public static JLabel label2 = new JLabel();
	public static JTextField tefi1 = new JTextField();
	public static JTextField tefi2 = new JTextField();
	public static JButton bu = new JButton();
	
	//Resolution issue
	public static int[] BoundChecker(){
		cHW01_Prog01_T142372 check = new cHW01_Prog01_T142372();
		// Default set container
		check.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		check.setVisible(true);
		check.setBounds(750, 250, 250, 300);
		Container pan = check.getContentPane();
		pan.getSize().
		check.setTitle("Adjustment");
		check.add(bu);
		bu.setText("Please Wait !!! Checking relosution.");
		
		//label.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		try { 
			Thread.sleep(1000); //1000 milliseconds is one second. 
		} 
		catch(InterruptedException ex) { 
			Thread.currentThread().interrupt(); 
		}
		int he = bu.getHeight();
		int wi = bu.getWidth();
		System.out.println(he+wi);
		bu.setText("All done press here to continue.");
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				check.dispose();
				// Create new top-level container
				cHW01_Prog01_T142372 myapp = new cHW01_Prog01_T142372();
				// Default set container
				myapp.setDefaultCloseOperation(EXIT_ON_CLOSE);
				myapp.setVisible(true);
				myapp.setBounds(750, 250, 250, 300);
				myapp.setTitle("T142372 - Form");
				myapp.setLayout(null);
			
				// Add component
				myapp.add(label1);
				myapp.add(label2);
				myapp.add(tefi1);
				myapp.add(tefi2);
				// Set Bound
				label1.setBounds(20, 10, wi-10-20, 20);
				label1.setText("Username");
				tefi1.setBounds(20,10+20,wi-10-20,20);
			}
		});
		return new int[] {wi,he};
	}
	//Main Class
	public static void main(String Args[]){
		
		/* Create new top-level container
		cHW01_Prog01_T142372 myapp = new cHW01_Prog01_T142372();
		// Default set container
		myapp.setDefaultCloseOperation(EXIT_ON_CLOSE);
		myapp.setVisible(true);
		myapp.setBounds(750, 250, 250, 300);
		myapp.setTitle("T142372 - Form");
		myapp.setLayout(null);
		// Add component
		myapp.add(label);
		*/// resolution issue function return
		int[] reis = BoundChecker();
		System.out.println(reis[0]+" "+reis[1]);
		// Component ID and Note
	}
}