package trap1.luphilip.firstanimation;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

class Sprite extends RectF {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int randomSpeed = (int) (Math.random() * 29 + 1);
    private int randomDirection = (int) (Math.random() * 4 + 1);

    public Sprite(int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    public Sprite() {
        this.x = 0;
        this.y = 0;
        this.dx = 10;
        this.dy = 10;
    }
    public void draw(Canvas canvas) {
        int randomPosition = (int) (Math.random() * 4 + 1);
        canvas.drawCircle(x, y, 100, new Paint());
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
    }

}

