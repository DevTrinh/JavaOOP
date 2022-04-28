package Rectangle;

public class Caculator {
    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }
    public double getArea(){
        return getChieudai() * getChieurong();
    }
    public double getPerimeter(){
        return (getChieudai()+getChieurong())*2;
    }
    public Caculator(double chieudai, double chieurong){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    private double chieudai;
    private double chieurong;

}
