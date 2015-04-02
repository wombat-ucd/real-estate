/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.ui;

import com.alee.laf.WebLookAndFeel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import real.estate.dao.ListHouse;
import real.estate.dao.impl.SortedList;
import real.estate.io.HouseFile;

/**
 *
 * @author Chathu
 */
public class RealEsateUI extends javax.swing.JFrame {

    private SortedList propertyList = new SortedList();
    ListHouse house;

    /**
     * Creates new form RealEsateUI
     */
    public RealEsateUI() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(this.getClass().getResource("/real/estate/res/logo.png")).getImage());
        try {
            //HouseFile.writeJSONToFile(propertyList);
            propertyList = HouseFile.readJSONFileToList();
        } catch (IOException ex) {
            Logger.getLogger(RealEsateUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Display information about parameter house on screen 
    private void showHouse(ListHouse house) {
        txtLotNumber.setText(Integer.toString(house.lotNumber()));
        txtFirstName.setText(house.firstName());
        txtLastName.setText(house.lastName());
        txtPrice.setText(Integer.toString(house.price()));
        txtSqFt.setText(Integer.toString(house.squareFeet()));
        txtNumberOfBedrooms.setText(Integer.toString(house.numberOfBedRooms()));
    }

    // Returns current screen information as a ListHouse 
    private ListHouse getHouse() {
        String lastName;
        String firstName;
        int lotNumber;
        int price;
        int squareFeet;
        int bedRooms;
        lotNumber = Integer.parseInt(txtLotNumber.getText());
        firstName = txtFirstName.getText();
        lastName = txtLastName.getText();
        price = Integer.parseInt(txtPrice.getText());
        squareFeet = Integer.parseInt(txtSqFt.getText());
        bedRooms = Integer.parseInt(txtNumberOfBedrooms.getText());
        ListHouse newHouse = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
        return newHouse;
    }

    private void clearHouse() {
        txtLotNumber.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPrice.setText("");
        txtSqFt.setText("");
        txtNumberOfBedrooms.setText("");
        lblStatus.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtLotNumber = new javax.swing.JFormattedTextField();
        txtFirstName = new javax.swing.JFormattedTextField();
        txtLastName = new javax.swing.JFormattedTextField();
        txtPrice = new javax.swing.JFormattedTextField();
        txtSqFt = new javax.swing.JFormattedTextField();
        txtNumberOfBedrooms = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Real Estate");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(127, 140, 141));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 260, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Number of Bedrooms:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Square Feet:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Price:");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Last Name:");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("First Name:");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Lot Number:");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        btnFind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        panel.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 160, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 160, -1));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        panel.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        panel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, -1));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panel.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, -1));

        jButton7.setText("jButton1");
        panel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));
        panel.add(txtLotNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 190, -1));
        panel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, -1));
        panel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 190, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        panel.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 190, -1));
        panel.add(txtSqFt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, -1));
        panel.add(txtNumberOfBedrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 190, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearHouse();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        propertyList.reset();
        if (propertyList.lengthIs() == 0) {
            clearHouse();
        } else {
            house = (ListHouse) propertyList.getNextItem();
            showHouse(house);
        }
        lblStatus.setText("List reset");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if (propertyList.lengthIs() == 0) {
            lblStatus.setText("list is empty!");
        } else {
            house = (ListHouse) propertyList.getNextItem();
            showHouse(house);
            lblStatus.setText("Next house displayed");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();                     // Close window 
        try {
            //Save Data Before closing
            HouseFile.writeJSONToFile(propertyList);
        } catch (IOException ex) {
            Logger.getLogger(RealEsateUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.exit(0);
        }

    }//GEN-LAST:event_formWindowClosing

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            house = getHouse();
            if (propertyList.isThere(house)) {
                lblStatus.setText("Lot number already in use");
            } else {
                propertyList.insert(house);
                lblStatus.setText("House added to list");
            }
        } catch (NumberFormatException badHouseData) {
            // Text field info incorrectly formated 
            lblStatus.setText("Number? " + badHouseData.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            house = getHouse();
            if (propertyList.isThere(house)) {
                propertyList.delete(house);
                lblStatus.setText("House deleted");
            } else {
                lblStatus.setText("Lot number not on list");
            }
        } catch (NumberFormatException badHouseData) {
            lblStatus.setText("Number? " + badHouseData.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        int lotNumber;
        try {
            lotNumber = Integer.parseInt(txtLotNumber.getText());
            house = new ListHouse("", "", lotNumber, 0, 0, 0);
            if (propertyList.isThere(house)) {
                house = (ListHouse) propertyList.retrieve(house);
                showHouse(house);
                lblStatus.setText("House found");
            } else {
                lblStatus.setText("House not found");
            }
        } catch (NumberFormatException badHouseData) {
            // Text field info incorrectly formated statusLabel.setText("Number? " + badHouseData.getMessage()); } 
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Web look and feel */
        //<editor-fold defaultstate="collapsed" desc="Web Look and feel setting code ">
        
         WebLookAndFeel.install ();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealEsateUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel panel;
    private javax.swing.JFormattedTextField txtFirstName;
    private javax.swing.JFormattedTextField txtLastName;
    private javax.swing.JFormattedTextField txtLotNumber;
    private javax.swing.JFormattedTextField txtNumberOfBedrooms;
    private javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JFormattedTextField txtSqFt;
    // End of variables declaration//GEN-END:variables
}
