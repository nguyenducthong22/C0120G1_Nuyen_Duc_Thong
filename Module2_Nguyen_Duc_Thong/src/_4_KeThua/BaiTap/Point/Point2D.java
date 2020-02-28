package _4_KeThua.BaiTap.Point;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;
    private  float[]arr;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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

    public float []getXY(){
        arr = new float[2];
        arr[0]=this.x;
        arr[1]=this.y;
        return  this.arr;
    }

    @Override
    public String toString() {
        return "point2D: "+  "("+this.getX()+","+this.getY()+")";
    }
}
