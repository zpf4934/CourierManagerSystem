/*
 * BookAdd.java
 *
 * Created on __DATE__, __TIME__
 */

package com.agen.library.window;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.agen.library.factory.DAOFactory;
import com.agen.library.util.DateUtil;
import com.agen.library.util.GlobalUser;
import com.agen.library.vo.Receive;

/**
 * 
 * @author __USER__
 */
public class Scan extends javax.swing.JFrame {

	private static final long serialVersionUID = -4036478391423600029L;

	String[] paisong = {"¥˝∂®","◊‘»°","≈…ÀÕ"};
	String[] jiesuan = {"ºƒ∏∂","µΩ∏∂"};
	String[] qianshou = {"Œ¥«© ’","“—«© ’","ÕÀº˛","Œ Ã‚÷Õ¡Ù","Œ Ã‚∑µø‚"};
	public Scan() {
		super("≈…º˛…®√Ë");
		Image ime = new ImageIcon(this.getClass().getClassLoader().getResource("com/images/ico.png")).getImage();
		setIconImage(ime);
		initComponents();
		this.setResizable(false);
		setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();
		jTextField8 = new javax.swing.JTextField();
		jTextField9 = new javax.swing.JTextField();
		jTextField10 = new javax.swing.JComboBox(paisong);
		jTextField11 = new javax.swing.JTextField();
		jTextField12 = new javax.swing.JTextField();
		jTextField13 = new javax.swing.JTextField();
		jTextField14 = new javax.swing.JComboBox(jiesuan);
		jTextField15 = new javax.swing.JTextField();
		jTextField16 = new javax.swing.JComboBox(qianshou);
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jTextField1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField3.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		jTextField4.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField5.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jTextField5.setText(DateUtil.getDateTime());

		jTextField6.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		jTextField7.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField8.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField9.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jTextField9.setText(String.valueOf(GlobalUser.LOGIN_USER.getLogin_id()));
		
		jTextField10.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField11.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField12.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jTextField12.setText(DateUtil.getDateTime());
		
		jTextField13.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jTextField13.setText(String.valueOf(GlobalUser.LOGIN_USER.getLogin_id()));

		jTextField14.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField15.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		jTextField16.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

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

		jLabel1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 18));
		jLabel1.setText("≈…º˛–≈œ¢");

		jLabel2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel2.setText("*øÏµ›∆∑≈∆");

		jLabel3.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel3.setText("*‘À  µ•  ∫≈");

		jLabel4.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel4.setText("*π‹¿Ì±‡∫≈");
		
		jLabel5.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel5.setText("*µΩº˛ ±º‰");

		jLabel6.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel6.setText("* ’º˛»ÀµÁª∞");

		jLabel7.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel7.setText("* ’º˛»À–’√˚");

		jLabel8.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel8.setText("* ’º˛»Àµÿ÷∑");
		
		jLabel9.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel9.setText("*…®  √Ë  ‘±");
		
		jLabel10.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel10.setText("*≈…º˛«Èøˆ");
		
		jLabel11.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel11.setText("*≈…  º˛  ‘±");
		
		jLabel12.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel12.setText("*¥¶¿Ì ±º‰");
		
		jLabel13.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel13.setText("*≤Ÿ  ◊˜  ‘±");
		
		jLabel14.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel14.setText("*Ω·À„∑Ω Ω");
		
		jLabel15.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel15.setText("±∏       ◊¢");
		
		jLabel16.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel16.setText("* «∑Ò«© ’");
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(100, Short.MAX_VALUE)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap(100, Short.MAX_VALUE)
								.addComponent(jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1, Short.MAX_VALUE)
								.addComponent(jTextField2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										200, 
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel3,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								 80,
								 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField3, 
								javax.swing.GroupLayout.PREFERRED_SIZE,
								200, 
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel7,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField7, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel6,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField6, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel8,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField8, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel11,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField11, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel5,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField5, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel12,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField12, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
									.addContainerGap(100, Short.MAX_VALUE))
				.addGroup( 
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel15,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField15, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel4,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField4, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))				
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel9,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField9, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel13,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField13, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel10,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField10, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
																	
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel14,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField14, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jLabel16,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField16, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(100, Short.MAX_VALUE)
						.addComponent(jButton1,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jButton2, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jButton3, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(100, Short.MAX_VALUE))
																		);
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2)
										.addComponent(jTextField2))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3)
										.addComponent(jTextField3))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel7)
										.addComponent(jTextField7))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel6)
										.addComponent(jTextField6))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel8)
										.addComponent(jTextField8))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel11)
										.addComponent(jTextField11))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5)
										.addComponent(jTextField5))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel12)
										.addComponent(jTextField12))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel4)
										.addComponent(jTextField4))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel15)
										.addComponent(jTextField15))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel9)
										.addComponent(jTextField9))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel13)
										.addComponent(jTextField13))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel10)
										.addComponent(jTextField10))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel14)
										.addComponent(jTextField14))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel16)
										.addComponent(jTextField16))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jButton1)
										.addComponent(jButton2)
										.addComponent(jButton3))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// «Â≥˝–≈œ¢
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField7.setText("");
		jTextField6.setText("");
		jTextField8.setText("");
		jTextField11.setText("");
		//jTextField5.setText("");
		//jTextField12.setText("");
		jTextField15.setText("");
		jTextField4.setText("");
		jTextField1.requestFocus();

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		String id = jTextField3.getText().trim();
		String name = jTextField2.getText().trim();
		String managerid = jTextField4.getText().trim();
	    String signs = qianshou[jTextField16.getSelectedIndex()];
	    String receivedate = jTextField5.getText().trim();
	    String receivephone  = jTextField6.getText().trim();
	    String receivename = jTextField7.getText().trim();
	   String  receiveadress = jTextField8.getText().trim();
	    String scanid = jTextField9.getText().trim();
	    String sends  = paisong[jTextField10.getSelectedIndex()];
	    String sendname = jTextField11.getText().trim();
	    String dotime  = jTextField12.getText().trim();
	    String doname  = jTextField13.getText().trim();
	    String settlement  = jiesuan[jTextField14.getSelectedIndex()];
	   String beizhu  = jTextField15.getText().trim();

		Receive borrow = new Receive();
		if (id != null && !id.equals("") && name != null && !name.equals("")
				&& managerid != null && !managerid.equals("")
						&& signs != null && !signs.equals("")
								&& receivedate != null && !receivedate.equals("")
								&& receivephone != null && !receivephone.equals("")
								&& receivename != null && !receivename.equals("")
								&& receiveadress != null && !receiveadress.equals("")
								&& scanid != null && !scanid.equals("")
								&& sends != null && !sends.equals("")
								&& sendname != null && !sendname.equals("")
								&& dotime != null && !dotime.equals("")
								&& doname != null && !doname.equals("")
								&& settlement != null && !settlement.equals("")) {
			try {
					borrow.setId(id);
					borrow.setname(name);
					borrow.setmanagerid(Integer.parseInt(managerid));
					borrow.setsigns(signs);
					borrow.setreceivedate(receivedate);
					borrow.setreceivephone(receivephone);
					borrow.setreceivename(receivename);
					borrow.setreceiveadress(receiveadress);
					borrow.setscanid(scanid);
					borrow.setsends(sends);
					borrow.setsendname(sendname);
					borrow.setsettlement(settlement);
					borrow.setbeizhu(beizhu);
					borrow.setdotime(dotime);
					borrow.setdoname(doname);
					boolean flag = false;
					{
						try {
							flag = DAOFactory.getIBorrowDAOInstance().doCreate(
									borrow);
							if (flag) {
								JOptionPane.showMessageDialog(null, "ÃÌº”≥…π¶£°",
										"œ˚œ¢", 1);
								this.dispose();

							} else {
								JOptionPane.showMessageDialog(null, "«Î»œ’Ê ‰»Î£°",
										"œ˚œ¢", 1);
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
				new Scan().setVisible(true);

			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private javax.swing.JComboBox jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JComboBox jTextField14;
	private javax.swing.JTextField jTextField15;
	private javax.swing.JComboBox jTextField16;
	// End of variables declaration//GEN-END:variables

}