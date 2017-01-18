package m1.visiteur.formes;

import java.awt.Color;
import java.awt.Point;

import m1.visiteur.Visitor;

public class FormeTexte extends AFormeGeometrique {

	private String texte;
	
	public FormeTexte(Point ancrage, String t, Color fill, Color border) {
		super(ancrage, fill, border);
		texte = t;
	}
	
	
	@Override
	public String toString() {
		return "(texte = " + texte + ")";
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
