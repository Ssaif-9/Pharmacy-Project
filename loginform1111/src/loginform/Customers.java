/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;


import Modeling.Customers_Model;
import Control.customers_operations;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        


/**
 *
 * @author Ahmed Sherif
 */
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form Customers
     */
     private ArrayList<Customers_Model> arr;
    private int row_number = 0;
    
    public Customers() {
        initComponents();
        tableCu.fixTable(jScrollPane2);
        tableCu.setColumnAlignment(0, JLabel.CENTER);
        tableCu.setCellAlignment(0, JLabel.CENTER);
        tableCu.setColumnAlignment(1, JLabel.CENTER);
        tableCu.setCellAlignment(1, JLabel.CENTER);
    }
    
     public void show_table() {
        DefaultTableModel mm = (DefaultTableModel) tableCu.getModel();
        arr = customers_operations.get_customersData();
        Object[] row = new Object[7];
         for (int i = 1; i < arr.size(); i++) {
            row[0] = arr.get(i).getCustomer_id(); 
            row[1] = arr.get(i).getFirstname();
            row[2] = arr.get(i).getLastname();
            row[3] = arr.get(i).getCity();
            row[4] = arr.get(i).getStreet();
            row[5] = arr.get(i).getGender();
            row[6] = arr.get(i).getPhoneNumber_1();
            mm.insertRow(i-1, row);
          
        }
    
        // Mouse Event
        tableCu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                row_number = tableCu.getSelectedRow();
            }
        }
       );
 }
     
      private void show_id(Customers_Model obj) {
        DefaultTableModel mm = (DefaultTableModel) tableCu.getModel();
        Object[] row = new Object[7];
        row[0] = obj.getCustomer_id();
        row[1] = obj.getFirstname();
        row[2] = obj.getLastname();
        row[3] = obj.getCity();
        row[4] = obj.getStreet();
        row[5] = obj.getGender();
        row[6] = obj.getPhoneNumber_1();
        mm.insertRow(0, row);
        arr = customers_operations.get_customersData();

        // Mouse Event
        tableCu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                row_number = tableCu.getSelectedRow();
            }
        }
       );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableCu = new tabledark.TableDark();
        back = new javax.swing.JLabel();
        Delete = new button.mybutton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        Search = new button.mybutton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "City", "Street", "Gender", "Phone number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCu.setGridColor(new java.awt.Color(0, 102, 102));
        tableCu.getTableHeader().setReorderingAllowed(false);
        tableCu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 162, 925, 217));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-button.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 34, -1));

        Delete.setBackground(new java.awt.Color(6, 107, 138));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x (2).png"))); // NOI18N
        Delete.setText("Delete");
        Delete.setBorderColor(new java.awt.Color(255, 255, 255));
        Delete.setColor(new java.awt.Color(6, 107, 138));
        Delete.setColorClick(new java.awt.Color(0, 153, 153));
        Delete.setColorText(new java.awt.Color(0, 102, 102));
        Delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Delete.setRadius(10);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 100, 49));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(6, 107, 138));
        jLabel1.setText("Customers List");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 37, -1, 46));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/age-group.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 47, -1, -1));

        txtSearch.setText("Enter Id");
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 115, 168, 29));

        Search.setBackground(new java.awt.Color(6, 107, 138));
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.setBorderColor(new java.awt.Color(255, 255, 255));
        Search.setColor(new java.awt.Color(6, 107, 138));
        Search.setColorClick(new java.awt.Color(0, 153, 153));
        Search.setColorText(new java.awt.Color(0, 102, 102));
        Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Search.setRadius(10);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 113, 92, 29));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/whitebg.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableCuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableCuMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
    if(login.Manager)
     {
        rond obj = new rond();
        obj.setVisible(true);
        this.dispose();
     }
     else
     {
        phar_rond obj = new phar_rond();
        obj.setVisible(true);
        this.dispose();
     }

    }//GEN-LAST:event_backMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
   if (txtSearch.getText().isEmpty()) {
        } else {
            Customers_Model obj = customers_operations.Search_customer(Integer.parseInt(txtSearch.getText()));

            if (obj != null) {
               this.dispose();
                Customers gg = new Customers();
                gg.show_id(obj);
                gg.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "ID is Not Found", "Message", JOptionPane.WARNING_MESSAGE);

            }
        }     
                
    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int id = arr.get(row_number).getCustomer_id();
        customers_operations.Delete_customer(id);
        this.dispose(); 
        Customers gg = new Customers();
        gg.show_table();
        gg.setVisible(true);
        JOptionPane.showMessageDialog(null, "customer has been Deleted Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.mybutton Delete;
    private button.mybutton Search;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private tabledark.TableDark tableCu;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
