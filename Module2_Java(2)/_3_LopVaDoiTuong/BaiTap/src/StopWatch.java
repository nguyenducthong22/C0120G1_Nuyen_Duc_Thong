import javafx.scene.effect.Bloom;
import javafx.scene.paint.Stop;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch()
    {
        this.startTime = new Date();
    }

    public Date getStartTime()
    {
        return this.startTime;
    }

    public Date getEndTime()
    {
        return this.endTime;
    }

    public void start()
    {
        this.startTime = new Date();
    }

    public void stop()
    {
        this.endTime = new Date();
    }

    public long getElapsedTime()
    {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        int[]array=new int[10000];
        for (int i=0;i<10000;i++){
            array[i]=(int) Math.floor(Math.random()*10000);
        }

        stopWatch.start();
        System.out.println("Mang ban dau :");
        for (int i=0;i<10000;i++){
            System.out.print(array[i]+"  ");
            if(i%5000==0&&i!=0){
                System.out.println("");
            }
        }

        System.out.println("");
        System.out.println("Dang sap xep ...");

        int temp = array[0];
        for (int i = 0 ; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        System.out.println("Mang sau khi sap xep :");
        for (int i=0;i<10000;i++){
            System.out.print(array[i]+"  ");
            if(i%5000==0&&i!=0){
                System.out.println("");
            }
        }
        stopWatch.stop();

        System.out.println("");
        System.out.println("Thoi gian sap xem 1 mang 10000 so la : "+ stopWatch.getElapsedTime()+" milliseconds");
    }
}

