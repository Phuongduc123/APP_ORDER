package com.example.app_order;

public class Table {
    private String Table_name;
    private int Image;

    public Table(String table_name, int image) {
        Table_name = table_name;
        Image = image;
    }

    public String getTable_name() {
        return Table_name;
    }

    public int getImage() {
        return Image;
    }

    public void setTable_name(String table_name) {
        Table_name = table_name;
    }

    public void setImage(int image) {
        Image = image;
    }


}
