package loginform;

import Control.Products_Operations;
import Modeling.Products_Model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Seifeldin Ahmed
 */
public class setStock extends javax.swing.JFrame {

    public setStock() {
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

        back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtexpireddate = new javax.swing.JTextField();
        Edit = new button.mybutton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(6, 107, 138,80));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Untitled-1 (2).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Name:");

        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtnameMouseExited(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price:");

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Expired Date:");

        txtexpireddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexpireddateActionPerformed(evt);
            }
        });

        Edit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Edit.setForeground(new java.awt.Color(6, 107, 138));
        Edit.setText("Set");
        Edit.setBorderColor(new java.awt.Color(255, 255, 255));
        Edit.setBorderPainted(false);
        Edit.setColorClick(new java.awt.Color(153, 204, 255));
        Edit.setColorOver(new java.awt.Color(204, 204, 204));
        Edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Edit.setRadius(10);
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtexpireddate)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtexpireddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 480, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/17973908.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        Products_Model obj = Products_Operations.Search_Product(txtname.getText());
        if (obj != null) {
            txtexpireddate.setText(obj.getExpired_date());
            txtprice.setText(obj.getPrice() + "");
            txtquantity.setText(obj.getQuantity() + "");
        }
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtexpireddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexpireddateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexpireddateActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        products ob = new products();
        ob.setVisible(true);
        ob.show_table();
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked

    }//GEN-LAST:event_EditMouseClicked
    public String DatePattern = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public boolean vaildate_fields() {
        String Name = txtname.getText();
        String Quantity = txtquantity.getText();
        String Price = txtprice.getText();
        String Expired = txtexpireddate.getText();
        return Expired.matches(DatePattern) && !Name.equals("") && !Quantity.equals("") && !Expired.equals("");
    }

    public boolean vaildate_ExpiredDate(Products_Model Product) {
        boolean vaild=false;
        String old_date = Product.getExpired_date();
        StringTokenizer old = new StringTokenizer(old_date, "/");
        StringTokenizer New = new StringTokenizer(txtexpireddate.getText(), "/");
        int DayOld = Integer.parseInt(old.nextToken());
        int MonthOld = Integer.parseInt(old.nextToken());
        int YearOld = Integer.parseInt(old.nextToken());    
        int DayNew = Integer.parseInt(New.nextToken());
        int MonthNew = Integer.parseInt(New.nextToken());
        int YearNew = Integer.parseInt(New.nextToken());
        if (YearNew > YearOld) // Expired
        {
            vaild = true;
        } else if (YearNew == YearOld) {
            if (MonthNew > MonthOld) {
                vaild = true;
            } else if (MonthNew == MonthOld) {
                if (DayNew >= DayOld) {
                    vaild = true;
                }
            }
        }
        return vaild;
    }
    
    public boolean IsExpired(Products_Model Product) {
        boolean expired = false;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String old_date = Product.getExpired_date();
        StringTokenizer old = new StringTokenizer(old_date, "/");
        StringTokenizer Now = new StringTokenizer(dtf.format(now), "/");
        int DayOld = Integer.parseInt(old.nextToken());
        int MonthOld = Integer.parseInt(old.nextToken());
        int YearOld = Integer.parseInt(old.nextToken());
        int YearNow = Integer.parseInt(Now.nextToken());
        int MonthNow = Integer.parseInt(Now.nextToken());
        int DayNow = Integer.parseInt(Now.nextToken());
        if (YearNow > YearOld) // Expired
        {
            expired = true;
        } else if (YearNow == YearOld) {
            if (MonthNow > MonthOld) {
                expired = true;
            } else if (MonthNow == MonthOld) {
                if (DayNow >= DayOld) {
                    expired = true;
                }
            }
        }
        return expired;
    }
    
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        if (vaildate_fields()) {
            Products_Model SelectedProduct = Products_Operations.Search_Product(txtname.getText());
            if (SelectedProduct != null) {
                int Price, new_quantity, last_quantity;
                String NewExpiredDate;
                if (!txtprice.getText().isEmpty()) {
                    Price = Integer.parseInt(txtprice.getText());
                } else {
                    Price = SelectedProduct.getPrice();
                }
                /*-----FOR QUANTITY------*/
                new_quantity = Integer.parseInt(txtquantity.getText());
                if (IsExpired(SelectedProduct)) {
                    last_quantity = 0;
                } else {
                    last_quantity = SelectedProduct.getQuantity();
                }
                int total_quantity = new_quantity + last_quantity;
                /*-----FOR Expired Date------*/
                if(vaildate_ExpiredDate(SelectedProduct))
                {
                   NewExpiredDate = txtexpireddate.getText();
                }
                else
                {
                   NewExpiredDate=SelectedProduct.getExpired_date();
                }
                Products_Operations.Edit_Product(txtname.getText(), Price, NewExpiredDate, total_quantity);
                /*-----------------------------------*/
                products obj = new products();
                obj.setVisible(true);
                obj.show_table();
                this.dispose();

                JOptionPane.showMessageDialog(null, "Data is updated", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Product Is Not Found", "Message", JOptionPane.WARNING_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Correct information", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EditActionPerformed

    private void txtnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseClicked
        Products_Model obj = Products_Operations.Search_Product(txtname.getText());
        if (obj != null) {
            txtexpireddate.setText(obj.getExpired_date());
            txtprice.setText(obj.getPrice() + "");
            txtquantity.setText(obj.getQuantity() + "");
        }
    }//GEN-LAST:event_txtnameMouseClicked

    private void txtnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseEntered
        Products_Model obj = Products_Operations.Search_Product(txtname.getText());
        if (obj != null) {
            txtexpireddate.setText(obj.getExpired_date());
            txtprice.setText(obj.getPrice() + "");
            txtquantity.setText(obj.getQuantity() + "");
        }
    }//GEN-LAST:event_txtnameMouseEntered

    private void txtnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseExited
        Products_Model obj = Products_Operations.Search_Product(txtname.getText());
        if (obj != null) {
            txtexpireddate.setText(obj.getExpired_date());
            txtprice.setText(obj.getPrice() + "");
            txtquantity.setText(obj.getQuantity() + "");
        }
    }//GEN-LAST:event_txtnameMouseExited

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
            java.util.logging.Logger.getLogger(setStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.mybutton Edit;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtexpireddate;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}