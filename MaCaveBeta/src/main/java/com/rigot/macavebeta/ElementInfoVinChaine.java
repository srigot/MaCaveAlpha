package com.rigot.macavebeta;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Seb on 11/11/13.
 */
public class ElementInfoVinChaine extends ElementInfoVin {
    private String val1 ;
    private String val2 ;
    private String type ;

    public ElementInfoVinChaine(String val1, String val2) {
        super(R.layout.item_det_chaine) ;
        this.val1 = val1 ;
        this.val2 = val2 ;
    }

    @Override
    public void remplirChamps(View view) {
        TextView champ1 = (TextView) view.findViewById(R.id.detGen1) ;
        TextView champ2 = (TextView) view.findViewById(R.id.detGen2) ;

        champ1.setText(val1);
        champ2.setText(val2);
    }
}
