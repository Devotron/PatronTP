package m1.visiteur.formes;

import java.awt.Color;
import java.awt.Point;

import m1.visiteur.Visitor;

public class FormeCarre extends FormeRectangle {

	public FormeCarre(Point ancrage, int cote, Color fill, Color border) {
		super(ancrage, cote, cote, fill, border);
	}
	
	@Override
	public String toString() {
		return "(width = " + width + ", height = " + height + ", ancrage = " + getAncrage() + ")";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
