package m1.visiteur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

import m1.visiteur.formes.FormeCarre;
import m1.visiteur.formes.FormeCercle;
import m1.visiteur.formes.FormeComposite;
import m1.visiteur.formes.FormeEllipse;
import m1.visiteur.formes.FormeLigne;
import m1.visiteur.formes.FormeRectangle;
import m1.visiteur.formes.FormeTexte;

public class GraphicVisitorTest extends JFrame {

	JPanel drawPanel;
	Graphics contexteG;
	
	GraphicVisitor v;

	public GraphicVisitorTest() {

		this.setSize(600, 600);

		this.setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setVisible(true);
		contexteG = this.getGraphics();
		v = new GraphicVisitor(contexteG);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Point a = new Point(50, 50);
		Point a2 = new Point(10, 30);
		Point a3 = new Point(100, 50);
		Point a4 = new Point(20, 48);
		Point a5 = new Point(80, 148);
		Point a6 = new Point(240, 200);

		FormeRectangle rect = new FormeRectangle(a, 100, 25, Color.white, Color.MAGENTA);
		FormeCarre car = new FormeCarre(a2, 50, Color.blue, Color.BLACK);
		FormeEllipse ell = new FormeEllipse(a3, 75, 40, Color.DARK_GRAY, Color.WHITE);
		FormeCercle cer = new FormeCercle(a4, 60, Color.white, Color.BLACK);
		FormeLigne l = new FormeLigne(a5, new Point(340, 150), Color.white, Color.BLACK);
		FormeTexte txt = new FormeTexte(a6, "PrettyPrint", Color.RED, Color.BLACK);

		FormeRectangle rect2 = new FormeRectangle(a3, 20, 200, Color.white, Color.BLACK);

		rect.accept(v);
		car.accept(v);
		ell.accept(v);
		l.accept(v);
		cer.accept(v);
		txt.accept(v);
		
		rect = new FormeRectangle(new Point(400, 120), 250, 140, Color.white, Color.yellow);
		car = new FormeCarre(new Point(230, 400), 100, Color.MAGENTA, Color.BLACK);
		ell = new FormeEllipse(new Point(340, 100), 120, 80, Color.white, Color.red);
		cer = new FormeCercle(new Point(390, 400), 85, Color.orange, Color.BLACK);
		l = new FormeLigne(new Point(310, 250), new Point(400, 245), null, null);
		txt = new FormeTexte(new Point(60, 250), "COMPOSITE", Color.cyan, Color.BLACK);
		
		
		
		Point a7 = new Point(200, 65);

		FormeComposite cmp = new FormeComposite(a7, Color.green, Color.BLACK);
		cmp.ajouterForme(rect);
		cmp.ajouterForme(rect2);
		cmp.ajouterForme(car);
		cmp.ajouterForme(ell);
		cmp.ajouterForme(cer);
		cmp.ajouterForme(l);
		cmp.ajouterForme(txt);
		
		cmp.accept(v);
	
	}

	public static void main(String[] args) {

		GraphicVisitorTest app = new GraphicVisitorTest();

	}

}
