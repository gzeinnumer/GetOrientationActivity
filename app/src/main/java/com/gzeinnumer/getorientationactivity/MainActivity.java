package com.gzeinnumer.getorientationactivity;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // In landscape
            Toast.makeText(this, "Lanscape", Toast.LENGTH_SHORT).show();
        } else {
            // In portrait
            Toast.makeText(this, "Potrait", Toast.LENGTH_SHORT).show();
        }
    }
}
