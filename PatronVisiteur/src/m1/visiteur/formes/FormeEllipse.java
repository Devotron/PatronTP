package m1.visiteur.formes;

import java.awt.Color;
import java.awt.Point;

import m1.visiteur.Visitor;

public class FormeEllipse extends AFormeGeometrique {

	int width;
	int height;
	
	public FormeEllipse(Point ancrage, int w, int h, Color fill, Color border) {
		super(ancrage, fill, border);
		width = w;
		height = h;
	}
	
	@Override
	public String toString() {
		return "(width = " + width + ", height = " + height + ", ancrage = " + getAncrage() + ")";
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
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

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public Point calculeDecalageAncrage() {
		
		int w = ancrage.x - width/2;
		int h = ancrage.y - height/2;
		
		return new Point(w, h);
	}

}
