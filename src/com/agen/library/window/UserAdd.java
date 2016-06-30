/*
 * BookAdd.java
 *
 * Created on __DATE__, __TIME__
 */

package com.agen.library.window;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.agen.library.factory.DAOFactory;
import com.agen.library.vo.User;

/**
 * 
 * @author __USER__
 */
public class UserAdd extends javax.swing.JFrame {

	private static final long serialVersionUID = -4036478391423600029L;

	public UserAdd() {
		super("ÃÌº””√ªß");
		Image ime = new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ico.png")).getImage();
		setIconImage(ime);
		initComponents();
		this.setResizable(false);
		setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel1.setText("\u6dfb\u52a0\u7528\u6237\u4fe1\u606f");

		jLabel2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel2.setText("I D  \uff1a");

		jLabel3.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel3.setText("\u5bc6\u7801\uff1a");

		jLabel4.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel4.setText("\u540d\u79f0\uff1a");

		jTextField1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField3.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jButton1.setBackground(new java.awt.Color(223, 216, 216));
		jButton1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jButton1.setText("save");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(223, 216, 216));
		jButton2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jButton2.setText("close");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(223, 216, 216));
		jButton3.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jButton3.setText("reset");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel9.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel9.setForeground(new java.awt.Color(247, 10, 10));
		jLabel9.setText("*");

		jLabel10.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel10.setForeground(new java.awt.Color(247, 10, 10));
		jLabel10.setText("*");

		jLabel11.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel11.setText("\u6743\u9650\uff1a");

		jComboBox1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"π‹¿Ì‘±", "∆’Õ®”√ªß" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addGap(209, 209, 209)
								.addComponent(jLabel1)
								.addContainerGap(231, Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(108, 108, 108)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel11)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		311,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel2)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel4)
																												.addComponent(
																														jLabel3))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jTextField2,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														281,
																														Short.MAX_VALUE)
																												.addComponent(
																														jTextField3,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														281,
																														Short.MAX_VALUE)
																												.addComponent(
																														jTextField1,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														281,
																														Short.MAX_VALUE)
																												.addComponent(
																														jComboBox1,
																														0,
																														281,
																														Short.MAX_VALUE))))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel10,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						20,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel9,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						20,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(87, 87, 87))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(143, 143, 143)
								.addComponent(jButton1)
								.addGap(32, 32, 32)
								.addComponent(jButton3)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										42, Short.MAX_VALUE)
								.addComponent(jButton2).addGap(138, 138, 138)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(32, 32, 32)
								.addComponent(jLabel1)
								.addGap(77, 77, 77)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel9))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel3))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						jTextField3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel11)
																				.addComponent(
																						jComboBox1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel10)))
								.addGap(71, 71, 71)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2)
												.addComponent(jButton3))
								.addGap(124, 124, 124)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// «Â≥˝–≈œ¢
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jComboBox1.setSelectedIndex(0);
		jTextField1.requestFocus();

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//ÃÌº””√ªß
		String login_id = jTextField1.getText().trim();
		String pass = jTextField2.getText().trim();
		String name = jTextField3.getText().trim();
		int is_admin = jComboBox1.getSelectedIndex();
		boolean flag = false;

		User user = new User();
		if (login_id != null && !login_id.equals("") && pass != null
				&& !pass.equals("")) {

			user.setLogin_id(login_id);
			user.setPass(pass);
			user.setName(name);
			user.setIs_admin(is_admin);
			if (user != null) {
				try {
					flag = DAOFactory.getIUserDAOInstance().doCreate(user);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (flag) {
					JOptionPane.showMessageDialog(null, "ÃÌº”≥…π¶£°", "œ˚œ¢", 1);
					this.dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "≤Ÿ◊˜¥ÌŒÛªÚ∏√”√ªß“—¥Ê‘⁄£°", "œ˚œ¢", 1);
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "«Î»œ’Ê ‰»Î£°", "œ˚œ¢", 1);
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserAdd().setVisible(true);

			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}