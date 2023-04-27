2.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TrafficSignal extends JFrame implements ItemListener 
{
    JRadioButton jr1;
    JRadioButton jr2;
    JRadioButton jr3;
    JTextField j1 = new JTextField(10);
    ButtonGroup b = new ButtonGroup();
    String msg = " ";
    int x = 0, y = 0, z = 0;
    public TrafficSignal(String msg)
    {
        super(msg);
        setLayout(new FlowLayout());
        jr1 = new JRadioButton("Red");
        jr2 = new JRadioButton("Yellow");
        jr3 = new JRadioButton("Green");
        jr1.addItemListener(this);
        jr2.addItemListener(this);
        jr3.addItemListener(this);
        add(jr1);
        add(jr2);
        add(jr3);
        b.add(jr1);
        b.add(jr2);
        b.add(jr3);
        add(j1);
        addWindowListener(new WindowAdapter() 
	{
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent ie)
    {
	if(ie.getSource() == jr1) 
	{
            if(ie.getStateChange() == 1) 
	    {
 		msg = "Stop!";
                x = 1;
                repaint();
            }
            else 
	    {
                msg = "";
            }
        }
	if(ie.getSource() == jr2) 
	{
            if(ie.getStateChange() == 1) 
	    {
                msg = "Get Ready to go!";
                y = 1;
                repaint();
            }
            else 
	    {
                msg = "";
            }
        }
	if (ie.getSource() == jr3) 
	{
            if (ie.getStateChange() == 1) 
	    {
                msg = "Go!!";
                z = 1;
                repaint();
            }
            else 
	    {
                msg = "";
            }
        }
        j1.setText(msg);
    }
 
public void paint(Graphics g)
    {
        g.drawRect(100, 105, 110, 270);
        g.drawOval(120, 150, 60, 60);
        g.drawOval(120, 230, 60, 60);
        g.drawOval(120, 300, 60, 60);
        if (x == 1) 
	{
            g.setColor(Color.RED);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);
            x = 0;
        }
        if (y == 1) 
	{
            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.YELLOW);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);
            y = 0;
        }
        if (z == 1) 
	{
            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.GREEN);
            g.fillOval(120, 300, 60, 60);
            z = 0;
        }
    }

    public static void main(String args[])
    {
        
        JFrame jf = new TrafficSignal("Traffic Light");
        jf.setSize(500, 500);
        jf.setVisible(true);
    }
}
6.wave
import java.awt.*;
import javax.swing.*;
public class Wave extends JPanel 
{
    int SCALEFACTOR = 200;
    int cycles;
    int points;
    double[] sines;
    int[] pts;
    public  void setCycles(int cycles) 
    {
	this.cycles = cycles;
	this.points = SCALEFACTOR * cycles * 2;
	this.sines = new double[points];
	for (int i = 0; i < points; i++) 
	{
	    double radians = (Math.PI / SCALEFACTOR) * i;
	    this.sines[i] = Math.sin(radians);
	}
    }

    public void paintComponent(Graphics g) 
    {
	int maxWidth = getWidth();
	double hstep = (double) maxWidth / (double) points;
	int maxHeight = getHeight();
	pts = new int[points];
	for (int i = 0; i < points; i++)
	{
	    pts[i] = (int) (sines[i] * maxHeight / 2 * .95 + maxHeight / 2);
	}
	g.setColor(Color.BLUE);
	for (int i = 1; i < points; i++) 
	{
	    int x1 = (int) ((i - 1) * hstep);
	    int x2 = (int) (i * hstep);
	    int y1 = pts[i - 1];
	    int y2 = pts[i];
	    g.drawLine(x1, y1, x2, y2);
	}
    }

    public static void main(String[] args) 
    {
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame("Print the wave pattern");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBackground(Color.white);
	frame.setSize(500, 200);
	Wave sw = new Wave();
	sw.setCycles(10);
	frame.add(sw);
	frame.setVisible(true);
    }
}
1.calculator
import javax.swing.*;  
import java.awt.event.*;  
class calculator implements ActionListener
{  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2,b3,b4;  
    calculator()
    {  
        JFrame f= new JFrame();  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20); 
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);  
        tf3=new JTextField();  
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);   
        b1=new JButton("+");  
        b1.setBounds(50,200,50,50);  
        b2=new JButton("-");  
        b2.setBounds(120,200,50,50);
        b3=new JButton("*");
        b3.setBounds(190,200,50,50);
        b4=new JButton("%");
        b4.setBounds(260,200,50,50);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) 
    {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==b1)
             c=a+b;  
        
        else 
            if(e.getSource()==b2)
                 c=a-b;  
        
            else 
                if(e.getSource()==b3)
                    c=a*b;
                else
                    if(e.getSource()==b4)
                    try
		    {
                        c=a%b;
                    }
                    catch(Exception er) 
                    {
			System.out.println(er);
		    }
                       
    	String result=String.valueOf(c);
        tf3.setText(result);            
    }
    public static void main(String[] args) 
    {  
    	new calculator();  
    } 
} 
5.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class draw extends Frame
{
    draw()
    {
	setTitle("Drawing different Shapes");
	setSize(500,500);
	setVisible(true);
	addWindowListener(new WindowAdapter()
	{
	    public void windowClosing(WindowEvent we)
	    {
		System.exit(0); 
	    } 
	} );
    }
    public static void main(String[] args)
    {
	new draw();
    }

    public void paint(Graphics g)
    {
	g.setColor(Color.blue);
	g.drawLine(100,80,350,80);
	g.drawRect(140,140,50,100);
	g.fillRect(200,140,70,70);
	g.drawOval(140,340,100,100);
	g.fillOval(300,340,100,100);
	g.setColor(Color.red);
	g.fillArc(180,500,100,150,10,+60);
	g.setColor(Color.green);
	int x[]={300,500,380,550,670};
	int y[]={550,580,600,680,490};
	g.drawPolygon(x,y,5);
    }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
class key extends KeyAdapter
{  
    static JLabel l; 
    public void keyPressed(KeyEvent e) 
    {  
	l.setText("Key is pressed");  
    }  
    public void keyReleased(KeyEvent e) 
    {  
	l.setText("Released a key");  
    }  
    public void keyTyped(KeyEvent e) 
    {  
	l.setText("Typed a key");  
    }  
    public static void main(String[] args) 
    {  
	JFrame f = new JFrame("Key Events Example");
	f.setSize(300,300);  
	key k = new key();
	f.addKeyListener(k);
	JPanel p = new JPanel();
	l = new JLabel();
	p.add(l);
	f.add(p);
	f.setVisible(true); 
    }  
} 
3.mouse
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
class mouse extends Frame implements MouseListener
{  
    static JLabel l;  
    mouse()
    {	 
    }  
    public void mouseClicked(MouseEvent e) 
    {  
	l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) 
    {  
	l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) 
    {  
	l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) 
    {  
	l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) 
    {  
	l.setText("Mouse Released");  
    }  
    public static void main(String[] args) 
    {  
	JFrame f = new JFrame("Mouse Events ");
	f.setSize(400,400);  
	mouse m = new mouse();
	f.addMouseListener(m);
	JPanel p = new JPanel();
	l = new JLabel();
	p.add(l);
	f.add(p);
	f.setVisible(true); 
    }  
}
