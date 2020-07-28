package java_calculator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Simple Calculator App");
		lblNewLabel.setBounds(10, 0, 416, 45);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		textFieldNumber1 = new JTextField();
		textFieldNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumber1.setBounds(71, 80, 75, 45);
		frame.getContentPane().add(textFieldNumber1);
		textFieldNumber1.setColumns(10);

		textFieldNumber2 = new JTextField();
		textFieldNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumber2.setBounds(332, 80, 75, 45);
		frame.getContentPane().add(textFieldNumber2);
		textFieldNumber2.setColumns(10);

		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(156, 199, 130, 45);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);

		lblNewLabel_1 = new JLabel("The Answer is");
		lblNewLabel_1.setBounds(34, 214, 112, 14);
		frame.getContentPane().add(lblNewLabel_1);

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
		btnNewButton.setBounds(183, 56, 56, 55);
		frame.getContentPane().add(btnNewButton);

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
		btnNewButton_1.setBounds(183, 122, 56, 45);
		frame.getContentPane().add(btnNewButton_1);
	}
}
