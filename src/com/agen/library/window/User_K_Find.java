/*
 * Book_K_Find.java
 *
 * Created on __DATE__, __TIME__
 */

package com.agen.library.window;

import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.agen.library.factory.DAOFactory;
import com.agen.library.vo.User;

/**
 * 
 * @author __USER__
 */
public class User_K_Find extends javax.swing.JFrame {

	/**
	 * 初始化表格里的内容
	 */
	private static final long serialVersionUID = 1L;
	private String[] head = { "用户id", "密码", "用户姓名", "权限" };
	private Object[][] inital = { {null, null, null, null },
			{null, null, null, null }, {  null, null, null, null },
			{ null, null, null, null }, { null, null, null, null },
			{ null, null, null, null }, {  null, null, null, null },
			{ null, null, null, null }, { null, null, null, null },
			{null, null, null, null }, { null, null, null, null },
			{  null, null, null, null }, {  null, null, null, null },
			{  null, null, null, null }, {null, null, null, null },
			{  null, null, null, null }, {  null, null, null, null },
			{  null, null, null, null }, {  null, null, null, null },
			{  null, null, null, null }, {  null, null, null, null },
			{ null, null, null, null }, {  null, null, null, null },
			{  null, null, null, null }, {  null, null, null, null },
			{  null, null, null, null }, {  null, null, null, null },
			{ null, null, null, null } };

	/** Creates new form Book_K_Find */
	public User_K_Find() {
		super("Library User Find");
		Image ime = new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ico.png")).getImage();
		setIconImage(ime);
		initComponents();
		setLocationRelativeTo(null);
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jSeparator1 = new javax.swing.JSeparator();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jProgressBar1 = new javax.swing.JProgressBar();
		jProgressBar1.setMaximum(100);
		jProgressBar1.setMinimum(0);
		jProgressBar1.setValue(0);
		jProgressBar1.setVisible(false);
		jProgressBar1.setStringPainted(false); //不显示字符串

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jTextField1.setSelectionColor(new java.awt.Color(198, 209, 232));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextField1KeyPressed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton1.setText("\u67e5\u627e");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jLabel1.setText("\u8bf7\u8f93\u5165\u5173\u952e\u5b57\uff1a");

		jTable1.setAutoCreateRowSorter(true);
		jTable1.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(inital, head));
		jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
		jTable1.setDragEnabled(true);
		jTable1.setFillsViewportHeight(true);
		jTable1.setFocusCycleRoot(true);
		jTable1.setOpaque(false);
		jTable1.setRowHeight(30);
		jTable1.setSelectionBackground(new java.awt.Color(140, 205, 233));
		jTable1.getTableHeader().setReorderingAllowed(false);
		jScrollPane1.setViewportView(jTable1);

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												174,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												684, Short.MAX_VALUE)
										.addComponent(
												jProgressBar1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												276,
												javax.swing.GroupLayout.PREFERRED_SIZE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jProgressBar1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 28,
						Short.MAX_VALUE)
				.addComponent(jLabel2,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 28,
						Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(303,
																		303,
																		303)
																.addComponent(
																		jLabel1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		315,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(77, 77,
																		77)
																.addComponent(
																		jSeparator1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		964,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(23, 23,
																		23)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		1092,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(23, Short.MAX_VALUE))
				.addComponent(jPanel2,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														36,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														31,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														31,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										568,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32)
								.addComponent(jPanel2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
		// GEN-END:initComponents

	private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {
		// 响应回车键
		if (evt.getKeyChar() == '\n') {
			jProgressBar1.setVisible(true);

			// 设置状态
			Long search_start = System.currentTimeMillis();
			Long search_end = 0L;

			jLabel2.setText("正在查询...");

			// 接收关键字
			String key_word = jTextField1.getText();
			List<User> alllist = null;
			try {
				alllist = DAOFactory.getIUserDAOInstance().findAll(key_word);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (alllist.size() != 0) {
				Object[][] results = getResult(alllist);
				jTable1.setModel(new javax.swing.table.DefaultTableModel(
						results, head) {

					private static final long serialVersionUID = 1L;
					boolean[] canEdit = new boolean[] { true, true, true, true,
							true, true, true };

					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return canEdit[columnIndex];
					}
				});
				jLabel2.setText("查询完成！");

				// 获取查询所需的时间
				search_end = System.currentTimeMillis();
				final int need_time = (int) (search_end - search_start);
				jProgressBar1.setMaximum(need_time);

				new Thread() {
					public void run() {
						int i = 0;
						while (i <= need_time) {
							try {
								Thread.sleep(1);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							jProgressBar1.setValue(i);
							i++;
						}
						jProgressBar1.setVisible(false);
					}

				}.start();

			}
			if (alllist.size() == 0) {
				// 如果不存在...

				jProgressBar1.setValue(100);
				jLabel2.setText("查询完成！");
				JOptionPane.showMessageDialog(null, "没有对应的信息！", "消息", 1);
				jProgressBar1.setVisible(false);
				return;
			}

		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// 响应查询按钮
		jProgressBar1.setVisible(true);

		// 设置状态
		Long search_start = System.currentTimeMillis();
		Long search_end = 0L;

		jLabel2.setText("正在查询...");

		// 接收关键字
		String key_word = jTextField1.getText();
		List<User> alllist = null;
		try {
			alllist = DAOFactory.getIUserDAOInstance().findAll(key_word);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (alllist.size() != 0) {
			Object[][] results = getResult(alllist);
			jTable1.setModel(new javax.swing.table.DefaultTableModel(results,
					head) {

				private static final long serialVersionUID = 1L;
				boolean[] canEdit = new boolean[] { true, true, true, true,
						true, true, true };

				public boolean isCellEditable(int rowIndex, int columnIndex) {
					return canEdit[columnIndex];
				}
			});
			jLabel2.setText("查询完成！");

			// 获取查询所需的时间
			search_end = System.currentTimeMillis();
			final int need_time = (int) (search_end - search_start);
			jProgressBar1.setMaximum(need_time);

			
			new Thread() {
				public void run() {
					int i = 0;
					while (i <= need_time) {
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						jProgressBar1.setValue(i);
						i++;
					}
					jProgressBar1.setVisible(false);
				}

			}.start();
			 
		}
		if (alllist.size() == 0) {
			// 如果不存在...

			jProgressBar1.setValue(100);
			jLabel2.setText("查询完成！");
			JOptionPane.showMessageDialog(null, "没有对应的信息！", "消息", 1);
			jProgressBar1.setVisible(false);
			return;
		}

	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private Object[][] getResult(List<User> list) {
		Object[][] results = new Object[list.size()][head.length];
		for (int i = 0; i < list.size(); i++) {
			User user = list.get(i);
			results[i][0] = user.getLogin_id();
			results[i][1] = user.getPass();
			results[i][2] = user.getName();
			results[i][3] = user.getIs_admin();

		}
		return results;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new User_K_Find().setVisible(true);
			}
		});

	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JProgressBar jProgressBar1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}