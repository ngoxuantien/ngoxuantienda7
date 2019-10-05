package com.example.ngoxuantien_day7;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<ContactABC> {

    private  Context context;
    private ArrayList<ContactABC> contact_tiens;
    private int resource;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactABC> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.contact_tiens= objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item_listview,parent,false);
        TextView nameview=convertView.findViewById(R.id.namelist);
        TextView text=convertView.findViewById(R.id.text123);


        ContactABC contact_tiens1234=contact_tiens.get(position);
        nameview.setText(contact_tiens1234.getNameview());
        text.setText(contact_tiens1234.getText()+"");
        return convertView;
    }
}
