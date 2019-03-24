package com.github.mrnerdy42.keywizard.gui;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;

public class GuiKeyboard extends FloatGui{
	
	public double x;
	public double y;
	public double scaleFactor;
	public GuiKeyWizard parent;
	
	protected GuiKeyRow[] rows;
	
	private GuiKeyboardKey testKey;

	public GuiKeyboard(GuiKeyWizard parent, double x, double y, double scaleFactor) {
		this.x = x;
		this.y = y;
		this.scaleFactor = scaleFactor;
		this.parent = parent;
		
		this.testKey = new GuiKeyboardKey(this.x, this.y, 20.0, 20.0, 30);
	}
	
	public void draw() {
		this.testKey.draw();
	}
	
	private class GuiKeyRow{
		private GuiKeyRow(int start, int end, int width, int height, int spacing) {
			
		}
		private GuiKeyRow(int[] keys, int[] widths, int[] spacings ) {
			
		}
	}
	
	private class GuiKeyboardKey extends FloatGui{
		private double x;
		private double y;
		private double width;
		private double height;
		
		private GuiKeyboardKey(double x, double y, double width, double height, int keyCode) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		private void draw() {
			this.drawRect(this.x, y, this.x + this.width, this.y + this.height, 0xFFFFFFFF);
		}
	}
}
