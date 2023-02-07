package packageAwt;

import java.awt.*;
import java.awt.event.*;

//make the window as sigleton window is next requirement

public class MainWindow implements ActionListener 
{
	public static double num1=0,num2=0;
	MainWindow()//constructor
	{
	    Frame fm=new Frame();    //Creating a frame
	    
	    Label lb = new Label("Number");   //Creating a label
	
	    Button b=new Button("Click");
	    Button bAdd= new Button("+");
	    Button bEqual= new Button("=");
	
	    TextField t = new TextField();  
	    // setting position of above components in the frame  
	    lb.setBounds(20, 80, 80, 30);  
	    t.setBounds(30, 100, 80, 30);  
	    b.setBounds(100, 100, 80, 30); 
	    bAdd.setBounds(200,100,80,30);
	    bEqual.setBounds(300,100,80,30);
	        
	    b.addActionListener(new ActionListener()
	    { 
        	@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//lb.setText(t.getText());
				num1=Double.parseDouble(t.getText());		
			}

		});
	    
	    bAdd.addActionListener(new ActionListener()
	    		{

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						lb.setText(bAdd.getLabel()+" "+t.getText());
					}
	    			
	    		});
	    
	    bEqual.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				num2=Double.parseDouble(t.getText());
				lb.setText(num1+" "+bAdd.getLabel()+" "+num2);
			}
			
		});
    
	    fm.add(lb);
        fm.add(b);
        fm.add(t);
        fm.add(bAdd);
        fm.add(bEqual);
        
	      
	    fm.setSize(400, 300);   //setting frame size.
	    fm.setBackground(Color.RED);
	    fm.setTitle("GUI First");
	    fm.setLayout(null);  
	    fm.setVisible(true);     //set frame visibilty true
	    
	    
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MainWindow obj= new MainWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

