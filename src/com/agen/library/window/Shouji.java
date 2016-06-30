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
import com.agen.library.vo.Send;

/**
 * 
 * @author __USER__
 */
public class Shouji extends javax.swing.JFrame {

	private static final long serialVersionUID = -4036478391423600029L;

	String[] paisong = {"ŒÔ∆∑","Œƒº˛"};
	String[] jiesuan = {"ºƒ∏∂","µΩ∏∂"};
	String[] qianshou = {"Œ¥«© ’","“—«© ’","ÕÀº˛","Œ Ã‚÷Õ¡Ù","Œ Ã‚∑µø‚"};
	public Shouji() {
		super(" ’ºƒøÏº˛");
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
		jTextField17 = new javax.swing.JTextField();
		jTextField18 = new javax.swing.JTextField();
		jTextField19 = new javax.swing.JTextField();
		jTextField20 = new javax.swing.JTextField();
		jTextField21 = new javax.swing.JTextField();
		jTextField22 = new javax.swing.JTextField("");
		jTextField23 = new javax.swing.JTextField("");
		jTextField24 = new javax.swing.JTextField();
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
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		
		
		new Thread(){
			public void run(){
				while(true){
					if(jTextField22.getText().trim()!=null&&jTextField23.getText().trim()!=null&&
							!jTextField22.getText().trim().equals("")&&!jTextField23.getText().trim().equals("")){
					jTextField24.setText(String.valueOf(Float.parseFloat(jTextField22.getText().trim()) * Float.parseFloat(jTextField23.getText().trim())));
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();

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
		
		jTextField13.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jTextField13.setText(String.valueOf(GlobalUser.LOGIN_USER.getLogin_id()));

		jTextField14.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField15.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		jTextField16.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		jTextField17.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		jTextField18.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField19.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField20.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		jTextField21.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField22.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));

		jTextField23.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		jTextField24.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		
		/*jTextField24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField24ActionPerformed(evt);
			}
		});*/
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
		jLabel1.setText("ºƒº˛–≈œ¢");

		jLabel2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel2.setText("*øÏµ›∆∑≈∆");

		jLabel3.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel3.setText("*‘À  µ•  ∫≈");

		jLabel4.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel4.setText("*ºƒº˛»ÀµÁª∞");
		
		jLabel5.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel5.setText("*ºƒº˛ ±º‰");

		jLabel6.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel6.setText("* ’º˛»ÀµÁª∞");

		jLabel7.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel7.setText("* ’º˛»À–’√˚");

		jLabel8.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel8.setText("* ’º˛»Àµÿ÷∑");
		
		jLabel9.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel9.setText("*…®  √Ë  ‘±");
		
		jLabel10.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel10.setText("*ƒ⁄    »›");
		
		jLabel11.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel11.setText("* ’º˛»Àµ•Œª");
		
		jLabel12.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel12.setText("*ºƒº˛»À–’√˚");
		
		jLabel13.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel13.setText("*≤Ÿ  ◊˜  ‘±");
		
		jLabel14.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel14.setText("*Ω·À„∑Ω Ω");
		
		jLabel15.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel15.setText("±∏       ◊¢");
		
		jLabel16.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel16.setText("* «∑Ò«© ’");
		
		jLabel17.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel17.setText("* °");
		
		jLabel18.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel18.setText("* –");
		
		jLabel19.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel19.setText("*£®«¯£©œÿ");
		
		jLabel20.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel20.setText("*ºƒº˛»Àµÿ÷∑");
		
		jLabel21.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel21.setText("*ºƒº˛»Àµ•Œª");
		
		jLabel22.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel22.setText("*º€      ∏Ò");
		
		jLabel23.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel23.setText("*÷ÿ     ¡ø");
		
		jLabel24.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 0, 14));
		jLabel24.setText("*‘À     ∑—");
		
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
								.addContainerGap(5, Short.MAX_VALUE)
								.addComponent(jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										70,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1, Short.MAX_VALUE)
								.addComponent(jTextField2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										200, 
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(280, Short.MAX_VALUE)
								.addComponent(jLabel7,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1, Short.MAX_VALUE)
								.addComponent(jTextField7,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										100, 
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1, Short.MAX_VALUE)
								.addComponent(jLabel6,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1, Short.MAX_VALUE)
								.addComponent(jTextField6,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										100, 
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(5, Short.MAX_VALUE)
						.addComponent(jLabel3,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								 70,
								 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField3, 
								javax.swing.GroupLayout.PREFERRED_SIZE,
								200, 
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(280, Short.MAX_VALUE)
								.addComponent(jLabel11,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(1, Short.MAX_VALUE)
								.addComponent(jTextField11,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										330, 
										javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(5, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
						.addContainerGap(5, Short.MAX_VALUE)
						.addComponent(jLabel4,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField4, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel12,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField12, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									100, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(10, Short.MAX_VALUE)
						.addComponent(jLabel8,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField17,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel17,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 20,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField18,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel18,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 20,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField19,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel19,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 90,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(5, Short.MAX_VALUE))
				.addGroup( 
						layout.createSequentialGroup()
						.addContainerGap(5, Short.MAX_VALUE)
						.addComponent(jLabel21,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField21, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel20,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField20, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(10, Short.MAX_VALUE)
						.addComponent(jTextField8, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									350, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(95, Short.MAX_VALUE))	
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
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel9,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									 javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField9, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
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
						.addComponent(jLabel22,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField22, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel23,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField23, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel24,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									 80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField24, 
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
									800, 
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
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jLabel14,
									javax.swing.GroupLayout.PREFERRED_SIZE,
									80,
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
						.addComponent(jTextField14, 
									javax.swing.GroupLayout.PREFERRED_SIZE,
									200, 
									javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(1, Short.MAX_VALUE)
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
										.addComponent(jTextField2)
										.addComponent(jLabel7)
										.addComponent(jTextField7)
										.addComponent(jLabel6)
										.addComponent(jTextField6))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3)
										.addComponent(jTextField3)
										.addComponent(jLabel11)
										.addComponent(jTextField11))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel4)
										.addComponent(jTextField4)
										.addComponent(jLabel12)
										.addComponent(jTextField12)
										.addComponent(jLabel8)
										.addComponent(jTextField17)
										.addComponent(jLabel17)
										.addComponent(jTextField18)
										.addComponent(jLabel18)
										.addComponent(jTextField19)
										.addComponent(jLabel19))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel21)
										.addComponent(jTextField21)
										.addComponent(jLabel20)
										.addComponent(jTextField20)
										.addComponent(jTextField8))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5)
										.addComponent(jTextField5)
										.addComponent(jLabel9)
										.addComponent(jTextField9)
										.addComponent(jLabel13)
										.addComponent(jTextField13))
								.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

						.addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel22)
										.addComponent(jTextField22)
										.addComponent(jLabel23)
										.addComponent(jTextField23)
										.addComponent(jLabel24)
										.addComponent(jTextField24))
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
										.addComponent(jLabel10)
										.addComponent(jTextField10)
										.addComponent(jLabel14)
										.addComponent(jTextField14)
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
		jTextField4.setText("");
		jTextField11.setText("");
		jTextField12.setText("");
		jTextField15.setText("");
		jTextField17.setText("");
		jTextField18.setText("");
		jTextField19.setText("");
		jTextField20.setText("");
		jTextField21.setText("");
		jTextField22.setText("");
		jTextField23.setText("");
		jTextField24.setText("");
		jTextField1.requestFocus();

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		
		float jiage = (float) 0.00;
		float zhong = (float) 0.00;
		float yunfei = (float)0.00;

		String id = jTextField3.getText().trim();
		String name = jTextField2.getText().trim();
		String jijiandianhua = jTextField4.getText().trim();
	    String signs = qianshou[jTextField16.getSelectedIndex()];
	    String jijianshijian = jTextField5.getText().trim();
	    String shoujiandianhua  = jTextField6.getText().trim();
	    String shoujianxingming = jTextField7.getText().trim();
	   String shoujiandizhi = jTextField8.getText().trim();
	    String scanid = jTextField9.getText().trim();
	    String neirong  = paisong[jTextField10.getSelectedIndex()];
	    String shoujiandanwei = jTextField11.getText().trim();
	    String jijianxingming  = jTextField12.getText().trim();
	    String doname  = jTextField13.getText().trim();
	    String settlement  = jiesuan[jTextField14.getSelectedIndex()];
	   String beizhu  = jTextField15.getText().trim();
	   String sheng = jTextField17.getText().trim();
	   String shi = jTextField18.getText().trim();
	   String xian = jTextField19.getText().trim();
	   String jijiandanwei = jTextField21.getText().trim();
	   String jijiandizhi = jTextField20.getText().trim();
	   if(jTextField22.getText().trim() != null && !jTextField22.getText().trim().equals("")
				&& jTextField23.getText().trim() != null && !jTextField23.getText().trim().equals("")
				&& jTextField24.getText().trim() != null && !jTextField24.getText().trim().equals("")){
	   jiage = Float.parseFloat(jTextField22.getText().trim());
	   zhong = Float.parseFloat(jTextField23.getText().trim());
	   yunfei = Float.parseFloat(jTextField24.getText().trim());
	}else {
		JOptionPane.showMessageDialog(null, "«Î»œ’Ê ‰»Î£°", "œ˚œ¢", 1);
	}

		Send send = new Send();
		if (id != null && !id.equals("") && name != null && !name.equals("")
				&& jijiandianhua != null && !jijiandianhua.equals("")
						&& signs != null && !signs.equals("")
								&& jijianshijian != null && !jijianshijian.equals("")
								&& shoujiandianhua != null && !shoujiandianhua.equals("")
								&& shoujianxingming != null && !shoujianxingming.equals("")
								&& shoujiandizhi != null && !shoujiandizhi.equals("")
								&& scanid != null && !scanid.equals("")
								&& neirong != null && !neirong.equals("")
								&& shoujiandanwei != null && !shoujiandanwei.equals("")
								&& jijianxingming != null && !jijianxingming.equals("")
								&& doname != null && !doname.equals("")
								&& settlement != null && !settlement.equals("")
								&& sheng != null && !sheng.equals("")
								&& shi != null && !shi.equals("")
								&& xian != null && !xian.equals("")
								&& jijiandanwei != null && !jijiandanwei.equals("")
								&& jijiandizhi != null && !jijiandizhi.equals("")) {
			try {
					send.setbeizhu(beizhu);
					send.setdoname(doname);
					send.setid(id);
					send.setjiage(jiage);
					send.setjijiandanwei(jijiandanwei);
					send.setjijiandianhua(jijiandianhua);
					send.setjijiandizhi(jijiandizhi);
					send.setjijianshijian(jijianshijian);
					send.setjijianxingming(jijianxingming);
					send.setname(name);
					send.setneirong(neirong);
					send.setscanid(scanid);
					send.setsettlement(settlement);
					send.setsheng(sheng);
					send.setshi(shi);
					send.setshoujiandanwei(shoujiandanwei);
					send.setshoujiandianhua(shoujiandianhua);
					send.setshoujiandizhi(shoujiandizhi);
					send.setshoujianxingming(shoujianxingming);
					send.setsigns(signs);
					send.setxian(xian);
					send.setyunfei(yunfei);
					send.setzhong(zhong);
					boolean flag = false;
					{
						try {
							flag = DAOFactory.getIBorrowDAOInstance().doSend(
									send);
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
	
	
	
	//public void jTextField24ActionPerformed(java.awt.event.ActionEvent evt){
	//	jTextField24.setText(String.valueOf(Float.parseFloat(jTextField22.getText().trim()) * Float.parseFloat(jTextField23.getText().trim())));
	//}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void start() {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Shouji().setVisible(true);

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
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
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
	private javax.swing.JTextField jTextField17;
	private javax.swing.JTextField jTextField18;
	private javax.swing.JTextField jTextField19;
	private javax.swing.JTextField jTextField20;
	private javax.swing.JTextField jTextField21;
	private javax.swing.JTextField jTextField22;
	private javax.swing.JTextField jTextField23;
	private javax.swing.JTextField jTextField24;
	// End of variables declaration//GEN-END:variables

}