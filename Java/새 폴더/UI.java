/////////////////////////////////////////////////////////////탭의 모양을 정하는 기능
package Donkey;

import java.awt.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;


public class UI extends BasicTabbedPaneUI {
	protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
		g.setColor(Color.white);
		g.drawRoundRect(x, y, w, h,10,10);
		if(isSelected) {
			g.setColor(Color.blue);
			g.drawLine(x+4 ,y+4 ,x+w-4 ,y+4);
		}
	}
}
