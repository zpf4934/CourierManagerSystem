/*
 * OsINF.java
 *
 * Created on __DATE__, __TIME__
 */

package com.agen.library.window;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import com.agen.library.util.Os;

/**
 *
 * @author  __USER__
 */
public class OsINF extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8942999184290612355L;

	/** Creates new form OsINF */
	public OsINF() {
		super("Library Manager System");
		Image ime = new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ico.png")).getImage();
		setIconImage(ime);
		initComponents();
		setLocationRelativeTo(null);
		this.setResizable(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel1.setForeground(new java.awt.Color(71, 68, 68));
		jLabel1.setText("LibraryManagerSystem");

		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jTextArea1.setLineWrap(true);
		jTextArea1.setText(Os.getStatus());
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton1.setBackground(new java.awt.Color(152, 146, 146));
		jButton1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jButton1.setText("close");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

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
																.addGap(210,
																		210,
																		210)
																.addComponent(
																		jLabel1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(247,
																		247,
																		247)
																.addComponent(
																		jButton1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(48, 48,
																		48)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		511,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(53, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addGap(26, 26, 26)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										378, Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton1).addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new OsINF().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}