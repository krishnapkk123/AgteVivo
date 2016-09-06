package com.agte.vivo;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contact extends Activity {

    My_Adapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.contact);

        // preparing list data
        prepareListData();

        listAdapter = new My_Adapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Executive Officers");
        listDataHeader.add("Business Head");
        listDataHeader.add("Sales Manager");
        //listDataHeader.add("Coming Soon..");

        // Adding child data
        List<String> ceo = new ArrayList<String>();
        ceo.add("George Thomas - 9995800888");
        ceo.add("Eldho Areeckal - 9995800808");
        ceo.add("Binu Varghese - 9995800707");
        //top250.add("Scheme 4 Dont lose that");
        //top250.add("Scheme 5 Dont lose that");
        //top250.add("Scheme 6 Dont lose that");
        //top250.add("Scheme 7 Dont lose that");

        List<String> bh = new ArrayList<String>();
       // nowShowing.add("Scheme 1 Dont lose that");
       bh.add("Nithin - 11111111");
        bh.add("Raju - 11111111");
        bh.add("3G VIVO - 11111111");
       // nowShowing.add("Scheme 1 Dont lose that");
        //nowShowing.add("Scheme 1 Dont lose that");

        List<String> sm = new ArrayList<String>();
        sm.add("Amal - 000000000");
        sm.add("Aneesh - 00000000");
        sm.add("Navas - 0000000000");
      sm.add("manu - 0000000000");
        //comingSoon.add("Scheme 1 Dont lose that");

       /* List<String> upcoming = new ArrayList<String>();
        upcoming.add("wait for new scheme");
        upcoming.add("Scheme 2 ");
        upcoming.add("Scheme 3");
        upcoming.add("Scheme 4");*/

        listDataChild.put(listDataHeader.get(0),ceo); // Header, Child data
        listDataChild.put(listDataHeader.get(1), bh);
        listDataChild.put(listDataHeader.get(2), sm);
       // listDataChild.put(listDataHeader.get(3), upcoming);

    }
}