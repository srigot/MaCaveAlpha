package com.rigot.macavebeta;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Seb on 11/11/13.
 */
public class ElementInfoVinTitre extends ElementInfoVin {
    private String nom ;

    public ElementInfoVinTitre(String nom) {
        super(R.layout.item_det_titre) ;
        this.nom = nom ;
    }

    @Override
    public void remplirChamps(View view) {
        TextView titre = (TextView) view.findViewById(R.id.detNom) ;
        if ((this.nom == null) || ("".equals(this.nom))) {
            titre.setHint("Nom");
        } else {
            titre.setText(this.nom);
        }
    }
}
