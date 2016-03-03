package saran.librarytutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import saran.mylittlelibrary.MyView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = new MyView(this);
        setContentView(v);
    }
}
