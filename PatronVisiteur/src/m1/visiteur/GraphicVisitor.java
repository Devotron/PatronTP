package m1.visiteur;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import m1.visiteur.formes.AFormeGeometrique;
import m1.visiteur.formes.FormeCarre;
import m1.visiteur.formes.FormeCercle;
import m1.visiteur.formes.FormeComposite;
import m1.visiteur.formes.FormeEllipse;
import m1.visiteur.formes.FormeLigne;
import m1.visiteur.formes.FormeRectangle;
import m1.visiteur.formes.FormeTexte;

public class GraphicVisitor implements Visitor {

	Graphics contextG;

	public GraphicVisitor(Graphics g) {
		contextG = g;
		System.out.println(g);
	}

	@Override
	public void visit(FormeRectangle f) {

		Color oldColor = contextG.getColor();

		//Fond
		Graphics2D g2 = (Graphics2D) contextG;
		g2.setColor(f.getFillColor());
		g2.fillRect(f.getAncrage().x, f.getAncrage().y, f.getWidth(), f.getHeight());
		//Bordure
		g2.setStroke(new BasicStroke(1));
		g2.setColor(f.getBorderColor());
		g2.drawRect(f.getAncrage().x, f.getAncrage().y, f.getWidth(), f.getHeight());

		g2.setColor(oldColor);
	}

	@Override
	public void visit(FormeEllipse f) {
		
		Color oldColor = contextG.getColor();

		//Fond
		Graphics2D g2 = (Graphics2D) contextG;
		g2.setColor(f.getFillColor());
		//g2.fillOval(f.getAncrage().x, f.getAncrage().y, f.getWidth(), f.getHeight());
		g2.fillOval(f.calculeDecalageAncrage().x, f.calculeDecalageAncrage().y, f.getWidth(), f.getHeight());
		
		//Bordure
		g2.setStroke(new BasicStroke(1));
		g2.setColor(f.getBorderColor());
		g2.drawOval(f.calculeDecalageAncrage().x, f.calculeDecalageAncrage().y, f.getWidth(), f.getHeight());
		//g2.drawOval(f.getAncrage().x, f.getAncrage().y, f.getWidth(), f.getHeight());

		g2.setColor(oldColor);
		
	}

	@Override
	public void visit(FormeComposite f) {
		
		for (AFormeGeometrique forme : f) {
			String s = forme.getClass().getSimpleName();
				
			if (forme.getFillColor() == null) {
				forme.setFillColor(f.getFillColor());
			}
			
			if (forme.getBorderColor() == null) {
				forme.setBorderColor(f.getBorderColor());
			}
			
			switch (s) {
			case "FormeRectangle":
				FormeRectangle r = (FormeRectangle) forme;
				visit(r);
				break;
			case "FormeCarre":
				FormeCarre c = (FormeCarre) forme;
				visit(c);
				break;
			case "FormeCercle":
				FormeCercle cer = (FormeCercle) forme;
				visit(cer);
				break;
			case "FormeEllipse":
				FormeEllipse e = (FormeEllipse) forme;
				visit(e);
				break;
			case "FormeLigne":
				FormeLigne l = (FormeLigne) forme;
				visit(l);
				break;
			case "FormeTexte":
				FormeTexte t = (FormeTexte) forme;
				visit(t);
				break;
			default:
				break;
			}
		}
	}

	@Override
	public void visit(FormeLigne f) {
		
		Color oldColor = contextG.getColor();
		
		contextG.setColor(f.getFillColor());
		contextG.drawLine(f.getAncrage().x, f.getAncrage().y, f.getExtremite().x, f.getExtremite().y);
	
		contextG.setColor(oldColor);
	}

	@Override
	public void visit(FormeTexte f) {
		Color oldColor = contextG.getColor();
		contextG.setColor(f.getFillColor());
		contextG.drawString(f.getTexte(), f.getAncrage().x, f.getAncrage().y);
		contextG.setColor(oldColor);
	}

	@Override
	public void visit(FormeCarre f) {
		Color oldColor = contextG.getColor();

		//Fond
		Graphics2D g2 = (Graphics2D) contextG;
		g2.setColor(f.getFillColor());
		g2.fillRect(f.getAncrage().x, f.getAncrage().y, f.getWidth(), f.getHeight());
		//Bordure
		g2.setStroke(new BasicStroke(1));
		g2.setColor(f.getBorderColor());
		g2.drawRect(f.getAncrage().x, f.getAncrage().y, f.getWidth(), f.getHeight());

		g2.setColor(oldColor);
	}

	@Override
	public void visit(FormeCercle f) {
		Color oldColor = contextG.getColor();

		//Fond
		Graphics2D g2 = (Graphics2D) contextG;
		g2.setColor(f.getFillColor());
		g2.fillOval(f.calculeDecalageAncrage().x, f.calculeDecalageAncrage().y, f.getWidth(), f.getHeight());
		//g2.fillOval(f.getAncrage().x, f.getAncrage().y, f.getWidth(), f.getHeight());
		//Bordure
		g2.setStroke(new BasicStroke(1));
		g2.setColor(f.getBorderColor());
		g2.drawOval(f.calculeDecalageAncrage().x, f.calculeDecalageAncrage().y, f.getWidth(), f.getHeight());
		//g2.drawOval(f.getAncrage().x, f.getAncrage().y, f.getWidth(), f.getHeight());

		g2.setColor(oldColor);}

	}
