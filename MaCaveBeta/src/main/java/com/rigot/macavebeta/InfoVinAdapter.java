package com.rigot.macavebeta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.rigot.macavebeta.metier.Vin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Seb on 11/11/13.
 */
public class InfoVinAdapter extends BaseAdapter {
    private Context contexte ;

    private LayoutInflater inflater ;

    private List<ElementInfoVin> liste ;

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
        liste.add(new ElementInfoVinTitre(vin.getNom()));

        // Ajout de la premiere ligne
        liste.add(new ElementInfoVinChaine<String>("Année", "2010")) ;
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

        if (convertView == null) {
            convertView = inflater.inflate(layout, null) ;
        }

        if (el != null) {
            el.remplirChamps(convertView) ;
        }
        return convertView;
    }
}
