package bebetes;

import java.util.ArrayList;
import java.util.List;

import culdesac.Etat;
import culdesac.Fuite;
import culdesac.MaBebete;

public abstract class BebeteFuite extends Bebete {

    private Fuite fuite = new Fuite();
    private Etat nouvelEtat = new Etat();
    
//    public static final double distanceMin = 10f; // En pixels
    
    @Override
    public void calculeDeplacementAFaire() {
        Etat etatCourant = new Etat();
        etatCourant.x = this.x;
        etatCourant.y = this.y;
        etatCourant.direction = this.directionCourante;
       etatCourant.vitesse = this.vitesseCourante;

       // TODO: add elts
        ArrayList<MaBebete> mesBebetes = new ArrayList<>();
       
       Object params = null;
        // params :  distanceMin, vitesseMax, Class de filtrage
        nouvelEtat = fuite.agit(mesBebetes, etatCourant, params);
    }

    @Override
    public void effectueDeplacement() {
        this.prochaineVitesse = nouvelEtat.vitesse;
        this.prochaineDirection = nouvelEtat.direction;
    }

}
