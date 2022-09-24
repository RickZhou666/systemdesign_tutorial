package com.rick.pattern_11_proxy.d06_album_state_optimization;

import java.awt.*;

/**
 * @Author: Rick
 * @Date: 2022/9/24 10:06
 */
public class IconLoaded implements State{

    ImageProxy imageProxy;

    public IconLoaded(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return imageProxy.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageProxy.getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageProxy.paintIcon(c, g, x, y);
    }
}
