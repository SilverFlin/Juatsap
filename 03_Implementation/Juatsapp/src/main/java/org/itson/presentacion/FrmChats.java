package org.itson.presentacion;

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

/**
 *
 */
public class FrmChats extends JFrameActualizable {

    /**
     * Clase para gestionar el crud de ususarios.
     */
    private UsuarioDAO usuarioDAO;

    /**
     * Clase para gestionar el crud de chats.
     */
    private ChatsDAO chatsDAO;
    /**
     * Lista de chats del usuario registrado.
     */
    private List<ChatItem> chatItems;

    private JList<ChatItem> chatsJList;

    private Usuario usuarioLoggeado;

    /**
     * Constuctor único.
     */
    public FrmChats(Usuario usuarioLoggeado) {
        initComponents();
        this.usuarioDAO = new UsuarioDAO();
        this.chatsDAO = new ChatsDAO();
        this.usuarioLoggeado = usuarioLoggeado;
        cargarListaChats();

    }

    @SuppressWarnings("all")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        pnListaChats = new javax.swing.JPanel();
        scPnChats = new javax.swing.JScrollPane();
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

        javax.swing.GroupLayout pnListaChatsLayout = new javax.swing.GroupLayout(pnListaChats);
        pnListaChats.setLayout(pnListaChatsLayout);
        pnListaChatsLayout.setHorizontalGroup(
            pnListaChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scPnChats, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        pnListaChatsLayout.setVerticalGroup(
            pnListaChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaChatsLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
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

    //CHECKSTYLE:OFF
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel pnChatActivo;
    private javax.swing.JPanel pnListaChats;
    private javax.swing.JPanel pnNavBar;
    private javax.swing.JScrollPane scPnChats;
    // End of variables declaration//GEN-END:variables
    //CHECKSTYLE:ON

    @Override
    public void actualizaFrame() {
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
            Chat chat = chatsDAO.consultar(id.toString());

            Usuario usuarioObjectivo = usuarioLoggeado;
            if (chat.getEmisor() == usuarioLoggeado.getId()) {
                usuarioObjectivo = usuarioDAO.consultar(chat.getReceptor().toString());
            } else {
                usuarioObjectivo = usuarioDAO.consultar(chat.getEmisor().toString());
            }

            String titulo = usuarioObjectivo.getUsername();
            Imagen imagen = usuarioObjectivo.getImagenPerfil();
            ChatItem chatItem = new ChatItem(titulo, imagen);
            lista.add(chatItem);
        }

        return lista;
    }

}
