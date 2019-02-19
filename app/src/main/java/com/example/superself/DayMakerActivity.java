package com.example.superself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayMakerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_maker);

        TextView dateView = findViewById(R.id.DateView);
        setDate(dateView);
    }

    public void setDate (TextView view){
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat format = new SimpleDateFormat("MM.dd.yyyy");
        String dateString = format.format(date);
        view.setText(dateString);
    }

    public void submitFood(){
        EditText food = findViewById(R.id.editText);
        String foodString = food.getText().toString();
        ScrollView foodView = findViewById(R.id.scrollView);
    }
}
