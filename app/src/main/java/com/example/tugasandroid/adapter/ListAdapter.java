package com.example.tugasandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasandroid.R;
import com.example.tugasandroid.model.Tipe;

import org.w3c.dom.Text;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    Context context;
    private List<Tipe> tipe;

    public ListAdapter(Context context, List<Tipe> tipe) {
        this.context = context;
        this.tipe = tipe;
    }

    @Override
    public int getCount() {
        return tipe.size();
    }

    @Override
    public Object getItem(int position) {
        return tipe.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressWarnings("deprecation")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater =LayoutInflater.from(this.context);
            convertView =inflater.inflate(R.layout.item_list, null);
        }
        Tipe t = tipe.get(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.gambar);
        TextView namaTipeTx = (TextView) convertView.findViewById(R.id.namaTipe);
        TextView tglTx = (TextView) convertView.findViewById(R.id.tgl);
        TextView moneyTx = (TextView) convertView.findViewById(R.id.money);
        TextView tipeTx = (TextView) convertView.findViewById(R.id.tipe);

        imageView.setImageResource(t.getGambar());
        namaTipeTx.setText(t.getNamaTipe());
        tglTx.setText(t.getTgl());
        moneyTx.setText(t.getMoney());
        tipeTx.setText(t.getTipe());

        return convertView;
    }
}
