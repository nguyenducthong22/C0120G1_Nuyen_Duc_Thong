package _2_MangVaPhuongThucTrongJava.BaiTap;

public class nhap {
    public static void main(String[] args) {
        int[] mangDem = new int[Character.MAX_VALUE];
        String str = "dont touch me";

        for(int i=0;i<str.length();i++){
            try{

                mangDem[str.charAt(i)]++;
                System.out.println(mangDem[str.charAt(i)]);
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("index over limit");
            }
        }
        for(int i=0;i<mangDem.length;i++){
            if(mangDem[i]!=0){
                System.out.println((char)i + ":" + mangDem[i]);
            }
        }

    }

}
