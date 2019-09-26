package trap1.luphilip.firstanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Paint;
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
        randomButton = findViewById(R.id.randomButton);
        resetButton = findViewById(R.id.resetButton);
        drawView = findViewById(R.id.drawView);
        circleButton = findViewById(R.id.circleButton);


        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//        resetButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Canvas canvas = new Canvas();
//                drawView.draw(canvas);
//
//            }
//        });

        circleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DrawView.addSprite();
            }
        });

    }


}
