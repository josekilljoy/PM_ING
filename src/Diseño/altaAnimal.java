/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author COMPUTER
 */
public class altaAnimal extends javax.swing.JFrame {

    /**
     * Creates new form altaAnimal
     */
    public altaAnimal() {
        initComponents();
        
        super.setTitle("Alta de Animal");
        
        //Centra la ventana a la pantalla
        super.setLocationRelativeTo(null);
        
        //Textos de ayuda
        TextPrompt placeholder1 = new TextPrompt("Etiqueta del Animal", JTF_Etiqueta);
        placeholder1.changeAlpha(0.75f);
        placeholder1.changeStyle(Font.ITALIC);
        TextPrompt placeholder2 = new TextPrompt("Raza del Animal", JTF_Raza);
        placeholder2.changeAlpha(0.75f);
        placeholder2.changeStyle(Font.ITALIC);
        TextPrompt placeholder3 = new TextPrompt("Nombre del Animal", JTF_Nombre);
        placeholder3.changeAlpha(0.75f);
        placeholder3.changeStyle(Font.ITALIC);
    }

    public String validarCampos() {
        String error="";
        
        
        if ("".equals(JTF_Nombre.getText())) {
            error+="Falta ingresar Nombre\n";
        }
        if ("".equals(JTF_Etiqueta.getText())) {
            error+="Falta ingresar Etiqueta\n";
        }
        if ("".equals(JTF_Raza.getText())) {
            error+="Falta ingresar Raza\n";
        }
        
        return error;
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
        titalta = new javax.swing.JLabel();
        altatel = new javax.swing.JLabel();
        JTF_Etiqueta = new javax.swing.JTextField();
        JTF_Raza = new javax.swing.JTextField();
        altabutt = new javax.swing.JButton();
        cancelbutt = new javax.swing.JButton();
        altanom = new javax.swing.JLabel();
        JTF_Nombre = new javax.swing.JTextField();
        altanom1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        titalta.setText("Ingrese los datos del Animal:");

        altatel.setText("Raza:");

        JTF_Etiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_EtiquetaActionPerformed(evt);
            }
        });

        altabutt.setText("Cargar");
        altabutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altabuttActionPerformed(evt);
            }
        });

        cancelbutt.setText("Cancelar");
        cancelbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttActionPerformed(evt);
            }
        });

        altanom.setText("Etiqueta:");

        JTF_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_NombreActionPerformed(evt);
            }
        });

        altanom1.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titalta)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(altabutt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cancelbutt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(altanom)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(altatel)
                                    .addComponent(altanom1)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTF_Etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titalta)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altanom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altanom1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altatel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altabutt)
                    .addComponent(cancelbutt))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelbuttActionPerformed

    private void altabuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altabuttActionPerformed
        // TODO add your handling code here:
        String errores=validarCampos();
        
        //Sin errores
        if ("".equals(errores)) {
            String etiqueta="", raza="";
            
            etiqueta=JTF_Etiqueta.getText();
            raza=JTF_Raza.getText();
            
            //Lo insertamos en la BD
            /* COMPLETAR */
            
            //Notificamos de la operación exitosa
            JOptionPane.showMessageDialog(null, "Alta de nuevo Animal exitosa: \n\nEtiqueta: " + etiqueta + "\nRaza: " + raza);
            
            //Vaciamos los campos
            JTF_Etiqueta.setText("");
            JTF_Raza.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, errores);
        }
    }//GEN-LAST:event_altabuttActionPerformed

    private void JTF_EtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_EtiquetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_EtiquetaActionPerformed

    private void JTF_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(altaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(altaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(altaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(altaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new altaAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTF_Etiqueta;
    private javax.swing.JTextField JTF_Nombre;
    private javax.swing.JTextField JTF_Raza;
    private javax.swing.JButton altabutt;
    private javax.swing.JLabel altanom;
    private javax.swing.JLabel altanom1;
    private javax.swing.JLabel altatel;
    private javax.swing.JButton cancelbutt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titalta;
    // End of variables declaration//GEN-END:variables
}
