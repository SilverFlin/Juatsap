package org.itson.utils;

import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 */
public final class ChatItemListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            final JList<?> list,
            final Object value,
            final int index,
            final boolean isSelected,
            final boolean cellHasFocus
    ) {
        JLabel label = (JLabel) super
                .getListCellRendererComponent(
                        list,
                        value,
                        index,
                        isSelected,
                        cellHasFocus
                );

        ChatItem chat = (ChatItem) value;
        label.setIcon(
                GestorImagenesMongo.getImageIcon(
                        chat.getImagen(),
                        GestorImagenesMongo.SizeImage.SMALL
                ));
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setFont(label.getFont().deriveFont(Font.BOLD));

        return label;
    }
}
