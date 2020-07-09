package com.example.algoexpert;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.speech.RecognizerIntent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "MainActivity";
    private ArrayList<String> mNames= new ArrayList<>();
    private ArrayList<String> mImageUrls= new ArrayList<>();
    MaterialSearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Algo Expert");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        Log.d(TAG,"Oncreate: started");
        initImageBitmaps();
    }

    private void initImageBitmaps()
    {
        Log.d(TAG,"initImageBitmaps: preparing bitmaps");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        mImageUrls.add("https://i.redd.it/5g0h4tqv6j351.jpg");
        mNames.add("India");
        initRecyclerView();
    }
    private void initRecyclerView()
    {
        Log.d(TAG,"initRecyclerView: init recyclerview");
        RecyclerView recyclerView= findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(mImageUrls,mNames,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item =menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}