package RentCar;

public abstract class Motoqiche {

    private String pingPai;      //品牌
    private String motoID;       //车牌
    private int perRent;         //日租金


    //构造方法

    public Motoqiche() {}

    public Motoqiche(String pingPai,String motoID,int perRent) {
        this.pingPai=pingPai;
        this.motoID=motoID;
        this.perRent=perRent;

    }
    public String getPingPai() {
        return pingPai;
    }
    public void setPingPai(String pingPai) {
        this.pingPai = pingPai;
    }
    public String getMotoID() {
        return motoID;
    }
    public void setMotoID(String motoID) {
        this.motoID = motoID;
    }
    public int getPerRent() {
        return perRent;
    }
    public void setPerRent(int perRent) {
        this.perRent = perRent;
    }

    //计算租金的抽象方法
    public abstract double renMoney(int day);

}


