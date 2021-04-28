package doplnky;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TraySysMenu {
    PopupMenu pop = new PopupMenu();
    final MenuItem mini = new MenuItem("Minimalizovat");
    final MenuItem exit = new MenuItem("Ukoncit");

    public void systemTray(JFrame window) {
        if (SystemTray.isSupported()){

            pop.add(mini);
            pop.add(exit);

            mini.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (window.getState()== JFrame.ICONIFIED){
                        window.setState(JFrame.NORMAL);
                        mini.setLabel("Minimalizovat");
                    }else {
                        window.setState(JFrame.ICONIFIED);
                        mini.setLabel("Obnovit");
                    }
                }
            });
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    window.dispose();
                    System.exit(0);
                }
            });
            SystemTray tr = SystemTray.getSystemTray();
            Image img =null;
            try {
                img = ImageIO.read(TraySysMenu.class.getResourceAsStream("/icon02.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert img != null;
            TrayIcon ic = new TrayIcon(img,"Team Builder",pop);
            try {
                tr.add(ic);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
}
public void eventTray(JFrame window){
        if (window.getState()==JFrame.ICONIFIED){
            mini.setLabel("Obnovit");
        }else {
            mini.setLabel("Minimalizovat");
        }
    }
}
