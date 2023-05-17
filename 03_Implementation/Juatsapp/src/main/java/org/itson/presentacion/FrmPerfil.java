package org.itson.presentacion;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import org.itson.dominio.Direccion;
import org.itson.dominio.Usuario;
import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.Dialogs;
import org.itson.utils.Forms;
import org.itson.utils.GestorImagenesMongo;
import org.itson.utils.ValidadorFrames;

/**
 *
 */
public class FrmPerfil extends JFrameActualizable {

    /**
     * Frame anterior.
     */
    private JFrameActualizable frmAnterior;
    /**
     * Unidad de trabajo con los DAO.
     */
    private final UnitOfWork unitOfWork;
    /**
     * Usuario que está loggeado.
     */
    private Usuario usuarioLoggeado;

    /**
     * Especifica si el ususario esta en modo editar perfil.
     */
    private boolean isEditando;

    /**
     * Constructor único.
     *
     * @param frmAnterior
     * @param unitOfWork
     * @param usuarioLoggeado
     */
    public FrmPerfil(
            final JFrameActualizable frmAnterior,
            final UnitOfWork unitOfWork,
            final Usuario usuarioLoggeado
    ) {
        initComponents();
        this.frmAnterior = frmAnterior;
        this.usuarioLoggeado = usuarioLoggeado;
        this.unitOfWork = unitOfWork;
        this.isEditando = false;
        this.configurarFrame();
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
        btnGuardar = new javax.swing.JButton();
        lblCorreo5 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblCorreo6 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblCorreo7 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        fotoPerfil = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();

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
        Background.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 160, 20));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 160, 10));

        lblCorreo1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo1.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo1.setText("Calle");
        Background.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 80, 20));

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
        Background.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 160, 20));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 160, 10));

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
        Background.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 160, 20));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, 10));

        lblCorreo2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo2.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo2.setText("Estado");
        Background.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 80, 20));

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
        Background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 160, 20));
        Background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 160, 10));

        lblCorreo3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo3.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo3.setText("Teléfono");
        Background.add(lblCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 160, 20));

        lblCorreo4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo4.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo4.setText("Colonia");
        Background.add(lblCorreo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 80, 20));

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

        btnGuardar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 153, 153));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnGuardarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnGuardarFocusLost(evt);
            }
        });
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        Background.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 90, 30));

        lblCorreo5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo5.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo5.setText("Número");
        Background.add(lblCorreo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 80, 20));

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
        Background.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 160, 20));
        Background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, 10));

        lblCorreo6.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo6.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo6.setText("Ciudad");
        Background.add(lblCorreo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 80, 20));

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
        Background.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 160, 20));
        Background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 160, 10));

        lblCorreo7.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lblCorreo7.setForeground(new java.awt.Color(0, 153, 153));
        lblCorreo7.setText("País");
        Background.add(lblCorreo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, 20));

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
        Background.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 160, 20));
        Background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 160, 10));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("username");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("...");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo Electrónico");

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("...");

        fotoPerfil.setText("FotoPerfil");
        fotoPerfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(fotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(fotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCorreo)
                .addGap(28, 28, 28))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 300));

        btnEditar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 153, 153));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnEditarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnEditarFocusLost(evt);
            }
        });
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        Background.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseEntered

    @SuppressWarnings("all")
    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseExited

    @SuppressWarnings("all")
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

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
    private void btnGuardarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnGuardarFocusGained
    }//GEN-LAST:event_btnGuardarFocusGained

    @SuppressWarnings("all")
    private void btnGuardarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnGuardarFocusLost
    }//GEN-LAST:event_btnGuardarFocusLost

    private void btnEditarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEditarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarFocusGained

    private void btnEditarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEditarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarFocusLost

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.toggleModoEditar();
    }//GEN-LAST:event_btnEditarActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblCorreo4;
    private javax.swing.JLabel lblCorreo5;
    private javax.swing.JLabel lblCorreo6;
    private javax.swing.JLabel lblCorreo7;
    private javax.swing.JLabel lblUsername;
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
        configurarFrame();
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

    private void guardar() {

        if (!this.validarCamposVacios()) {
            return;
        }

        if (!this.validarTelefono()) {
            return;
        }

        usuarioLoggeado.setTelefono(txtTelefono.getText());

        Direccion direccion = new Direccion();

        direccion.setCalle(txtCalle.getText());
        direccion.setCiudad(txtCiudad.getText());
        direccion.setColonia(txtColonia.getText());
        direccion.setEstado(txtEstado.getText());
        direccion.setNumero(txtNumero.getText());
        direccion.setPais(txtPais.getText());

        usuarioLoggeado.setDireccion(direccion);

        this.actualizarUsuario();
        this.isEditando = false;
        this.actualizaFrame();
    }

    private void actualizarUsuario() {
        this.unitOfWork.usuariosDAO().actualizar(usuarioLoggeado);
    }

    private void cargarDatosUsuario() {
        if (this.usuarioLoggeado == null) {
            throw new IllegalStateException("Debe existir un usuario loggeado");
        }

        ImageIcon imageIcon = GestorImagenesMongo.getImageIcon(usuarioLoggeado.getImagenPerfil(), GestorImagenesMongo.SizeImage.SMALL);
        fotoPerfil.setIcon(imageIcon);

        lblUsername.setText(usuarioLoggeado.getUsername());
        lblCorreo.setText(usuarioLoggeado.getCorreo());

        txtTelefono.setText(usuarioLoggeado.getTelefono());

        Direccion direccion = usuarioLoggeado.getDireccion();
        txtCalle.setText(direccion.getCalle());
        txtNumero.setText(direccion.getNumero());
        txtColonia.setText(direccion.getColonia());
        txtCiudad.setText(direccion.getCiudad());
        txtEstado.setText(direccion.getEstado());
        txtPais.setText(direccion.getPais());

    }

    private void configurarFrame() {
        this.isCamposActivos(isEditando);
        this.cargarDatosUsuario();

        this.ajustarVisibilidadBotonesEditar();

    }

    private void isCamposActivos(boolean estado) {
        txtCalle.setEnabled(estado);
        txtNumero.setEnabled(estado);
        txtColonia.setEnabled(estado);
        txtCiudad.setEnabled(estado);
        txtEstado.setEnabled(estado);
        txtPais.setEnabled(estado);
        txtTelefono.setEnabled(estado);
    }

    private void ajustarVisibilidadBotonesEditar() {
        this.btnGuardar.setVisible(isEditando);
        if (isEditando) {
            btnEditar.setText("CANCELAR");
        } else {
            btnEditar.setText("EDITAR");
        }
    }

    private void toggleModoEditar() {
        this.isEditando = !this.isEditando;
        configurarFrame();

    }

}
