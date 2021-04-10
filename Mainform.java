
package bloodbank;

import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;
import java.awt.*;
import java.security.*;




public class Mainform extends javax.swing.JFrame {
private Connection con=null;
 PreparedStatement ptr=null;
  private static String userid;
    private Object inqid;
    private Object inqname;
    private Object inqmsg;


    
    public Mainform() {
       
        initComponents();
        GenerClass.setImageIntoLabel("C:\\Users\\HP\\Desktop\\Home.png",HomeShowPicture);
         GenerClass.setImageIntoLabel("About.png",AboutShowPicture);
    }
    public static void setID(String id)
    {
        userid=id;
    }

    public static String getID()
    {
        return userid;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        HomeShowPicture = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SignUpCancelButton = new javax.swing.JButton();
        SignUpTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SignUpPasswordField = new javax.swing.JTextField();
        SignUpButton = new javax.swing.JButton();
        SignUpErrorMessage = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        AboutShowPicture = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        InquiryButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        InquiryCancelButton1 = new javax.swing.JButton();
        InquiryErrorMessage = new javax.swing.JTextField();
        Idinquiry = new javax.swing.JTextField();
        contactinq = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        nminq = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        AdminPasswordTextField = new javax.swing.JTextField();
        AdminSignInButton = new javax.swing.JButton();
        AdminCancelButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        AdminIdTextField = new javax.swing.JTextField();
        AdminErrorMessage = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        FeedBackName2 = new javax.swing.JTextField();
        FeedbackEmail2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        FeedbackTextArea2 = new javax.swing.JTextArea();
        FeedbackButton2 = new javax.swing.JButton();
        FeedbackCancelButton2 = new javax.swing.JButton();
        FeedbackErrorMessage = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SignInTextField = new javax.swing.JTextField();
        SignInPasswordField = new javax.swing.JTextField();
        SignInButton = new javax.swing.JButton();
        SignInCancelButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SignInSelectRoleComboBox = new javax.swing.JComboBox<>();
        SignInErrorMessage = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                                                                                                BLOOD DONATION SYSTEM        ");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeShowPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 1527, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeShowPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Enter Your Id");

        SignUpCancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignUpCancelButton.setText("Cancel");

        SignUpTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Enter Your Password ");

        SignUpPasswordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        SignUpButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignUpButton.setText("Sign Up");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        SignUpErrorMessage.setEditable(false);
        SignUpErrorMessage.setBackground(new java.awt.Color(255, 255, 255));
        SignUpErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignUpErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignUpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignUpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SignUpErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SignUpButton)
                                .addGap(333, 333, 333)
                                .addComponent(SignUpCancelButton)))))
                .addContainerGap(936, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignUpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignUpPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(SignUpErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        jTabbedPane1.addTab("Sign Up", jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AboutShowPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 1527, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AboutShowPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("About", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        InquiryButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InquiryButton.setText("Inquiry ");
        InquiryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InquiryButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Enter Your Name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Enter Your Id");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Contact");

        jTextField2.setText("jTextField1");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Enter Message");

        InquiryCancelButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InquiryCancelButton1.setText("Cancel");

        InquiryErrorMessage.setEditable(false);
        InquiryErrorMessage.setForeground(new java.awt.Color(255, 51, 51));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        nminq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nminqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactinq, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nminq, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Idinquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(InquiryButton))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(InquiryErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1011, 1062, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1335, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1382, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(388, 388, 388)
                    .addComponent(InquiryCancelButton1)
                    .addContainerGap(1080, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Idinquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nminq, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(contactinq, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(InquiryButton)
                .addGap(35, 35, 35)
                .addComponent(InquiryErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(476, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(222, 222, 222)
                    .addComponent(jLabel17)
                    .addContainerGap(277, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(393, Short.MAX_VALUE)
                    .addComponent(InquiryCancelButton1)
                    .addGap(97, 97, 97)))
        );

        jTabbedPane1.addTab("Inquiry form", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Enter Your Id");

        AdminPasswordTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AdminSignInButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdminSignInButton.setText("Sign In");
        AdminSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminSignInButtonActionPerformed(evt);
            }
        });

        AdminCancelButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdminCancelButton.setText("Cancel");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Enter Your Passwod");

        AdminIdTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AdminErrorMessage.setEditable(false);
        AdminErrorMessage.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AdminErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(AdminSignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(AdminCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(992, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AdminIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminSignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(AdminErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        jTabbedPane1.addTab("Admin", jPanel8);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Enter Your Name ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Enter Your Email");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Feedback");

        FeedBackName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FeedbackEmail2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FeedbackTextArea2.setColumns(20);
        FeedbackTextArea2.setRows(5);
        jScrollPane4.setViewportView(FeedbackTextArea2);

        FeedbackButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FeedbackButton2.setText("Feedback");
        FeedbackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbackButton2ActionPerformed(evt);
            }
        });

        FeedbackCancelButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FeedbackCancelButton2.setText("Cancel");
        FeedbackCancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbackCancelButton2ActionPerformed(evt);
            }
        });

        FeedbackErrorMessage.setEditable(false);
        FeedbackErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FeedbackEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FeedBackName2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(259, 259, 259)
                                        .addComponent(FeedbackCancelButton2))))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FeedbackButton2)
                            .addComponent(FeedbackErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(952, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FeedBackName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FeedbackEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FeedbackCancelButton2)
                    .addComponent(FeedbackButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FeedbackErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Feedback", jPanel11);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Enter Your Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Select Role");

        SignInTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignInTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInTextFieldActionPerformed(evt);
            }
        });

        SignInPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignInPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInPasswordFieldActionPerformed(evt);
            }
        });

        SignInButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignInButton.setText("Sign In");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        SignInCancelButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignInCancelButton.setText("Cancel");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Enter Your Password");

        SignInSelectRoleComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignInSelectRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "As A Donor", "As A Patient" }));
        SignInSelectRoleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInSelectRoleComboBoxActionPerformed(evt);
            }
        });

        SignInErrorMessage.setEditable(false);
        SignInErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignInErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SignInPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SignInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SignInErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(SignInButton)
                                        .addGap(283, 283, 283)
                                        .addComponent(SignInCancelButton))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignInSelectRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 977, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignInPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignInSelectRoleComboBox))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignInButton)
                    .addComponent(SignInCancelButton))
                .addGap(75, 75, 75)
                .addComponent(SignInErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("Sign In", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InquiryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InquiryButtonActionPerformed
      
        if(((Idinquiry.getText().equals("") || nminq.getText().equals("")) || contactinq.getText().equals(""))||area.getText().equals(""))
        {
            SignUpErrorMessage.setText("please fill all the field");
            JOptionPane.showMessageDialog(null,"Please fill all the field");
            
        }else{
            try{
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
                }
                String path="E:\\Bloodbank.accdb";
                String url="jdbc:ucanaccess://"+path;
                con=DriverManager.getConnection(url);
                
                
                
                
                
                Statement st=con.createStatement();
                String id=Idinquiry.getText();
                String nam;
                nam=nminq.getText();
                String msg=area.getText();
                
                
                
                
                
                String query;
                query = "insert into Inquiry values('"+id+"','"+nam+"','"+contactinq.getText()+"','"+msg+"')";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Your Data send to Admin Thanks");
                
            }catch(HeadlessException | NumberFormatException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            finally{
            
                try{
                    con.close();
                    
                }catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
            
        }
    }//GEN-LAST:event_InquiryButtonActionPerformed

    private void SignInSelectRoleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInSelectRoleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInSelectRoleComboBoxActionPerformed

    private void SignInPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInPasswordFieldActionPerformed

    private void SignInTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInTextFieldActionPerformed

    private void FeedbackCancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackCancelButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeedbackCancelButton2ActionPerformed

    private void AdminSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminSignInButtonActionPerformed
        // TODO add your handling code here:
          if(SignInTextField.getText().equals(" ")|| SignInPasswordField.getText().equals(" "))
        {
            SignInErrorMessage.setText("please fill all the field");
            JOptionPane.showMessageDialog(null,"Please fill all the field");
             
        }
        else
        { 
            try
            {
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
                }
           String path="E:\\Bloodbank.accdb";
          String url="jdbc:ucanaccess://"+path;
            con=DriverManager.getConnection(url);
               
               setID(SignUpTextField.getText());
                Statement st=con.createStatement();
                String id=AdminIdTextField.getText();
                String pass=AdminPasswordTextField.getText();
                
                
                
                String query="select Userid from Admin where Userid=' "+id+" ' ";
                PreparedStatement smt=con.prepareStatement(query);
                 ResultSet rs=smt.executeQuery();
//               ptr=con.prepareStatement(query);
//                 ResultSet rs=st.executeQuery();
              //   ResultSet rs=st.executeQuery(query);
                 if(rs.next())
                 {
                      JOptionPane.showMessageDialog(null,"Login Succesfully");
                      new BloodDonor().show();
                 }
                else{
                  JOptionPane.showMessageDialog(null,"Login UnSuccesfull");   
                 }
               
                //this.hide();
               
            }catch(HeadlessException | NumberFormatException | SQLException e)
            {
                 JOptionPane.showMessageDialog(null,e.getMessage());
            }
            finally
            {
                try{
                    con.close();
                    
                }catch(SQLException ex)
                        {
                          JOptionPane.showMessageDialog(null,ex.getMessage());   
                        }
            }
        }
        
    }//GEN-LAST:event_AdminSignInButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        if(SignUpTextField.getText().equals("")|| SignUpPasswordField.getText().equals(""))
        {
            SignUpErrorMessage.setText("please fill all the field");
            JOptionPane.showMessageDialog(null,"Please fill all the field");
             
        }
        else
        { 
            try
            {
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
                }
           String path="E:\\Bloodbank.accdb";
           String url="jdbc:ucanaccess://"+path;
           con=DriverManager.getConnection(url);
            
               
               Statement st=con.createStatement();
               String query="insert into User_Registration values(' "+SignUpTextField.getText()+" ',' " +SignUpPasswordField.getText() +" ') ";               
               st.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"inserted into database");
               this.hide();
               new  UserRegistrationForm().show();
            }catch(HeadlessException | NumberFormatException | SQLException e)
            {
                 JOptionPane.showMessageDialog(null,e.getMessage());
            }
            finally
            {
                try{
                    con.close();
                    
                }catch(SQLException ex)
                        {
                          JOptionPane.showMessageDialog(null,ex.getMessage());   
                        }
            }
        }
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void nminqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nminqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nminqActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        // TODO add your handling code here:
        if(SignInTextField.getText().equals("")|| SignInPasswordField.getText().equals(""))
        {
            SignInErrorMessage.setText("please fill all the field");
            JOptionPane.showMessageDialog(null,"Please fill all the field");
             
        }
        else
        { 
            try
            {
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
                }
           String path="E:\\Bloodbank.accdb";
          String url="jdbc:ucanaccess://"+path;
            con=DriverManager.getConnection(url);
            
              setID(SignInTextField.getText());
              
               String query="select UserId from User_Registration where UserId=' "+SignInTextField.getText()+" ' ";
               PreparedStatement pt=con.prepareStatement(query);
                ResultSet rs=pt.executeQuery();
                if(rs.next())
                {  
                  setID(SignInTextField.getText());
                   if(SignInSelectRoleComboBox.getSelectedIndex()==0)
                   {
                      dispose();
                      JOptionPane.showMessageDialog(null,"Success");
                      new BloodDonor().show();
                      
             
                   }
                   if(SignInSelectRoleComboBox.getSelectedIndex()==1)
                   {
                      dispose();
                      JOptionPane.showMessageDialog(null,"Success");
                      new BloodDonor().show();
                   }
                   
                }
                else
                {
                    
                     SignInErrorMessage.setText("Unauthorized-access please enter Correct id or Password");
                }
                
               
                
            }catch(HeadlessException | NumberFormatException | SQLException e)
            {
                 JOptionPane.showMessageDialog(null,e.getMessage());
            }
            finally
            {
                try{
                    con.close();
                    
                }catch(SQLException ex)
                        {
                          JOptionPane.showMessageDialog(null,ex.getMessage());   
                        }
            }
        }
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void FeedbackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackButton2ActionPerformed
        // TODO add your handling code here:
        if(((FeedBackName2.getText().equals("") || FeedbackEmail2.getText().equals("")) || FeedbackTextArea2.getText().equals("")))
        {
            SignUpErrorMessage.setText("please fill all the field");
            JOptionPane.showMessageDialog(null,"Please fill all the field");
            
        }else{
            try{
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Mainform.class.getName()).log(Level.SEVERE, null, ex);
                }
                String path="E:\\Bloodbank.accdb";
                String url="jdbc:ucanaccess://"+path;
                con=DriverManager.getConnection(url);
                
                
                
                
                
                Statement st=con.createStatement();
                String id=FeedBackName2.getText();
                String nam;
                nam=FeedbackEmail2.getText();
                String msg=FeedbackTextArea2.getText();                           
                String query;
                query = "insert into Feedback values('"+id+"','"+nam+"','"+msg+"')";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Your Data send to Admin Thanks");
                
            }catch(HeadlessException | NumberFormatException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            finally{
            
                try{
                    con.close();
                    
                }catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
            
        }
    }//GEN-LAST:event_FeedbackButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Mainform().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutShowPicture;
    private javax.swing.JButton AdminCancelButton;
    private javax.swing.JTextField AdminErrorMessage;
    private javax.swing.JTextField AdminIdTextField;
    private javax.swing.JTextField AdminPasswordTextField;
    private javax.swing.JButton AdminSignInButton;
    private javax.swing.JTextField FeedBackName2;
    private javax.swing.JButton FeedbackButton2;
    private javax.swing.JButton FeedbackCancelButton2;
    private javax.swing.JTextField FeedbackEmail2;
    private javax.swing.JTextField FeedbackErrorMessage;
    private javax.swing.JTextArea FeedbackTextArea2;
    private javax.swing.JLabel HomeShowPicture;
    private javax.swing.JTextField Idinquiry;
    private javax.swing.JButton InquiryButton;
    private javax.swing.JButton InquiryCancelButton1;
    private javax.swing.JTextField InquiryErrorMessage;
    private javax.swing.JButton SignInButton;
    private javax.swing.JButton SignInCancelButton;
    private javax.swing.JTextField SignInErrorMessage;
    private javax.swing.JTextField SignInPasswordField;
    private javax.swing.JComboBox<String> SignInSelectRoleComboBox;
    private javax.swing.JTextField SignInTextField;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JButton SignUpCancelButton;
    private javax.swing.JTextField SignUpErrorMessage;
    private javax.swing.JTextField SignUpPasswordField;
    private javax.swing.JTextField SignUpTextField;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField contactinq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nminq;
    // End of variables declaration//GEN-END:variables
}
