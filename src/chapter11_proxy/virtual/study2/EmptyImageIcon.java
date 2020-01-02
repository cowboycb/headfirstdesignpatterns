package chapter11_proxy.virtual.study2;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class EmptyImageIcon extends ImageIcon {
    private ImageProxyWithState context;
    private boolean retrieving;

    public EmptyImageIcon(ImageProxyWithState context){
        super();
        this.context = context;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD Cover, Please wait...", x+300, y+190);
        if (!retrieving){
            retrieving = true;
            // sychronize image loading
            Thread retrievalThread = new Thread(()->{
                try {
                    // Just ImageIcon could be used, but I want to emphasize the other state which is set with an image url.
                    context.setImageIcon(new RealImageIcon(context.getImageUrl(), "CD Cover"));
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            retrievalThread.start();
        }
    }
}
