package java_calculator;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Simple_calculator {

	private JFrame frame;
	private JTextField textFieldNumber1;
	private JTextField textFieldNumber2;
	private JTextField textFieldAnswer;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_2;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Simple_calculator window = new Simple_calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Simple_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Marco's Java Calculator");
		frame.getContentPane().setLayout(new GridLayout(0, 4, 0, 0));

		label = new JLabel("");
		frame.getContentPane().add(label);

		JLabel lblNewLabel = new JLabel("More Info");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Test two");
			}
		});

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		label_1 = new JLabel("");
		frame.getContentPane().add(label_1);

		label_2 = new JLabel("");
		frame.getContentPane().add(label_2);

		textFieldNumber1 = new JTextField();
		textFieldNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textFieldNumber1);
		textFieldNumber1.setColumns(10);

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int number1, number2, ans;

				try {
					number1 = Integer.parseInt(textFieldNumber1.getText());
					number2 = Integer.parseInt(textFieldNumber2.getText());

					ans = number1 + number2;
					textFieldAnswer.setText(Integer.toString(ans));

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number!");
				}
			}
		});
		frame.getContentPane().add(btnNewButton);

		btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int number1, number2, ans;
				try {
					number1 = Integer.parseInt(textFieldNumber1.getText());
					number2 = Integer.parseInt(textFieldNumber2.getText());

					ans = number1 * number2;
					textFieldAnswer.setText(Integer.toString(ans));

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number!");
				}
			}
		});
		frame.getContentPane().add(btnNewButton_2);

		textFieldNumber2 = new JTextField();
		textFieldNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textFieldNumber2);
		textFieldNumber2.setColumns(10);

		label_3 = new JLabel("");
		frame.getContentPane().add(label_3);

		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int number1, number2, ans;

				try {
					number1 = Integer.parseInt(textFieldNumber1.getText());
					number2 = Integer.parseInt(textFieldNumber2.getText());

					ans = number1 - number2;
					textFieldAnswer.setText(Integer.toString(ans));

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number!");
				}
			}
		});
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int number1, number2, ans;

				try {
					number1 = Integer.parseInt(textFieldNumber1.getText());
					number2 = Integer.parseInt(textFieldNumber2.getText());

					ans = number1 / number2;
					textFieldAnswer.setText(Integer.toString(ans));

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number!");
				}

			}
		});
		frame.getContentPane().add(btnNewButton_3);

		label_4 = new JLabel("");
		frame.getContentPane().add(label_4);

		label_5 = new JLabel("");
		frame.getContentPane().add(label_5);

		label_6 = new JLabel("");
		frame.getContentPane().add(label_6);

		label_7 = new JLabel("");
		frame.getContentPane().add(label_7);

		label_8 = new JLabel("");
		frame.getContentPane().add(label_8);

		label_9 = new JLabel("");
		frame.getContentPane().add(label_9);

		lblNewLabel_1 = new JLabel("The Answer is");
		frame.getContentPane().add(lblNewLabel_1);

		textFieldAnswer = new JTextField();
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);

		label_10 = new JLabel("");
		frame.getContentPane().add(label_10);

		label_11 = new JLabel("");
		frame.getContentPane().add(label_11);
	}
}
