package trap1.luphilip.firstanimation;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

import java.util.Random;

class Sprite extends RectF {
    private Random rand = new Random();
//    private int x;
//    private int y;
public Bitmap bitmap = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.space_background);

    private int dx;
    private int dy;
    private Paint paint;
    private int randomSpeed = (int) (Math.random() * 29 + 1);
    private int randomDirection = (int) (Math.random() * 4 + 1);
    private int randomColor = Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));

    public Sprite(int x, int y, int dx, int dy, Paint paint) {
        super(x-100,y-100,x+100,y+100);

        this.dx = dx;
        this.dy = dy;
        this.paint = paint;
    }

    public Sprite() {
        super(0,0,200,200);
        this.dx = 10;
        this.dy = 10;
        this.paint = new Paint();
        this.paint.setColor(Color.BLUE);
    }
    public void draw(Canvas canvas) {
//        canvas.drawBitmap(bitmap, 0, 0, null);
        canvas.drawCircle(centerX(),centerY(),width()/2, paint);
        offset(dx,dy);
        if(right + dx>=canvas.getWidth() ) {
            dx*=-1;
        }
        else if(left + dx <=0) {
            dx*=-1;
        }
        if(bottom + dy>= canvas.getHeight()) {
            dy*=-1;
        }
        else if(bottom + dy <=0) {
            dy*=-1;
        }
    }
    public void update() {
        this.paint.setColor(randomColor);
        switch(randomDirection) {
            case 1:
                this.dx = randomSpeed;
                break;
            case 2:
                this.dx = -randomSpeed;
                break;
            case 3:
                this.dy = randomSpeed;
            case 4:
                this.dy = -randomSpeed;
            default:
                System.out.println("here");
        }
        randomSpeed = (int) (Math.random() * 29 + 1);
        randomDirection = (int) (Math.random() * 4 + 1);
        randomColor = Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
    }

}

