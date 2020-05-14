package PointVaMovablePoint;

public class MovablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        float[]arraySpeed=new float[2];
        arraySpeed[0]=this.getxSpeed();
        arraySpeed[1]=this.getySpeed();
        return arraySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint { x= "+this.getX()+", y= "+this.getY()+", xSpeed= "+this.getxSpeed()+", ySpeed= "+this.getySpeed()+" }";
    }

    public void  move(){
        x+=xSpeed;
        y+=ySpeed;
    }
}
