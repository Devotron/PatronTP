package m1.visiteur.formes;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import m1.visiteur.Visitable;

public abstract class AFormeGeometrique implements Visitable {

	protected Point ancrage;
	// Notion non obligatoirement un attribut (une methode par ex)
	protected Rectangle boundingBox;

	protected Color fillColor;
	protected Color borderColor;
	
	protected EAlignement alignement;

	public AFormeGeometrique(Point ancrage, Color fill, Color border) {
		this.ancrage = ancrage;
		fillColor = fill;
		borderColor = border;
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

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	public EAlignement getAlignement() {
		return alignement;
	}

	public void setAlignement(EAlignement alignement) {
		this.alignement = alignement;
	}
	
	//Pour bien dessiner les cercle sur son centre
	public Point calculeDecalageAncrage() {
		return ancrage;
	}
	

}
