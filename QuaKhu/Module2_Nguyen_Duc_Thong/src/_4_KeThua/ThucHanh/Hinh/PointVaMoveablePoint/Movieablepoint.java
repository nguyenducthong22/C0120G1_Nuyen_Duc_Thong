package _4_KeThua.ThucHanh.Hinh.PointVaMoveablePoint;

public class Movieablepoint extends Point {
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;

    public Movieablepoint() {
    }

    public Movieablepoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movieablepoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] speed = new float[2];
        speed[0]=this.getXSpeed();
        speed[1]=this.getYSpeed();
        return speed;
    }

    public void setSpeed(float xSpeed,float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public Movieablepoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }

    public String toString(){
        return "X : "+this.getX()+"\n"+"Y : "+this.getY()+
                "\n"+"XSpeed : "+this.getXSpeed()+"\n"+"YSpeed : "+this.getYSpeed();
    }
}
