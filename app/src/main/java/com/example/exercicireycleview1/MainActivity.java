package com.example.exercicireycleview1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    ColorAdapter adapter;
    ArrayList<miColor> items = new ArrayList<>();

    private LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       inicioColores();
       inicioElementos();
    }

    private void inicioColores() {
    items.add(new miColor("#2196f3", "Blue", "#2196f3",R.drawable.las_vocales ));
        items.add(new miColor("#3f51b5", "Indigo", "#3f51b5",R.drawable.las_vocales ));
        items.add(new miColor("#f44336", "Red", "#f44336",R.drawable.las_vocales ));
        items.add(new miColor("#4caf50", "Green", "#4caf50",R.drawable.las_vocales ));
        items.add(new miColor("#ff9800", "Orange", "#ff9800",R.drawable.las_vocales ));
        items.add(new miColor("#607d8b", "Grey", "#607d8b",R.drawable.las_vocales ));
        items.add(new miColor("#ffb300", "Amber", "#ffb300",R.drawable.las_vocales ));
        items.add(new miColor("#673ab7", "Deep Purple", "#673ab7",R.drawable.las_vocales ));
    }

    private void inicioElementos() {
        recycler = findViewById(R.id.recyclerView);
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
        adapter = new ColorAdapter(items);
        recycler.setAdapter(adapter);
        //LinearLayoutManager.HORIZONTAL, false
    }
}