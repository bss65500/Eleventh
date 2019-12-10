package com.gamecodeschool.eleventh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private Button btn;
    private TextView tvSpinner;
    private TextView tvDescription;
    private String[] descriptionArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        tvSpinner = findViewById(R.id.activity_main_tv_spinner);
        btn = findViewById(R.id.findbuttom);
        tvDescription = findViewById(R.id.ds);

        descriptionArray = getResources().getStringArray(R.array.descriptionArray);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.foods, android.R.layout.simple_spinner_item);





        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tvSpinner.setText(parent.getSelectedItem().toString());
        tvDescription.setText(descriptionArray[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
