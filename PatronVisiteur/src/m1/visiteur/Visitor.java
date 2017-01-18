package m1.visiteur;

import m1.visiteur.formes.FormeCarre;
import m1.visiteur.formes.FormeCercle;
import m1.visiteur.formes.FormeComposite;
import m1.visiteur.formes.FormeEllipse;
import m1.visiteur.formes.FormeLigne;
import m1.visiteur.formes.FormeRectangle;
import m1.visiteur.formes.FormeTexte;

public interface Visitor {

	public void visit(FormeRectangle f);
	
	public void visit(FormeEllipse f);
	
	public void visit(FormeComposite f);
	
	public void visit(FormeLigne f);
	
	public void visit(FormeTexte f);
	
	public void visit(FormeCarre f);
	
	public void visit(FormeCercle f);
}
