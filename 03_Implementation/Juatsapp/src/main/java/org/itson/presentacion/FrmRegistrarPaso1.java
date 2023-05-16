package org.itson.presentacion;

import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.Forms;

/**
 *
 */
public class FrmRegistrarPaso1 extends JFrameActualizable {

    /**
     * Frame anterior.
     */
    private JFrameActualizable frmAnterior;

    /**
     * Constructor único.
     *
     * @param frmAnterior
     */
    public FrmRegistrarPaso1(final JFrameActualizable frmAnterior) {
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
        btnContinuar = new javax.swing.JButton();
        campoTextoUsuario1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        campoTextoUsuario2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblCorreo2 = new javax.swing.JLabel();
        campoTextoUsuario3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblCorreo3 = new javax.swing.JLabel();
        lblCorreo4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblPreviewPerfil = new javax.swing.JLabel();
        btnContinuar1 = new javax.swing.JButton();
        btnContinuar2 = new javax.swing.JButton();
        lblCorreo5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

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
        lblCorreo1.setText("Usuario");
        Background.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 20));

        btnContinuar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(0, 153, 153));
        btnContinuar.setText("ELEGIR FOTO PERFIL");
        btnContinuar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContinuar.setBorderPainted(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuarMouseExited(evt);
            }
        });
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        Background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 130, 30));

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

        lblCorreo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo.setText("Sexo");
        Background.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, 20));

        campoTextoUsuario2.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario2.setToolTipText("");
        campoTextoUsuario2.setBorder(null);
        campoTextoUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario2ActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 160, 20));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 160, 10));

        lblCorreo2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo2.setText("Password");
        Background.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 80, 20));

        campoTextoUsuario3.setForeground(new java.awt.Color(51, 51, 51));
        campoTextoUsuario3.setToolTipText("");
        campoTextoUsuario3.setBorder(null);
        campoTextoUsuario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoUsuario3ActionPerformed(evt);
            }
        });
        Background.add(campoTextoUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 160, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 160, 10));

        lblCorreo3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo3.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo3.setText("Confirmar Password");
        Background.add(lblCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 160, 20));

        lblCorreo4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo4.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo4.setText("Correo");
        Background.add(lblCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Background.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, -1));

        lblPreviewPerfil.setText("previewPerfil");
        Background.add(lblPreviewPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 70, 60));

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
        btnContinuar2.setText("CONTINUAR");
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
        lblCorreo5.setText("Fecha De Nacimiento");
        Background.add(lblCorreo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Background.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 110, -1));

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
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
    }//GEN-LAST:event_btnContinuarActionPerformed

    @SuppressWarnings("all")
    private void btnContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseEntered
        Forms.iluminarBoton(btnContinuar);
    }//GEN-LAST:event_btnContinuarMouseEntered

    @SuppressWarnings("all")
    private void btnContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseExited
        Forms.desiluminarBoton(btnContinuar);
    }//GEN-LAST:event_btnContinuarMouseExited

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
        this.continuar();
    }//GEN-LAST:event_btnContinuar2ActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnContinuar1;
    private javax.swing.JButton btnContinuar2;
    private javax.swing.JTextField campoTextoUsuario;
    private javax.swing.JTextField campoTextoUsuario1;
    private javax.swing.JTextField campoTextoUsuario2;
    private javax.swing.JTextField campoTextoUsuario3;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblCorreo4;
    private javax.swing.JLabel lblCorreo5;
    private javax.swing.JLabel lblPreviewPerfil;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void continuar() {
        Forms.cargarForm(new FrmRegistrarPaso2(this), this);
    }

    private void regresar() {
        Forms.regresar(frmAnterior, this);
    }

    @Override
    public void actualizaFrame() {
    }

}
