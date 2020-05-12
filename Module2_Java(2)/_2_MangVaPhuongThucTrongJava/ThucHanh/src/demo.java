public class demo {
    public static void main(String[] args) {
        int b=1;
        int[]a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;

        for (int i=0;i<a.length;i++){
            a[b]=4;
            a[b]=a[b+1];
            System.out.println(a[i]);
        }

    }
}
