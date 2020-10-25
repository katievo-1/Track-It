package com.trackit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Home {
	
	//since you need the jframe in main, but others does not necessary to be there
	private JFrame frmTrackIt;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmTrackIt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrackIt = new JFrame();
		frmTrackIt.setMinimumSize(new Dimension(1280, 720));
		frmTrackIt.setTitle("Track It");
		frmTrackIt.setBounds(100, 100, 450, 300);
		frmTrackIt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrackIt.getContentPane().setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSearch.setBackground(SystemColor.controlShadow);
		btnSearch.setBounds(776, 138, 125, 44);
		frmTrackIt.getContentPane().add(btnSearch);
		
		JLabel lblTitle = new JLabel("Calorie Calculator");
		lblTitle.setBounds(0, 25, 1264, 44);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 36));
		frmTrackIt.getContentPane().add(lblTitle);
		
		JSeparator separator1 = new JSeparator();
		separator1.setForeground(SystemColor.menu);
		separator1.setBackground(SystemColor.controlHighlight);
		separator1.setBounds(44, 80, 1172, 2);
		frmTrackIt.getContentPane().add(separator1);
		
		JLabel lblSubTitle = new JLabel("Search Food");
		lblSubTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblSubTitle.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSubTitle.setBounds(381, 93, 159, 34);
		frmTrackIt.getContentPane().add(lblSubTitle);
		
		JTextField txtSearch = new JTextField();
		txtSearch.setForeground(SystemColor.controlShadow);
		txtSearch.setFont(new Font("Tahoma", Font.ITALIC, 16));
		txtSearch.setText("e.g, banana");
		txtSearch.setBounds(381, 138, 396, 44);
		frmTrackIt.getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JSeparator seperator2 = new JSeparator();
		seperator2.setForeground(SystemColor.menu);
		seperator2.setBackground(SystemColor.controlHighlight);
		seperator2.setBounds(381, 204, 520, 2);
		frmTrackIt.getContentPane().add(seperator2);
		
		JLabel lblRecent = new JLabel("Recently Searched");
		lblRecent.setHorizontalAlignment(SwingConstants.LEFT);
		lblRecent.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblRecent.setBounds(381, 231, 188, 34);
		frmTrackIt.getContentPane().add(lblRecent);
		
		JPanel pnlRecent1 = new JPanel();
		pnlRecent1.setBorder(null);
		pnlRecent1.setBackground(SystemColor.controlHighlight);
		pnlRecent1.setBounds(381, 287, 250, 44);
		frmTrackIt.getContentPane().add(pnlRecent1);
		pnlRecent1.setLayout(null);
		
		JLabel lblRecent1 = new JLabel("should be empty");
		lblRecent1.setForeground(Color.white);
		lblRecent1.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblRecent1.setBounds(10, 0, 230, 44);
		pnlRecent1.add(lblRecent1);
		
		JPanel pnlRecent2 = new JPanel();
		pnlRecent2.setBorder(null);
		pnlRecent2.setBackground(SystemColor.controlHighlight);
		pnlRecent2.setBounds(651, 287, 250, 44);
		frmTrackIt.getContentPane().add(pnlRecent2);
		pnlRecent2.setLayout(null);
		
		JLabel lblRecent2 = new JLabel("should be empty");
		lblRecent2.setForeground(Color.white);
		lblRecent2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblRecent2.setBounds(10, 0, 230, 44);
		pnlRecent2.add(lblRecent2);
		
		JPanel pnlRecent3 = new JPanel();
		pnlRecent3.setBorder(null);
		pnlRecent3.setBackground(SystemColor.controlHighlight);
		pnlRecent3.setBounds(381, 342, 250, 44);
		frmTrackIt.getContentPane().add(pnlRecent3);
		pnlRecent3.setLayout(null);
		
		JLabel lblRecent3 = new JLabel("should be empty");
		lblRecent3.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblRecent3.setForeground(Color.white);
		lblRecent3.setBounds(10, 0, 230, 44);
		pnlRecent3.add(lblRecent3);
		
		JPanel pnlRecent4 = new JPanel();
		pnlRecent4.setBorder(null);
		pnlRecent4.setBackground(SystemColor.controlHighlight);
		pnlRecent4.setBounds(651, 342, 250, 44);
		frmTrackIt.getContentPane().add(pnlRecent4);
		pnlRecent4.setLayout(null);
		
		JLabel lblRecent4 = new JLabel("should be empty");
		lblRecent4.setForeground(Color.white);
		lblRecent4.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblRecent4.setBounds(10, 0, 230, 44);
		pnlRecent4.add(lblRecent4);
		
		JLabel lblCalories = new JLabel("Calories Today");
		lblCalories.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalories.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblCalories.setBounds(381, 554, 250, 44);
		frmTrackIt.getContentPane().add(lblCalories);
		
		JPanel pnlTotal = new JPanel();
		pnlTotal.setLayout(null);
		pnlTotal.setBorder(null);
		pnlTotal.setBackground(SystemColor.controlHighlight);
		pnlTotal.setBounds(651, 554, 250, 44);
		frmTrackIt.getContentPane().add(pnlTotal);
		
		JLabel lblTotal = new JLabel("0");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setForeground(Color.white);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(10, 0, 230, 44);
		pnlTotal.add(lblTotal);
		
		//I think you should save the image into the src folder, i created a folder src/main/resources/images, and i saved another image there, otherwise I did not see any images on the frame but a white block
		// i resize the button too. 
		JButton btnGit = new JButton("");
		btnGit.setIcon(new ImageIcon("/Users/xiaoxiao/Desktop/Track-It/src/main/resources/images/github.png"));
		btnGit.setBounds(16, 570, 79, 84);
		frmTrackIt.getContentPane().add(btnGit);
	
	}
}
