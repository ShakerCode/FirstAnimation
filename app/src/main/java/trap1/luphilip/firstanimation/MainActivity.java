package trap1.luphilip.firstanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    Button randomButton;
    Button resetButton;
    Button circleButton;
    DrawView drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        randomButton = findViewById(R.id.randomButton);
        resetButton = findViewById(R.id.resetButton);
        drawView = findViewById(R.id.drawView);
        circleButton = findViewById(R.id.circleButton);


        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawView.update();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawView.clear();
            }
        });

        circleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawView.addSprite();
                circleButton.setEnabled(false);
                delayTimer.start();
            }
        });


    }

    CountDownTimer delayTimer = new CountDownTimer(500, 500) {
        @Override
        public void onTick(long l) {

        }

        @Override
        public void onFinish() {
            circleButton.setEnabled(true);
        }
    };


}
