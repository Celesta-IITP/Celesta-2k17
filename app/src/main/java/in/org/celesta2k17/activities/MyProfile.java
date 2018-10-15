package in.org.celesta2k17.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import in.org.celesta2k17.R;


/**
 * Created by mayank on 15/7/17.
 */

public class MyProfile extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView();
    }

    private void setView() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//
//            setContentView(R.layout.activity_register_signup_or_signin);
//            TextView fullNameTextView = findViewById(R.id.fullName);
//            TextView nameTextView = findViewById(R.id.nameTextView);
//            TextView idTextView = findViewById(R.id.idValue);
//            TextView collegeTextView = findViewById(R.id.collegeNameValue);
////            TextView eventTextView = findViewById(R.id.eventsParticipatedValue);
////            TextView eventAllTextView = findViewById(R.id.eventsParticipated);
//            String full_name = sharedPreferences.getString("full_name", "Mayank Vaidya");
//
//            fullNameTextView.setText(sharedPreferences.getString(getString(R.string.full_name), "Mayank Vaidya"));
//            String nameViewText = "" + Character.toUpperCase(full_name.charAt(0)) + Character.toUpperCase(full_name.charAt(full_name.indexOf(' ') + 1));
//            nameTextView.setText(nameViewText);
//            idTextView.setText(sharedPreferences.getString(getString(R.string.id), "12345"));
//            collegeTextView.setText(sharedPreferences.getString(getString(R.string.college_name), "IIT Patna"));
////            int numb = sharedPreferences.getInt("numEvents", 0);
////            String numEvents = Integer.toString(numb);
////            eventTextView.setText(numEvents);
////            eventAllTextView.setText(sharedPreferences.getString("eventList", "-"));
        setContentView(R.layout.activity_register_signup_or_signin);
        TextView fullNameTextView = findViewById(R.id.fullName);
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView idTextView = findViewById(R.id.idValue);
        TextView collegeTextView = findViewById(R.id.collegeNameValue);
        String full_name = sharedPreferences.getString(getString(R.string.full_name), "Mayank Vaidya");
        Log.v("Response:", full_name);
        fullNameTextView.setText(sharedPreferences.getString(getString(R.string.full_name), "Mayank Vaidya"));
        String nameViewText = "" + Character.toUpperCase(full_name.charAt(0)) + Character.toUpperCase(full_name.charAt(full_name.indexOf(' ') + 1));
        nameTextView.setText(nameViewText);
        idTextView.setText(sharedPreferences.getString(getString(R.string.id), "12345"));
        collegeTextView.setText(sharedPreferences.getString(getString(R.string.college_name), "IIT Patna"));
//        eventTextView.setText(sharedPreferences.getString(getString(R.string.event_participated), "-"));
//        eventTextView.setVisibility(View.GONE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setView();
    }
}
