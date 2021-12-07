package org.topra.form;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import org.compiere.apps.ADialog;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.model.Query;
import org.compiere.swing.CFrame;
import org.compiere.util.Env;
import org.topra.model.MCAuctionLicense;
import org.topra.model.MCAuctionLicenseSinhala;

public class AuctionLicenseSinhalaInput implements FormPanel, ActionListener {

	private CFrame frame;
	private MCAuctionLicense licence;

	

	@Override
	public void init(int WindowNo, FormFrame frame) {
		this.frame = frame.getCFrame();

		this.initComponents(licence);

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JTextField txtLocation;
	private javax.swing.JTextField txtRes;
	private javax.swing.JTextField txtCustomer;
	private javax.swing.JTextField txtDate;

	public void initComponents(MCAuctionLicense licence) {

		this.licence = licence;

		if (frame == null) {
			Frame owner = Env.getWindow(0);
			frame = new CFrame(owner.getGraphicsConfiguration());
			frame.setSize(636, 433);

			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		}

		jPanel4 = new javax.swing.JPanel();
		txtLocation = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		txtRes = new javax.swing.JTextField();
		txtCustomer = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		txtDate = new javax.swing.JTextField();

		frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		frame.setTitle("National Jem & Jewellery Authority");

		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "මැණික් වෙන්දේසි අවසර පත්‍රය  ",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Iskoola Pota", 1, 15))); // NOI18N

		txtLocation.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N

		jLabel1.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jLabel1.setText("දිනය");

		txtRes.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N

		txtCustomer.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N

		jLabel2.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N

		jLabel3.setFont(new java.awt.Font("Iskoola Pota", 0, 13)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jLabel3.setText("ස්ථානය");

		jLabel4.setFont(new java.awt.Font("Iskoola Pota", 0, 13)); // NOI18N
		jLabel4.setText("අයදුම්කරු");

		jLabel5.setFont(new java.awt.Font("Iskoola Pota", 0, 13)); // NOI18N
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		jLabel5.setText("පදිංචිය");

		jButton1.setBackground(new java.awt.Color(102, 255, 102));
		jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
		jButton1.setText("SAVE");
		jButton1.addActionListener(this);

		txtDate.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(13, 13, 13)
										.addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
								.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(
										jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(2, 2, 2)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(42, 42, 42).addComponent(jLabel2)
										.addContainerGap())
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(8, 8, 8)
										.addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtLocation)
												.addGroup(jPanel4Layout.createSequentialGroup()
														.addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE,
																240, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 235, Short.MAX_VALUE))
												.addComponent(txtRes)))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel4Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel4Layout.createSequentialGroup().addGap(12, 12, 12).addComponent(jLabel4)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(txtCustomer)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(77, 77, 77).addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1))
						.addGap(13, 13, 13)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
						.addComponent(jButton1).addGap(23, 23, 23)));
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
		frame.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		frame.pack();
		// set defaults
		this.setDefaults(licence);

		frame.show(true);

	}

	private void setDefaults(MCAuctionLicense licence) {

		List<MCAuctionLicenseSinhala> list = new Query(licence.getCtx(), MCAuctionLicenseSinhala.Table_Name,
				"C_AuctionLicense_ID= ?", licence.get_TrxName()).setParameters(licence.get_ID()).list();

		if (list.size() == 0) {
			txtDate.setText(String.valueOf(licence.getStartDate()));
		}else {
			
			MCAuctionLicenseSinhala alreadySavedLicense = list.get(0);
			
			txtDate.setText(alreadySavedLicense.getDateConfirm());
			txtLocation.setText(alreadySavedLicense.getLocation());
            txtRes.setText(alreadySavedLicense.getResidence());   
            txtCustomer.setText(alreadySavedLicense.getName());
            
            txtDate.setEditable(false);
			txtLocation.setEditable(false);
            txtRes.setEditable(false);
            txtCustomer.setEditable(false);
            
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MCAuctionLicenseSinhala licenseSinhala = new MCAuctionLicenseSinhala(licence.getCtx(), 0, licence.get_TrxName());

		if (e.getActionCommand().equalsIgnoreCase("SAVE")) {
			
			licenseSinhala.setDateConfirm(txtDate.getText());
			licenseSinhala.setName(txtCustomer.getText());
			licenseSinhala.setLocation(txtLocation.getText());
			licenseSinhala.setResidence(txtRes.getText());
			licenseSinhala.setC_AuctionLicense_ID(licence.get_ID());
			licenseSinhala.save();
			ADialog.info(1, null, "Saved");
		}

	}
	
	

}
