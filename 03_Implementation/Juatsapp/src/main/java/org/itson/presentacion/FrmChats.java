package org.itson.presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Chat;
import org.itson.dominio.Imagen;
import org.itson.dominio.Mensaje;
import org.itson.dominio.Usuario;
import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.ChatItem;
import org.itson.utils.ChatItemListCellRenderer;
import org.itson.utils.Dialogs;
import org.itson.utils.Forms;
import org.itson.utils.GestorImagenesMongo;
import org.itson.utils.MensajeItem;
import org.itson.utils.MensajeItem.MsgSide;
import org.itson.utils.ValidadorFrames;

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

    private JPanel chatPanelTest;
    private Chat chatSeleccionado;

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
        pnTituloChat = new javax.swing.JPanel();
        lblChatSeleccionado = new javax.swing.JLabel();
        fotoChatSeleccionado = new javax.swing.JLabel();
        pnMsgsChat = new javax.swing.JPanel();
        scPnChatSeleccionado = new javax.swing.JScrollPane();
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

        scPnChats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scPnChatsMouseClicked(evt);
            }
        });

        btnNuevoChat.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        btnNuevoChat.setForeground(new java.awt.Color(0, 153, 153));
        btnNuevoChat.setText("NUEVO CHAT");
        btnNuevoChat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoChat.setBorderPainted(false);
        btnNuevoChat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        pnTituloChat.setBackground(new java.awt.Color(255, 255, 255));

        lblChatSeleccionado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        fotoChatSeleccionado.setPreferredSize(new java.awt.Dimension(70, 70));

        javax.swing.GroupLayout pnTituloChatLayout = new javax.swing.GroupLayout(pnTituloChat);
        pnTituloChat.setLayout(pnTituloChatLayout);
        pnTituloChatLayout.setHorizontalGroup(
            pnTituloChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloChatLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblChatSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fotoChatSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        pnTituloChatLayout.setVerticalGroup(
            pnTituloChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloChatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTituloChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChatSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoChatSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnMsgsChatLayout = new javax.swing.GroupLayout(pnMsgsChat);
        pnMsgsChat.setLayout(pnMsgsChatLayout);
        pnMsgsChatLayout.setHorizontalGroup(
            pnMsgsChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPnChatSeleccionado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        pnMsgsChatLayout.setVerticalGroup(
            pnMsgsChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMsgsChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scPnChatSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnChatActivoLayout = new javax.swing.GroupLayout(pnChatActivo);
        pnChatActivo.setLayout(pnChatActivoLayout);
        pnChatActivoLayout.setHorizontalGroup(
            pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChatActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnTituloChat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChatActivoLayout.createSequentialGroup()
                        .addComponent(txtNuevoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChatActivoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnMsgsChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnChatActivoLayout.setVerticalGroup(
            pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChatActivoLayout.createSequentialGroup()
                .addComponent(pnTituloChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addGroup(pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnChatActivoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNuevoMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnChatActivoLayout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(pnMsgsChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
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
        this.enviarMensaje();
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

    private void scPnChatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scPnChatsMouseClicked

    }//GEN-LAST:event_scPnChatsMouseClicked

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnNuevoChat;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JLabel fotoChatSeleccionado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblChatSeleccionado;
    private javax.swing.JPanel pnChatActivo;
    private javax.swing.JPanel pnListaChats;
    private javax.swing.JPanel pnMsgsChat;
    private javax.swing.JPanel pnNavBar;
    private javax.swing.JPanel pnTituloChat;
    private javax.swing.JScrollPane scPnChatSeleccionado;
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

        chatsJList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccionarChat();
            }

        });

    }

    private void seleccionarChat() {
        cargarTituloChat();
        cargarChat();
    }

    private void cargarTituloChat() {
        ChatItem selectedItem = chatsJList.getSelectedValue();
        lblChatSeleccionado.setText(selectedItem.getNombreChat());
        fotoChatSeleccionado.setIcon(GestorImagenesMongo.getImageIcon(selectedItem.getImagen(), GestorImagenesMongo.SizeImage.SMALL));
    }

    private void cargarChat() {
        ChatItem selectedItem = chatsJList.getSelectedValue();
        this.chatSeleccionado = unitOfWork.chatsDAO().consultar(selectedItem.getId());
        List<MensajeItem> mensajes = consultarMensajes(chatSeleccionado);

        agregarMensajesAChat(mensajes);

        // Update the chat panel
        pnMsgsChat.revalidate();
        pnMsgsChat.repaint();

    }

    private List<ChatItem> consultarChats() {
        List<ObjectId> listaIds = usuarioLoggeado.getChats();

        List<ChatItem> lista = new ArrayList<>();

        for (ObjectId id : listaIds) {
            Chat chat = unitOfWork.chatsDAO().consultar(id.toString());

            Usuario usuarioObjectivo;
            if (chat.getEmisor().toString().equals(usuarioLoggeado.getId().toString())) {
                usuarioObjectivo = unitOfWork.usuariosDAO().consultar(chat.getReceptor().toString());
            } else {
                usuarioObjectivo = unitOfWork.usuariosDAO().consultar(chat.getEmisor().toString());
            }

            String titulo = usuarioObjectivo.getUsername();
            Imagen imagen = usuarioObjectivo.getImagenPerfil();
            ChatItem chatItem = new ChatItem(titulo, imagen, chat.getId().toString());
            lista.add(chatItem);
        }

        return lista;
    }

    private List<MensajeItem> consultarMensajes(Chat chat) {
        List<ObjectId> listaIds = chat.getHistorialMensajes();

        List<MensajeItem> lista = new ArrayList<>();

        for (ObjectId id : listaIds) {
            Mensaje mensaje = unitOfWork.mensajesDAO().consultar(id.toString());

            Usuario usuarioObjectivo;
            MensajeItem mensajeItem;
            if (mensaje.getUserId().toString().equals(usuarioLoggeado.getId().toString())) {
                usuarioObjectivo = unitOfWork.usuariosDAO().consultar(usuarioLoggeado.getId().toString());
                String username = usuarioObjectivo.getUsername();
                mensajeItem = new MensajeItem(username, MensajeItem.MsgSide.RIGHT);

            } else {
                usuarioObjectivo = unitOfWork.usuariosDAO().consultar(mensaje.getUserId().toString());
                String username = usuarioObjectivo.getUsername();
                mensajeItem = new MensajeItem(username, MensajeItem.MsgSide.LEFT);
            }

            if (mensaje.getImagen() != null) {
                mensajeItem.setImagenMensaje(GestorImagenesMongo.getImageIcon(mensaje.getImagen(), GestorImagenesMongo.SizeImage.MEDIUM));
            } else {
                mensajeItem.setContenidoMensaje(mensaje.getContenidoMensaje());
            }

            lista.add(mensajeItem);
        }

        return lista;
    }

    private void nuevoChat() {
        String username = Dialogs.pedirInputUsuario(rootPane, "Ingresa usuario", "Usuario");

        if (username.equals(usuarioLoggeado.getUsername())) {
            Dialogs.mostrarMensajeError(rootPane, "No puedes hablar contigo mismo.");
            return;
        }

        Usuario usuarioReceptor = unitOfWork.usuariosDAO().consultarPorUsername(username);

        if (usuarioReceptor == null) {
            Dialogs.mostrarMensajeError(rootPane, "No existe ese usuario.");
            return;
        }

        // TODO verificar si ya tienes chat con esa persona
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

    private void agregarMensajesAChat(List<MensajeItem> mensajes) {
        System.out.println(mensajes.size());
        pnMsgsChat.removeAll();
        pnMsgsChat.setLayout(new BoxLayout(pnMsgsChat, BoxLayout.Y_AXIS));
        for (MensajeItem mensaje : mensajes) {
            JPanel messagePanel = createMessagePanel(mensaje);
            pnMsgsChat.add(messagePanel);
        }
//        scPnChatSeleccionado.setViewportView(pnMsgsChat);
        scPnChatSeleccionado.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scPnChatSeleccionado.revalidate();
        scPnChatSeleccionado.repaint();
        scPnChatSeleccionado.getVerticalScrollBar().setValue(scPnChatSeleccionado.getVerticalScrollBar().getMaximum());;

    }

    private JPanel createMessagePanel(MensajeItem mensaje) {
        JPanel messagePanel = new JPanel();
        messagePanel.setLayout(new BorderLayout());

        JTextArea usernameLabel = new JTextArea(mensaje.getUsername());
        usernameLabel.setEditable(false);
        usernameLabel.setLineWrap(true);
        JTextArea contentTextArea = new JTextArea(mensaje.getContenidoMensaje());
        contentTextArea.setEditable(false);
        contentTextArea.setLineWrap(true);

        if (mensaje.getImagenMensaje() != null) {
            JLabel imageLabel = new JLabel(mensaje.getImagenMensaje());
            messagePanel.add(imageLabel, BorderLayout.WEST);
        }

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));

        if (mensaje.getMsgSide() == MsgSide.LEFT) {
            contentTextArea.setBackground(new Color(0, 255, 204));
            contentTextArea.setForeground(new Color(51, 51, 51));

            usernameLabel.setBackground(new Color(0, 255, 204));
            usernameLabel.setForeground(new Color(51, 51, 51));

            usernameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
            textPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        } else if (mensaje.getMsgSide() == MsgSide.RIGHT) {
            contentTextArea.setBackground(new Color(255, 153, 0));
            contentTextArea.setForeground(new Color(255, 255, 255));

            usernameLabel.setBackground(new Color(255, 153, 0));
            usernameLabel.setForeground(new Color(255, 255, 255));

            textPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
            usernameLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        }

        usernameLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, usernameLabel.getPreferredSize().height)); // Set maximum width for username label

        textPanel.add(usernameLabel);
        textPanel.add(contentTextArea);

        textPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        messagePanel.add(textPanel, BorderLayout.CENTER);

        return messagePanel;
    }

    private void enviarMensaje() {
        String contenidoMensaje = txtNuevoMensaje.getText();

        if (!ValidadorFrames.isValidText(contenidoMensaje)) {
            return;
        }

        Mensaje mensaje = new Mensaje();
        mensaje.setDisponibilidad(true);
        mensaje.setTimestamp(LocalDateTime.now());
        mensaje.setContenidoMensaje(contenidoMensaje);
        mensaje.setUserId(usuarioLoggeado.getId());

        unitOfWork.mensajesDAO().agregar(mensaje);

        unitOfWork.chatsDAO().pushMensaje(chatSeleccionado.getId(), mensaje.getId());

        cargarChat();

    }

}
