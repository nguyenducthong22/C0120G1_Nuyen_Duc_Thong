package _6_CauTrucDuLieuVaGiaiThuat.BaiTap.TrienKhaiArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;//So luong phan tu//
    private static final int DEFAULT_CAPACITY=10;//Suc chua mac dinh la 10 //
    public Object[] element;//Mang chua phan tu //

    public MyList(){
        element =new Object[DEFAULT_CAPACITY];
        //Suc chua mac dinh cua contructor khong tham so la 10//
    }

    public MyList(int capacity) {
        if (capacity>=0){
            element=new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity : "+capacity);
        }
    }

    public int size(){
        return this.size;
    //Tra ve do dai //
    }

    public void clear(){
        size=0;
        for (int i=0;i<element.length;i++){
            element[i]=null;
    // Clear tat ca phan tu //
        }
    }

    public boolean add( E e){
        if (element.length==size){
            this.ensuzeCapacity(5);
        }
        //neu do dai mang bang so luong phan tu thi tang mang len 5 don vi (de co the tiep tuc add them phan tu) //

        element [size]=element;
        size++;
        return true;
    //Them 1 phan tu vao array list //
    }

    public void ensuzeCapacity(int minCapacity){
        if (minCapacity>=0){
            int newSize=this.element.length*2;
            element= Arrays.copyOf(element,newSize);
        }else {
            throw new IllegalArgumentException("minaCapacity : "+minCapacity);
        }
    //Tang kich thuoc cua mang (gap doi) co dk //
    }

    public void add(E e,int index){
        if (index>element.length){
            throw new IllegalArgumentException("index : "+index);
        // Neu add tai vi tri lon hon do dai mang bao loi //
        }else if (element.length==size){
            this.ensuzeCapacity(5);
        // Neu them o vi tri cuoi cung thi tang mang len de tiep tuc add hoac thao tac //
        }

        if (element[index]==null){
            element[index]=e;
            size++;
        // Neu tai vi tri index co gia ti null thi gan e truyen vao bang gia tri tai do //
        }else {
            for (int i=size+1;i>=index;i--){
                element[i]=element[i-1];
            // Chay vong lap tu cuoi mang den index gan tu sau ve trc de den index co gia tri null //
            }

            element[index]=element;
            size++;
        }
    }
}
