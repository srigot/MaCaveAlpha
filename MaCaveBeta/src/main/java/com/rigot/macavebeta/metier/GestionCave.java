package com.rigot.macavebeta.metier;

import com.rigot.macavebeta.ref.RefAppellation;

import java.util.ArrayList;

/**
 * Created by Seb on 08/11/13.
 */
public class GestionCave {
    private static GestionCave ourInstance = new GestionCave();

    private ArrayList<Vin> liste = new ArrayList<Vin>() ;

    /**
     * Lecture du singleton de GestionCave
     * @return l'instance de GestionCave
     */
    public static GestionCave getInstance() {
        return ourInstance;
    }

    public ArrayList<Vin> getListeVins() {
        return liste;
    }

    public void AjouterVin(Vin v) {
        // TODO Enregistrer le vin
        liste.add(v) ;
    }

    public void ModifierVin(Vin v) {
        // TODO Enregistrer le vin
    }

    private GestionCave() {
        liste.add(new Vin("Nom 1", RefAppellation.BORDEAUX));
        liste.add(new Vin("Nom 2", RefAppellation.BORDEAUX));
    }
}
