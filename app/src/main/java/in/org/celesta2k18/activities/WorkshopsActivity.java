package in.org.celesta2k18.activities;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import in.org.celesta2k18.R;
import in.org.celesta2k18.adapters.WorkshopsRecyclerViewAdapter;
import in.org.celesta2k18.data.lAndwData;

import static in.org.celesta2k18.activities.landwInfoActivity.EXTRA_CONTACTS;
import static in.org.celesta2k18.activities.landwInfoActivity.EXTRA_DATE;
import static in.org.celesta2k18.activities.landwInfoActivity.EXTRA_DESCRIPTION;
import static in.org.celesta2k18.activities.landwInfoActivity.EXTRA_HEADER;
import static in.org.celesta2k18.activities.landwInfoActivity.EXTRA_IMAGE_ID;
import static in.org.celesta2k18.activities.landwInfoActivity.EXTRA_ORGANIZERS;
import static in.org.celesta2k18.activities.landwInfoActivity.EXTRA_TIME;
import static in.org.celesta2k18.activities.landwInfoActivity.EXTRA_VENUE;


public class WorkshopsActivity extends AppCompatActivity implements WorkshopsRecyclerViewAdapter.ListCardClick {

    RecyclerView recyclerView;
    TextView register;
    WorkshopsRecyclerViewAdapter workshopsRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_workshops);
        register = (TextView)findViewById(R.id.registerbutton);
        recyclerView = findViewById(R.id.rv_workshops);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        Resources resources = getResources();

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        assert bar != null;
        bar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.colorEvents)));

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.thecollegefever.com/events/celesta-2018-yEYo3DFhwl");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });

        workshopsRecyclerViewAdapter = new WorkshopsRecyclerViewAdapter(getApplicationContext(), this,resources.getStringArray(R.array.array_workshop_topics), resources.getStringArray(R.array.array_workshop_headers),
                resources.getStringArray(R.array.array_workshop_date),
                resources.getStringArray(R.array.array_workshop_time),
                resources.getStringArray(R.array.array_workshop_venue),
                resources.getStringArray(R.array.array_workshop_intro),
                resources.getStringArray(R.array.array_workshop_description),
                resources.getStringArray(R.array.array_workshop_organiser),
                resources.getStringArray(R.array.array_workshop_contacts),
                resources.obtainTypedArray(R.array.array_workshop_images),
                resources.getStringArray(R.array.array_workshop_intent));
        recyclerView.setAdapter(workshopsRecyclerViewAdapter);
    }

    @Override
    public void onListClick(lAndwData landwData, View view) throws ClassNotFoundException {
//        Intent intentNew = new Intent(this, Class.forName("in.org.celesta2k17.activities.landwInfoActivity"));
        Uri webpage = Uri.parse(landwData.intents);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}

