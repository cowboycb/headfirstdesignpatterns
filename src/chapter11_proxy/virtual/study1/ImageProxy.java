package chapter11_proxy.virtual.study1;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    private ImageIcon imageIcon;
    private URL imageUrl;
    Thread retrievalThread;
    boolean retrieving;

    public ImageProxy(URL url) {
        this.imageUrl = url;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);
        }else{
            g.drawString("Loading CD Cover, Please wait...", x+300, y+190);
            if (!retrieving){
                retrieving = true;
                // sychronize image loading
                retrievalThread = new Thread(()->{
                    try {
                        imageIcon = new ImageIcon(imageUrl, "CD Cover");
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon == null){
            return 800;
        }
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        if (imageIcon == null){
            return 600;
        }
        return imageIcon.getIconHeight();
    }


}
