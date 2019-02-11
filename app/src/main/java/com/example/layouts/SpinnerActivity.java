package com.example.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner mSpinnerAndroidVersions;
    private List<String> androidVersions = Arrays.asList("Cupcake", "Donut", "Eclair", "KitKat", "Pie");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initView();
    }


    private ArrayAdapter<String> getAndroidAdapter() {
        return new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, androidVersions);
    }

    private void initView() {
        mSpinnerAndroidVersions = findViewById(R.id.spinner_example);
        mSpinnerAndroidVersions.setAdapter(getAndroidAdapter());
        mSpinnerAndroidVersions.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = androidVersions.get(position);
        Toast.makeText(this, "Selected: " + selectedItem, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
