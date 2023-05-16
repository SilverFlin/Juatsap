package org.itson.presentacion;

import javax.swing.JTextField;
import org.itson.dao.UsuarioDAO;
import org.itson.dominio.Direccion;
import org.itson.dominio.Usuario;
import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.Dialogs;
import org.itson.utils.Forms;
import org.itson.utils.ValidadorFrames;

/**
 *
 */
public class FrmRegistrarPaso2 extends JFrameActualizable {

    /**
     * Frame anterior.
     */
    private JFrameActualizable frmAnterior;
    /**
     * Unidad de trabajo con los DAO.
     */
    private final UnitOfWork unitOfWork;
    /**
     * Usuario que se esta registrando.
     */
    private Usuario usuarioRegistrando;

    /**
     * Constructor único.
     *
     * @param frmAnterior
     * @param unitOfWork
     * @param usuarioRegistrado
     */
    public FrmRegistrarPaso2(
            final JFrameActualizable frmAnterior,
            final UnitOfWork unitOfWork,
            final Usuario usuarioRegistrado
    ) {
        initComponents();
        this.frmAnterior = frmAnterior;
        this.usuarioRegistrando = usuarioRegistrado;
        this.unitOfWork = unitOfWork;
    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        txtCalle = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblCorreo1 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtEstado = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblCorreo2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblCorreo3 = new javax.swing.JLabel();
        lblCorreo4 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        lblCorreo5 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblCorreo6 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblCorreo7 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCalle.setForeground(new java.awt.Color(51, 51, 51));
        txtCalle.setToolTipText("");
        txtCalle.setBorder(null);
        txtCalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCalleFocusLost(evt);
            }
        });
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        Background.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 160, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, 10));

        lblCorreo1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo1.setText("Calle");
        Background.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 20));

        txtColonia.setForeground(new java.awt.Color(51, 51, 51));
        txtColonia.setToolTipText("");
        txtColonia.setBorder(null);
        txtColonia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtColoniaFocusLost(evt);
            }
        });
        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });
        Background.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, 10));

        txtEstado.setForeground(new java.awt.Color(51, 51, 51));
        txtEstado.setToolTipText("");
        txtEstado.setBorder(null);
        txtEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstadoFocusLost(evt);
            }
        });
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        Background.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 160, 20));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 160, 10));

        lblCorreo2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo2.setText("Estado");
        Background.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, 20));

        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        txtTelefono.setToolTipText("");
        txtTelefono.setBorder(null);
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        Background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 160, 10));

        lblCorreo3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo3.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo3.setText("Teléfono");
        Background.add(lblCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 160, 20));

        lblCorreo4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo4.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo4.setText("Colonia");
        Background.add(lblCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 20));

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

        btnTerminar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(0, 153, 153));
        btnTerminar.setText("TERMINAR");
        btnTerminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTerminar.setBorderPainted(false);
        btnTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTerminar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnTerminarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnTerminarFocusLost(evt);
            }
        });
        btnTerminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTerminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTerminarMouseExited(evt);
            }
        });
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        Background.add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 90, 30));

        lblCorreo5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo5.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo5.setText("Número");
        Background.add(lblCorreo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 80, 20));

        txtNumero.setForeground(new java.awt.Color(51, 51, 51));
        txtNumero.setToolTipText("");
        txtNumero.setBorder(null);
        txtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroFocusLost(evt);
            }
        });
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        Background.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 160, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 160, 10));

        lblCorreo6.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo6.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo6.setText("Ciudad");
        Background.add(lblCorreo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, 20));

        txtCiudad.setForeground(new java.awt.Color(51, 51, 51));
        txtCiudad.setToolTipText("");
        txtCiudad.setBorder(null);
        txtCiudad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCiudadFocusLost(evt);
            }
        });
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });
        Background.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 160, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, 10));

        lblCorreo7.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo7.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo7.setText("País");
        Background.add(lblCorreo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 80, 20));

        txtPais.setForeground(new java.awt.Color(51, 51, 51));
        txtPais.setToolTipText("");
        txtPais.setBorder(null);
        txtPais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaisFocusLost(evt);
            }
        });
        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });
        Background.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 160, 20));
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
    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    @SuppressWarnings("all")
    private void txtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColoniaActionPerformed
    @SuppressWarnings("all")
    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    @SuppressWarnings("all")
    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    @SuppressWarnings("all")
    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarMouseEntered

    @SuppressWarnings("all")
    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarMouseExited

    @SuppressWarnings("all")
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.regresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    @SuppressWarnings("all")
    private void btnTerminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarMouseEntered

    @SuppressWarnings("all")
    private void btnTerminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarMouseExited

    @SuppressWarnings("all")
    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        this.terminarRegistro();
    }//GEN-LAST:event_btnTerminarActionPerformed

    @SuppressWarnings("all")
    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    @SuppressWarnings("all")
    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    @SuppressWarnings("all")
    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    @SuppressWarnings("all")
    private void txtCalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCalleFocusLost
        this.validarCampo(txtCalle, "Calle");
    }//GEN-LAST:event_txtCalleFocusLost

    @SuppressWarnings("all")
    private void txtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroFocusLost
        this.validarCampo(txtNumero, "Numero");
    }//GEN-LAST:event_txtNumeroFocusLost

    @SuppressWarnings("all")
    private void txtColoniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColoniaFocusLost
        this.validarCampo(txtColonia, "Colonia");
    }//GEN-LAST:event_txtColoniaFocusLost

    @SuppressWarnings("all")
    private void txtCiudadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCiudadFocusLost
        this.validarCampo(txtCiudad, "Ciudad");
    }//GEN-LAST:event_txtCiudadFocusLost

    @SuppressWarnings("all")
    private void txtEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusLost
        this.validarCampo(txtEstado, "Estado");
    }//GEN-LAST:event_txtEstadoFocusLost

    @SuppressWarnings("all")
    private void txtPaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaisFocusLost
        this.validarCampo(txtPais, "Pais");
    }//GEN-LAST:event_txtPaisFocusLost

    @SuppressWarnings("all")
    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        this.validarTelefono();
    }//GEN-LAST:event_txtTelefonoFocusLost

    @SuppressWarnings("all")
    private void btnTerminarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnTerminarFocusGained
    }//GEN-LAST:event_btnTerminarFocusGained

    @SuppressWarnings("all")
    private void btnTerminarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnTerminarFocusLost
    }//GEN-LAST:event_btnTerminarFocusLost

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTerminar;
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
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    @Override
    public void actualizaFrame() {

    }

    private void regresar() {
        Forms.regresar(frmAnterior, this);
    }

    private boolean validarCampo(
            final JTextField campo,
            final String nombreCampo
    ) {
        if (!ValidadorFrames.isValidText(campo.getText())) {
            Dialogs.mostrarMensajeError(
                    this,
                    nombreCampo + " es un campo necesario."
            );
            return false;
        }
        return true;
    }

    private boolean validarTelefono() {
        validarCampo(txtTelefono, "Telefono");

        if (!ValidadorFrames.isValidTelefono(txtTelefono.getText())) {
            Dialogs.mostrarMensajeError(
                    this,
                    "El teléfono debe estar a 10 dígitos."
            );
            return false;
        }
        return true;
    }

    private boolean validarCamposVacios() {

        JTextField[] txtFieldsArr = new JTextField[]{
            txtCalle,
            txtCiudad,
            txtColonia,
            txtEstado,
            txtNumero,
            txtPais,
            txtTelefono
        };

        for (JTextField field : txtFieldsArr) {
            if (!ValidadorFrames.isValidText(field.getText())) {
                return false;
            }
        }

        return true;
    }

    private void terminarRegistro() {

        if (!this.validarCamposVacios()) {
            return;
        }

        if (!this.validarTelefono()) {
            return;
        }

        usuarioRegistrando.setTelefono(txtTelefono.getText());

        Direccion direccion = new Direccion();

        direccion.setCalle(txtCalle.getText());
        direccion.setCiudad(txtCiudad.getText());
        direccion.setColonia(txtColonia.getText());
        direccion.setEstado(txtEstado.getText());
        direccion.setNumero(txtNumero.getText());
        direccion.setPais(txtPais.getText());

        usuarioRegistrando.setDireccion(direccion);

        this.guardarUsuario();

        this.regresarALogin();

    }

    private void guardarUsuario() {
        this.unitOfWork.usuariosDAO().agregar(usuarioRegistrando);
    }

    private void regresarALogin() {
        Forms.cargarForm(new FrmIniciarSesion(), this);
    }

}
