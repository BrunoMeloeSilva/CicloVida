package bms.ciclovida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Log.i("#", "onCreate: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("#", "onStart: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("#", "onResume: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("#", "onPause: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("#", "onStop: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("#", "onDestroy: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("#", "onRestart: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("#", "onSaveInstanceState: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("#", "onRestoreInstanceState: " + this.getClass().getSimpleName());
    }
}
