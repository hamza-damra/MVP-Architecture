package com.example.mvcarchitectureimplementation.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvcarchitectureimplementation.R;
import com.example.mvcarchitectureimplementation.pojo.MoviesModel;

public class MainActivity extends AppCompatActivity implements MovieView{
    TextView textView;
    Button button;
    MoviePresenter moviePresenter = new MoviePresenter(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
           moviePresenter.getMoviename();
        });

    }


    @Override
    public void onGetMovieName(String name) {
        textView.setText(name);
    }
}