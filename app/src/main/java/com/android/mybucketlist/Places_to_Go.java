package com.android.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Places_to_Go extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();

    }

    private void setupList() {

        BucketListEntry[] placesToGo= {
                new BucketListEntry("Vietnam","Con Dao Islands,Hanoi, Halong Bay, Ho",R.drawable.vietnam,5),
                new BucketListEntry("Kerala , India","Try varied tea flavoures, stay in houseboat the fabulous food!",R.drawable.kerala,3.5f),
                new BucketListEntry("Japan","Hot Springs , sushi bamboo forest, bullet train through mountains",R.drawable.japan,4.5f),
                new BucketListEntry("Iceland","Dyojyando waterfall, nature reserves , maybe the Northern Lights too!",R.drawable.iceland,4.5f),
                new BucketListEntry("The Amazon Brazil","Try to survive being scared by all the creppy crwalies!",R.drawable.amazon,3.5f)

        };
        RecyclerView recyclerView= findViewById(R.id.recycler_view_palces_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}

