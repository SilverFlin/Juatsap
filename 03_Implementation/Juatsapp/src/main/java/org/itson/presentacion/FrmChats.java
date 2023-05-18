package org.itson.presentacion;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.bson.types.ObjectId;
import org.itson.dominio.Chat;
import org.itson.dominio.Imagen;
import org.itson.dominio.Mensaje;
import org.itson.dominio.Usuario;
import org.itson.interfaces.JFrameActualizable;
import org.itson.utils.ChatItem;
import org.itson.utils.ChatItemListCellRenderer;
import org.itson.utils.Dialogs;
import org.itson.utils.Fecha;
import org.itson.utils.Forms;
import org.itson.utils.GestorImagenesMongo;
import org.itson.utils.GestorImagenesMongo.SizeImage;
import org.itson.utils.MensajeItem;
import org.itson.utils.MensajeItem.MsgSide;
import org.itson.utils.ValidadorFrames;

/**
 *
 */
public final class FrmChats extends JFrameActualizable {

    /**
     * Unidad de trabajo con los DAO.
     */
    private final UnitOfWork unitOfWork;
    /**
     * Lista de chats del usuario registrado.
     */
    private List<ChatItem> chatItems;

    /**
     * JList de los chat items.
     */
    private JList<ChatItem> chatsJList;

    /**
     * Usuario logeado.
     */
    private Usuario usuarioLoggeado;

    /**
     * JPanel para mostrar los mensajes. Se encuentra en prueba
     */
    private JPanel chatPanelTest;
    /**
     * Chat seleccionado de la lista de chats.
     */
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
        scPnChatActivo = new javax.swing.JScrollPane();
        pnMsgsChat = new javax.swing.JPanel();
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

        txtNuevoMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNuevoMensajeKeyPressed(evt);
            }
        });

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
                .addGroup(pnTituloChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTituloChatLayout.createSequentialGroup()
                        .addComponent(lblChatSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fotoChatSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnMsgsChatLayout = new javax.swing.GroupLayout(pnMsgsChat);
        pnMsgsChat.setLayout(pnMsgsChatLayout);
        pnMsgsChatLayout.setHorizontalGroup(
            pnMsgsChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        pnMsgsChatLayout.setVerticalGroup(
            pnMsgsChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        scPnChatActivo.setViewportView(pnMsgsChat);

        javax.swing.GroupLayout pnChatActivoLayout = new javax.swing.GroupLayout(pnChatActivo);
        pnChatActivo.setLayout(pnChatActivoLayout);
        pnChatActivoLayout.setHorizontalGroup(
            pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChatActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnTituloChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnChatActivoLayout.createSequentialGroup()
                        .addComponent(txtNuevoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                    .addGroup(pnChatActivoLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(scPnChatActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnChatActivoLayout.setVerticalGroup(
            pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChatActivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnTituloChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scPnChatActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    @SuppressWarnings("all")
    private void btnNuevoChatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoChatMouseEntered
        Forms.iluminarBoton(btnNuevoChat);
    }//GEN-LAST:event_btnNuevoChatMouseEntered

    @SuppressWarnings("all")
    private void btnNuevoChatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoChatMouseExited
        Forms.desiluminarBoton(btnNuevoChat);
    }//GEN-LAST:event_btnNuevoChatMouseExited

    @SuppressWarnings("all")
    private void btnNuevoChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoChatActionPerformed
        this.nuevoChat();
    }//GEN-LAST:event_btnNuevoChatActionPerformed

    @SuppressWarnings("all")
    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        Forms.iluminarBoton(btnCerrarSesion);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    @SuppressWarnings("all")
    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        Forms.desiluminarBoton(btnCerrarSesion);
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    @SuppressWarnings("all")
    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    @SuppressWarnings("all")
    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        Forms.iluminarBoton(btnEnviar);
    }//GEN-LAST:event_btnEnviarMouseEntered

    @SuppressWarnings("all")
    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        Forms.desiluminarBoton(btnEnviar);
    }//GEN-LAST:event_btnEnviarMouseExited

    @SuppressWarnings("all")
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        this.enviarMensaje();
    }//GEN-LAST:event_btnEnviarActionPerformed

    @SuppressWarnings("all")
    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        Forms.iluminarBoton(btnPerfil);
    }//GEN-LAST:event_btnPerfilMouseEntered

    @SuppressWarnings("all")
    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        Forms.desiluminarBoton(btnPerfil);
    }//GEN-LAST:event_btnPerfilMouseExited

    @SuppressWarnings("all")
    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        this.cargarPerfil();
    }//GEN-LAST:event_btnPerfilActionPerformed

    @SuppressWarnings("all")
    private void btnFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseEntered
        Forms.iluminarBoton(btnFoto);
    }//GEN-LAST:event_btnFotoMouseEntered

    @SuppressWarnings("all")
    private void btnFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseExited
        Forms.desiluminarBoton(btnFoto);
    }//GEN-LAST:event_btnFotoMouseExited

    @SuppressWarnings("all")
    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFotoActionPerformed

    @SuppressWarnings("all")
    private void scPnChatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scPnChatsMouseClicked

    }//GEN-LAST:event_scPnChatsMouseClicked

    @SuppressWarnings("all")
    private void txtNuevoMensajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoMensajeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.enviarMensaje();
        }
    }//GEN-LAST:event_txtNuevoMensajeKeyPressed

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
    private javax.swing.JScrollPane scPnChatActivo;
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
            public void mouseClicked(final MouseEvent e) {
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
        fotoChatSeleccionado.setIcon(
                GestorImagenesMongo.getImageIcon(selectedItem.getImagen(),
                        GestorImagenesMongo.SizeImage.SMALL)
        );
    }

    private void cargarChat() {
        ChatItem selectedItem = chatsJList.getSelectedValue();
        this.chatSeleccionado
                = unitOfWork.chatsDAO().consultar(selectedItem.getId());
        List<MensajeItem> mensajes = consultarMensajes(chatSeleccionado);

        agregarMensajesAChat(mensajes);

        // Update the chat panel
        pnMsgsChat.revalidate();
        pnMsgsChat.repaint();

        JScrollBar verticalScrollBar = scPnChatActivo.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMaximum());

    }

    private List<ChatItem> consultarChats() {
        List<ObjectId> listaIds = usuarioLoggeado.getChats();

        List<ChatItem> lista = new ArrayList<>();

        for (ObjectId id : listaIds) {
            Chat chat = unitOfWork.chatsDAO().consultar(id.toString());

            Usuario usuarioObjectivo;
            String idEmisor = chat.getEmisor().toString();
            if (idEmisor.equals(usuarioLoggeado.getId().toString())) {
                usuarioObjectivo
                        = unitOfWork
                                .usuariosDAO()
                                .consultar(chat.getReceptor().toString());
            } else {
                usuarioObjectivo
                        = unitOfWork
                                .usuariosDAO()
                                .consultar(chat.getEmisor().toString());
            }

            String titulo = usuarioObjectivo.getUsername();
            Imagen imagen = usuarioObjectivo.getImagenPerfil();
            String idChat = chat.getId().toString();
            ChatItem chatItem = new ChatItem(titulo, imagen, idChat);
            lista.add(chatItem);
        }

        return lista;
    }

    private List<MensajeItem> consultarMensajes(final Chat chat) {
        List<ObjectId> listaIds = chat.getHistorialMensajes();

        List<MensajeItem> lista = new ArrayList<>();

        for (ObjectId id : listaIds) {
            Mensaje mensaje = unitOfWork.mensajesDAO().consultar(id.toString());

            Usuario usuarioObjectivo;
            MensajeItem mensajeItem;
            String mensajeId = mensaje.getUserId().toString();
            if (mensajeId.equals(usuarioLoggeado.getId().toString())) {
                usuarioObjectivo
                        = unitOfWork
                                .usuariosDAO()
                                .consultar(usuarioLoggeado.getId().toString());
                String username = usuarioObjectivo.getUsername();
                mensajeItem = new MensajeItem(username, MsgSide.LEFT);

            } else {
                usuarioObjectivo
                        = unitOfWork
                                .usuariosDAO()
                                .consultar(mensaje.getUserId().toString());
                String username = usuarioObjectivo.getUsername();
                mensajeItem = new MensajeItem(username, MsgSide.RIGHT);
            }

            if (mensaje.getImagen() != null) {
                mensajeItem.setImagenMensaje(
                        GestorImagenesMongo.getImageIcon(mensaje.getImagen(),
                                SizeImage.MEDIUM)
                );
            } else {
                mensajeItem.setContenidoMensaje(mensaje.getContenidoMensaje());
            }

            lista.add(mensajeItem);
        }

        return lista;
    }

    private void nuevoChat() {
        String username = Dialogs.pedirInputUsuario(
                rootPane,
                "Ingresa usuario",
                "Usuario"
        );

        if (username.equals(usuarioLoggeado.getUsername())) {
            Dialogs.mostrarMensajeError(
                    rootPane,
                    "No puedes hablar contigo mismo."
            );
            return;
        }

        Usuario usuarioReceptor
                = unitOfWork
                        .usuariosDAO()
                        .consultarPorUsername(username);

        if (usuarioReceptor == null) {
            Dialogs.mostrarMensajeError(rootPane, "No existe ese usuario.");
            return;
        }
        String idUsuarioReceptor = usuarioReceptor.getId().toString();
        String idUsuarioLoggeado = usuarioLoggeado.getId().toString();
        boolean existeChat
                = unitOfWork
                        .chatsDAO()
                        .verificarChatExistente(
                                idUsuarioLoggeado,
                                idUsuarioReceptor
                        );
        if (existeChat) {
            Dialogs.mostrarMensajeError(rootPane, "Chat ya existe");
            return;
        }

        Chat chat = new Chat();
        chat.setEmisor(usuarioLoggeado.getId());
        chat.setReceptor(usuarioReceptor.getId());
        chat.setFecha(LocalDateTime.now());

        unitOfWork.chatsDAO().agregar(chat);

        unitOfWork.usuariosDAO()
                .pushChat(usuarioReceptor.getId(), chat.getId());
        unitOfWork.usuariosDAO()
                .pushChat(usuarioLoggeado.getId(), chat.getId());

        this.actualizaFrame();
    }

    private void actualizarUsuarioLoggeado() {
        this.usuarioLoggeado
                = unitOfWork
                        .usuariosDAO()
                        .consultar(this.usuarioLoggeado.getId().toString());
    }

    private void cargarBotones() {
        Forms.desiluminarBoton(btnCerrarSesion);
        Forms.desiluminarBoton(btnEnviar);
        Forms.desiluminarBoton(btnFoto);
        Forms.desiluminarBoton(btnNuevoChat);
        Forms.desiluminarBoton(btnPerfil);
    }

    private void cargarPerfil() {
        Forms.cargarForm(
                new FrmPerfil(this, unitOfWork, usuarioLoggeado),
                this
        );
    }

    private void cerrarSesion() {
        this.usuarioLoggeado = null;
        Forms.cargarForm(new FrmIniciarSesion(), this);
    }

    private void agregarMensajesAChat(final List<MensajeItem> mensajes) {
        pnMsgsChat.removeAll();
        pnMsgsChat.setLayout(new BoxLayout(pnMsgsChat, BoxLayout.PAGE_AXIS));
        for (MensajeItem mensaje : mensajes) {
            JTextPane messagePanel = createMessageTextPane(mensaje);
            pnMsgsChat.add(messagePanel);
        }

    }

    private JTextPane createMessageTextPane(final MensajeItem mensaje) {
        String username = mensaje.getUsername();
        String fecha = Fecha.fechaAhoraConHora();
        String contenido = mensaje.getContenidoMensaje();
        ImageIcon optionalImage = mensaje.getImagenMensaje();
        MsgSide side = mensaje.getMsgSide();

        JTextPane textPane = new JTextPane();
        textPane.setEditable(false);
        textPane.setOpaque(false);

        if (side == MsgSide.LEFT) {
            textPane.setAlignmentX(JTextPane.LEFT_ALIGNMENT);
            textPane.setText("\n" + "tú" + " (" + fecha + "):\n" + contenido);
        } else {
            textPane.setAlignmentX(JTextPane.RIGHT_ALIGNMENT);
            textPane.setText(contenido + "\n"
                    + username + " (" + fecha + ")\n");
        }

        if (optionalImage != null) {
            Style style = textPane.addStyle("image", null);
            StyleConstants.setIcon(style, optionalImage);
            StyledDocument doc = textPane.getStyledDocument();
            try {
                doc.insertString(doc.getLength(), "ignored text", style);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }

        return textPane;

    }

    private void enviarMensaje() {
        String contenidoMensaje = txtNuevoMensaje.getText().trim();

        if (!ValidadorFrames.isValidText(contenidoMensaje)) {
            return;
        }

        Mensaje mensaje = new Mensaje();
        mensaje.setDisponibilidad(true);
        mensaje.setTimestamp(LocalDateTime.now());
        mensaje.setContenidoMensaje(contenidoMensaje);
        mensaje.setUserId(usuarioLoggeado.getId());

        unitOfWork.mensajesDAO().agregar(mensaje);

        unitOfWork.chatsDAO()
                .pushMensaje(chatSeleccionado.getId(), mensaje.getId());
        txtNuevoMensaje.setText("");
        cargarChat();
    }

}
