package com.mycompany.Cheats_Guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Get the message from the intent
        Intent intent = getIntent();
        int players = intent.getIntExtra("newplayers", 0);
        int place = intent.getIntExtra("newplace", 0);
        String message1 = "";
        //assign array
        String[] card = new String[14];
        card[1] = "A";
        card[2] = "2";
        card[3] = "3";
        card[4] = "4";
        card[5] = "5";
        card[6] = "6";
        card[7] = "7";
        card[8] = "8";
        card[9] = "9";
        card[10] = "10";
        card[11] = "J";
        card[12] = "Q";
        card[13] = "K";



        // for loop
        for(int i=1; i<14; i++) {
                    if (place > 13) {
                        place = place - 13;
                    }
                    message1 = message1 + " " + card[place];
                    place = place + players;
                }


        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message1);

        // Set the text view as the activity layout
        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
