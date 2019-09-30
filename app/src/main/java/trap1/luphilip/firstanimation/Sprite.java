package trap1.luphilip.firstanimation;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import java.util.Random;

class Sprite extends RectF {
    private Random rand = new Random();
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Paint paint;
    private int randomSpeed = (int) (Math.random() * 29 + 1);
    private int randomDirection = (int) (Math.random() * 4 + 1);
    private int randomColor = Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
//    private int randomPosition = (int) (Math.random() * 4 + 1);

    public Sprite(int x, int y, int dx, int dy, Paint paint) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.paint = paint;
    }

    public Sprite() {
        this.x = 0;
        this.y = 0;
        this.dx = 10;
        this.dy = 10;
        this.paint = new Paint();
    }
    public void draw(Canvas canvas) {
        canvas.drawCircle(x, y, 100, this.paint);
        y+=dy;
        x+=dx;
        if(x>=canvas.getWidth()) {
            dx*=-1;
        }
        else if(x<=0) {
            dx*=-1;
        }
        if(y>= canvas.getHeight()) {
            dy*=-1;
        }
        else if(y<=0) {
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

