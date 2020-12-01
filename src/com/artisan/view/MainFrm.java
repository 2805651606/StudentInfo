package com.artisan.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.artisan.model.UserType;

public class MainFrm extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	public static UserType userType;
	public static Object userObject;
	private JMenuItem addStudentMenuItem ;
	private JMenu manageClassMenu ;
	private JMenu manageTeacherMenu;
	private JMenuItem addTeacherMenuItem;
	private JMenu courseMenu;
	private JMenuItem studentAttdentanceMenuItem;
	private JMenuItem manageAttendanceMenuItem;
	private JMenuItem statsAttendanceMenuItem;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFrm frame = new MainFrm(null,null);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MainFrm(UserType userType,Object userObject) {
		this.userType = userType;
		this.userObject = userObject;
		setTitle("ѧ����Ϣϵͳ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 774);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("ϵͳ����");
		menu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7CFB\u7EDF\u8BBE\u7F6E.png")));
		menuBar.add(menu);

		JMenuItem menuItem = new JMenuItem("�޸�����");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				editPassword(ae);
			}
		});
		menuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u4FEE\u6539\u5BC6\u7801.png")));
		menu.add(menuItem);

		JMenuItem menuItem_1 = new JMenuItem("�˳�ϵͳ");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(MainFrm.this, "ȷ���˳�ô��") == JOptionPane.OK_OPTION){
					System.exit(0);
				}
			}
		});
		menuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9000\u51FA.png")));
		menu.add(menuItem_1);

//		JMenu menu_1 = new JMenu("ѧ������");
//		menu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5B66\u751F\u7BA1\u7406.png")));
//		menuBar.add(menu_1);
//
//		addStudentMenuItem = new JMenuItem("ѧ�����");
//		addStudentMenuItem.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AddStudentFrm addStudentFrm = new AddStudentFrm();
//				addStudentFrm.setVisible(true);
//				desktopPane.add(addStudentFrm);
//			}
//		});
//		addStudentMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u6DFB\u52A0.png")));
//		menu_1.add(addStudentMenuItem);
//
//		JMenuItem menuItem_3 = new JMenuItem("ѧ���б�");
//		menuItem_3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				ManageStudentFrm studentManageFrm = new ManageStudentFrm();
//				studentManageFrm.setVisible(true);
//				desktopPane.add(studentManageFrm);
//			}
//		});
//		menuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7528\u6237\u5217\u8868.png")));
//		menu_1.add(menuItem_3);
//
//		manageClassMenu = new JMenu("�༶����");
//		manageClassMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u73ED\u7EA7\u7BA1\u7406.png")));
//		menuBar.add(manageClassMenu);
//
//		JMenuItem menuItem_4 = new JMenuItem("�༶���");
//		menuItem_4.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
//				addStudentClass(ae);
//			}
//		});
//		menuItem_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u6DFB\u52A0.png")));
//		manageClassMenu.add(menuItem_4);
//
//		JMenuItem menuItem_5 = new JMenuItem("�༶����");
//		menuItem_5.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				ManageClassFrm classManageFrm = new ManageClassFrm();
//				classManageFrm.setVisible(true);
//				desktopPane.add(classManageFrm);
//			}
//		});
//		menuItem_5.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u73ED\u7EA7\u5217\u8868.png")));
//		manageClassMenu.add(menuItem_5);
//
//		manageTeacherMenu = new JMenu("��ʦ����");
//		manageTeacherMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u8001\u5E08.png")));
//		menuBar.add(manageTeacherMenu);
//
//		addTeacherMenuItem = new JMenuItem("��ӽ�ʦ");
//		addTeacherMenuItem.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AddTeacherFrm addTeacherFrm = new AddTeacherFrm();
//				addTeacherFrm.setVisible(true);
//				desktopPane.add(addTeacherFrm);
//			}
//		});
//		addTeacherMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u6DFB\u52A0.png")));
//		manageTeacherMenu.add(addTeacherMenuItem);
//
//		JMenuItem menuItem_8 = new JMenuItem("��ʦ�б�");
//		menuItem_8.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				ManageTeacherFrm manageTeacherFrm = new ManageTeacherFrm();
//				manageTeacherFrm.setVisible(true);
//				desktopPane.add(manageTeacherFrm);
//			}
//		});
//		menuItem_8.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7528\u6237\u5217\u8868.png")));
//		manageTeacherMenu.add(menuItem_8);
//
//		courseMenu = new JMenu("�γ̹���");
//		courseMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u8BFE\u7A0B.png")));
//		menuBar.add(courseMenu);
//
//		JMenuItem addCourseMenuItem = new JMenuItem("��ӿγ�");
//		addCourseMenuItem.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				AddCourseFrm addCourseFrm = new AddCourseFrm();
//				addCourseFrm.setVisible(true);
//				desktopPane.add(addCourseFrm);
//			}
//		});
//		addCourseMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u6DFB\u52A0.png")));
//		courseMenu.add(addCourseMenuItem);
//
//		JMenuItem courseListMenuItem = new JMenuItem("�γ��б�");
//		courseListMenuItem.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				ManageCourseFrm manageCourseFrm = new ManageCourseFrm();
//				manageCourseFrm.setVisible(true);
//				desktopPane.add(manageCourseFrm);
//			}
//		});
//		courseListMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u8BFE\u7A0B\u5217\u8868.png")));
//		courseMenu.add(courseListMenuItem);
//
//		JMenu menu_4 = new JMenu("ѡ�ι���");
//		menu_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9009\u62E9.png")));
//		menuBar.add(menu_4);
//
//		JMenuItem menuItem_2 = new JMenuItem("ѡ�ι���");
//		menuItem_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				ManageSelectedCourseFrm manageSelectedCourseFrm = new ManageSelectedCourseFrm();
//				manageSelectedCourseFrm.setVisible(true);
//				desktopPane.add(manageSelectedCourseFrm);
//			}
//		});
//		menuItem_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9009\u62E9.png")));
//		menu_4.add(menuItem_2);

		JMenu menu_2 = new JMenu("ǩ������");
		menu_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7B7E\u5230.png")));
		menuBar.add(menu_2);

		studentAttdentanceMenuItem = new JMenuItem("ѧ��ǩ��");
		studentAttdentanceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AttendanceStudentFrm attendanceStudentFrm = new AttendanceStudentFrm();
				attendanceStudentFrm.setVisible(true);
				desktopPane.add(attendanceStudentFrm);
			}
		});
		studentAttdentanceMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5B66\u751F\u7BA1\u7406.png")));
		studentAttdentanceMenuItem.setEnabled(false);
		menu_2.add(studentAttdentanceMenuItem);

		manageAttendanceMenuItem = new JMenuItem("ǩ������");
		manageAttendanceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManageAttendanceFrm manageAttendanceFrm = new ManageAttendanceFrm();
				manageAttendanceFrm.setVisible(true);
				desktopPane.add(manageAttendanceFrm);
			}
		});
		manageAttendanceMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7B7E\u5230\u5217\u8868.png")));
		menu_2.add(manageAttendanceMenuItem);

		statsAttendanceMenuItem = new JMenuItem("ǩ��ͳ��");
		statsAttendanceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StatsAttendanceFrm statsAttendanceFrm = new StatsAttendanceFrm();
				statsAttendanceFrm.setVisible(true);
				desktopPane.add(statsAttendanceFrm);
			}
		});
		statsAttendanceMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7EDF\u8BA1.png")));
		menu_2.add(statsAttendanceMenuItem);

