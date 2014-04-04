package com.rigot.macavebeta.ui.vin;

import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

import com.rigot.macavebeta.InfoVinAdapter;

/**
 * Projet : MaCaveBeta
 * Cree par : Seb
 * Date : 14/12/13
 */
public class EIVAnnee extends ElementInfoVinChaine<Integer> {
    public EIVAnnee(InfoVinAdapter adapter) {
        super(adapter);
    }

    @Override
    public void lireValeur() {
        setVal1("Année");
        setVal2(getVin().getAnnee()) ;
    }

    @Override
    public void ecrireValeur(String s) {
        getVin().setAnnee(Integer.valueOf(s));
    }

    @Override
    public void configInput(EditText input) {
        input.setInputType(EditorInfo.TYPE_CLASS_NUMBER);
    }
}
