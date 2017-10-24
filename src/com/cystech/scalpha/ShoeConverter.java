package com.cystech.scalpha;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;

import com.mcraedesign.exampleAPI.ShoeSizeConverter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShoeConverter {

	private JFrame frmCysShoeConverter;
	final JPanel window = new JPanel();
	final JPanel leftPanel = new JPanel();
	final JPanel centerPanel = new JPanel();
	final JPanel rightPanel = new JPanel();
	final JPanel genderPanel = new JPanel();
	final JPanel regionPanel = new JPanel();
	final JPanel sizePanel = new JPanel();
	final String title = "CYS SHOE CONVERTER";
	final String info = "CYS Shoe Converter\nVersion 2.2.0 (\u03B1 Build)\nDeveloped for Clean Your Shoes and CYS Tech by Jordan C. McRae";
	final JLabel label = new JLabel(title);
	final JLabel hint = new JLabel("ENTER SIZE");
	final JLabel usLabel = new JLabel("US:");
	final JLabel ukLabel = new JLabel("UK:");
	final JLabel euLabel = new JLabel("EU:");
	final JLabel usSize = new JLabel();
	final JLabel ukSize = new JLabel();
	final JLabel euSize = new JLabel();
	final JTextField userSize = new JTextField();
	final ButtonGroup gender = new ButtonGroup();
	final ButtonGroup region = new ButtonGroup();
	final JRadioButton mens = new JRadioButton("MEN'S");
	final JRadioButton womens = new JRadioButton("WOMEN'S");
	final JRadioButton us = new JRadioButton("US");
	final JRadioButton uk = new JRadioButton("UK");
	final JRadioButton eu = new JRadioButton("EU");
	final JButton help = new JButton("HELP");
	final JButton convert = new JButton("CONVERT");

	public String getSelectedButtonText(ButtonGroup buttonGroup) {
		for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = buttons.nextElement();

			if (button.isSelected()) {
				return button.getText();
			}
		}

		return null;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShoeConverter window = new ShoeConverter();
					window.frmCysShoeConverter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShoeConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCysShoeConverter = new JFrame();
		frmCysShoeConverter.setTitle("CYS Shoe Converter");
		frmCysShoeConverter.setBounds(100, 100, 550, 300);
		frmCysShoeConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCysShoeConverter.getContentPane().setLayout(new BorderLayout());
		frmCysShoeConverter.getContentPane().add(window, BorderLayout.CENTER);
		label.setFont(new Font("Helvetica LT Std Cond Blk", Font.BOLD | Font.ITALIC, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frmCysShoeConverter.getContentPane().add(label, BorderLayout.NORTH);

		window.setLayout(new GridLayout(1, 3, 1, 0));
		window.add(leftPanel);
		window.add(centerPanel);
		window.add(rightPanel);

		leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "INPUT"));
		leftPanel.setLayout(new GridLayout(3, 1));
		userSize.setToolTipText("");
		userSize.setHorizontalAlignment(SwingConstants.CENTER);
		userSize.setFont(new Font("Helvetica LT Std Cond", Font.BOLD, 40));
		leftPanel.add(userSize);
		hint.setVerticalAlignment(SwingConstants.TOP);
		hint.setHorizontalAlignment(SwingConstants.CENTER);
		leftPanel.add(hint);
		help.setBackground(UIManager.getColor("Button.light"));
		help.setFont(new Font("Helvetica LT Std Cond Blk", Font.BOLD | Font.ITALIC, 20));
		leftPanel.add(help);

		genderPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "GENDER"));
		genderPanel.setLayout(new GridLayout(2, 1));
		mens.setFont(new Font("Helvetica LT Std Cond Blk", Font.PLAIN, 20));
		genderPanel.add(mens);
		womens.setFont(new Font("Helvetica LT Std Cond Blk", Font.PLAIN, 20));
		genderPanel.add(womens);

		regionPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "REGION"));
		regionPanel.setLayout(new GridLayout(3, 1));
		us.setFont(new Font("Helvetica LT Std Cond Blk", Font.PLAIN, 20));
		regionPanel.add(us);
		uk.setFont(new Font("Helvetica LT Std Cond Blk", Font.PLAIN, 20));
		regionPanel.add(uk);
		eu.setFont(new Font("Helvetica LT Std Cond Blk", Font.PLAIN, 20));
		regionPanel.add(eu);

		gender.add(mens);
		gender.add(womens);

		region.add(us);
		region.add(uk);
		region.add(eu);

		centerPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "SYSTEM"));
		centerPanel.setLayout(new GridLayout(2, 1));
		centerPanel.add(genderPanel);
		centerPanel.add(regionPanel);

		sizePanel.setLayout(new GridLayout(3, 2));
		usLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usLabel.setFont(new Font("Helvetica LT Std Cond Blk", Font.PLAIN, 20));
		sizePanel.add(usLabel);
		usSize.setHorizontalAlignment(SwingConstants.LEFT);
		usSize.setFont(new Font("Helvetica LT Std Cond", Font.PLAIN, 20));
		sizePanel.add(usSize);
		ukLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ukLabel.setFont(new Font("Helvetica LT Std Cond Blk", Font.PLAIN, 20));
		sizePanel.add(ukLabel);
		ukSize.setFont(new Font("Helvetica LT Std Cond", Font.PLAIN, 20));
		ukSize.setHorizontalAlignment(SwingConstants.LEFT);
		sizePanel.add(ukSize);
		euLabel.setHorizontalAlignment(SwingConstants.CENTER);
		euLabel.setFont(new Font("Helvetica LT Std Cond Blk", Font.PLAIN, 20));
		sizePanel.add(euLabel);
		euSize.setHorizontalAlignment(SwingConstants.LEFT);
		euSize.setFont(new Font("Helvetica LT Std Cond", Font.PLAIN, 20));
		sizePanel.add(euSize);

		rightPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "SIZES"));
		rightPanel.setLayout(new GridLayout(2, 1));
		rightPanel.add(sizePanel);

		convert.setBackground(UIManager.getColor("Button.light"));
		convert.setFont(new Font("Helvetica LT Std Cond Blk", Font.BOLD | Font.ITALIC, 20));
		rightPanel.add(convert);

		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, info);
			}
		});

		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String size = userSize.getText();
				try {
					double dbl = Double.parseDouble(size);
					if (!size.isEmpty() && getSelectedButtonText(gender) != null
							&& getSelectedButtonText(region) != null) {
						if (getSelectedButtonText(gender).equals(mens.getText())) {
							if (getSelectedButtonText(region).equals(us.getText())) {
								usSize.setText(size);
								ukSize.setText(ShoeSizeConverter.mensUSToUK(dbl));
								euSize.setText(ShoeSizeConverter.mensUSToEu(dbl));
							} else if (getSelectedButtonText(region).equals(uk.getText())) {
								usSize.setText(ShoeSizeConverter.mensUKToUS(dbl));
								ukSize.setText(size);
								euSize.setText(ShoeSizeConverter.mensUKtoEu(dbl));
							} else if (getSelectedButtonText(region).equals(eu.getText())) {
								usSize.setText(ShoeSizeConverter.mensEuToUS(dbl));
								ukSize.setText(ShoeSizeConverter.mensEuToUK(dbl));
								euSize.setText(size);
							}
						} else if (getSelectedButtonText(gender).equals(womens.getText())) {
							if (getSelectedButtonText(region).equals(us.getText())) {
								usSize.setText(size);
								ukSize.setText(ShoeSizeConverter.wommensUSToUK(dbl));
								euSize.setText(ShoeSizeConverter.wommensUSToEu(dbl));
							} else if (getSelectedButtonText(region).equals(uk.getText())) {
								usSize.setText(ShoeSizeConverter.wommensUKToUS(dbl));
								ukSize.setText(size);
								euSize.setText(ShoeSizeConverter.wommensUKToEu(dbl));
							} else if (getSelectedButtonText(region).equals(eu.getText())) {
								usSize.setText(ShoeSizeConverter.wommensEuToUS(dbl));
								ukSize.setText(ShoeSizeConverter.wommensEuToUK(dbl));
								euSize.setText(size);
							}
						}
					} else {
						JOptionPane.showMessageDialog(null, "Complete all the steps.");
					}
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Enter A Size.");
				}
			}
		});

		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"Steps:\n1. Enter your shoe size.\n2. Select your gender and then a sizing system.\n3. Press Convert.\n\nSUPPORTED SIZES:\n"
								+ "US Men's: 6-11.5, 12, 13, 14, 15, 16\nUS Women's: 4-12\n"
								+ "UK Men's: 5.5-11.5, 12.5, 13.5, 14.5, 15.5\nUK Women's: 2-10\n"
								+ "EU Men's: 39-49\nEU Women's: 35-43");
			}
		});

	}

}
