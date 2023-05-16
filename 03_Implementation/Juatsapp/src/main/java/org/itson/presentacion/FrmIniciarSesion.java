package org.itson.presentacion;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.itson.dominio.Usuario;
import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.Dialogs;
import org.itson.utils.Encriptador;
import org.itson.utils.Forms;

/**
 *
 */
public class FrmIniciarSesion extends JFrameActualizable {

    /**
     * Unidad de trabajo con los DAO.
     */
    private final UnitOfWork unitOfWork;

    /**
     * Constuctor único.
     */
    public FrmIniciarSesion() {
        initComponents();
        cargarLogo();
        this.unitOfWork = new UnitOfWork();

    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        campoTextoUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        campoTextoContraseña = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        lblCorreo1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();

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
        Background.add(campoTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 190, 10));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 190, 10));

        lblContraseña.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 153, 153));
        lblContraseña.setText("Contraseña");
        Background.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        campoTextoContraseña.setBorder(null);
        Background.add(campoTextoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 190, 20));

        btnRegistrarse.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 153, 153));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseExited(evt);
            }
        });
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        Background.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 90, 30));

        lblCorreo1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo1.setText("Usuario");
        Background.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 80, 20));
        Background.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 70, 60));

        btnIniciarSesion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(0, 153, 153));
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        Background.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 100, 30));

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
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        this.cargarRegistro();
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    @SuppressWarnings("all")
    private void btnRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseExited
        Forms.desiluminarBoton(btnRegistrarse);
    }//GEN-LAST:event_btnRegistrarseMouseExited

    @SuppressWarnings("all")
    private void btnRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseEntered
        Forms.iluminarBoton(btnRegistrarse);
    }//GEN-LAST:event_btnRegistrarseMouseEntered

    @SuppressWarnings("all")
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        this.intentarIniciarSesion();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    @SuppressWarnings("all")
    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        Forms.desiluminarBoton(btnIniciarSesion);
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    @SuppressWarnings("all")
    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        Forms.iluminarBoton(btnIniciarSesion);
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPasswordField campoTextoContraseña;
    private javax.swing.JTextField campoTextoUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void cargarLogo() {
        // TODO
        try {
            BufferedImage image
                    = ImageIO.read(
                            FrmIniciarSesion.class.getResource("/gato2.jpg")
                    );
            final int width = 500;
            final int height = 500;
            Image scaledImage = image
                    .getScaledInstance(width, height, Image.SCALE_SMOOTH);

            // Create an ImageIcon from the scaled image
            ImageIcon imageIcon = new ImageIcon(scaledImage);

            // Set the image icon on the label
            lblLogo.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void cargarRegistro() {
        Forms.cargarForm(new FrmRegistrarPaso1(this, unitOfWork), this);
    }

    @Override
    public void actualizaFrame() {
    }

    private void intentarIniciarSesion() {

        if (!this.validarCampos()) {
            return;
        }

        Usuario usuario = unitOfWork
                .usuariosDAO()
                .consultarPorUsername(campoTextoUsuario.getText());

        if (usuario == null) {
            this.mostrarErrorInicioSesion();
            return;
        }

        String intentoPassword = new String(campoTextoContraseña.getPassword());
        boolean isPasswordValida
                = Encriptador.verificarPasswordConHash(
                        intentoPassword,
                        usuario.getPassword()
                );

        if (!isPasswordValida) {
            this.mostrarErrorInicioSesion();
            return;
        }

        this.iniciarSesion(usuario);
    }

    private boolean validarCampos() {

        if (campoTextoUsuario.getText().isBlank()) {
            return false;
        }

        if (new String(campoTextoContraseña.getPassword()).isBlank()) {
            return false;
        }

        return true;

    }

    private void mostrarErrorInicioSesion() {
        Dialogs.mostrarMensajeError(rootPane, "Credenciales no validas.");
    }

    private void iniciarSesion(Usuario usuario) {
        Forms.cargarForm(new FrmChats(usuario, unitOfWork), this);
    }

}
