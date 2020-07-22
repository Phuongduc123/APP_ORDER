package com.example.app_order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ORDER_SIDE extends AppCompatActivity {
    GridView gvTable;
    ArrayList<Table> arrayTable;
    TableAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order__side);

        Anhxa();

        adapter = new TableAdapter(this, R.layout.table_item,arrayTable);
        gvTable.setAdapter(adapter);

    }

    private void Anhxa(){
        gvTable = (GridView) findViewById(R.id.GridviewTable);
        arrayTable = new ArrayList<>();

        arrayTable.add(new Table("Table 1", R.drawable.table));
        arrayTable.add(new Table("Table 2",R.drawable.table));
        arrayTable.add(new Table("Table 3",R.drawable.table));
        arrayTable.add(new Table("Table 4",R.drawable.table));
        arrayTable.add(new Table("Table 5",R.drawable.table));
        arrayTable.add(new Table("Table 6",R.drawable.table));
        arrayTable.add(new Table("Table 7",R.drawable.table));
        arrayTable.add(new Table("Table 8",R.drawable.table));
        arrayTable.add(new Table("Table 9",R.drawable.table));

    }
}
