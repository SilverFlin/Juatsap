package org.itson.presentacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import org.bson.types.ObjectId;
import org.itson.dominio.Chat;
import org.itson.dominio.Imagen;
import org.itson.dominio.Usuario;
import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.ChatItem;
import org.itson.utils.ChatItemListCellRenderer;
import org.itson.utils.Dialogs;
import org.itson.utils.Forms;

/**
 *
 */
public class FrmChats extends JFrameActualizable {

    /**
     * Unidad de trabajo con los DAO.
     */
    private final UnitOfWork unitOfWork;
    /**
     * Lista de chats del usuario registrado.
     */
    private List<ChatItem> chatItems;

    private JList<ChatItem> chatsJList;

    private Usuario usuarioLoggeado;

    /**
     * Constuctor único.
     *
     * @param usuarioLoggeado
     * @param unitOfWork
     */
    public FrmChats(
            final Usuario usuarioLoggeado,
            final UnitOfWork unitOfWork
    ) {
        initComponents();
        this.usuarioLoggeado = usuarioLoggeado;
        this.unitOfWork = unitOfWork;
        cargarBotones();
        cargarListaChats();

    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        pnListaChats = new javax.swing.JPanel();
        scPnChats = new javax.swing.JScrollPane();
        btnNuevoChat = new javax.swing.JButton();
        pnChatActivo = new javax.swing.JPanel();
        txtNuevoMensaje = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnFoto = new javax.swing.JButton();
        pnNavBar = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        Background.setBackground(new java.awt.Color(204, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnListaChats.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevoChat.setText("NUEVO CHAT");
        btnNuevoChat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoChat.setBorderPainted(false);
        btnNuevoChat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoChat.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnNuevoChat.setForeground(new java.awt.Color(0, 153, 153));
        btnNuevoChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoChatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoChatMouseExited(evt);
            }
        });
        btnNuevoChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoChatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnListaChatsLayout = new javax.swing.GroupLayout(pnListaChats);
        pnListaChats.setLayout(pnListaChatsLayout);
        pnListaChatsLayout.setHorizontalGroup(
            pnListaChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPnChats)
            .addComponent(btnNuevoChat, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnListaChatsLayout.setVerticalGroup(
            pnListaChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaChatsLayout.createSequentialGroup()
                .addComponent(btnNuevoChat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scPnChats, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(pnListaChats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 450));

        pnChatActivo.setBackground(new java.awt.Color(255, 255, 255));

        btnEnviar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(0, 153, 153));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnviar.setBorderPainted(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnFoto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(0, 153, 153));
        btnFoto.setText("Foto");
        btnFoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFoto.setBorderPainted(false);
        btnFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFotoMouseExited(evt);
            }
        });
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnChatActivoLayout = new javax.swing.GroupLayout(pnChatActivo);
        pnChatActivo.setLayout(pnChatActivoLayout);
        pnChatActivoLayout.setHorizontalGroup(
            pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChatActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNuevoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnChatActivoLayout.setVerticalGroup(
            pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChatActivoLayout.createSequentialGroup()
                .addGap(0, 402, Short.MAX_VALUE)
                .addGroup(pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addGroup(pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnChatActivoLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(txtNuevoMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))))
                .addContainerGap())
        );

        Background.add(pnChatActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 710, 450));

        pnNavBar.setBackground(new java.awt.Color(255, 255, 255));

        btnCerrarSesion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(0, 153, 153));
        btnCerrarSesion.setText("CERRAR SESIÓN");
        btnCerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnPerfil.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(0, 153, 153));
        btnPerfil.setText("PERFIL");
        btnPerfil.setBorder(null);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerfilMouseExited(evt);
            }
        });
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnNavBarLayout = new javax.swing.GroupLayout(pnNavBar);
        pnNavBar.setLayout(pnNavBarLayout);
        pnNavBarLayout.setHorizontalGroup(
            pnNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 737, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnNavBarLayout.setVerticalGroup(
            pnNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNavBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Background.add(pnNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoChatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoChatMouseEntered
        Forms.iluminarBoton(btnNuevoChat);
    }//GEN-LAST:event_btnNuevoChatMouseEntered

    private void btnNuevoChatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoChatMouseExited
        Forms.desiluminarBoton(btnNuevoChat);
    }//GEN-LAST:event_btnNuevoChatMouseExited

    private void btnNuevoChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoChatActionPerformed
        this.nuevoChat();
    }//GEN-LAST:event_btnNuevoChatActionPerformed

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        Forms.iluminarBoton(btnCerrarSesion);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        Forms.desiluminarBoton(btnCerrarSesion);
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        Forms.iluminarBoton(btnEnviar);
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        Forms.desiluminarBoton(btnEnviar);
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        Forms.iluminarBoton(btnPerfil);
    }//GEN-LAST:event_btnPerfilMouseEntered

    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        Forms.desiluminarBoton(btnPerfil);
    }//GEN-LAST:event_btnPerfilMouseExited

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        this.cargarPerfil();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseEntered
        Forms.iluminarBoton(btnFoto);
    }//GEN-LAST:event_btnFotoMouseEntered

    private void btnFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseExited
        Forms.desiluminarBoton(btnFoto);
    }//GEN-LAST:event_btnFotoMouseExited

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFotoActionPerformed

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnNuevoChat;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel pnChatActivo;
    private javax.swing.JPanel pnListaChats;
    private javax.swing.JPanel pnNavBar;
    private javax.swing.JScrollPane scPnChats;
    private javax.swing.JTextField txtNuevoMensaje;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    @Override
    public void actualizaFrame() {
        actualizarUsuarioLoggeado();
        cargarListaChats();
    }

    private void cargarListaChats() {
        if (usuarioLoggeado == null) {
            throw new IllegalStateException("Debe haber un usuario loggeado.");
        }

        this.chatItems = consultarChats();

        this.chatsJList = new JList<>(chatItems.toArray(new ChatItem[0]));
        chatsJList.setCellRenderer(new ChatItemListCellRenderer());

        scPnChats.setViewportView(chatsJList);

    }

    private List<ChatItem> consultarChats() {
        List<ObjectId> listaIds = usuarioLoggeado.getChats();

        List<ChatItem> lista = new ArrayList<>();

        for (ObjectId id : listaIds) {
            Chat chat = unitOfWork.chatsDAO().consultar(id.toString());

            Usuario usuarioObjectivo = usuarioLoggeado;
            if (chat.getEmisor() == usuarioLoggeado.getId()) {
                usuarioObjectivo = unitOfWork.usuariosDAO().consultar(chat.getEmisor().toString());
            } else {
                usuarioObjectivo = unitOfWork.usuariosDAO().consultar(chat.getReceptor().toString());
            }

            String titulo = usuarioObjectivo.getUsername();
            Imagen imagen = usuarioObjectivo.getImagenPerfil();
            ChatItem chatItem = new ChatItem(titulo, imagen);
            lista.add(chatItem);
        }

        return lista;
    }

    private void nuevoChat() {
        String username = Dialogs.pedirInputUsuario(rootPane, "Ingresa usuario", "Usuario");

        if (username.equals(usuarioLoggeado.getUsername())) {
            Dialogs.mostrarMensajeError(rootPane, "No puedes hablar contigo mismo.");
        }

        Usuario usuarioReceptor = unitOfWork.usuariosDAO().consultarPorUsername(username);

        Chat chat = new Chat();
        chat.setEmisor(usuarioLoggeado.getId());
        chat.setReceptor(usuarioReceptor.getId());
        chat.setFecha(LocalDateTime.now());

        unitOfWork.chatsDAO().agregar(chat);

        unitOfWork.usuariosDAO().pushChat(usuarioReceptor.getId(), chat.getId());
        unitOfWork.usuariosDAO().pushChat(usuarioLoggeado.getId(), chat.getId());

        this.actualizaFrame();
    }

    private void actualizarUsuarioLoggeado() {
        this.usuarioLoggeado = unitOfWork.usuariosDAO().consultar(this.usuarioLoggeado.getId().toString());
    }

    private void cargarBotones() {
        Forms.desiluminarBoton(btnCerrarSesion);
        Forms.desiluminarBoton(btnEnviar);
        Forms.desiluminarBoton(btnFoto);
        Forms.desiluminarBoton(btnNuevoChat);
        Forms.desiluminarBoton(btnPerfil);
    }

    private void cargarPerfil() {
        Forms.cargarForm(new FrmPerfil(this, unitOfWork, usuarioLoggeado), this);
    }

    private void cerrarSesion() {
        this.usuarioLoggeado = null;
        Forms.cargarForm(new FrmIniciarSesion(), this);
    }

}
