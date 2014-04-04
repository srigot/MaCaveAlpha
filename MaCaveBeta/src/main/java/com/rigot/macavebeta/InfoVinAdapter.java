package com.rigot.macavebeta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.rigot.macavebeta.metier.Vin;
import com.rigot.macavebeta.ref.RefCouleur;
import com.rigot.macavebeta.ui.vin.EIVAnnee;
import com.rigot.macavebeta.ui.vin.EIVCepage;
import com.rigot.macavebeta.ui.vin.ElementInfoVin;
import com.rigot.macavebeta.ui.vin.ElementInfoVinChaine;
import com.rigot.macavebeta.ui.vin.ElementInfoVinEnum;
import com.rigot.macavebeta.ui.vin.ElementInfoVinTitre;

import java.util.ArrayList;
import java.util.List;

/**
 * Projet : ${PROJECT_NAME}
 * Cree par : Seb
 * Date : 11/11/13
 */
public class InfoVinAdapter extends BaseAdapter {
    private Context contexte ;

    private LayoutInflater inflater ;

    private List<ElementInfoVin> liste ;

    public Vin getVin() {
        return vin;
    }

    private Vin vin ;

    public InfoVinAdapter(Context c, Vin v) {
        this.contexte = c ;
        if (v != null) {
            this.vin = v ;
        } else {
            this.vin = new Vin() ;
        }
        this.inflater = LayoutInflater.from(this.contexte);

        creerListeElements() ;
    }

    private void creerListeElements() {
        liste = new ArrayList<ElementInfoVin>() ;

        // Ajout du titre
        liste.add(new ElementInfoVinTitre(this, vin.getNom()));

        // Ajout de la premiere ligne
        liste.add(new EIVAnnee(this));

        // Cepage
        liste.add(new EIVCepage(this)) ;

        // Couleur
//        liste.add(new ElementInfoVinEnum<RefCouleur>(this, "Couleur", vin.getCouleur())) ;

        // taille
//        liste.add(new ElementInfoVinChaine<Float>(this, "Taille", vin.getTaille())) ;

        // Estimation
//        liste.add(new ElementInfoVinChaine<Float>(this, "Estimation", vin.getEstimation())) ;

        // Note



        // Debut fin boire

        // Commentaires

        // Degre


        // Debut fin temperature
     }

    @Override
    public int getCount() {
        return liste.size() ;
    }

    @Override
    public Object getItem(int position) {
        return liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int layout = R.layout.item_det_chaine ;

        // Lecture de l'element
        ElementInfoVin el = (ElementInfoVin) getItem(position);
        if (el != null) {
            layout = el.getLayout() ;
        }

//        if (convertView == null) {
            convertView = inflater.inflate(layout, null) ;
 //       }

        if (el != null) {
            el.remplirChamps(convertView) ;
        }
        return convertView;
    }

    public void modifierChamp(int position) {
        ElementInfoVin el = (ElementInfoVin) getItem(position);
        el.modifierChamp(contexte);
    }
}
