package bms.ciclovida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("#", "onCreate: " + this.getClass().getSimpleName());

        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Tela2Activity.class);
                startActivity(i);
            }
        });
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
