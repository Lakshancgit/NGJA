package org.topra.form;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.apps.form.FormFrame;
import org.compiere.apps.form.FormPanel;
import org.compiere.model.MBPartner;
import org.compiere.model.MInvoice;
import org.compiere.model.Query;
import org.compiere.print.MPrintFormat;
import org.compiere.swing.CFrame;
import org.compiere.util.Env;
import org.topra.model.MCGemMining;
import org.topra.model.MCMiningLicenseSinhala;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//org.topra.form.MiningLicenSinhapaInput
// Auther Chathuranga-topra
public class MiningLicenSinhapaInput implements FormPanel, ActionListener {

	private CFrame frame;
	private MCGemMining licence;

	@Override
	public void init(int WindowNo, FormFrame frame) {
		this.frame = frame.getCFrame();
		this.initComponents(null);
	}

	@Override
	public void dispose() {
	}

	public void initComponents(MCGemMining licence) {

		this.licence = licence;

		if (frame == null) {
			Frame owner = Env.getWindow(0);
			frame = new CFrame(owner.getGraphicsConfiguration());
			frame.setSize(1050, 700);

			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		}

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		txtLicenseNo = new javax.swing.JTextField();
		txtFileNo = new javax.swing.JTextField();
		txtLandNature = new javax.swing.JTextField();
		txtNoofMine = new javax.swing.JTextField();
		txtNameNic = new javax.swing.JTextField();
		txtDateSigned = new javax.swing.JTextField();
		txtExpiryDate = new javax.swing.JTextField();
		txtSpConditions = new javax.swing.JTextField();
		txtId = new javax.swing.JTextField();
		btnSave = new javax.swing.JButton();
		rbnSaved = new javax.swing.JCheckBox();
		rbnPrinted = new javax.swing.JCheckBox();
		jLabel8 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
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
		jPanel4 = new javax.swing.JPanel();
		txtDisctrict = new javax.swing.JTextField();
		txtLandName = new javax.swing.JTextField();
		txtPLK = new javax.swing.JTextField();
		txtWasama = new javax.swing.JTextField();
		txtGama = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtNorth = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		txtSouth = new javax.swing.JTextArea();
		jScrollPane3 = new javax.swing.JScrollPane();
		txtEast = new javax.swing.JTextArea();
		jScrollPane4 = new javax.swing.JScrollPane();
		jScrollPane5 = new javax.swing.JScrollPane();
		txtWest = new javax.swing.JTextArea();
		jLabel19 = new javax.swing.JLabel();

		frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		frame.setTitle("Mining License Sinhala Input");
		// frame.setAlwaysOnTop(true);

		jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		txtLicenseNo.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
		txtLicenseNo.setEditable(false);

		txtFileNo.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
		txtFileNo.setEditable(false);

		txtLandNature.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

		txtNoofMine.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
		txtNoofMine.setEditable(false);

		txtNameNic.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

		txtDateSigned.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
		txtDateSigned.setEditable(false);

		txtExpiryDate.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
		txtExpiryDate.setEditable(false);

		txtId.setEditable(false);

		btnSave.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
		// btnSave.setIcon(new
		// javax.swing.ImageIcon(getClass().getResource("/ngjadev/rs_save.png"))); //
		// NOI18N
		btnSave.setText("SAVE");
		btnSave.addActionListener(this);

		jLabel7.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel7.setText("කල්‍‍ පිරීමේ දිනය");

		jLabel6.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel6.setText("අත්සන් දිනය");

		jLabel5.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel5.setText("නම සහ ලිපිනය");

		jLabel4.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel4.setText("වරකට පතල්");

		jLabel3.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel3.setText("ඉඩමේ ස්වභාවය");

		jLabel2.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel2.setText("බලපත් අoකය");

		jLabel1.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel1.setText("ලිපි‍ගොනු අoකය");

		jLabel19.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel19.setText("ජා.හැ.අ");

		txtId.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 131,
														Short.MAX_VALUE))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE,
														272, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtDateSigned, javax.swing.GroupLayout.PREFERRED_SIZE,
														272, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(184, 184, 184).addComponent(btnSave,
												javax.swing.GroupLayout.PREFERRED_SIZE, 272,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(
														jLabel3, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(txtFileNo,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 272,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtLandNature,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 272,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtId,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 272,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(35, 35, 35)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(jLabel2,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 131,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel4,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 112,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(18, 18, 18)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(txtNoofMine,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 272,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(txtLicenseNo,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 272,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18)
														.addComponent(txtNameNic)))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
								.addComponent(txtFileNo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2)
								.addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3)
										.addComponent(txtLandNature, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4).addComponent(txtNoofMine,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel19)
										.addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel5)
										.addComponent(txtNameNic, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(30, 30, 30).addComponent(
												btnSave, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(txtDateSigned,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6))
												.addGap(18, 18, 18)
												.addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel7).addComponent(txtExpiryDate,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(0, 0, Short.MAX_VALUE)))
								.addContainerGap()));

		jLabel8.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabel8.setText("උපලේඛනය");

		jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		txtLandName.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

		txtPLK.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

		txtWasama.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

		txtGama.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

		txtNorth.setColumns(20);
		txtNorth.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
		txtNorth.setRows(5);
		jScrollPane1.setViewportView(txtNorth);

		txtSouth.setColumns(20);
		txtSouth.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
		txtSouth.setRows(5);
		jScrollPane2.setViewportView(txtSouth);

		txtEast.setColumns(20);
		txtEast.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
		txtEast.setRows(5);
		jScrollPane3.setViewportView(txtEast);

		txtWest.setColumns(20);
		txtWest.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
		txtWest.setRows(5);
		jScrollPane4.setViewportView(txtWest);

		txtDisctrict.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N

		txtSpConditions.setColumns(20);
		txtSpConditions.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
		// txtSpConditions.setRows(5);
		jScrollPane5.setViewportView(txtSpConditions);

		jLabel17.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel17.setText("ඉඩමේ නම");

		jLabel9.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel9.setText("දිස්තික්කය");

		jLabel10.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel10.setText("පා.ලේ.කො");

		jLabel11.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel11.setText("වසම");

		jLabel12.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel12.setText("ගම");

		jLabel13.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel13.setText("උතුරට");

		jLabel14.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel14.setText("දකුණට");

		jLabel15.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel15.setText("නැගෙනහිරට");

		jLabel16.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel16.setText("බස්නාහිරට");

		jLabel18.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
		jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jLabel18.setText("විශේෂ කොන්දේසි");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel18)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 847,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel4Layout.createSequentialGroup().addGap(44, 44, 44)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE,
																100, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE,
																69, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE,
																76, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel13).addComponent(jLabel16))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(jScrollPane4,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jScrollPane3,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jScrollPane2,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jScrollPane1,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(txtLandName,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel4Layout.createSequentialGroup()
																.addGroup(jPanel4Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(txtDisctrict,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				292,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				txtWasama,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				292,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(102, 102, 102)
																.addGroup(jPanel4Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel10,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				109,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel12,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				65,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(jPanel4Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false).addComponent(txtPLK)
																		.addComponent(txtGama,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				334,
																				javax.swing.GroupLayout.PREFERRED_SIZE))))))
						.addContainerGap(16, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtLandName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel17))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel9).addComponent(txtDisctrict,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel11).addComponent(txtWasama,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10).addComponent(txtPLK,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel4Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel12).addComponent(txtGama,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(8, 8, 8).addComponent(
										jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(18, 18, 18)
										.addComponent(jLabel13)))
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(19, 19, 19)
										.addComponent(jLabel14).addGap(41, 41, 41).addComponent(jLabel15))
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(jLabel16)))
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(22, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel4Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel18).addGap(32, 32, 32)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
		frame.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(2, 2, 2)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(2, 2, 2))))
				.addGroup(layout
						.createSequentialGroup().addGap(166, 166, 166).addComponent(jLabel8,
								javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		this.setDefaults(licence);
		frame.show(true);
	}

	private JButton btnSave;
	private JCheckBox rbnSaved, rbnPrinted;
	private JLabel jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel2, jLabel3,
			jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel19, jLabel17, jLabel18;
	private JPanel jPanel1, jPanel2, jPanel3, jPanel4;
	private JScrollPane jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5;
	private JTextField txtLandNature, txtDateSigned, txtDisctrict, txtLandName, txtExpiryDate, txtFileNo, txtGama,
			txtLicenseNo, txtNameNic, txtNoofMine, txtPLK, txtWasama, txtId, txtSpConditions;
	JTextArea txtWest;
	JTextArea txtEast;
	JTextArea txtSouth;
	JTextArea txtNorth;

	private void setDefaults(MCGemMining licence) {

		List<MCMiningLicenseSinhala> list = new Query(licence.getCtx(), MCMiningLicenseSinhala.Table_Name,
				"C_GemMining_ID= ?", licence.get_TrxName()).setParameters(licence.get_ID()).list();

		rbnSaved.setEnabled(false);
		rbnPrinted.setEnabled(false);

		if (list.size() == 0) {

			MInvoice invoice = new MInvoice(licence.getCtx(), licence.getC_Invoice_ID(), licence.get_TrxName());
			MBPartner mbPartner = new MBPartner(licence.getCtx(), licence.getC_BPartner_ID(), licence.get_TrxName());

			txtFileNo.setText(String.valueOf(invoice.get_Value("FileNoMiningCustomer")));
			txtLicenseNo.setText(licence.getDocumentNo());
			txtNoofMine.setText(String.valueOf(licence.getNoOfMine()));
			txtId.setText(mbPartner.getValue());
			txtDateSigned.setText(String.valueOf(licence.getDateStart()));
			txtExpiryDate.setText(String.valueOf(licence.getDateTo()));

		} else {

			MCMiningLicenseSinhala alreadySavedLicense = list.get(0);

			if (licence.getLicenseStatus().equalsIgnoreCase("A")) {
				txtId.setEditable(false);
				txtLandNature.setEditable(false);
				txtDisctrict.setEditable(false);
				txtFileNo.setEditable(false);
				txtGama.setEditable(false);
				txtLicenseNo.setEditable(false);
				txtNameNic.setEditable(false);
				txtNoofMine.setEditable(false);
				txtPLK.setEditable(false);
				txtWasama.setEditable(false);
				txtWest.setEditable(false);
				txtEast.setEditable(false);
				txtSouth.setEditable(false);
				txtNorth.setEditable(false);
				txtNorth.setEditable(false);
				txtLandName.setEditable(false);
				txtSpConditions.setEditable(false);
				txtDateSigned.setEditable(false);
				txtExpiryDate.setEditable(false);
				btnSave.setEnabled(false);
			}

			txtId.setText(alreadySavedLicense.getValue());
			txtLandNature.setText(alreadySavedLicense.getLandNature());
			txtDisctrict.setText(alreadySavedLicense.getDistrict());
			txtFileNo.setText(alreadySavedLicense.getDocumentNo());
			txtGama.setText(alreadySavedLicense.getVillage());
			txtLicenseNo.setText(alreadySavedLicense.getMiningLicenseNo());
			txtNameNic.setText(alreadySavedLicense.getNICnName());
			txtNoofMine.setText(alreadySavedLicense.getNoOfMine());
			txtPLK.setText(alreadySavedLicense.getDiviSecHeadOff());
			txtWasama.setText(alreadySavedLicense.getDiviSecOffice());
			txtWest.setText(alreadySavedLicense.getToWest());
			txtEast.setText(alreadySavedLicense.getToEast());
			txtSouth.setText(alreadySavedLicense.getToSouth());
			txtNorth.setText(alreadySavedLicense.getToNorth());
			rbnSaved.setSelected(alreadySavedLicense.isSaved());
			rbnPrinted.setSelected(alreadySavedLicense.isPrinted());
			txtLandName.setText(alreadySavedLicense.getLandName());
			txtSpConditions.setText(alreadySavedLicense.getspecialConditions());
			txtDateSigned.setText(alreadySavedLicense.getDateConfirm());
			txtExpiryDate.setText(alreadySavedLicense.getExpiryDateOfLicense());

//			if (alreadySavedLicense.isSaved()) {
//				txtLandNature.setEditable(false); 
//				txtDateSigned.setEditable(false);
//				txtDisctrict.setEditable(false);
//				txtExpiryDate.setEditable(false);
//	            txtFileNo.setEditable(false);  
//	            txtGama.setEditable(false);
//	            txtLicenseNo.setEditable(false); 
//				txtNameNic.setEditable(false);
//				txtNoofMine.setEditable(false);
//				txtPLK.setEditable(false);
//				txtWasama.setEditable(false);
//				txtWest.setEditable(false);
//				txtEast.setEditable(false);
//				txtSouth.setEditable(false);
//				txtNorth.setEditable(false);
//				txtLandName.setEditable(false);
//				btnSave.setEnabled(false);
//			}

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		List<MCMiningLicenseSinhala> list = new Query(licence.getCtx(), MCMiningLicenseSinhala.Table_Name,
				"C_GemMining_ID= ?", licence.get_TrxName()).setParameters(licence.get_ID()).list();
		MCMiningLicenseSinhala licenseSinhala;

		if (list.size() == 0) {
			licenseSinhala = new MCMiningLicenseSinhala(licence.getCtx(), 0, licence.get_TrxName());
		} else {
			licenseSinhala = list.get(0);
		}
		if (e.getActionCommand().equalsIgnoreCase("SAVE")) {
			JFrame f;
			f = new JFrame();

			if (txtFileNo.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'ලිපි‍ගොනු අoකය' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtDisctrict.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'දිස්තික්කය' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtEast.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'නැගෙනහිරට' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			}
			else if (txtGama.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'ගම' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtId.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'ජා.හැ.අ' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtLandName.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'ඉඩමේ නම' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtLandNature.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'ඉඩමේ ස්වභාවය' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtLicenseNo.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'බලපත් අoකය' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtNameNic.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'නම සහ ලිපිනය' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtNoofMine.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'වරකට පතල්' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtNorth.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'උතුරට' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtPLK.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'පා.ලේ.කො' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtSouth.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'දකුණට' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtWasama.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'වසම' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else if (txtWest.getText().equalsIgnoreCase("")) {
				JLabel errlable = new JLabel("'බස්නාහිරට' අනිවාර්ය වේ!");
				errlable.setFont(new java.awt.Font("Iskoola Pota", 1, 18));
				JOptionPane.showMessageDialog(f, errlable, "Alert", JOptionPane.WARNING_MESSAGE);
			} else {
				licenseSinhala.setDateConfirm(txtDateSigned.getText());
				licenseSinhala.setC_GemMining_ID(licence.getC_GemMining_ID());
				licenseSinhala.setDocumentNo(txtFileNo.getText());
				licenseSinhala.setMiningLicenseNo(txtLicenseNo.getText());
				licenseSinhala.setLandNature(txtLandNature.getText());
				licenseSinhala.setNoOfMine(txtNoofMine.getText());
				licenseSinhala.setNICnName(txtNameNic.getText());
				licenseSinhala.setExpiryDateOfLicense(txtExpiryDate.getText());
				licenseSinhala.setDistrict(txtDisctrict.getText());
				licenseSinhala.setDiviSecHeadOff(txtPLK.getText());
				licenseSinhala.setDiviSecOffice(txtWasama.getText());
				licenseSinhala.setVillage(txtGama.getText());
				licenseSinhala.setToNorth(txtNorth.getText());
				licenseSinhala.setToEast(txtEast.getText());
				licenseSinhala.setToSouth(txtSouth.getText());
				licenseSinhala.setToWest(txtWest.getText());
				licenseSinhala.setValue(txtId.getText());
				licenseSinhala.setLandName(txtLandName.getText());
				licenseSinhala.setspecialConditions(txtSpConditions.getText());
				licenseSinhala.setIsSaved(true);
				licenseSinhala.save();
				setDefaults(licence);

				if (list.size() == 0) {
					ADialog.info(1, null, "Saved");
				} else {
					ADialog.info(1, null, "Updated");
				}
			}

		}
//		else if (e.getActionCommand().equalsIgnoreCase("PRINT LICENSE")) {
//			MPrintFormat pf = new MPrintFormat(null, 1, "");
//			licenseSinhala.isPrinted();
//			licenseSinhala.save();
//		}
	}
}
