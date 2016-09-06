package com.agte.vivo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    ImageButton imgButton;
    ImageButton product;
    ImageButton contact;
    ImageButton feedback;
    ImageButton help;
    ImageButton dms;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgButton =(ImageButton)findViewById(R.id.imageButton);
        product = (ImageButton) findViewById(R.id.imageButton2);
        contact =  (ImageButton) findViewById(R.id.imageButton3);
        feedback= (ImageButton) findViewById(R.id.imageButton4);
        dms= (ImageButton) findViewById(R.id.imageButton6);
        help= (ImageButton) findViewById(R.id.imageButton5);
        imgButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
              //  Intent scheme = new Intent(Home.this, Scheme.class);
                //startActivity(scheme);




            // imgButton.setOnClickListener(new View.OnClickListener() {
           // @Override

                //Toast.makeText(getApplicationContext(),"You download is resumed",Toast.LENGTH_LONG).show();
               // Intent scheme = new Intent(Home.this, Scheme.class);
                //startActivity(scheme);

                switch(v.getId()){

                    case R.id.imageButton: /** Start a new Activity OtherActivity.java */
                        Intent intent = new Intent(Home.this, Scheme.class);
                        startActivity(intent);
                        break;


                    case R.id.imageButton2: /** Start a new Activity OtherActivity.java */
                        Intent intent1 = new Intent(Home.this, Product.class);
                        startActivity(intent1);
                        break;

                    case R.id.imageButton3:  /** Start a new Activity OtherActivity2.java */
                        Intent intent2 = new Intent(Home.this, Contact.class);
                        startActivity(intent2);
                        break;
                }
            }



        });

        product.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent product = new Intent(Home.this, Product.class);
                startActivity(product);
            }

            });
        contact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent contact = new Intent(Home.this, Contact.class);
                startActivity(contact);
            }

            });
       feedback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent feedback = new Intent(Home.this, Feedback.class);
                startActivity(feedback);
            }

        });

        dms.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View v) {
                                       Intent dms = new Intent(Home.this,Dms.class);
                                       startActivity(dms);

                                   }
                               });
        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent hel = new Intent(Home.this, Help.class);
                startActivity(hel);

            }
        });




        // final  ImageButton myButton = (ImageButton) findViewById(R.id.home.xml);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);


     //   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
