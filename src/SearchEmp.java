
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jagru
 */
public class SearchEmp extends javax.swing.JFrame {

    /**
     * Creates new form SearchEmp
     */
    AddEmp addEmp = new AddEmp();
    
    public SearchEmp() {
        initComponents();
        this.setVisible(true);
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        for(int i=0;i<MainClass.employeeList.size();i++){
            String data[] = {MainClass.employeeList.get(i).getName(), Integer.toString(MainClass.employeeList.get(i).getEmployeeId()), MainClass.employeeList.get(i).getPositionTitle()};
            model.addRow(data);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Employee Id", "Position Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton4.setText("Edit Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete Employee");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("View Profile");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        HomePage home = new HomePage();
        home.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        AddEmp addEmp = new AddEmp();
        addEmp.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here: 
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1) {
            int id = Integer.parseInt(tableModel.getValueAt(jTable1.getSelectedRow(), 1).toString());
            MainClass.remove(id);
            tableModel.removeRow(jTable1.getSelectedRow());
        }
        else {
            if(jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "The table is empty or select a row.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Select one row at a time.");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1) {
            int id = Integer.parseInt(tableModel.getValueAt(jTable1.getSelectedRow(), 1).toString());
            for(int i=0;i<MainClass.employeeList.size();i++) {
                if(MainClass.employeeList.get(i).getEmployeeId() == id) {
                    
                    addEmp.jTextField1.setText(MainClass.employeeList.get(i).getName());
                    addEmp.jTextField2.setText(Integer.toString(MainClass.employeeList.get(i).getEmployeeId()));
                    addEmp.jTextField4.setText(Integer.toString(MainClass.employeeList.get(i).getAge()));
                    if(MainClass.employeeList.get(i).getGender() == "Male") {
                        addEmp.jRadioButton1.setSelected(true);
                    }
                    else if(MainClass.employeeList.get(i).getGender() == "Female") {
                        addEmp.jRadioButton2.setSelected(true);
                    } 
                    else {
                        addEmp.jRadioButton3.setSelected(true);
                    }
                    addEmp.jDateChooser1.setDate(MainClass.employeeList.get(i).getStartDate());
                    addEmp.jTextField3.setText(Integer.toString(MainClass.employeeList.get(i).getLevel()));
                    addEmp.jTextArea2.setText(MainClass.employeeList.get(i).getTeamInfo());
                    addEmp.jTextField5.setText(MainClass.employeeList.get(i).getPositionTitle());
                    addEmp.jTextField7.setText(MainClass.employeeList.get(i).getPhoneNumber());
                    addEmp.jTextField6.setText(MainClass.employeeList.get(i).getEmail());
                }
            }
//            MainClass.update(id);
//            tableModel.updateRow(jTable1.getSelectedRow());
        }
        else {
            if(jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "The table is empty or select a row.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Select one row at a time.");
            }
        }
        this.hide();
        addEmp.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        this.hide();
        Profile profile = new Profile();
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1) {
            int id = Integer.parseInt(tableModel.getValueAt(jTable1.getSelectedRow(), 1).toString());
            for(int i=0;i<MainClass.employeeList.size();i++) {
                if(MainClass.employeeList.get(i).getEmployeeId() == id) {
                    
                    profile.jLabel14.setText(MainClass.employeeList.get(i).getName());
                    profile.jLabel8.setText(Integer.toString(MainClass.employeeList.get(i).getEmployeeId()));
                    profile.jLabel9.setText(Integer.toString(MainClass.employeeList.get(i).getAge()));
                    profile.jLabel6.setText(MainClass.employeeList.get(i).getGender());
                    Format formatter = new SimpleDateFormat("MM/dd/yyyy");
                    String s = formatter.format(MainClass.employeeList.get(i).getStartDate());
                    profile.jLabel7.setText(s);
                    profile.jLabel4.setText(Integer.toString(MainClass.employeeList.get(i).getLevel()));
                    profile.jLabel5.setText(MainClass.employeeList.get(i).getTeamInfo().toString());
                    profile.jLabel2.setText(MainClass.employeeList.get(i).getPositionTitle());
                    profile.jLabel19.setText(MainClass.employeeList.get(i).getPhoneNumber());
                    profile.jLabel21.setText(MainClass.employeeList.get(i).getEmail());
                }
            }
//            MainClass.update(id);
//            tableModel.updateRow(jTable1.getSelectedRow());
        }
        profile.show();
    }//GEN-LAST:event_jButton6ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
