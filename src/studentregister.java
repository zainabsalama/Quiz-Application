
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Esraa Fouad
 */
public class studentregister extends javax.swing.JFrame {

    /**
     * Creates new form studentregister
     */
    public studentregister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2_register = new javax.swing.JButton();
        jTextField1_FN = new javax.swing.JTextField();
        jTextField2_LN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3_login = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1_close = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3_UN1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3_UN2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailtextbox = new javax.swing.JTextField();
        yearId = new javax.swing.JPasswordField();
        passwordID = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jButton2_register.setBackground(new java.awt.Color(255, 255, 255));
        jButton2_register.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2_register.setForeground(new java.awt.Color(0, 51, 102));
        jButton2_register.setText("Register");
        jButton2_register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jButton2_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_registerActionPerformed(evt);
            }
        });

        jTextField1_FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_FNActionPerformed(evt);
            }
        });

        jTextField2_LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_LNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("fname");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("lname");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setText("email");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("year_id");

        jButton3_login.setBackground(new java.awt.Color(255, 255, 255));
        jButton3_login.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3_login.setForeground(new java.awt.Color(0, 51, 102));
        jButton3_login.setText("Already have acount");
        jButton3_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jButton3_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_loginActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jButton1_close.setBackground(new java.awt.Color(255, 255, 255));
        jButton1_close.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1_close.setForeground(new java.awt.Color(0, 51, 102));
        jButton1_close.setText("Close");
        jButton1_close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jButton1_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_closeActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (1).png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setBackground(new java.awt.Color(255, 204, 255));
        jLabel7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("register as student");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 3, 2, 3, new java.awt.Color(51, 0, 51)));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setText("uname");

        jTextField3_UN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_UN1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setText("subject");

        jTextField3_UN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_UN2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel10.setText("password");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        emailtextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextboxActionPerformed(evt);
            }
        });

        passwordID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordIDMouseClicked(evt);
            }
        });
        passwordID.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                passwordIDInputMethodTextChanged(evt);
            }
        });
        passwordID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1_close, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jButton3_login, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton2_register, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3_UN1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(emailtextbox)
                                    .addComponent(yearId)
                                    .addComponent(passwordID))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3_UN2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2_LN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField1_FN)
                                        .addGap(83, 83, 83)))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2_LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField3_UN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3_UN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailtextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yearId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(passwordID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_close, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_register, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_registerActionPerformed
        // TODO add your handling code here:
        String fname=jTextField1_FN.getText();
        String lname=jTextField2_LN.getText();
       // String stud_id=studID.getText();
        String uname;
        uname = jTextField3_UN2.getText();
        String subject;
        subject = jTextField3_UN1.getText();
        String email;
        email = emailtextbox.getText();
        String year_id;
        year_id = String.valueOf(yearId.getPassword());
        Integer password;
        password = Integer.parseInt(String.valueOf((passwordID.getPassword())));
        

        if (uname.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Add username");
        }
        else if (password.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Add password");
        }
        else if (chk_username(uname))
        {
            JOptionPane.showMessageDialog(null,"this username is already exist");
        }
         else if (chk_email(email))
        {
            JOptionPane.showMessageDialog(null,"this email is already exist");
        }
        else
        {
            PreparedStatement ps;
            String query;
            query = "INSERT INTO `students`(`fname`, `lname`, `uname` , `subject`, `email`,`year_id`,`password`) VALUES (?,?,?,?,?,?,?)";
            try{ps=MyConnection.getConnection().prepareStatement(query);
                ps.setString(1,fname);
                ps.setString(2,lname);
                ps.setString(3,uname);
                ps.setString(4,subject);
                ps.setString(5,email);
                ps.setString(6,year_id);
                //Integer pass = null;
                ps.setInt(7,password);
                //ps.setInt(9,result);
                if(ps.executeUpdate()>0)
                {JOptionPane.showMessageDialog(null,"New record Added");
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton2_registerActionPerformed
    }
         
    private void jTextField1_FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_FNActionPerformed

    private void jTextField2_LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_LNActionPerformed

    private void jButton3_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_loginActionPerformed
        // TODO add your handling code here:
        LoginForm lg= new LoginForm();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3_loginActionPerformed

    private void jButton1_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1_closeActionPerformed

    private void jTextField3_UN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_UN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_UN1ActionPerformed

    private void jTextField3_UN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_UN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_UN2ActionPerformed

    private void emailtextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextboxActionPerformed

    private void passwordIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordIDMouseClicked

    private void passwordIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordIDActionPerformed

    private void passwordIDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_passwordIDInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordIDInputMethodTextChanged

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new studentregister().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailtextbox;
    private javax.swing.JButton jButton1_close;
    private javax.swing.JButton jButton2_register;
    private javax.swing.JButton jButton3_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1_FN;
    private javax.swing.JTextField jTextField2_LN;
    private javax.swing.JTextField jTextField3_UN1;
    private javax.swing.JTextField jTextField3_UN2;
    private javax.swing.JPasswordField passwordID;
    private javax.swing.JPasswordField yearId;
    // End of variables declaration//GEN-END:variables

    //check if user is exiset or not
    public boolean chk_username(String uname)
     {
       PreparedStatement ps;
       ResultSet rs;
       boolean checkuser=false;
       String query;
       query = "select * from `students` WHERE `uname`=?";
       try{
           ps=MyConnection.getConnection().prepareStatement(query);
           ps.setString(1,uname);
           rs=ps.executeQuery();
           if(rs.next()){
               checkuser=true;
           }
       }
       catch(SQLException ex){
           Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       return checkuser;
       }
    
    //check if email is exist or not
     public boolean chk_email(String email)
      {
       PreparedStatement ps;
       ResultSet rs;
       boolean checkemail=false;
       String query;
       query = "select * from `students` WHERE `email`=?";
       try{
           ps=MyConnection.getConnection().prepareStatement(query);
           ps.setString(1,email);
           rs=ps.executeQuery();
           if(rs.next()){
               checkemail=true;
           }
       }
       catch(SQLException ex){
           Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       return checkemail;
       }
    } 
//