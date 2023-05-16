package org.itson.presentacion;

import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.Forms;

/**
 *
 */
public class FrmRegistrarPaso2 extends JFrameActualizable {

    /**
     * Frame anterior.
     */
    private JFrameActualizable frmAnterior;

    /**
     * Constructor único.
     *
     * @param frmAnterior
     */
    public FrmRegistrarPaso2(final JFrameActualizable frmAnterior) {
        initComponents();
        this.frmAnterior = frmAnterior;
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        campoTextoUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblCorreo1 = new javax.swing.JLabel();
        campoTextoUsuario1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        campoTextoUsuario2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblCorreo2 = new javax.swing.JLabel();
        campoTextoUsuario3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblCorreo3 = new javax.swing.JLabel();
        lblCorreo4 = new javax.swing.JLabel();
        btnContinuar1 = new javax.swing.JButton();
        btnContinuar2 = new javax.swing.JButton();
        lblCorreo5 = new javax.swing.JLabel();
        campoTextoUsuario4 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblCorreo6 = new javax.swing.JLabel();
        campoTextoUsuario5 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblCorreo7 = new javax.swing.JLabel();
        campoTextoUsuario6 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoTextoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario.setToolTipText("");
        campoTextoUsuario.setBorder(null);
        campoTextoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuarioActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 160, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 10));

        lblCorreo1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo1.setText("Calle");
        Background.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 20));

        campoTextoUsuario1.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario1.setToolTipText("");
        campoTextoUsuario1.setBorder(null);
        campoTextoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario1ActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, 10));

        campoTextoUsuario2.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario2.setToolTipText("");
        campoTextoUsuario2.setBorder(null);
        campoTextoUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario2ActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 160, 20));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 160, 10));

        lblCorreo2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo2.setText("Estado");
        Background.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, 20));

        campoTextoUsuario3.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario3.setToolTipText("");
        campoTextoUsuario3.setBorder(null);
        campoTextoUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario3ActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 160, 10));

        lblCorreo3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo3.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo3.setText("Teléfono");
        Background.add(lblCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 160, 20));

        lblCorreo4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo4.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo4.setText("Colonia");
        Background.add(lblCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 20));

        btnContinuar1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnContinuar1.setForeground(new java.awt.Color(0, 153, 153));
        btnContinuar1.setText("Regresar");
        btnContinuar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar1.setBorderPainted(false);
        btnContinuar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuar1MouseExited(evt);
            }
        });
        btnContinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar1ActionPerformed(evt);
            }
        });
        Background.add(btnContinuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        btnContinuar2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnContinuar2.setForeground(new java.awt.Color(0, 153, 153));
        btnContinuar2.setText("TERMINAR");
        btnContinuar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar2.setBorderPainted(false);
        btnContinuar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuar2MouseExited(evt);
            }
        });
        btnContinuar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar2ActionPerformed(evt);
            }
        });
        Background.add(btnContinuar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 90, 30));

        lblCorreo5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo5.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo5.setText("Número");
        Background.add(lblCorreo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 80, 20));

        campoTextoUsuario4.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario4.setToolTipText("");
        campoTextoUsuario4.setBorder(null);
        campoTextoUsuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario4ActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 160, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 160, 10));

        lblCorreo6.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo6.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo6.setText("Ciudad");
        Background.add(lblCorreo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, 20));

        campoTextoUsuario5.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario5.setToolTipText("");
        campoTextoUsuario5.setBorder(null);
        campoTextoUsuario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario5ActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 160, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, 10));

        lblCorreo7.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo7.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo7.setText("País");
        Background.add(lblCorreo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 80, 20));

        campoTextoUsuario6.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario6.setToolTipText("");
        campoTextoUsuario6.setBorder(null);
        campoTextoUsuario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario6ActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 160, 20));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 160, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("all")
    private void campoTextoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuarioActionPerformed

    @SuppressWarnings("all")
    private void campoTextoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuario1ActionPerformed
    @SuppressWarnings("all")
    private void campoTextoUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuario2ActionPerformed

    @SuppressWarnings("all")
    private void campoTextoUsuario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuario3ActionPerformed

    @SuppressWarnings("all")
    private void btnContinuar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuar1MouseEntered

    @SuppressWarnings("all")
    private void btnContinuar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuar1MouseExited

    @SuppressWarnings("all")
    private void btnContinuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar1ActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnContinuar1ActionPerformed

    @SuppressWarnings("all")
    private void btnContinuar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuar2MouseEntered

    @SuppressWarnings("all")
    private void btnContinuar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuar2MouseExited

    @SuppressWarnings("all")
    private void btnContinuar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuar2ActionPerformed

    @SuppressWarnings("all")
    private void campoTextoUsuario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuario4ActionPerformed

    @SuppressWarnings("all")
    private void campoTextoUsuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuario5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuario5ActionPerformed

    @SuppressWarnings("all")
    private void campoTextoUsuario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoUsuario6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoUsuario6ActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnContinuar1;
    private javax.swing.JButton btnContinuar2;
    private javax.swing.JTextField campoTextoUsuario;
    private javax.swing.JTextField campoTextoUsuario1;
    private javax.swing.JTextField campoTextoUsuario2;
    private javax.swing.JTextField campoTextoUsuario3;
    private javax.swing.JTextField campoTextoUsuario4;
    private javax.swing.JTextField campoTextoUsuario5;
    private javax.swing.JTextField campoTextoUsuario6;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblCorreo4;
    private javax.swing.JLabel lblCorreo5;
    private javax.swing.JLabel lblCorreo6;
    private javax.swing.JLabel lblCorreo7;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    @Override
    public void actualizaFrame() {

    }

    private void regresar() {
        Forms.regresar(frmAnterior, this);
    }

}
