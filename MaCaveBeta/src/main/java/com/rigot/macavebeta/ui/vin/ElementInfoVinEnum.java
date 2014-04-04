package com.rigot.macavebeta.ui.vin;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rigot.macavebeta.InfoVinAdapter;
import com.rigot.macavebeta.R;

/**
 * Projet : MaCaveBeta
 * Cree par : Seb
 * Date : 28/11/13
 */
public class ElementInfoVinEnum<T> extends ElementInfoVin {
    private String titre ;
    private T valeur ;

    public ElementInfoVinEnum(InfoVinAdapter adapter, String titre, T valeur) {
        super(R.layout.item_det_chaine, adapter) ;
        this.titre = titre ;
        this.valeur = valeur ;
    }

    @Override
    public void remplirChamps(View view) {
        TextView champ1 = (TextView) view.findViewById(R.id.detGen1) ;
        TextView champ2 = (TextView) view.findViewById(R.id.detGen2) ;

        champ1.setText(titre);
        if (valeur != null){
            champ2.setText(valeur.toString());
        }
    }

    @Override
    public void modifierChamp(Context contexte) {
        Toast.makeText(contexte, "TODO ElementInfoVinEnum", Toast.LENGTH_SHORT).show();
    }
}
