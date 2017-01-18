package m1.visiteur.formes;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import m1.visiteur.Visitor;

public class FormeLigne extends AFormeGeometrique {
	
	Point extremite;
	
	public FormeLigne(Point ancrage, Point extremite, Color fill, Color border) {
		super(ancrage, fill, border);
		this.extremite = extremite;
		
	}
	
	@Override
	public String toString() {
		return "(extremite = " + extremite + ", ancrage = " + getAncrage() + ")";
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

	public Point getExtremite() {
		return extremite;
	}

	public void setExtremite(Point extremite) {
		this.extremite = extremite;
	}
	
	

}
