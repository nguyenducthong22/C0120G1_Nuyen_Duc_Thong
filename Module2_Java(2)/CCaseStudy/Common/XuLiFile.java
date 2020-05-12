package CCaseStudy.Common;
import static CCaseStudy.Controller.MainController.*;
public class XuLiFile {
    public static void xuLyLuu(){
        boolean kt= FileFactory.luuFile(listVilla, "C:\\Users\\HP\\Downloads\\Compressed\\project codegym 2\\Module2_Nguyen_Duc_Thong\\src\\CCaseStudy\\Data\\Villa");
        boolean kt1= FileFactory.luuFile(listHouse, "C:\\Users\\HP\\Downloads\\Compressed\\project codegym 2\\Module2_Nguyen_Duc_Thong\\src\\CCaseStudy\\Data\\House");
        boolean kt2= FileFactory.luuFile(listRoom, "C:\\Users\\HP\\Downloads\\Compressed\\project codegym 2\\Module2_Nguyen_Duc_Thong\\src\\CCaseStudy\\Data\\Room");
        boolean kt3= FileFactory.luuFile(listCustomer,"C:\\Users\\HP\\Downloads\\Compressed\\project codegym 2\\Module2_Nguyen_Duc_Thong\\src\\CCaseStudy\\Data\\Customer");
        if(kt&&kt1&&kt2&&kt3) {
            System.out.println("Đã lưu file thành công");
        } else {
            System.out.println("Đã lưu file thất bại");
        }
    }
    public static void xuLyDoc(){
        listVilla=FileFactory.docFile("C:\\Users\\HP\\Downloads\\Compressed\\project codegym 2\\Module2_Nguyen_Duc_Thong\\src\\CCaseStudy\\Data\\Villa");
        listHouse=FileFactory.docFile("C:\\Users\\HP\\Downloads\\Compressed\\project codegym 2\\Module2_Nguyen_Duc_Thong\\src\\CCaseStudy\\Data\\House");
        listRoom=FileFactory.docFile("C:\\Users\\HP\\Downloads\\Compressed\\project codegym 2\\Module2_Nguyen_Duc_Thong\\src\\CCaseStudy\\Data\\Room");
        listCustomer=FileFactory.docFile("C:\\Users\\HP\\Downloads\\Compressed\\project codegym 2\\Module2_Nguyen_Duc_Thong\\src\\CCaseStudy\\Data\\Customer");
        System.out.println("Đã đọc 4" + " file thành công");
    }
}
