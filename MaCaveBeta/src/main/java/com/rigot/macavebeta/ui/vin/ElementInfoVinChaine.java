package com.rigot.macavebeta.ui.vin;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.rigot.macavebeta.InfoVinAdapter;
import com.rigot.macavebeta.R;

/**
 * Created by Seb on 11/11/13.
 */
public abstract class ElementInfoVinChaine <T> extends ElementInfoVin {
    private String val1 ;
    private T val2 ;

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }

    public ElementInfoVinChaine(InfoVinAdapter adapter) {
        super(R.layout.item_det_chaine, adapter) ;
        lireValeur();
    }

    @Override
    public void remplirChamps(View view) {
        TextView champ1 = (TextView) view.findViewById(R.id.detGen1) ;
        TextView champ2 = (TextView) view.findViewById(R.id.detGen2) ;

        champ1.setText(val1);
        if (val2 != null){
            if (val2 instanceof String) {
                champ2.setText((String) val2);
            } else {
                champ2.setText(val2.toString());
            }
        }
    }

    @Override
    public void modifierChamp(Context contexte) {
        // Afficher boite de dialogue de saisie de texte
        final EditText input = new EditText(contexte);
        AlertDialog.Builder adb = new AlertDialog.Builder(contexte);
        configInput(input);
        if (val2 != null) {
            input.setText(val2.toString());
        }
        adb.setTitle(val1);
        adb.setView(input);
        adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Verifier que si val2 est null, cela ne plante pas
//                if (val2 instanceof String) {
                    val2 = (T)input.getText().toString();
                    ecrireValeur(input.getText().toString());
  //              }
                getAdapter().notifyDataSetChanged();
            }
       }) ;
        adb.show();
    }

    public abstract void lireValeur() ;

    public abstract void ecrireValeur(String s) ;

    public abstract void configInput(final EditText input) ;
}
