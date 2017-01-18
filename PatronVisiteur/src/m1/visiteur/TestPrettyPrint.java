package m1.visiteur;

import java.awt.Color;
import java.awt.Point;

import m1.visiteur.formes.FormeCarre;
import m1.visiteur.formes.FormeCercle;
import m1.visiteur.formes.FormeComposite;
import m1.visiteur.formes.FormeEllipse;
import m1.visiteur.formes.FormeLigne;
import m1.visiteur.formes.FormeRectangle;
import m1.visiteur.formes.FormeTexte;

public class TestPrettyPrint {

	public static void main(String[] args) {
		Point a = new Point(45, 30);
		
		FormeRectangle rect = new FormeRectangle(a, 100, 25, Color.white, Color.BLACK);
		FormeCarre car = new FormeCarre(a, 50, Color.white, Color.BLACK);
		FormeEllipse ell = new FormeEllipse(a, 75, 40, Color.white, Color.BLACK);
		FormeCercle cer = new FormeCercle(a, 60, Color.white, Color.BLACK);
		FormeLigne l = new FormeLigne(a, new Point(70, 150), Color.white, Color.BLACK);
		FormeTexte txt = new FormeTexte(a, "PrettyPrint", Color.white, Color.BLACK);
		
		FormeRectangle rect2 = new FormeRectangle(a, 20, 200, Color.white, Color.BLACK);

		FormeComposite cmp = new FormeComposite(a, Color.white, Color.BLACK);
		cmp.ajouterForme(rect);
		cmp.ajouterForme(rect2);
		cmp.ajouterForme(car);
		cmp.ajouterForme(ell);
		cmp.ajouterForme(cer);
		cmp.ajouterForme(l);
		cmp.ajouterForme(txt);
		
		PrettyPrintVisitor print = new PrettyPrintVisitor();
		
		rect.accept(print);
		car.accept(print);
		ell.accept(print);
		cer.accept(print);
		l.accept(print);
		txt.accept(print);
		cmp.accept(print);
	}

}
