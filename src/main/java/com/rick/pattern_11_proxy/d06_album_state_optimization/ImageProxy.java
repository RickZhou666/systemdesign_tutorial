package com.rick.pattern_11_proxy.d06_album_state_optimization;

import com.rick.pattern_11_proxy.d04_album_virtual_proxy.Icon;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @Author: Rick
 * @Date: 2022/9/24 07:48
 */
public class ImageProxy implements Icon {
    // volatile 保护读
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    State iconLoaded;
    State iconUnLoaded;

    State state = iconUnLoaded;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
        iconLoaded = new IconLoaded(this);
        iconUnLoaded = new IconUnloaded(this, imageURL);
    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }


    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        state.paintIcon(c, g, x, y);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getIconLoaded() {
        return iconLoaded;
    }

    public State getIconUnLoaded() {
        return iconUnLoaded;
    }
}
