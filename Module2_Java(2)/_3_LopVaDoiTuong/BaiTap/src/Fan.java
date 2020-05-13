public class Fan {
    private  String name;
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private boolean status=false;
    private  int speech=SLOW;
    private  double radius=5;
    private String color="blue";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fan() {
    }

    public Fan(String name, boolean status, int speech, double radius, String color) {
        this.name = name;
        this.status = status;
        this.speech = speech;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSpeech() {
        return speech;
    }

    public void setSpeech(int speech) {
        this.speech = speech;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String nameSpeech;

    public String getNameSpeech() {
        if (this.getSpeech()==1){
            return "Slow";
        }else if (this.getSpeech()==2){
            return "Medium";
        }else if (this.getSpeech()==3){
            return "Fast";
        }else {
            return "!!!!!";
        }
    }

    public String toString(){
        if (status==false){
            return  this.getName()+" is off !!! ";
        }else {
        return this.getName()+" is on : " +"\n"+
                "Color  : "+this.getColor()+"\n"+
                "Radius : "+this.getRadius()+"\n"+
                "Speech : "+this.getNameSpeech();
        }
    }

    public static void main(String[] args) {
        boolean on=true;
        boolean off=false;

        Fan fan1=new Fan();
        fan1.setName("fan1");
        fan1.setStatus(on);
        fan1.setSpeech(2);
        System.out.println(fan1.toString());

        System.out.println("-----------------------");
        Fan fan2=new Fan();
        fan2.setName("fan2");
        System.out.println(fan2.toString());
    }
}
