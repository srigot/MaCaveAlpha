package com.rigot.macavebeta;

import android.view.View;

/**
 * Created by Seb on 11/11/13.
 */
public abstract class ElementInfoVin {
    private int layout ;

    public int getLayout() {
        return layout;
    }

    protected void setLayout(int layout) {
        this.layout = layout;
    }

    public ElementInfoVin(int layout) {
        this.layout = layout ;
    }

    public ElementInfoVin() {
    }

    public abstract void remplirChamps(View view) ;
}
