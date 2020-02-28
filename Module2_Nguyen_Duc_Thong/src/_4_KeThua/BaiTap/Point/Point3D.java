package _4_KeThua.BaiTap.Point;

public class Point3D extends Point2D {
    private float x;
    private float y;
    private float z;
    float [] arr3D;


    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float [] getXYZ(){
        arr3D = new float[3];
        arr3D[0]=this.getX();
        arr3D[1]=this.getY();
        arr3D[2]=this.getZ();
        return arr3D;
    }

    @Override
    public String toString() {
        return "point3D{} ("+this.getX()+","+this.getY()+","+this.getZ()+")";
        }
}
