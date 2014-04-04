package com.rigot.macavebeta.ui.vin;

import android.widget.EditText;

import com.rigot.macavebeta.InfoVinAdapter;

/**
 * Projet : MaCaveBeta
 * Cree par : Seb
 * Date : 09/01/14
 */
public class EIVCepage extends ElementInfoVinChaine<String> {
    public EIVCepage(InfoVinAdapter adapter) {
        super(adapter);
    }

    @Override
    public void lireValeur() {
        setVal1("Cépage");
        setVal2(getVin().getCepage());
    }

    @Override
    public void ecrireValeur(String s) {
        getVin().setCepage(getVal2());
    }

    @Override
    public void configInput(EditText input) {
        // RAS
    }
}
