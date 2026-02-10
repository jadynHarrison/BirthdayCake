package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeViewInstance;
    private CakeModel cakeModelInstance;

    public CakeController(CakeView expectCakeView) {
        cakeViewInstance = expectCakeView;
        cakeModelInstance = cakeViewInstance.grantReferenceAccess();
    }

    @Override
    public void onClick(View view) {
        Log.d("cake", "click!");
        cakeModelInstance.candlesLit = false;
        cakeViewInstance.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d("candles", "let's get lit");
        cakeModelInstance.hasCandles = b;
        cakeViewInstance.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModelInstance.numCandles = seekBar.getProgress();
        cakeViewInstance.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
