package java_calculatorv2;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class CalculatorV2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CalculatorV2 frame = new CalculatorV2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorV2() {
		setForeground(Color.BLACK);
		setType(Type.UTILITY);
		setBackground(Color.BLACK);
		setTitle("Calculator V2");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 357);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TextField textField = new TextField();
		textField.setBounds(5, 5, 436, 36);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		contentPane.add(textField);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("OFF");
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBackground(Color.BLACK);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(5, 69, 75, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("ON");
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setBackground(Color.BLACK);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setBounds(5, 47, 75, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		Button button = new Button("DEL");
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button.setBounds(103, 47, 102, 45);
		contentPane.add(button);

		Button button_1 = new Button("C");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(228, 47, 75, 45);
		contentPane.add(button_1);

		Button button_2 = new Button("+");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(328, 47, 75, 45);
		contentPane.add(button_2);

		Button button_3 = new Button("1");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(22, 109, 75, 45);
		contentPane.add(button_3);

		Button button_4 = new Button("2");
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_4.setBackground(Color.BLACK);
		button_4.setBounds(123, 109, 75, 45);
		contentPane.add(button_4);

		Button button_5 = new Button("3");
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_5.setBackground(Color.BLACK);
		button_5.setBounds(228, 109, 75, 45);
		contentPane.add(button_5);

		Button button_6 = new Button("-");
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_6.setBackground(Color.BLACK);
		button_6.setBounds(328, 109, 75, 45);
		contentPane.add(button_6);

		Button button_7 = new Button("4");
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_7.setBackground(Color.BLACK);
		button_7.setBounds(22, 160, 75, 45);
		contentPane.add(button_7);

		Button button_8 = new Button("5");
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_8.setBackground(Color.BLACK);
		button_8.setBounds(123, 160, 75, 45);
		contentPane.add(button_8);

		Button button_9 = new Button("6");
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_9.setBackground(Color.BLACK);
		button_9.setBounds(228, 160, 75, 45);
		contentPane.add(button_9);

		Button button_10 = new Button("*");
		button_10.setForeground(Color.WHITE);
		button_10.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_10.setBackground(Color.BLACK);
		button_10.setBounds(328, 160, 75, 45);
		contentPane.add(button_10);

		Button button_11 = new Button("7");
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_11.setBackground(Color.BLACK);
		button_11.setBounds(22, 211, 75, 45);
		contentPane.add(button_11);

		Button button_12 = new Button("8");
		button_12.setForeground(Color.WHITE);
		button_12.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_12.setBackground(Color.BLACK);
		button_12.setBounds(123, 211, 75, 45);
		contentPane.add(button_12);

		Button button_13 = new Button("9");
		button_13.setForeground(Color.WHITE);
		button_13.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_13.setBackground(Color.BLACK);
		button_13.setBounds(228, 211, 75, 45);
		contentPane.add(button_13);

		Button button_14 = new Button("/");
		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_14.setBackground(Color.BLACK);
		button_14.setBounds(328, 211, 75, 45);
		contentPane.add(button_14);

		Button button_15 = new Button("0");
		button_15.setForeground(Color.WHITE);
		button_15.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_15.setBackground(Color.BLACK);
		button_15.setBounds(22, 262, 75, 45);
		contentPane.add(button_15);

		Button button_16 = new Button(".");
		button_16.setForeground(Color.WHITE);
		button_16.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_16.setBackground(Color.BLACK);
		button_16.setBounds(123, 262, 75, 45);
		contentPane.add(button_16);

		Button button_17 = new Button("=");
		button_17.setForeground(Color.WHITE);
		button_17.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_17.setBackground(Color.BLACK);
		button_17.setBounds(228, 262, 175, 45);
		contentPane.add(button_17);

		setLocationRelativeTo(null);
	}
}
