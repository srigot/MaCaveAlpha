package com.rigot.macavebeta.ui.vin;

import android.content.Context;
import android.view.View;

import com.rigot.macavebeta.InfoVinAdapter;
import com.rigot.macavebeta.metier.Vin;

/**
 * Created by Seb on 11/11/13.
 */
public abstract class ElementInfoVin {
    private int layout ;

    private InfoVinAdapter adapter ;

    public int getLayout() {
        return layout;
    }

    protected void setLayout(int layout) {
        this.layout = layout;
    }

    public InfoVinAdapter getAdapter() {
        return adapter;
    }

    public Vin getVin() {
        return adapter.getVin() ;
    }
    public ElementInfoVin(int layout, InfoVinAdapter adapter) {
        this.layout = layout ;
        this.adapter = adapter ;
    }

    public ElementInfoVin() {
    }

    public abstract void remplirChamps(View view) ;

    public abstract void modifierChamp(Context contexte) ;
}
