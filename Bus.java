package RentCar;

//客车类
public class Bus extends Motoqiche {

    private int zuiWei;     //客车特有座位数

    public int getZuiWei() {
        return zuiWei;
    }
    public void setZuiWei(int zuiWei) {
        this.zuiWei = zuiWei;
    }

    //构造方法
    public Bus() {}
    public Bus(String pingPai,String motoID,int perRent,int zuiWei) {
        super(pingPai,motoID,perRent);
        this.zuiWei = zuiWei;
    }
    @Override
    public double renMoney(int day) {
        double dayRent=this.getPerRent()*day;
        if(day>=3&&day<7) {
            dayRent*=0.9;
        }else if(day>=7&&day<30) {
            dayRent*=0.8;
        }else if(day>=30&&day<150){
            dayRent*=0.7;
        }else {
            dayRent*=0.6;
        }
        return dayRent;
    }
}

