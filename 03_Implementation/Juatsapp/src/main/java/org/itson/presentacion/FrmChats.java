package org.itson.presentacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import org.bson.types.ObjectId;
import org.itson.dao.ChatsDAO;
import org.itson.dao.UsuarioDAO;
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
        pnNavBar = new javax.swing.JPanel();

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

        javax.swing.GroupLayout pnChatActivoLayout = new javax.swing.GroupLayout(pnChatActivo);
        pnChatActivo.setLayout(pnChatActivoLayout);
        pnChatActivoLayout.setHorizontalGroup(
            pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        pnChatActivoLayout.setVerticalGroup(
            pnChatActivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Background.add(pnChatActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 710, 450));

        pnNavBar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnNavBarLayout = new javax.swing.GroupLayout(pnNavBar);
        pnNavBar.setLayout(pnNavBarLayout);
        pnNavBarLayout.setHorizontalGroup(
            pnNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        pnNavBarLayout.setVerticalGroup(
            pnNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
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

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnNuevoChat;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel pnChatActivo;
    private javax.swing.JPanel pnListaChats;
    private javax.swing.JPanel pnNavBar;
    private javax.swing.JScrollPane scPnChats;
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

}
