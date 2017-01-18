package m1.visiteur;

import m1.visiteur.formes.AFormeGeometrique;
import m1.visiteur.formes.FormeCarre;
import m1.visiteur.formes.FormeCercle;
import m1.visiteur.formes.FormeComposite;
import m1.visiteur.formes.FormeEllipse;
import m1.visiteur.formes.FormeLigne;
import m1.visiteur.formes.FormeRectangle;
import m1.visiteur.formes.FormeTexte;

public class PrettyPrintVisitor implements Visitor {

	@Override
	public void visit(FormeRectangle f) {
		System.out.println("[ Rectangle ] : " + f+ "\n");
	}

	@Override
	public void visit(FormeEllipse f) {
		System.out.println("[ Ellipse ] : " + f + "\n");
	}

	@Override
	public void visit(FormeComposite f) {
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("[ Composite ] :\n");
		
		for (AFormeGeometrique forme : f) {
			String s = forme.getClass().getSimpleName();
			switch (s) {
			case "FormeRectangle":
				sb.append(">[ Rectangle ] : " + forme + "\n");
				break;
			case "FormeCarre":
				sb.append(">[ Carre ] : " + forme + "\n");
				break;
			case "FormeCercle":
				sb.append(">[ Cercle ] : " + forme + "\n");
				break;
			case "FormeEllipse":
				sb.append(">[ Ellipse ] : " + forme + "\n");
				break;
			case "FormeLigne":
				sb.append(">[ Ligne ] : " + forme + "\n");
				break;
			case "FormeTexte":
				sb.append(">[ Texte ] : " + forme + "\n");
				break;	
			default:
				break;
			}
			
		}
		
		System.out.println(sb.toString());
	}

	@Override
	public void visit(FormeLigne f) {
		System.out.println("[ Ligne ] : " + f+ "\n");
	}

	@Override
	public void visit(FormeTexte f) {
		System.out.println("[ Texte ] : " + f+ "\n");
	}

	@Override
	public void visit(FormeCarre f) {
		System.out.println("[ Carre ] : " + f+ "\n");
	}

	@Override
	public void visit(FormeCercle f) {
		System.out.println("[ Cercle ] : " + f+ "\n");
	}

}
