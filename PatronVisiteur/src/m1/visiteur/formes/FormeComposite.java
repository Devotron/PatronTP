package m1.visiteur.formes;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import m1.visiteur.Visitor;

public class FormeComposite extends AFormeGeometrique implements Iterable<AFormeGeometrique> {

	ArrayList<AFormeGeometrique> formes;
	
	public FormeComposite(Point ancrage, Color fill, Color border) {
		super(ancrage, fill, border);
		formes = new ArrayList<AFormeGeometrique>();
	}
	
	
	public ArrayList<AFormeGeometrique> getFormes() {
		return formes;
	}


	public void ajouterForme(AFormeGeometrique forme) {
		formes.add(forme);
	}


	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}


	@Override
	public Iterator<AFormeGeometrique> iterator() {
		return formes.iterator();
	}
	
	

}