//		JMenu menu_3 = new JMenu("����");
//		menu_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5E2E\u52A9.png")));
//		menuBar.add(menu_3);

//		JMenuItem menuItem_6 = new JMenuItem("��������");
//		menuItem_6.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent ae) {
////				aboutUs(ae);
//			}
//		});
//		menuItem_6.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5173\u4E8E\u6211\u4EEC.png")));
//		menu_3.add(menuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(0, 128, 128));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setAuthority();
	}

	protected void addStudentClass(ActionEvent ae) {
		// TODO Auto-generated method stub
		AddStudentClassFrm sca = new AddStudentClassFrm();
		sca.setVisible(true);
		desktopPane.add(sca);
	}

	protected void editPassword(ActionEvent ae) {
		// TODO Auto-generated method stub
		EditPasswordFrm editPasswordFrm = new EditPasswordFrm();
		editPasswordFrm.setVisible(true);
		desktopPane.add(editPasswordFrm);
	}

//	protected void aboutUs(ActionEvent ae) {
//		// TODO Auto-generated method stub
//		String info = "��Գ����ˡ���Ʒ\n";
//		info += "��ַ��http://programmer.ischoolbar.com \n";
//		info += "ÿ�����һ����Ŀ����������Ƶ�̳̣�";
//		String[] buttons = {"�Ȳ�����ȥ����!","���鲻���Ժ���˵!"};
//		int ret = JOptionPane.showOptionDialog(this, info, "��������", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, new ImageIcon(LoginFrm.class.getResource("/images/logo.png")), buttons, null);
//		if(ret == 0){
//			//����Java ����ϵͳ��������ƶ�
//			try {
//				URI uri = new URI("http://programmer.ischoolbar.com");
//				Desktop.getDesktop().browse(uri);
//				//Runtime.getRuntime().exec("explorer http://programmer.ischoolbar.com");
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}else{
//			JOptionPane.showMessageDialog(this, "�����Ǻ��ģ�������");
//		}
//	}
	private void setAuthority(){
		if("ѧ��".equals(userType.getName())){
			addStudentMenuItem.setEnabled(false);
			manageClassMenu.setEnabled(false);
			manageTeacherMenu.setEnabled(false);
			courseMenu.setEnabled(false);
			studentAttdentanceMenuItem.setEnabled(true);
			manageAttendanceMenuItem.setEnabled(false);
			statsAttendanceMenuItem.setEnabled(false);
		}
		if("��ʦ".equals(userType.getName())){
			addTeacherMenuItem.setEnabled(false);
		}
	}
}
