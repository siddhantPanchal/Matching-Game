package withApplet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainInterface extends JApplet implements ActionListener {
	private JTextField txtFirstArrayIndexes;
	private JTextField txtSecondArrayIndexes;
	private JLabel lblEnterFirstArray;
	private JLabel lblEnterSecondArray;
	private JTextField txtaIndex;
	private JTextField txtbIndex;
	MainLogic mainl = new MainLogic();
	GenerateArray ga = new GenerateArray();
	MatchingLogic ml = new MatchingLogic();
	Nos[] a = ga.generate();
	Nos[] b = ga.generate();
	private JLabel lblElementOfFirst;
	private JTextField txtaElement;
	private JTextField txtbElement;
	private JTextField txtStatus;
	/**
	 * Create the applet.
	 */
	public MainInterface() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblstArrayIndexes = new JLabel("1st Array Indexes : ");
		lblstArrayIndexes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtFirstArrayIndexes = new JTextField();
		txtFirstArrayIndexes.setToolTipText("First array indexes");
		txtFirstArrayIndexes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFirstArrayIndexes.setColumns(10);
		
		txtSecondArrayIndexes = new JTextField();
		txtSecondArrayIndexes.setToolTipText("Second array indexes");
		txtSecondArrayIndexes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSecondArrayIndexes.setColumns(10);
		
		JLabel lblstArrayIndexes_1 = new JLabel("2st Array Indexes : ");
		lblstArrayIndexes_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblEnterFirstArray = new JLabel("Enter First array Index to match the values : ");
		lblEnterFirstArray.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblEnterSecondArray = new JLabel("Enter Second array Index to match the values : ");
		lblEnterSecondArray.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnMatch = new JButton("Match");
		btnMatch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtaIndex = new JTextField();
		txtaIndex.setText("0");
		txtaIndex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtaIndex.setColumns(10);
		
		txtbIndex = new JTextField();
		txtbIndex.setText("0");
		txtbIndex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtbIndex.setColumns(10);
		
		lblElementOfFirst = new JLabel("Element of First array entered indexes is :  ");
		lblElementOfFirst.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtaElement = new JTextField();
		txtaElement.setToolTipText("Element of Index");
		txtaElement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtaElement.setColumns(10);
		
		JLabel lblElementOfSecond = new JLabel("Element of Second array entered indexes is : ");
		lblElementOfSecond.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtbElement = new JTextField();
		txtbElement.setToolTipText("Element of Index");
		txtbElement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtbElement.setColumns(10);
		
		JButton btnPrintArrayIndexes = new JButton("Print Array Indexes");
		btnPrintArrayIndexes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPrintArrayIndexes.addActionListener(this);
		
		JLabel lblStatus = new JLabel("Status : ");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtStatus = new JTextField();
		txtStatus.setToolTipText("Status");
		txtStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtStatus.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(69)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblstArrayIndexes)
									.addGap(38)
									.addComponent(txtFirstArrayIndexes, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblstArrayIndexes_1)
									.addGap(38)
									.addComponent(txtSecondArrayIndexes, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblElementOfSecond)
										.addComponent(lblEnterSecondArray)
										.addComponent(lblElementOfFirst)
										.addComponent(lblEnterFirstArray)
										.addComponent(lblStatus))
									.addGap(113)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtaIndex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtaElement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtbIndex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtbElement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(290)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnMatch)
								.addComponent(btnPrintArrayIndexes))))
					.addContainerGap(208, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblstArrayIndexes))
						.addComponent(txtFirstArrayIndexes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblstArrayIndexes_1)
						.addComponent(txtSecondArrayIndexes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addComponent(btnPrintArrayIndexes)
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEnterFirstArray)
						.addComponent(txtaIndex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblElementOfFirst)
						.addComponent(txtaElement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEnterSecondArray, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtbIndex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblElementOfSecond)
						.addComponent(txtbElement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblStatus)
						.addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
					.addComponent(btnMatch)
					.addGap(28))
		);
		btnMatch.addActionListener(this);
		getContentPane().setLayout(groupLayout);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getActionCommand());
		if(e.getActionCommand() == "Print Array Indexes")
		{
			ml.printArray(a,txtFirstArrayIndexes);
			ml.printArray(b, txtSecondArrayIndexes);
		}
		else if(e.getActionCommand() == "Match")
		{
			mainl.playIt(txtFirstArrayIndexes,txtSecondArrayIndexes,txtaIndex,txtbIndex,txtaElement,txtbElement,txtStatus,a,b);
			if(ml.isMatchedAll())
			{
				txtStatus.setText("Winner");
			}
		}
		//getContentPane().setBackground(Color.blue);
	}
}
