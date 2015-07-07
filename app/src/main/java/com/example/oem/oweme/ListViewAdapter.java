package com.example.oem.oweme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 19/05/15.
 */
public class ListViewAdapter extends ArrayAdapter<Contact>{

    public ListViewAdapter(Context context, int resourceID){
        super(context, resourceID);

    }
    public ListViewAdapter(Context context, int resource, List<Contact> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if(view == null){
            LayoutInflater inflater;
            inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.row, null);
        }

        Contact contact = getItem(position);
        //Get text for row
        if(contact != null) {
            TextView name = (TextView) view.findViewById(R.id.name);
            TextView moneyamount = (TextView) view.findViewById(R.id.moneyamount);

            if(name != null){
                name.setText(contact.getName());
            }
            if(moneyamount != null) {
                moneyamount.setText(Integer.toString(contact.getAmount()));
            }
        }
        return view;
    }
}
