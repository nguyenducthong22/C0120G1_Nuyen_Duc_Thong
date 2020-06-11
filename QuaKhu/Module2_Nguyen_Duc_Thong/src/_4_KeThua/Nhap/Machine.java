package _4_KeThua.Nhap;

public class Machine {
    private int id;
    private double price;
    private String url;

    public Machine(){

    }

    public Machine(int id,double price,String url){
        this.id=id;
        this.price=price;
        this.url=url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString(){
        return "id : "+this.getId()+"\n"+"URL : "+this.getUrl()+"\n"+"Price : "+this.getPrice();
    }
}
