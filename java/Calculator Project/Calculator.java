//import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.JFrame;

public class Calculator implements ActionListener {

	double number,answer;
	int calculation;
	JFrame frame;
	
	//Calculator Components
	
	JLabel label = new JLabel();
	JLabel footer = new JLabel("@CodeKofy");
	// Text field for displaying the result
	JTextField textfield = new JTextField();
	// Buttons for 0-9
	JButton zerobtn = new JButton("0");
	JButton onebtn = new JButton("1");
	JButton twobtn = new JButton("2");
	JButton threebtn = new JButton("3");
	JButton fourbtn = new JButton("4");
	JButton fivebtn = new JButton("5");
	JButton sixbtn = new JButton("6");
	JButton sevenbtn = new JButton("7");
	JButton eightbtn = new JButton("8");
	JButton ninebtn = new JButton("9");
	// Buttons for clear, dot, equal, delete
	JButton clearbtn = new JButton("C");
	JButton deletebtn = new JButton("DEL");
	JButton dotbtn = new JButton(".");
	JButton equalbtn = new JButton("=");
	// Buttons for Arithmetic Operations
	JButton addbtn = new JButton("+");
	JButton subbtn = new JButton("-");
	JButton mulbtn = new JButton("*");
	JButton divbtn = new JButton("/");
	
	
	
	Calculator(){
		
		prepareGUI();
		addComponents();
		addActionEvents();
		
	}
	
	public void prepareGUI() {
		frame = new JFrame();
		frame.setTitle("Calculator APP");
		frame.getContentPane().setBackground(Color.decode("#222831"));
		frame.getContentPane().setLayout(null);
		frame.setSize(300, 450);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}
	
	public void addComponents() {
		
		//Label properties
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);
        
        footer.setBounds(118, 390, 100, 30);
        footer.setFont(new Font("Arial", Font.TRUETYPE_FONT, 10));
        footer.setForeground(Color.decode("#FBF8F1"));
        frame.add(footer);
        
