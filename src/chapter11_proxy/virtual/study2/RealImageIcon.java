package chapter11_proxy.virtual.study2;

import javax.swing.*;
import java.net.URL;

/**
 * This class can be ignored. This state is just a type of ImageIcon.
 */
public class RealImageIcon extends ImageIcon {

    public RealImageIcon(URL imageUrl, String cd_cover) {
        super(imageUrl, cd_cover);
    }

}
