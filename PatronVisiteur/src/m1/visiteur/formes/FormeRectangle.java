package m1.visiteur.formes;

import java.awt.Color;
import java.awt.Point;

import m1.visiteur.Visitor;

public class FormeRectangle extends AFormeGeometrique {

	int width;
	int height;
	
	public FormeRectangle(Point ancrage, int w, int h, Color fill, Color border) {
		super(ancrage, fill, border);
		width = w;
		height = h;
	}
	
	@Override
	public String toString() {
		return "(width = " + width + ", height = " + height + ", ancrage = " + getAncrage() + ")";
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int heigth) {
		this.height = heigth;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
	
	
}
