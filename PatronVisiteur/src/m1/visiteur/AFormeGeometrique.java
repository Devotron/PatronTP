package m1.visiteur;

import java.awt.Point;
import java.awt.Rectangle;

public abstract class AFormeGeometrique {
	
	private Point ancrage;
	private Rectangle boundingBox;
	
	
	public AFormeGeometrique(Point ancrage, Rectangle box) {
		this.ancrage = ancrage;
		boundingBox = box;
	}
	
	public Point getAncrage() {
		return ancrage;
	}
	public void setAncrage(Point ancrage) {
		this.ancrage = ancrage;
	}
	
	public Rectangle getBoundingBox() {
		return boundingBox;
	}
	public void setBoundingBox(Rectangle boundingBox) {
		this.boundingBox = boundingBox;
	}
	
	
}
