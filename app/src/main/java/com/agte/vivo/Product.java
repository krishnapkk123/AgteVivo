package com.agte.vivo;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Product extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

    PopulateListView();
  //      registerClickCallback();

    }
   private void PopulateListView()
    {
        // Create list of items
        String[] myItems = {"Product1", "product2", "product3", "product4","product5","product6","product7","product8","product9","product10","product11","product12","product13","product14","product15","product16","product17","product18"}; // Build Adapter
// TODO: CHANGE THE [[ to a less than, ]] to greater than.
        ArrayAdapter <String> adapter = new ArrayAdapter <String>(
            this,                        // Context for the activity.//
            R.layout.activity_iistview, // Layout to use (create)
             myItems);                  // Items to be displayed // Configure the list view.
            ListView list = (ListView) findViewById(R.id.mobile_list);
        list.setAdapter(adapter);
    }

   // private void registerClickCallback() {
     //   ListView list = (ListView) findViewById(R.id.listViewMain);
       // list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         //   @Override
// TODO: CHANGE THE [[ to a less than, ]] to greater than.
           // public void onItemClick(AdapterView[[?]] paret, View viewClicked, int position, long id)
            //{

              //  TextView textView = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is string: " + textView.getText().toString();
                //Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            //}
        //});
    }
//}




