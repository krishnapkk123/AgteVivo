package com.agte.vivo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Feedback extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        Button send;

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Prise");
        categories.add("Bug");
        categories.add("Suggestions");
        categories.add("Gripe");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        send=(Button)findViewById(R.id.button3);

       /* final EditText nameField = (EditText) findViewById(R.id.editText3);
        String name = nameField.getText().toString();

        final EditText emailField = (EditText) findViewById(R.id.editText4);
        String email = emailField.getText().toString();

        final EditText feedbackField = (EditText) findViewById(R.id.editText5);
        final String feedback = feedbackField.getText().toString();

        final Spinner feedbackSpinner = (Spinner) findViewById(R.id.spinner);
        String feedbackType = feedbackSpinner.getSelectedItem().toString();
        final CheckBox responseCheckbox = (CheckBox) findViewById(R.id.checkBox);
        boolean bRequiresResponse = responseCheckbox.isChecked();
        */
        assert send != null;
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String to = textTo.getText().toString();
                //String subject = textSubject.getText().toString();
                //String message = feedback.getText().toString();
                final EditText nameField = (EditText) findViewById(R.id.editText3);
                String name = nameField.getText().toString();

                final EditText emailField = (EditText) findViewById(R.id.editText4);
                String useremail = emailField.getText().toString();

                final EditText feedbackField = (EditText) findViewById(R.id.editText5);
                final String feedback = feedbackField.getText().toString();

                final Spinner feedbackSpinner = (Spinner) findViewById(R.id.spinner);
                String feedbackType = feedbackSpinner.getSelectedItem().toString();
                final CheckBox responseCheckbox = (CheckBox) findViewById(R.id.checkBox);
                boolean bRequiresResponse = responseCheckbox.isChecked();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "kpkk@aldousglare.com"});
                //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
                //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, "subject");
                email.putExtra(Intent.EXTRA_TEXT, "message");

                //need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));

            }

        });

      }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    //public void sendFeedback(view Button){

    //}
}
