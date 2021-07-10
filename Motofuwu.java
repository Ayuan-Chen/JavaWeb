package RentCar;

//租车服务类
public class Motofuwu {
    //将初始化信息存放数组中
    public Motoqiche[] motos=new Motoqiche[8];

    //初始化车辆信息
    public void init() {
        motos[0]=new Car("宝马","辽B12345",800,"X6");
        motos[1]=new Car("宝马","辽B33345",600,"550i");
        motos[2]=new Car("别克","辽B12445",300,"林荫大道");
        motos[3]=new Car("别克","辽B09875",600,"GL8");
        motos[4]=new Bus("金杯","辽B13445",800,16);
        motos[5]=new Bus("金杯","辽B12665",1500,32);
        motos[6]=new Bus("金龙","辽B12555",800,16);
        motos[7]=new Bus("金龙","辽B12390",1500,32);

    }
    //根据给出的信息寻找车辆
    public Motoqiche xunzhao(String pingPai,String type,int zuoWei) {
        Motoqiche moto=null;
        for(Motoqiche mymoto:motos) {
            if(mymoto instanceof Car) {
                Car car =(Car)mymoto;
                //寻找的为轿车
                if(car.getPingPai().equals(pingPai)&& car.getType().equals(type)) {
                    moto= car;
                    break;
                }

            }else if(mymoto instanceof Bus) {
                Bus bus=(Bus)mymoto;
                //寻找客车
                if(bus.getPingPai().equals(pingPai)&&bus.getZuiWei()==(zuoWei)) {
                    moto=bus;
                    break;
                }

            }
        }
        return moto;
    }

}

