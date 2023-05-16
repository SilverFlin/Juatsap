package org.itson.presentacion;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.itson.dao.UsuarioDAO;
import org.itson.dominio.Imagen;
import org.itson.dominio.Usuario;
import org.itson.dominio.Sexo;
import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.Dialogs;
import org.itson.utils.Forms;
import org.itson.utils.GestorImagenesMongo;
import org.itson.utils.ValidadorFrames;

/**
 *
 */
public class FrmRegistrarPaso1 extends JFrameActualizable {

    /**
     * Frame anterior.
     */
    private JFrameActualizable frmAnterior;

    /**
     * Usuario que se esta registrando.
     */
    private Usuario usuarioRegistrando;

    /**
     * Clase para gestionar el crud de dao
     */
    private UsuarioDAO usuarioDAO;

    /**
     * Imagen de perfil seleccionada.
     */
    private Imagen imagenPerfil;

    /**
     * Constructor único.
     *
     * @param frmAnterior
     */
    public FrmRegistrarPaso1(final JFrameActualizable frmAnterior) {
        initComponents();
        this.frmAnterior = frmAnterior;
        this.usuarioDAO = new UsuarioDAO();

    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblCorreo1 = new javax.swing.JLabel();
        btnFotoPerfil = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblCorreo2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblCorreo3 = new javax.swing.JLabel();
        cBoxSexo = new javax.swing.JComboBox<>();
        lblCorreo4 = new javax.swing.JLabel();
        lblPreviewPerfil = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblCorreo5 = new javax.swing.JLabel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmarPassword = new javax.swing.JPasswordField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setForeground(new java.awt.Color(51, 51, 51));
        txtUsername.setToolTipText("");
        txtUsername.setBorder(null);
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        Background.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 160, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 10));

        lblCorreo1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo1.setText("Username");
        Background.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 20));

        btnFotoPerfil.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnFotoPerfil.setForeground(new java.awt.Color(0, 153, 153));
        btnFotoPerfil.setText("ELEGIR FOTO PERFIL");
        btnFotoPerfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFotoPerfil.setBorderPainted(false);
        btnFotoPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFotoPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFotoPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFotoPerfilMouseExited(evt);
            }
        });
        btnFotoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoPerfilActionPerformed(evt);
            }
        });
        Background.add(btnFotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 130, 30));

        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setToolTipText("");
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        Background.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, 10));

        lblCorreo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo.setText("Sexo");
        Background.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, 20));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 160, 10));

        lblCorreo2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo2.setText("Password");
        Background.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 80, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 160, 10));

        lblCorreo3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo3.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo3.setText("Confirmar Password");
        Background.add(lblCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 160, 20));

        cBoxSexo.setModel(new DefaultComboBoxModel(Sexo.values()));
        Background.add(cBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, -1));

        lblCorreo4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo4.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo4.setText("Correo");
        Background.add(lblCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 20));

        lblPreviewPerfil.setText("    preview");
        lblPreviewPerfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Background.add(lblPreviewPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 70, 70));

        btnRegresar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 153, 153));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setBorderPainted(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        Background.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        btnContinuar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(0, 153, 153));
        btnContinuar.setText("CONTINUAR");
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
        Background.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 90, 30));

        lblCorreo5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo5.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo5.setText("Fecha De Nacimiento");
        Background.add(lblCorreo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, 20));
        Background.add(datePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        txtPassword.setBorder(null);
        Background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 160, 20));

        txtConfirmarPassword.setBorder(null);
        txtConfirmarPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmarPasswordFocusLost(evt);
            }
        });
        txtConfirmarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarPasswordActionPerformed(evt);
            }
        });
        Background.add(txtConfirmarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 160, 20));

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
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    @SuppressWarnings("all")
    private void btnFotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoPerfilActionPerformed
        try {
            this.elegirFotoPerfil();
        } catch (IOException ex) {
            Logger.getLogger(FrmRegistrarPaso1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFotoPerfilActionPerformed

    @SuppressWarnings("all")
    private void btnFotoPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoPerfilMouseEntered
        Forms.iluminarBoton(btnFotoPerfil);
    }//GEN-LAST:event_btnFotoPerfilMouseEntered

    @SuppressWarnings("all")
    private void btnFotoPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoPerfilMouseExited
        Forms.desiluminarBoton(btnFotoPerfil);
    }//GEN-LAST:event_btnFotoPerfilMouseExited

    @SuppressWarnings("all")
    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    @SuppressWarnings("all")
    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        Forms.iluminarBoton(btnRegresar);
    }//GEN-LAST:event_btnRegresarMouseEntered

    @SuppressWarnings("all")
    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        Forms.desiluminarBoton(btnRegresar);
    }//GEN-LAST:event_btnRegresarMouseExited

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseEntered
        Forms.iluminarBoton(btnContinuar);
    }//GEN-LAST:event_btnContinuarMouseEntered

    @SuppressWarnings("all")
    private void btnContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseExited
        Forms.desiluminarBoton(btnContinuar);
    }//GEN-LAST:event_btnContinuarMouseExited

    @SuppressWarnings("all")
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        this.continuar();
    }//GEN-LAST:event_btnContinuarActionPerformed

    @SuppressWarnings("all")
    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        this.validarUsername();
    }//GEN-LAST:event_txtUsernameFocusLost

    @SuppressWarnings("all")
    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        this.validarCorreo();
    }//GEN-LAST:event_txtCorreoFocusLost

    @SuppressWarnings("all")
    private void txtConfirmarPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarPasswordFocusLost
        this.validarPassword();
    }//GEN-LAST:event_txtConfirmarPasswordFocusLost

    @SuppressWarnings("all")
    private void txtConfirmarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarPasswordActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnFotoPerfil;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cBoxSexo;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPasswordField txtConfirmarPassword;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    private void continuar() {

        if (!this.validarTodosLosCampos()) {
            return;
        }

        usuarioRegistrando = new Usuario();
        usuarioRegistrando.setUsername(txtUsername.getText());
        usuarioRegistrando.setCorreo(txtCorreo.getText());
        usuarioRegistrando.setPassword(txtPassword.getText());
        usuarioRegistrando.setSexo((Sexo) cBoxSexo.getSelectedItem());
        LocalDateTime localDateTime = datePicker.getDate().atStartOfDay();
        usuarioRegistrando.setFechaNacimiento(localDateTime);
        usuarioRegistrando.setImagenPerfil(imagenPerfil);

        this.cargarSiguientePaso();

    }

    private void regresar() {
        Forms.regresar(frmAnterior, this);
    }

    @Override
    public void actualizaFrame() {
    }

    private void elegirFotoPerfil() throws IOException {
        String path = this.obtenerPath();

        File file = new File(path);
        this.imagenPerfil = GestorImagenesMongo.crearImagen("perfil", file);
        Icon imageIcon = GestorImagenesMongo
                .getImageIcon(
                        this.imagenPerfil,
                        GestorImagenesMongo.SizeImage.SMALL
                );
        lblPreviewPerfil.setIcon(imageIcon);

    }

    private String obtenerPath() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar la imagen de perfil.");

        FileNameExtensionFilter imageFilter
                = new FileNameExtensionFilter(
                        "Image files",
                        "jpg", "jpeg", "png"
                );
        fileChooser.setFileFilter(imageFilter);

        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {

            return fileChooser.getSelectedFile().getAbsolutePath();
        } else {
            return null;
        }
    }

    private boolean validarTodosLosCampos() {
        LocalDate date = datePicker.getDate();
        if (date == null || date.isAfter(LocalDate.now())) {
            Dialogs.mostrarMensajeError(rootPane, "Verifica la fecha.");
            return false;
        }
        if (this.imagenPerfil == null) {
            Dialogs.mostrarMensajeError(rootPane, "Selecciona una imagen.");
            return false;
        }

        return validarCorreo() && validarUsername() && validarPassword();
    }

    private boolean validarUsername() {

        String username = txtUsername.getText();

        if (!ValidadorFrames.isValidText(username)) {
            Dialogs.mostrarMensajeError(rootPane, "Username es obligatorio.");
            return false;
        }

        Usuario usuario
                = this.usuarioDAO.consultarPorUsername(username);

        if (usuario != null) {
            Dialogs.mostrarMensajeError(rootPane, "Username existente");
            return false;
        }

        return true;
    }

    private boolean validarCorreo() {
        String correo = txtCorreo.getText();

        if (!ValidadorFrames.isValidEmail(correo)) {
            Dialogs.mostrarMensajeError(rootPane, "Correo inválido.");
            return false;
        }

        if (!ValidadorFrames.isValidText(correo)) {
            Dialogs.mostrarMensajeError(rootPane, "Correo es obligatorio.");
            return false;
        }

        Usuario usuario
                = this.usuarioDAO.consultarPorCorreo(correo);

        if (usuario != null) {
            Dialogs.mostrarMensajeError(rootPane, "Correo existente.");
            return false;
        }
        return true;
    }

    private boolean validarPassword() {
        String password = new String(txtPassword.getPassword());
        String confirPassword = new String(txtConfirmarPassword.getPassword());

        boolean isVacias = password.isBlank() || confirPassword.isBlank();
        boolean isDiferentes = !password.matches(confirPassword);

        if (isVacias || isDiferentes) {
            Dialogs.mostrarMensajeError(
                    rootPane,
                    "Las contraseñas no coinciden."
            );
            return false;
        }

        if (!ValidadorFrames.isValidPassword(password)) {
            Dialogs.mostrarMensajeError(
                    rootPane,
                    "La contraseña no es lo suficiente segura."
            );
            return false;
        }

        return true;
    }

    private void cargarSiguientePaso() {
        Forms.cargarForm(new FrmRegistrarPaso2(this, usuarioRegistrando), this);
    }

}
