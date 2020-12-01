package com.artisan.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.artisan.dao.ClassDao;
import com.artisan.dao.StudentDao;
import com.artisan.model.Student;
import com.artisan.model.StudentClass;
import com.artisan.util.StringUtil;

public class AddStudentFrm extends JInternalFrame {
	private JTextField studentNameTextField;
	private JPasswordField studentPasswordField;
	private JComboBox studentClassComboBox;
	private ButtonGroup sexButtonGroup;
	private JRadioButton studentSexManRadioButton;
	private JRadioButton studentSexFemalRadioButton;
	private JRadioButton studentSexUnkonwRadioButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudentFrm frame = new AddStudentFrm();
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
	public AddStudentFrm() {
		setClosable(true);
		setIconifiable(true);
		setTitle("ÃÌº”—ß…˙");
		setBounds(100, 100, 450, 300);

		JLabel label = new JLabel("—ß…˙–’√˚:");
		label.setIcon(new ImageIcon(AddStudentFrm.class.getResource("/images/\u5B66\u751F\u7BA1\u7406.png")));
		label.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));
		
		studentNameTextField = new JTextField();
		studentNameTextField.setColumns(10);

		JLabel label_1 = new JLabel("À˘ Ù∞‡º∂:");
		label_1.setIcon(new ImageIcon(AddStudentFrm.class.getResource("/images/\u73ED\u7EA7\u540D\u79F0.png")));
		label_1.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));
		
		studentClassComboBox = new JComboBox();
		studentClassComboBox.setModel(new DefaultComboBoxModel(new String[] {}));

		JLabel label_2 = new JLabel("µ«¬º√‹¬Î:");
		label_2.setIcon(new ImageIcon(AddStudentFrm.class.getResource("/images/password.png")));
		label_2.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));
		
		studentPasswordField = new JPasswordField();

		JLabel label_3 = new JLabel("—ß…˙–‘±:");
		label_3.setIcon(new ImageIcon(AddStudentFrm.class.getResource("/images/\u6027\u522B.png")));
		label_3.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));

		studentSexManRadioButton = new JRadioButton("ƒ–");
		studentSexManRadioButton.setSelected(true);

		studentSexFemalRadioButton = new JRadioButton("≈Æ");

		studentSexUnkonwRadioButton = new JRadioButton("±£√‹");
		
		sexButtonGroup = new ButtonGroup();
		sexButtonGroup.add(studentSexManRadioButton);
		sexButtonGroup.add(studentSexFemalRadioButton);
		sexButtonGroup.add(studentSexUnkonwRadioButton);

		JButton submitButton = new JButton("»∑»œ");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				studentAddAct(ae);
			}
		});
		submitButton.setIcon(new ImageIcon(AddStudentFrm.class.getResource("/images/\u786E\u8BA4.png")));
		submitButton.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));

		JButton resetButton = new JButton("÷ÿ÷√");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				resetValue(ae);
			}
		});
		resetButton.setIcon(new ImageIcon(AddStudentFrm.class.getResource("/images/\u91CD\u7F6E.png")));
		resetButton.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 14));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(91)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(studentPasswordField, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(studentClassComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(studentNameTextField, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
							.addGap(92))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(resetButton)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_3)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(studentSexManRadioButton)
									.addGap(10)
									.addComponent(studentSexFemalRadioButton)
									.addGap(10)
									.addComponent(studentSexUnkonwRadioButton)))
							.addContainerGap())))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(132)
					.addComponent(submitButton)
					.addContainerGap(221, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(studentNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(studentClassComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(studentPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(studentSexManRadioButton)
						.addComponent(studentSexUnkonwRadioButton)
						.addComponent(studentSexFemalRadioButton))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(submitButton)
						.addComponent(resetButton))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		setStudentClassInfo();
	}

	protected void resetValue(ActionEvent ae) {
		// TODO Auto-generated method stub
		studentNameTextField.setText("");
		studentPasswordField.setText("");
		studentClassComboBox.setSelectedIndex(0);
		sexButtonGroup.clearSelection();
		studentSexManRadioButton.setSelected(true);
	}

	protected void studentAddAct(ActionEvent ae) {
		// TODO Auto-generated method stub
		String studentName = studentNameTextField.getText().toString();
		String studentPassword = studentPasswordField.getText().toString();
		if(StringUtil.isEmpty(studentName)){
			JOptionPane.showMessageDialog(this, "«ÎÃÓ–¥—ß…˙–’√˚!");
			return;
		}
		if(StringUtil.isEmpty(studentPassword)){
			JOptionPane.showMessageDialog(this, "«ÎÃÓ–¥√‹¬Î!");
			return;
		}
		StudentClass sc = (StudentClass)studentClassComboBox.getSelectedItem();
		String sex = studentSexManRadioButton.isSelected() ? studentSexManRadioButton.getText() : (studentSexFemalRadioButton.isSelected() ? studentSexFemalRadioButton.getText() : studentSexUnkonwRadioButton.getText());
		Student student = new Student();
		student.setName(studentName);
		student.setClassId(sc.getId());
		student.setPassword(studentPassword);
		student.setSex(sex);
		StudentDao studentDao = new StudentDao();
		if(studentDao.addStudent(student)){
			JOptionPane.showMessageDialog(this, "ÃÌº”≥…π¶!");
		}else{
			JOptionPane.showMessageDialog(this, "ÃÌº” ß∞‹!");
		}
		resetValue(ae);
	}
	
	private void setStudentClassInfo(){
		ClassDao classDao = new ClassDao();
		List<StudentClass> classList = classDao.getClassList(new StudentClass());
		for (StudentClass sc : classList) {
			studentClassComboBox.addItem(sc);
		}
		classDao.closeDao();
	}
}
