package in.org.celesta2k18.activities;

import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

import in.org.celesta2k18.R;

public class SponsorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        CustomTabsIntent.Builder builder  = new CustomTabsIntent.Builder();
        CustomTabsIntent customTabsIntent = builder.build();

        HashMap<Integer ,String> map = new HashMap<>();
        map.put(R.id.beltron,"http://www.bsedc.bihar.gov.in/");
        map.put(R.id.startup_bihar,"http://www.startup.bihar.gov.in/");
        map.put(R.id.bihar_tourism,"http://www.bihartourism.gov.in/");
        map.put(R.id.coca_cola,"https://www.coca-colaindia.com/");
        map.put(R.id.icetl,"http://www.icetl.com/");
        map.put(R.id.hacker_earth,"http://www.hackerearth.com/");
        map.put(R.id.coding_ninjas,"https://www.codingninjas.in/");
        map.put(R.id.ruban,"http://www.rubanpatliputrahospital.com/");
        map.put(R.id.hospi,"http://classmatestationery.com/");
        map.put(R.id.zebronics,"https://zebronics.com/");
        map.put(R.id.radio_mirchi,"http://www.radiomirchi.com/");
        map.put(R.id.chicken,"http://broaster.com/");
        map.put(R.id.jain_food_stall,"https://www.justdial.com/Patna/Jain-Food-World-Below-SBI-Bank-Boring-Road/0612PX612-X612-170905112625-X8H1_BZDET");
        map.put(R.id.cert_store,"https://www.certstore.in/");
        map.put(R.id.technoprolabz,"https://www.techprolabz.com");
        map.put(R.id.youth_india_foundation,"https://www.facebook.com/YouthIndiaGlobal/");
        map.put(R.id.awestuck,"http://www.awestruck.clothing/");
        map.put(R.id.what_after_college,"http://whataftercollege.com/");
        map.put(R.id.blogadda,"https://www.blogadda.com/");
        map.put(R.id.scientific_india,"http://scind.org/");
        map.put(R.id.fest_pav,"http://festpav.com/");
        map.put(R.id.ntd_india,"http://ntdin.tv/");
        map.put(R.id.the_college_fever,"https://www.thecollegefever.com/");
        map.put(R.id.ignite_engineers,"https://www.igniteengineers.com/");
        map.put(R.id.know_a_fest,"http://www.knowafest.com/college-fests/events");
        map.put(R.id.the_souled_store,"https://www.thesouledstore.com/");
        map.put(R.id.learn_code_online,"https://learncodeonline.in/");
        map.put(R.id.grabon,"https://www.grabon.in/");
        map.put(R.id.pizzahut,"https://online.pizzahut.co.in/home");
        map.put(R.id.opentalk,"https://opentalk.to/tag/Celesta2018/ht-a42ae94ac26fc98c");
        map.put(R.id.hospi,"http://www.gargeehotels.com/");
        for(Map.Entry<Integer,String> pair: map.entrySet()){
            ImageView imageView = findViewById(pair.getKey());
            imageView.setOnClickListener(v -> customTabsIntent.launchUrl(SponsorsActivity.this,Uri.parse(pair.getValue())));
        }
    }
}
