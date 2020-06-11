package _4_KeThua.ThucHanh.Hinh.PointVaMoveablePoint;

public class Point {
    private  float x;
    private  float y;
    private float[] arrPoint;

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

    public float[]getArrXY(){
        arrPoint= new float[2];
        this.x=arrPoint[0];
        this.y=arrPoint[1];
        return arrPoint;
    }

    public void setXY(float x,float y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point ("+this.getX()+","+this.getY()+")";
    }
}
