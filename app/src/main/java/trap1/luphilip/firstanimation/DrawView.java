package trap1.luphilip.firstanimation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DrawView extends View {
    Paint paint=new Paint();
    public Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.space_background);
    public static ArrayList<Sprite> sprites= new ArrayList<>();
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.GRAY);//set paint to gray

        for(Sprite s:sprites){
            s.draw(canvas);
        }

        invalidate();  //redraws screen, invokes onDraw()

    }

    public static void update() {
        for(Sprite s: sprites) {
            s.update();
        }
    }

    public static void addSprite(){
        sprites.add(new Sprite());
    }

    public static void clear() {
        sprites.clear();
    }



}