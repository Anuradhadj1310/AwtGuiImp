package packageAwt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridArrayLayOut implements ActionListener
{
	JButton btn1,btn2,btn3,btn4,btn21,btn22,btn23,btn24,btn31,btn32,btn33,btn34,btn41,btn42,btn43,btn44,btn51,btn52,btn53,btn54;
	JLabel lab1,lab2;
    TextField t;
  
    //static String storedStr;
	boolean isNum_1_flag=false,isNum_2_flag=false;
	String s0,s1,s2;	
 static	boolean isOperatorFlag=false;
 static char operator;
	GridArrayLayOut(){
			s0=s1=s2="";
			JFrame fm=new JFrame();    //Creating a frame
		    t = new TextField();  
		    // setting position of above components in the frame  
		    t.setBounds(30, 50, 340, 30);  
		    t.setEditable(false);
		    fm.add(t);
	        
		     lab1=new JLabel("");
		     lab2= new JLabel("");
		    //**********************
	        JPanel panel1=new JPanel(new GridLayout(1,2));  
	        panel1.setBounds(30,50,340,80);    
	        panel1.add(lab1);
	        panel1.add(lab2);
	        fm.add(panel1);
	        

	        btn1=new JButton("Back");
	        btn1.setName("B");
	        btn2=new JButton("C");
	        btn2.setName("C");
	        btn3=new JButton("+/-");
	        btn3.setName("A");
	        btn4=new JButton("%");
	        btn4.setName("%");
	        
	        
	        JPanel panel2=new JPanel(new GridLayout(1,4));  
	        panel2.setBounds(30,130,340,50);    
	        panel2.add(btn1);
	        btn1.addActionListener(this);
	        panel2.add(btn2);
	        btn2.addActionListener(this);     
	        panel2.add(btn3);
	        btn3.addActionListener(this);
	        panel2.add(btn4);
	        btn4.addActionListener(this);
	        
	        fm.add(panel2);
	        
	        
	        btn21=new JButton("9");
	        btn21.setName("9");
	        btn22=new JButton("8");
	        btn22.setName("8");
	        btn23=new JButton("7");
	        btn23.setName("7");
	        btn24=new JButton("/");
	        btn24.setName("/");
	        
	  
	        
	        JPanel panel3=new JPanel(new GridLayout(1,4));  
	        panel3.setBounds(30,180,340,50);    
	        panel3.add(btn21);
	        btn21.addActionListener(this);
	        panel3.add(btn22);
	        btn22.addActionListener(this);     
	        panel3.add(btn23);
	        btn23.addActionListener(this);
	        panel3.add(btn24);
	        btn24.addActionListener(this);
	        fm.add(panel3);
	   
	        

	        btn31=new JButton("6");
	        btn31.setName("6");
	        btn32=new JButton("5");
	        btn32.setName("5");
	        btn33=new JButton("4");
	        btn33.setName("4");
	        btn34=new JButton("*");
	        btn34.setName("*");
	        

	        
	        JPanel panel4=new JPanel(new GridLayout(1,4));  
	        panel4.setBounds(30,230,340,50);    
	        panel4.add(btn31);
	        btn31.addActionListener(this);
	        panel4.add(btn32);
	        btn32.addActionListener(this);     
	        panel4.add(btn33);
	        btn33.addActionListener(this);
	        panel4.add(btn34);
	        btn34.addActionListener(this);
	        fm.add(panel4);

	        
	        btn41=new JButton("3");
	        btn41.setName("3");
	        btn42=new JButton("2");
	        btn42.setName("2");
	        btn43=new JButton("1");
	        btn43.setName("1");
	        btn44=new JButton("+");
	        btn44.setName("+");
	        

	        
	        JPanel panel5=new JPanel(new GridLayout(1,4));  
	        panel5.setBounds(30,280,340,50);    
	        panel5.add(btn41);
	        btn41.addActionListener(this);
	        panel5.add(btn42);
	        btn42.addActionListener(this);     
	        panel5.add(btn43);
	        btn43.addActionListener(this);
	        panel5.add(btn44);
	        btn44.addActionListener(this);
	        fm.add(panel5);
	        
	        
	        btn51=new JButton("0");
	        btn51.setName("0");
	        btn52=new JButton(".");
	        btn52.setName(".");
	        btn53=new JButton("=");
	        btn53.setName("=");
	        btn54=new JButton("-");
	        btn54.setName("-");
	        
	        
	        
	        JPanel panel6=new JPanel(new GridLayout(1,4));  
	        panel6.setBounds(30,330,340,50);    
	        panel6.add(btn51);
	        btn51.addActionListener(this);
	        panel6.add(btn52);
	        btn52.addActionListener(this);     
	        panel6.add(btn53);
	        btn53.addActionListener(this);
	        panel6.add(btn54);
	        btn54.addActionListener(this);
	        fm.add(panel6);
	        
		        fm.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent we) {
	                System.exit(0);
	            }
	        });
		        
	        
		    fm.setSize(400, 500);   //setting frame size.
		    fm.setBackground(Color.LIGHT_GRAY);
		    fm.setTitle("GUI First");
		    fm.setLayout(null);  
		    fm.setVisible(true);     //set frame visibilty true
		    
		    
		}
	
	
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			GridArrayLayOut obj1= new GridArrayLayOut();
		}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int cntPts=0;
		// TODO Auto-generated method stub
		String str=e.getActionCommand();
		
		
		if((str.charAt(0)>='0' && str.charAt(0)<='9')||str.charAt(0)=='.')
		{
			
			if(!s1.equals(""))
			{
				s2=s2+str;
			}
			else
                {
					s0 = s0 + str;
		        }
				
			
            // set the value of text
            t.setText(s0 + s1 + s2);
		}
		else if (str.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";
 
            // set the value of text
            t.setText(s0 + s1 + s2);
        }
		else if(str.charAt(0)=='B')
		{
			String strB;
			if(t.getText().length()>0)
			{
				StringBuilder bld= new StringBuilder(t.getText());
				bld.deleteCharAt(t.getText().length()-1);
				strB=bld.toString();
				s0=strB;
				t.setText(s0);
			}
		}
		/*else if(str.charAt(0)=='A' && s0!="") 
		{			
			
			Double res;
			res=(-1)*Double.parseDouble(s0);
					
			t.setText(res.toString());
		} */ 
		else if (str.charAt(0) == '=' && s2!="" &&s0!="") {
 
            double te = 0;
 
            // store the value in 1st
            try {
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else if (s1.equals("%"))
                te = (Double.parseDouble(s0) % Double.parseDouble(s2));
            else if(s1.equals("*"))
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            // set the value of text
            else if(s1.equals("+/-"))
            {
            	te= (Double.parseDouble(s0)*(-1));
            	s2="";
            }
            t.setText(s0 + s1 + s2 + "=" + te);
 
            // convert it to string
            s0 = Double.toString(te);
 
            s1 = s2 = "";
            }
            catch(Exception ob3) {
            	System.out.println("Multiple points===================="+ob3.getMessage());
            }
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = str;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                try {
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else if (s1.equals("%"))
                    te = (Double.parseDouble(s0) % Double.parseDouble(s2));
                else //if(s1.equals("*"))
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                
                // convert it to string
                s0 = Double.toString(te);
 
                // place the operator
                s1 = str;
 
                // make the operand blank
                s2 = "";
                }
                catch(Exception ob2) {
                	System.out.println("============="+ob2.getMessage()+"=============");
                }
            }
 
            // set the value of text
            t.setText(s0 + s1 + s2);
            
        }
		    }
}