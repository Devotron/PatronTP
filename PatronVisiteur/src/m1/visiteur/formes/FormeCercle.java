package m1.visiteur.formes;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import m1.visiteur.Visitor;

public class FormeCercle extends FormeEllipse {
	
	public FormeCercle(Point ancrage, int rayon, Color fill, Color border) {
		super(ancrage, rayon, rayon, fill, border);
	}
	
	@Override
	public String toString() {
		return "(rayon = " + width + ", ancrage = " + getAncrage() + ")";
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
