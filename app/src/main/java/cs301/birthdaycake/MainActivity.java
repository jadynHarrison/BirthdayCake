package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cv = findViewById(R.id.cakeview);
        CakeController cakeControllerInstance = new CakeController(cv);

        Button blowOut = findViewById(R.id.button);
        blowOut.setOnClickListener(cakeControllerInstance);

        Switch candles = findViewById(R.id.switch3);
        candles.setOnCheckedChangeListener(cakeControllerInstance);

        SeekBar howManyCandles = findViewById(R.id.seekBar);
        howManyCandles.setOnSeekBarChangeListener(cakeControllerInstance);
    }
    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        finishAffinity();
    }
}