        //Text field properties
        textfield.setBounds(15, 50, 270, 40);
        textfield.setFont(new Font("Arial", Font.BOLD, 20));
        textfield.setBackground(Color.decode("#DDDDDD"));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);
        //Buttons properties
        sevenbtn.setBounds(15, 190, 60, 40);
        sevenbtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(sevenbtn);
        
        eightbtn.setBounds(85, 190, 60, 40);
        eightbtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(eightbtn);
        
        ninebtn.setBounds(155, 190, 60, 40);
        ninebtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(ninebtn);
        
        mulbtn.setBounds(225, 190, 60, 40);
        mulbtn.setFont(new Font("Arial", Font.BOLD, 20));
        mulbtn.setBackground(new Color(239, 188, 2));
        mulbtn.setBackground(Color.decode("#FFCA03"));
        mulbtn.setOpaque(true);
        frame.add(mulbtn);
        
        fourbtn.setBounds(15, 240, 60, 40);
        fourbtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(fourbtn);
        
        fivebtn.setBounds(85, 240, 60, 40);
        fivebtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(fivebtn);
        
        sixbtn.setBounds(155, 240, 60, 40);
        sixbtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(sixbtn);
        
        addbtn.setBounds(225, 240, 60, 40);
        addbtn.setFont(new Font("Arial", Font.BOLD, 20));
        addbtn.setBackground(new Color(239, 188, 2));
        addbtn.setBackground(Color.decode("#FFCA03"));
        addbtn.setOpaque(true);
        frame.add(addbtn);
        
        onebtn.setBounds(15, 290, 60, 40);
        onebtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(onebtn);
        
        twobtn.setBounds(85, 290, 60, 40);
        twobtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(twobtn);
        
        threebtn.setBounds(155, 290, 60, 40);
        threebtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(threebtn);
        
        zerobtn.setBounds(15, 340, 130, 40);
        zerobtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(zerobtn);
        
        dotbtn.setBounds(155, 340, 60, 40);
        dotbtn.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(dotbtn);
        
        equalbtn.setBounds(225, 290, 60, 90);
        equalbtn.setFont(new Font("Arial", Font.BOLD, 20));
        equalbtn.setBackground(Color.decode("#FFCA03"));
        equalbtn.setOpaque(true);
        frame.add(equalbtn);
        
        divbtn.setBounds(155, 140, 60, 40);
        divbtn.setFont(new Font("Arial", Font.BOLD, 20));
        divbtn.setBackground(new Color(239, 188, 2));
        divbtn.setBackground(Color.decode("#FFCA03"));
        divbtn.setOpaque(true);
        frame.add(divbtn);
 
        subbtn.setBounds(225, 140, 60, 40);
        subbtn.setFont(new Font("Arial", Font.BOLD, 20));
        subbtn.setBackground(new Color(239, 188, 2));
        subbtn.setBackground(Color.decode("#FFCA03"));
        subbtn.setOpaque(true);
        frame.add(subbtn);
        
        deletebtn.setBounds(85, 140, 60, 40);
        deletebtn.setFont(new Font("Arial", Font.BOLD, 12));
        deletebtn.setBackground(Color.decode("#F05454"));
        deletebtn.setOpaque(true);
        frame.add(deletebtn);
        
        clearbtn.setBounds(15, 140, 60, 40);
        clearbtn.setFont(new Font("Arial", Font.BOLD, 12));
        clearbtn.setBackground(Color.decode("#F05454"));
        clearbtn.setOpaque(true);
        frame.add(clearbtn);
        
        
		
	}
	
	void addActionEvents() {
		
		zerobtn.addActionListener((ActionListener) this);
		onebtn.addActionListener((ActionListener) this);
		twobtn.addActionListener((ActionListener) this);
		threebtn.addActionListener((ActionListener) this);
		fourbtn.addActionListener((ActionListener) this);
		fivebtn.addActionListener((ActionListener) this);
		sixbtn.addActionListener((ActionListener) this);
		sevenbtn.addActionListener((ActionListener) this);
		eightbtn.addActionListener((ActionListener) this);
		ninebtn.addActionListener((ActionListener) this);
		
		dotbtn.addActionListener((ActionListener) this);
		deletebtn.addActionListener((ActionListener) this);
		clearbtn.addActionListener((ActionListener) this);
		equalbtn.addActionListener((ActionListener) this);
		
		divbtn.addActionListener((ActionListener) this);
		mulbtn.addActionListener((ActionListener) this);
		addbtn.addActionListener((ActionListener) this);
		subbtn.addActionListener((ActionListener) this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object source = e.getSource();
		
		if(source == clearbtn) {
			label.setText(" ");
			textfield.setText(" ");
		}
		else if(source == deletebtn) {
			int length = textfield.getText().length();		//when pressed delete button it delete one by one
			int number = length - 1;
			
			if (length > 0) {
                StringBuilder back = new StringBuilder(textfield.getText());
                back.deleteCharAt(number);
                textfield.setText(back.toString());
 
            }
            if (textfield.getText().endsWith("")) {
                label.setText("");
            }
         } 
		
		else if (source == zerobtn) {
            if (textfield.getText().equals("0")) {
                return;
            }
            
            else {
                textfield.setText(textfield.getText() + "0");
            }
        }
		
		else if (source == onebtn) {
            textfield.setText(textfield.getText() + "1");
        } else if (source == twobtn) {
        	textfield.setText(textfield.getText() + "2");
        } else if (source == threebtn) {
        	textfield.setText(textfield.getText() + "3");
        } else if (source == fourbtn) {
        	textfield.setText(textfield.getText() + "4");
        } else if (source == fivebtn) {
        	textfield.setText(textfield.getText() + "5");
        } else if (source == sixbtn) {
        	textfield.setText(textfield.getText() + "6");
        } else if (source == sevenbtn) {
        	textfield.setText(textfield.getText() + "7");
        } else if (source == eightbtn) {
        	textfield.setText(textfield.getText() + "8");
        } else if (source == ninebtn) {
        	textfield.setText(textfield.getText() + "9");
        } else if (source == dotbtn) {
            if (textfield.getText().contains(".")) {
                return;
            } else {
            	textfield.setText(textfield.getText() + ".");
            }
 
        }
        
        else if (source == addbtn) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            textfield.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == subbtn) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            textfield.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == mulbtn) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            textfield.setText("");
            label.setText(str + "x");
            calculation = 3;
        } else if (source == divbtn) {
            String str = textfield.getText();
            number = Double.parseDouble(textfield.getText());
            textfield.setText("");
            label.setText(str + "/");
            calculation = 4;
 
        } 
        
        else if (source == equalbtn) {
           //equal to operation used by switch statement
        	
            switch (calculation) {
            
                case 1:
                    answer = number + Double.parseDouble(textfield.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                    	textfield.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                    	textfield.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                    
                case 2:
                    answer = number - Double.parseDouble(textfield.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                    	textfield.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                    	textfield.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                    
                case 3:
                    answer = number * Double.parseDouble(textfield.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                    	textfield.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                    	textfield.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                    
                case 4:
                    answer = number / Double.parseDouble(textfield.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                    	textfield.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                    	textfield.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
 
            }
        }
			
		}
		
		
		
		
	}
	


