package chapter11_proxy.virtual.study2;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxyWithState implements Icon {
    private ImageIcon imageIcon;
    private URL imageUrl;

    public ImageProxyWithState(URL url) {
        this.imageUrl = url;
        imageIcon = new EmptyImageIcon(this);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public URL getImageUrl() {
        return imageUrl;
    }
}
