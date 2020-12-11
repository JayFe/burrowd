package com.jayfemagic.burrowd;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

public class ListOverview extends Activity {

    String[] users = new String[] { "John","Jeff","Jackson","Jolien","Stacy"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_item_overview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, users);
        ListView listView = (ListView) findViewById(R.id.item_overview);
        listView.setAdapter(adapter);

    }

//    @Override
//    public void onListItemClick(ListView l, View v, int position, long id) {
//        DetailsFragment txt = (DetailsFragment)getFragmentManager().findFragmentById(R.id.fragment2);
//        txt.change("Name: "+ users[position],"Location : "+ location[position]);
//        getListView().setSelector(android.R.color.holo_blue_dark);
//    }
}
