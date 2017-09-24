import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.color.*;
class calculator extends JFrame implements ActionListener
{
	JButton b,b1,b2,b3,b4,b5;
	JTextField tf1,tf2,tf3;
	JLabel l1,l2,l3;
	int x,y;
	
	calculator()
	{
		l1=new JLabel("ENTER X:");
		l1.setBounds(50,100,60,40);
		l1.setForeground(Color.white);
		tf1=new JTextField();
		tf1.setBounds(115,105,100,22);
		
		l2=new JLabel("ENTER Y:");
		l2.setBounds(50,160,60,40);
		l2.setForeground(Color.white);
		tf2=new JTextField();
		tf2.setBounds(115,165,100,22);
			
		l3=new JLabel("RESULT IS:");
		l3.setBounds(250,310,80,40);
		l3.setForeground(Color.white);
		tf3=new JTextField();
		tf3.setBounds(150,345,300,25);
		
		b=new JButton(new ImageIcon("D:\\anuj\\project\\Calculator-icon.png"));
		b.setBounds(250,20,100,60);
		
		b1=new JButton("Addition");
		b1.setBounds(50,250,100,40);
		
		b2=new JButton("Subtraction");
		b2.setBounds(170,250,100,40);
		
		b3=new JButton("Multiplication");
		b3.setBounds(290,250,120,40);
		
		b4=new JButton("Division");
		b4.setBounds(430,250,100,40);
		
		b.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ev)
			{
				
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
		
			}
		});
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		add(b);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);
		add(l2);
		add(l3);
		add(tf1);
		add(tf2);
		add(tf3);
		setTitle("Calculator");
		setSize(600,450);
		setLayout(null);
		setLocation(100,50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground( Color.black );
		setVisible(true);

		
	}
	public void actionPerformed(ActionEvent ev)
		{
			try
			{
				float x=Float.parseFloat(tf1.getText());
				float y=Float.parseFloat(tf2.getText());
			
			
			
		if(ev.getSource()==b1)
		{
		tf3.setText("addition of "+x+" and "+y+" is = "+(x+y));
		}
		
		if(ev.getSource()==b2)
		{
		tf3.setText("subtraction of "+x+" and "+y+" is = "+(x-y));
		}
		
		if(ev.getSource()==b3)
		{
		tf3.setText("multiplication of "+x+" and "+y+" is = "+(x*y));
		}
		
		if(ev.getSource()==b4)
		{
		tf3.setText("division of "+x+" and "+y+" is = "+(x/y));
			}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null ,"please fill the required fill correctly ");
				
			}
	}
	
	public static void main(String args[])
	{
		new calculator();	
	}
}