/**
 * 
 */
package pHW02_Calculator_T144231;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author Minh Le(144231)
 *
 */
public class cHW02_Calculator_T144231 extends JFrame {
	//setup cac thanh phan
		JTextField t1 = new JTextField();
		JButton MC = new JButton("MC"), Mplus = new JButton("M+"),
				Msub = new JButton("M-"), Mr = new JButton("MR"),
				AC = new JButton("AC"), CE = new JButton("CE"),
				plusub = new JButton("+/-"), div = new JButton("/"),
				mul = new JButton("*"), sub = new JButton("-"),
				plus = new JButton("+"), bdot = new JButton("."),
				eq = new JButton("="), b1 = new JButton("1"),
				b2 = new JButton("2"), b3 = new JButton("3"),
				b4 = new JButton("4"), b5 = new JButton("5"),
				b6 = new JButton("6"), b7 = new JButton("7"),
				b8 = new JButton("8"), b9 = new JButton("9"),
				b0 = new JButton("0"), b00 = new JButton("00");
		//cac bien ket qua va bo nho
		double n1=0,result=0,mem=0;
		// cac key dung trong chuong trinh
		int first =1; //key cho phep tinh dau tien
		int key=0; //key danh cho phep tinh moi se tu set ve man rong
		//key cho option nut
		int opt=2;
		//key cho danh dau cac phep toan tu
		/* 0- khong thuc thi
		 * 1- cong
		 * 2- tru
		 * 3- nhan
		 * 4- chia
		 */
		int opera1 =0, opera2 =0;
		//cong thuc cho phep cong
		void plus()
		  {
		      if(first==0)
		            result=result+n1;
		          String stmp=String.valueOf(result);
		          t1.setText(stmp);
		          opt=2;
		          if(opera2!=0)
		          {
		              opera1=opera2;
		              opera2=0;
		          }
		          first=0;
		  }
		//cong thuc cho phep tru
		void sub()
		  {
		      if(first==0)
		          result=result-n1;
		      String stmp=String.valueOf(result);
		      t1.setText(stmp);
		      opt=2;
		      if(opera2!=0)
		        opera1=opera2;
		      first=0;
		  }
		//cong thuc cho phep nhan
		  void mul()
		  {
		      if(first==0)
		          result=result*n1;
		      String stmp=String.valueOf(result);
		      t1.setText(stmp);
		      opt=2;
		      if(opera2!=0)
		        opera1=opera2;
		      first=0;
		  }
		//lenh cho phep chia
		  void div()
		  {
		      if(first==0)
		      {
		          if(n1==0)
		              t1.setText("khong chia duoc cho 0");
		          else
		              result=result/n1;
		      }
		      String stmp=String.valueOf(result);
		      t1.setText(stmp);
		      opt=2;
		      if(opera2!=0)
		        opera1=opera2;
		      first=0;
		  }
		public cHW02_Calculator_T144231(){
			setTitle("My calculator-T144231");
			// set size
			setSize(235, 300);
			// set layout
			setLayout(null);
			// them cac compoment
			add(t1);
			add(b0);
			add(b00);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			add(b7);
			add(b8);
			add(b9);
			add(AC);
			add(Mr);
			add(Mplus);
			add(Msub);
			add(MC);
			add(bdot);
			add(plus);
			add(sub);
			add(mul);
			add(div);
			add(eq);
			add(AC);
			add(CE);
			add(plusub);
			//set vi tri cac button
			t1.setBounds(10, 10, 200, 24);
			t1.setEditable(false);
			Insets insbutton = new Insets(1, 1, 1, 1);
			MC.setBounds(10, 48, 37, 37);
			MC.setMargin(insbutton);
			Mplus.setBounds(50, 48, 37, 37);
			Mplus.setMargin(insbutton);
			Msub.setBounds(90, 48, 37, 37);
			Msub.setMargin(insbutton);
			Mr.setBounds(130, 48, 37, 37);
			Mr.setMargin(insbutton);
			AC.setBounds(170, 48, 37, 37);
			AC.setMargin(insbutton);
			Mr.setMargin(insbutton);
			b7.setBounds(10, 88, 37, 37);
			b7.setMargin(insbutton);
			b8.setBounds(50, 88, 37, 37);
			b8.setMargin(insbutton);
			b9.setBounds(90, 88, 37, 37);
			b9.setMargin(insbutton);
			plusub.setBounds(130, 88, 37, 37);
			plusub.setMargin(insbutton);
			CE.setBounds(170, 88, 37, 37);
			CE.setMargin(insbutton);
			b4.setBounds(10, 128, 37, 37);
			b4.setMargin(insbutton);
			b5.setBounds(50, 128, 37, 37);
			b5.setMargin(insbutton);
			b6.setBounds(90, 128, 37, 37);
			b6.setMargin(insbutton);
			mul.setBounds(130, 128, 37, 37);
			mul.setMargin(insbutton);
			div.setBounds(170, 128, 37, 37);
			div.setMargin(insbutton);
			b1.setBounds(10, 168, 37, 37);
			b1.setMargin(insbutton);
			b2.setBounds(50, 168, 37, 37);
			b2.setMargin(insbutton);
			b3.setBounds(90, 168, 37, 37);
			b3.setMargin(insbutton);
			plus.setBounds(130, 168, 37, 77);
			plus.setMargin(insbutton);
			sub.setBounds(170, 168, 37, 37);
			sub.setMargin(insbutton);
			b0.setBounds(10, 208, 37, 37);
			b0.setMargin(insbutton);
			b00.setBounds(50, 208, 37, 37);
			b00.setMargin(insbutton);
			bdot.setBounds(90, 208, 37, 37);
			eq.setBounds(170, 208, 37, 37);
			eq.setMargin(insbutton);
			t1.setHorizontalAlignment(JTextField.RIGHT);
			
			ActionListener button = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent ev) {
					// TODO Auto-generated method stub
					String stmp;
					//key cho phep tinh moi
					if(key==1){
						result=0;
				          first=1;
				          opt=2;
				          t1.setText("");
				          key=0;
					}
					//nut cong
					if(ev.getSource()==plus){
						if(first==1){
							result=Double.parseDouble(t1.getText());
							opera1=1;
						}else{
							n1=Double.parseDouble(t1.getText());
							opera2=1;
						}
						switch(opera1){
						case 1:plus();
						break;
						case 2:sub();
						break;
						case 3:mul();
						break;
						case 4:div();
						break;
						}
					}
					//nut tru
					else if(ev.getSource()==sub){
						if(first==1){
							result=Double.parseDouble(t1.getText());
							opera1=2;
						}else{
							n1=Double.parseDouble(t1.getText());
							opera2=2;
						}
						switch(opera1){
						case 1:plus();
						break;
						case 2:sub();
						break;
						case 3:mul();
						break;
						case 4:div();
						break;
						}
					}
					//nut nhan
					else if(ev.getSource()==mul){
						if(first==1){
							result=Double.parseDouble(t1.getText());
							opera1=3;
						}else{
							n1=Double.parseDouble(t1.getText());
							opera2=3;
						}
						switch(opera1){
						case 1:plus();
						break;
						case 2:sub();
						break;
						case 3:mul();
						break;
						case 4:div();
						break;
						}
					}
					//nut chia
					else if(ev.getSource()==div){
						if(first==1){
							result=Double.parseDouble(t1.getText());
							opera1=4;
						}else{
							n1=Double.parseDouble(t1.getText());
							opera2=4;
						}
						switch(opera1){
						case 1:plus();
						break;
						case 2:sub();
						break;
						case 3:mul();
						break;
						case 4:div();
						break;
						}
					}
					//nut =
					else if(ev.getSource()==eq){
						double n1=Double.parseDouble(t1.getText());
			              if(opera1==1)
			                  result=result+n1;
			              else if(opera1==2)
			                  result=result-n1;
			              else if(opera1==3)
			                  result=result*n1;
			              else if(opera1==4)
			                  result=result/n1;
			              else
			                  result=Double.parseDouble(t1.getText());
			              stmp=String.valueOf(result);
			              t1.setText(stmp);
			              key=1;
					}
					//nut M+
					else if(ev.getSource()==Mplus){
						mem+=Double.parseDouble(t1.getText());
					}
					//nut MC
					else if(ev.getSource()==MC)
				      {
				          mem=0;
				          t1.setText("");
				      }
					//nut Mr
					else if(ev.getSource()==Mr)
				      {
				          stmp=String.valueOf(mem);
				          t1.setText(stmp);
				      }
					//nut +\-
					else if(ev.getSource()==plusub)
				      {
				          double n1=Double.parseDouble(t1.getText());
				          n1=-n1;
				          stmp=String.valueOf(n1);
				          t1.setText(stmp);
				      }
					//nut 0
					else if(ev.getSource()==b0)
				      {
				          if(opt==1)
				              stmp=String.valueOf(t1.getText())+0;
				          else
				              stmp=String.valueOf(" ")+0;
				          opt=1;
				                  t1.setText(stmp);  
				          
				      }
					//nut 1
				      else if(ev.getSource()==b1)
				      {
				          if(opt==1)
				              stmp=String.valueOf(t1.getText())+1;
				          else
				              stmp=String.valueOf(" ")+1;
				          opt=1;
				          t1.setText(stmp);
				           
				      }
				    //nut 2
				      else if(ev.getSource()==b2)
				      {
				          if(opt==1)
				             stmp=String.valueOf(t1.getText())+2;
				          else
				              stmp=String.valueOf(" ")+2;
				          opt=1;
				          t1.setText(stmp);
				      }
				    //nut 3
				      else if(ev.getSource()==b3)
				      {
				          if(opt==1)
				             stmp=String.valueOf(t1.getText())+3;
				          else
				             stmp=String.valueOf(" ")+3;
				          opt=1;
				          t1.setText(stmp);
				      }
				    //nut 4
				      else if(ev.getSource()==b4)
				      {
				          if(opt==1)
				             stmp=String.valueOf(t1.getText())+4;
				          else
				             stmp=String.valueOf(" ")+4;
				          opt=1;
				          t1.setText(stmp);
				      }
				    //nut 5
				      else if(ev.getSource()==b5)
				      {
				          if(opt==1)
				            stmp=String.valueOf(t1.getText())+5;
				          else
				            stmp=String.valueOf(" ")+5;
				          opt=1;
				          t1.setText(stmp);
				      }
				    //nut 6
				      else if(ev.getSource()==b6)
				      {
				          if(opt==1)
				            stmp=String.valueOf(t1.getText())+6;
				          else
				            stmp=String.valueOf(" ")+6;
				          opt=1;
				          t1.setText(stmp);
				      }
				    //nut 7
				      else if(ev.getSource()==b7)
				      {
				          if(opt==1)
				            stmp=String.valueOf(t1.getText())+7;
				          else
				            stmp=String.valueOf(" ")+7;
				          opt=1;
				          t1.setText(stmp);
				      }
				    //nut 8
				      else if(ev.getSource()==b8)
				      {
				          if(opt==1)
				             stmp=String.valueOf(t1.getText())+8;
				          else
				             stmp=String.valueOf(" ")+8;
				          opt=1;
				          t1.setText(stmp);
				      }
				    //nut 9
				      else if(ev.getSource()==b9)
				      {
				          if(opt==1)
				             stmp=String.valueOf(t1.getText())+9;
				          else
				             stmp=String.valueOf(" ")+9;
				          opt=1;
				          t1.setText(stmp);
				      }
					//nut CE
				      else if(ev.getSource()==CE)
				      {
				          result=0;
				          first=1;
				          opt=2;
				          stmp=String.valueOf("");
				          t1.setText(stmp);
				           
				      }
				    //nut AC
				      else if(ev.getSource()==AC)
				      {
				          result=0;
				          mem=0;
				          first=1;
				          opt=2;
				          t1.setText("");			           
				      }
				    //nut bam cham
				      else if(ev.getSource()==bdot)
				      {
				          stmp=String.valueOf(t1.getText())+".";
				          t1.setText(stmp);
				      }
					//nut 00
				      else if(ev.getSource()==b00)
				      {
				          if(opt==1)
				             stmp=String.valueOf(t1.getText())+00;
				          else
				             stmp=String.valueOf(" ")+00;
				          opt=1;
				          t1.setText(stmp);
				      }
				}
			};
			//them action cho cac button
			b0.addActionListener(button);
			b00.addActionListener(button);
			b1.addActionListener(button);
			b2.addActionListener(button);
			b3.addActionListener(button);
			b4.addActionListener(button);
			b5.addActionListener(button);
			b6.addActionListener(button);
			b7.addActionListener(button);
			b8.addActionListener(button);
			b9.addActionListener(button);
			plus.addActionListener(button);
			sub.addActionListener(button);
			mul.addActionListener(button);
			div.addActionListener(button);
			AC.addActionListener(button);
			CE.addActionListener(button);
			plusub.addActionListener(button);
			bdot.addActionListener(button);
			Mr.addActionListener(button);
			MC.addActionListener(button);
			Mplus.addActionListener(button);
			Msub.addActionListener(button);
			eq.addActionListener(button);
			
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW02_Calculator_T144231 wMain = new cHW02_Calculator_T144231();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}

}
