package dartmouth.edu.sleepguard;

/**
 * Created by zohaibakmal on 2/15/2015.
 */


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.vibhuyadav.sleepgaurd.R;

public class NotificationReceiver extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = new TextView(this);
        tv.setText("Yo!");

        setContentView(tv);
    }
}