package com.rick.pattern_11_proxy.d04_album_virtual_proxy;

import java.awt.*;

/**
 * @Author: Rick
 * @Date: 2022/9/24 07:48
 */
public interface Icon {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(final Component c, Graphics g, int x, int y);
}
