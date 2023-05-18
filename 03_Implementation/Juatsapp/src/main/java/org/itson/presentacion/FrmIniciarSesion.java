package org.itson.presentacion;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.itson.dominio.Imagen;
import org.itson.dominio.Usuario;
import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.Dialogs;
import org.itson.utils.Encriptador;
import org.itson.utils.Forms;
import org.itson.utils.GestorImagenesMongo;

/**
 *
 */
public class FrmIniciarSesion extends JFrameActualizable {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(FrmIniciarSesion.class.getName());

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
        cargarBotones();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

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
        Background.add(campoTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 190, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 190, 10));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 190, 10));

        lblContraseña.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 153, 153));
        lblContraseña.setText("Contraseña");
        Background.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        campoTextoContraseña.setBorder(null);
        Background.add(campoTextoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 190, 20));

        btnRegistrarse.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 153, 153));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.setBorder(null);
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
        Background.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 90, 30));

        lblCorreo1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo1.setText("Usuario");
        Background.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 80, 20));
        Background.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 70, 70));

        btnIniciarSesion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(0, 153, 153));
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.setBorder(null);
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
        Background.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 100, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("¿No tienes cuenta?");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void cargarLogo() {

        try {
            URL urlLogo = FrmIniciarSesion.class.getResource("/logo.jpg");
            File file = new File(urlLogo.toURI());
            Imagen imgLogo = GestorImagenesMongo.crearImagen("logo", file);
            ImageIcon imgageIcon
                    = GestorImagenesMongo
                            .getImageIcon(
                                    imgLogo,
                                    GestorImagenesMongo.SizeImage.SMALL
                            );
            lblLogo.setIcon(imgageIcon);
        } catch (IOException | URISyntaxException ex) {
            LOG.log(Level.SEVERE, null, ex);
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

    private void iniciarSesion(final Usuario usuario) {
        Forms.cargarForm(new FrmChats(usuario, unitOfWork), this);
    }

    private void cargarBotones() {
        Forms.desiluminarBoton(btnIniciarSesion);
        Forms.desiluminarBoton(btnRegistrarse);
    }

}
