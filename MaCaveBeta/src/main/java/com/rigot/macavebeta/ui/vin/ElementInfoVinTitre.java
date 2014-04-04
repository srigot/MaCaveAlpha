package com.rigot.macavebeta.ui.vin;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rigot.macavebeta.InfoVinAdapter;
import com.rigot.macavebeta.R;

/**
 * Created by Seb on 11/11/13.
 */
public class ElementInfoVinTitre extends ElementInfoVin {
    private String nom ;

    public ElementInfoVinTitre(InfoVinAdapter adapter, String nom) {
        super(R.layout.item_det_titre, adapter) ;
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

    @Override
    public void modifierChamp(Context contexte) {
        Toast.makeText(contexte, "TODO ElementInfoVinTitre", Toast.LENGTH_SHORT).show();

    }
}
