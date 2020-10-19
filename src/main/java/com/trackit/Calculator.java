package com.trackit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Calculator {

	private JFrame frmTrackit;
	private JTextField textField;
	private JTextField txtServings;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmTrackit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrackit = new JFrame();
		frmTrackit.setTitle("Track It");
		frmTrackit.setBounds(100, 100, 1280, 720);
		frmTrackit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrackit.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Calorie Calculator");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblTitle.setBounds(0, 25, 1264, 44);
		frmTrackit.getContentPane().add(lblTitle);
		
		JSeparator seperator1 = new JSeparator();
		seperator1.setForeground(SystemColor.menu);
		seperator1.setBackground(SystemColor.controlHighlight);
		seperator1.setBounds(44, 80, 1172, 2);
		frmTrackit.getContentPane().add(seperator1);
		
		JLabel lblSubTitle = new JLabel("Search Food");
		lblSubTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblSubTitle.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSubTitle.setBounds(381, 93, 159, 34);
		frmTrackit.getContentPane().add(lblSubTitle);
		
		textField = new JTextField();
		textField.setText("e.g, banana");
		textField.setForeground(SystemColor.controlShadow);
		textField.setFont(new Font("Tahoma", Font.ITALIC, 16));
		textField.setColumns(10);
		textField.setBounds(381, 138, 396, 44);
		frmTrackit.getContentPane().add(textField);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSearch.setBackground(SystemColor.controlShadow);
		btnSearch.setBounds(774, 138, 125, 44);
		frmTrackit.getContentPane().add(btnSearch);
		
		JLabel lblSelectedFood = new JLabel("Selected Food");
		lblSelectedFood.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelectedFood.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSelectedFood.setBounds(381, 215, 159, 34);
		frmTrackit.getContentPane().add(lblSelectedFood);
		
		JPanel pnlFood = new JPanel();
		pnlFood.setLayout(null);
		pnlFood.setBorder(null);
		pnlFood.setBackground(SystemColor.controlHighlight);
		pnlFood.setBounds(381, 260, 250, 60);
		frmTrackit.getContentPane().add(pnlFood);
		
		JLabel lblFoodInfo = new JLabel("food x calories / serving");
		lblFoodInfo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFoodInfo.setBounds(10, 0, 230, 60);
		pnlFood.add(lblFoodInfo);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setHorizontalAlignment(SwingConstants.LEFT);
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAmount.setBounds(381, 331, 159, 34);
		frmTrackit.getContentPane().add(lblAmount);
		
		JPanel pnlAmount = new JPanel();
		pnlAmount.setLayout(null);
		pnlAmount.setBorder(null);
		pnlAmount.setBackground(SystemColor.controlHighlight);
		pnlAmount.setBounds(381, 376, 250, 60);
		frmTrackit.getContentPane().add(pnlAmount);
		
		txtServings = new JTextField();
		txtServings.setText("no. Servings");
		txtServings.setForeground(SystemColor.controlShadow);
		txtServings.setFont(new Font("Tahoma", Font.ITALIC, 16));
		txtServings.setColumns(10);
		txtServings.setBounds(10, 11, 230, 38);
		pnlAmount.add(txtServings);
		
		JPanel pnlTimes = new JPanel();
		pnlTimes.setBackground(SystemColor.controlHighlight);
		pnlTimes.setBounds(717, 260, 60, 60);
		frmTrackit.getContentPane().add(pnlTimes);
		pnlTimes.setLayout(null);
		
		JLabel lblTimes = new JLabel("X");
		lblTimes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTimes.setBounds(10, 11, 40, 38);
		pnlTimes.add(lblTimes);
		
		JPanel pnlEquals = new JPanel();
		pnlEquals.setLayout(null);
		pnlEquals.setBackground(SystemColor.controlHighlight);
		pnlEquals.setBounds(717, 376, 60, 60);
		frmTrackit.getContentPane().add(pnlEquals);
		
		JLabel lblEquals = new JLabel("=");
		lblEquals.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEquals.setBounds(10, 11, 40, 38);
		pnlEquals.add(lblEquals);
		
		JSeparator seperator2 = new JSeparator();
		seperator2.setForeground(SystemColor.menu);
		seperator2.setBackground(SystemColor.controlHighlight);
		seperator2.setBounds(44, 491, 1172, 2);
		frmTrackit.getContentPane().add(seperator2);
		
		JLabel lblCalories = new JLabel("Calories Consumed");
		lblCalories.setHorizontalAlignment(SwingConstants.LEFT);
		lblCalories.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCalories.setBounds(381, 504, 225, 34);
		frmTrackit.getContentPane().add(lblCalories);
		
		JPanel pnlCaloriesConsumed = new JPanel();
		pnlCaloriesConsumed.setLayout(null);
		pnlCaloriesConsumed.setBorder(null);
		pnlCaloriesConsumed.setBackground(SystemColor.controlHighlight);
		pnlCaloriesConsumed.setBounds(381, 549, 250, 60);
		frmTrackit.getContentPane().add(pnlCaloriesConsumed);
		
		JLabel lblCaloriesConsumed = new JLabel("0");
		lblCaloriesConsumed.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaloriesConsumed.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCaloriesConsumed.setBounds(10, 0, 230, 60);
		pnlCaloriesConsumed.add(lblCaloriesConsumed);
		
		JButton btnAdd = new JButton("Add to Total");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdd.setBackground(SystemColor.controlShadow);
		btnAdd.setBounds(704, 559, 125, 44);
		frmTrackit.getContentPane().add(btnAdd);
		
		JButton btnGit = new JButton("");
		btnGit.setIcon(new ImageIcon("C:\\Users\\csros\\Downloads\\CLASS STUFF\\ENTERPRISE\\Documents\\GitHub-Mark\\PNG\\GitHub-Mark-32px.png"));
		btnGit.setBounds(10, 638, 32, 32);
		frmTrackit.getContentPane().add(btnGit);
	}
}
