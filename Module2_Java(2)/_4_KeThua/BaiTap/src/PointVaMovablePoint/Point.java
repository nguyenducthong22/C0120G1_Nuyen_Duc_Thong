package PointVaMovablePoint;

public class Point {
    protected float x=0.0f;
    protected float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[]arrayXY=new float[2];
        arrayXY[0]=this.getX();
        arrayXY[1]=this.getY();
        return arrayXY;
    }


    @Override
    public String toString() {
        return "Point { x= "+this.getX()+", y= "+this.getY()+" }";
    }
}

