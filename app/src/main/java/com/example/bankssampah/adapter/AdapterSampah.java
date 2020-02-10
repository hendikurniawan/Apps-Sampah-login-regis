package com.example.bankssampah.adapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.bankssampah.R;
import com.example.bankssampah.data.DataSampah;

import java.util.List;
public class AdapterSampah extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<DataSampah> item;

    public AdapterSampah(Activity activity, List<DataSampah> item) {
        this.activity = activity;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int location) {
        return item.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.content_hitorys, null);


        TextView Saldo         = (TextView) convertView.findViewById(R.id.txtSaldotransaksi);
        TextView TotalSaldo        = (TextView) convertView.findViewById(R.id.txtTotalsaldo);
        TextView Tanggal     = (TextView) convertView.findViewById(R.id.txtTanggal);


        Saldo.setText(": "+item.get(position).getSaldo());
        TotalSaldo.setText(": "+item.get(position).getTotalSaldo());
        Tanggal.setText(": "+item.get(position).getTanggal());


        return convertView;
    }
}


