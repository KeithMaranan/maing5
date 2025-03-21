package LOGREGFORM;

import javax.swing.JOptionPane;

public class StudentList extends javax.swing.JFrame {

    public StudentList() {
        initComponents();
        setUndecorated(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Dashboardlabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Studentlistlabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Academicslabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Date = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        id = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Name = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Email = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(60, 80, 110));

        jPanel4.setBackground(new java.awt.Color(60, 80, 110));

        Dashboardlabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Dashboardlabel.setForeground(new java.awt.Color(255, 255, 255));
        Dashboardlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/DashboardICON.png"))); // NOI18N
        Dashboardlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dashboardlabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(Dashboardlabel)
                .addGap(17, 17, 17))
        );

        jPanel5.setBackground(new java.awt.Color(60, 66, 130));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 88));

        Studentlistlabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Studentlistlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/listICON.png"))); // NOI18N
        Studentlistlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentlistlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Studentlistlabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Studentlistlabel)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(60, 80, 110));
        jPanel7.setPreferredSize(new java.awt.Dimension(250, 88));

        Academicslabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Academicslabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/schoolICON.png"))); // NOI18N
        Academicslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcademicslabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Academicslabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Academicslabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 44, 60, 680);

        jPanel3.setBackground(new java.awt.Color(60, 80, 110));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 50));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cloud Nine Academy");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/logoutICON.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 759, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1121, 50);

        jButton1.setBackground(new java.awt.Color(60, 80, 110));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/addICON.png"))); // NOI18N
        jButton1.setText("Enroll new Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 90, 220, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("entries");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 140, 60, 20);

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(220, 140, 40, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setText("Show");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 140, 40, 20);

        Date.setBorder(new javax.swing.border.MatteBorder(null));
        Date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Date.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date"
            }
        ));
        jScrollPane1.setViewportView(Date);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(810, 190, 230, 480);

        id.setBorder(new javax.swing.border.MatteBorder(null));
        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id"
            }
        ));
        jScrollPane2.setViewportView(id);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(160, 190, 110, 480);

        Name.setBorder(new javax.swing.border.MatteBorder(null));
        Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Name.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        Name.setColumnSelectionAllowed(true);
        Name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Name.setOpaque(false);
        jScrollPane3.setViewportView(Name);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(260, 190, 370, 480);

        Email.setBorder(new javax.swing.border.MatteBorder(null));
        Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Email.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email"
            }
        ));
        jScrollPane4.setViewportView(Email);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(610, 190, 230, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1140, 730);

        setSize(new java.awt.Dimension(1120, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AcademicslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcademicslabelMouseClicked
        Academics academics = new Academics();
        academics.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AcademicslabelMouseClicked

    private void StudentlistlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentlistlabelMouseClicked

    }//GEN-LAST:event_StudentlistlabelMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void DashboardlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardlabelMouseClicked
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardlabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Object[] options = {"College", "Senior High"};
        int result = JOptionPane.showOptionDialog(
        
        null,
                "Select your Grade level",
                "Success",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );
        
        if(result == JOptionPane.YES_OPTION){
           
            
        }else if(result == JOptionPane.NO_OPTION){
            
            StudentinformationSHS studentinformation = new StudentinformationSHS();
            studentinformation.setVisible(true);
            this.dispose();
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Academicslabel;
    private javax.swing.JLabel Dashboardlabel;
    private javax.swing.JTable Date;
    private javax.swing.JTable Email;
    private javax.swing.JTable Name;
    private javax.swing.JLabel Studentlistlabel;
    private javax.swing.JTable id;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
