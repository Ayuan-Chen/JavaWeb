package RentCar;


    public class Car extends Motoqiche {

        private String type;         //轿车特有的型号

        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        //构造方法
        public Car() {}
        public Car(String pingPai, String motoID, int perRent, String type) {
            super(pingPai,motoID,perRent);             //继承父类的品牌，车牌号，日租金
            this.type = type;
        }
        @Override
        public double renMoney(int day) {
            double dayRent=this.getPerRent()*day;

            if(day>7&&day<=30) {
                dayRent*=0.9;
            }else if(day>30&&day<=150) {
                dayRent*=0.8;
            }else {
                dayRent*=0.7;
            }
            return dayRent;
        }
    }



