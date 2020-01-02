package chapter11_proxy.virtual.study2;


import chapter11_proxy.virtual.study1.ImageComponent;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Map;

public class ImageProxyTestDriveWithState {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Map<String, String> menuItemsUrls = new Hashtable<>();

    public static void main (String[] args) throws Exception {
        ImageProxyTestDriveWithState testDrive = new ImageProxyTestDriveWithState();
    }

    public ImageProxyTestDriveWithState() throws Exception{
        menuItemsUrls.put("Programming","https://image.shutterstock.com/image-vector/software-web-development-programming-concept-260nw-1122339353.jpg");
        menuItemsUrls.put("Code Writing","https://image.shutterstock.com/image-photo/monitor-closeup-function-source-codewriting-260nw-1576314853.jpg");
        menuItemsUrls.put("Technology","https://image.shutterstock.com/image-photo/businessman-computer-background-technology-theme-260nw-1505528303.jpg");
        menuItemsUrls.put("Web Development","https://image.shutterstock.com/image-vector/web-development-application-design-coding-260nw-1575399187.jpg");
        menuItemsUrls.put("Software Abstract","https://image.shutterstock.com/image-vector/programming-software-development-abstract-concept-260nw-1193397784.jpg");

        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        menuItemsUrls.forEach((name,_url) -> {
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener((e) -> {
                try {
                    imageComponent.setIcon(new ImageProxyWithState(new URL(_url)));
                    frame.repaint();
                } catch (MalformedURLException e1) {
                    e1.printStackTrace();
                }
            });
        });

        Icon icon = new ImageProxyWithState(new URL(menuItemsUrls.get("Programming")));
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);

    }
}
