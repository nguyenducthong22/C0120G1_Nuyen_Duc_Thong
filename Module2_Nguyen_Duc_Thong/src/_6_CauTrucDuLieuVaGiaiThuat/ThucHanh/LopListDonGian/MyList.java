package _6_CauTrucDuLieuVaGiaiThuat.ThucHanh.LopListDonGian;

import javax.crypto.Mac;
import java.sql.Array;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class MyList {
    private  int size=0;
    private final int DEFAULT_CAPACITY=10;
    private Object []element;

    public MyList(){
        element=new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element,newSize);
    }
    // Tang gap doi kich thuoc mang//

    public <E> void add(E e){
        if (size==element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    //Them phan tu vao cuoi mang//

    public <E> E get(int i){
        if (i>=size|i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element [i];
    }
    //Lay phan tu tai ci tri i //

}
