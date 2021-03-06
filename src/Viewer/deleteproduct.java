/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Viewer;

import Model.DB;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author Ashan Lakshitha
 */
public class deleteproduct extends javax.swing.JDialog {

    /**
     * Creates new form updateproduct
     */
    DB d = new DB();
    
    public deleteproduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setFrontText();
    }
    
    private void setFrontText(){
        setPront(pidtxt, "Product No#");
    }
    
    private void setPront(JTextField a , String text) {
        PromptSupport.setPrompt(text, a);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pidtxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Delete Product");

        pidtxt.setFont(new java.awt.Font("Iskoola Pota", 0, 13)); // NOI18N
        pidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pidtxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pidtxtKeyTyped(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Exciting Name : ");

        namelbl.setFont(new java.awt.Font("Iskoola Pota", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pidtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(namelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(pidtxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please insert a valid ID");
        }else if(namelbl.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please insert a valid ID");
        }else{
            try {
                int i = d.aud("delete from product where id = '"+pidtxt.getText()+"' ");
                if(i==1){
                    JOptionPane.showMessageDialog(this, "Deleted Succesfully");
                    pidtxt.setText("");
                    namelbl.setText("");
                    pidtxt.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(this, "Cant Delete. If there can be some stocks for this product");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pidtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidtxtKeyReleased
        searchproduct();
    }//GEN-LAST:event_pidtxtKeyReleased

    private void pidtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidtxtKeyTyped
        char c = evt.getKeyChar();
        
        String key = String.valueOf(c);
        
        if  (!(Character.isDigit(c) || key.equals("/") || key.equals(" ") || key.equals("(") || key.equals(")") || key.equals("-") || key.equals("+") || key.equals("/")|| key.equals(",")|| key.equals(".") || key.equals(".") || Character.isAlphabetic(c))) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(pidtxt.getText().length() == 0 && key.equals(" ") ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_pidtxtKeyTyped

    private void searchproduct() {
        namelbl.setText("");
        try {
            ResultSet rs = d.srh("select *  from product where id = '"+pidtxt.getText()+"' ");
            for (int i = 0; rs.next(); i++) {
                namelbl.setText(rs.getString("name"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
                
    }
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
            java.util.logging.Logger.getLogger(updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateproduct dialog = new updateproduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField pidtxt;
    // End of variables declaration//GEN-END:variables
}
