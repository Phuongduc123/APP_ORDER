package com.example.app_order;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app_order.R;
import com.example.app_order.Table;

import java.util.List;

public class TableAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Table> tableList;

    public TableAdapter(Context context, int layout, List<Table> tableList) {
        this.context = context;
        this.layout = layout;
        this.tableList = tableList;
    }



    @Override
    public int getCount() {
        return tableList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout,null);

        //anhxa
        TextView txtName =(TextView) convertView.findViewById(R.id.TextviewTable);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.ImageviewTable);

        Table table = tableList.get(position);

        txtName.setText(table.getTable_name());

        imgHinh.setImageResource(table.getImage());

        return convertView;
    }
}
