import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInterface extends JFrame {
	private JTextArea textArea;
	
	//Constructor 
	public UserInterface() {
		//Setting up the JFrame Properties
		setTitle("User Interface");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creating the content pane
		JPanel contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		
		//Creating the panel using the GridLayout
		JPanel panel = new JPanel(new GridLayout(0, 1));
		
		//Creating the Buttons
		JButton button1 = new JButton("Print Date and Time");
		JButton button2 = new JButton("Write to File");
		JButton button3 = new JButton("Change Background Color");
		JButton button4 = new JButton("Exit");
		
		//The below are implementing ActionListners and ActionPerfomed to the buttons
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printDateTime();
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writeToTextFile();
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeBackgroundColor();
			}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Adding buttons to the panel
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		//Adding the panel to the content pane
		contentPane.add(panel, BorderLayout.WEST);
		
		//Creating a JTextArea for displaying text/color change
		textArea = new JTextArea();
		textArea.setEditable(false);
		
		//Creating a JScrollPane to enable scrolling in the text pane if needed
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);
		
		//Setting the visibility to the JFrame
		setVisible(true);
	}
	
	//Main method to print current date and time
	private void printDateTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTime = dateFormat.format(new Date());
		textArea.append(dateTime + "\n");
	}
	
	//Main method to write text area to a file
	private void writeToTextFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
			writer.write(textArea.getText());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Main method to change background color
	private void changeBackgroundColor() {
		//Generating random HSB color for Green
	    float hue = (float) ((Math.random() * 0.25f) + 0.2f);
	    float saturation = 1.0f;
	    float brightness = 1.0f;
	    Color color = Color.getHSBColor(hue, saturation, brightness);
	    textArea.setBackground(color);
	    repaint(); // Ensure the frame is repainted
	}
	
	//Main method to run the UI
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				UserInterface ui = new UserInterface();
				ui.setVisible(true);
			}
		});
	}
}
