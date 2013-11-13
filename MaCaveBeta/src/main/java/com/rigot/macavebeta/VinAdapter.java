package com.rigot.macavebeta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rigot.macavebeta.metier.Vin;

import java.util.List;

/**
 * Created by Seb on 08/11/13.
 */
public class VinAdapter extends BaseAdapter {
    private List<Vin> liste ;

    private Context contexte ;

    private LayoutInflater inflater ;

    public VinAdapter(Context contexte, List<Vin> liste) {
        this.contexte = contexte ;
        this.liste = liste ;
        inflater = LayoutInflater.from(this.contexte);
    }

    @Override
    public int getCount() {
        return liste.size();
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
        ViewHolder holder = null ;

        if (convertView == null) {
            convertView = (LinearLayout) inflater.inflate(R.layout.item_vin, null);

            holder = new ViewHolder() ;
            holder.nom = (TextView) convertView.findViewById(R.id.nomVin) ;
            holder.appellation = (TextView) convertView.findViewById(R.id.appellationVin) ;

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag() ;
        }

        Vin v = (Vin)getItem(position);
        if (v != null) {
            holder.nom.setText(v.getNom());
            holder.appellation.setText(v.getAppellation().getNom());
        }
        return convertView;
    }

    static class ViewHolder {
        public TextView nom ;
        public TextView appellation ;
    }
}
