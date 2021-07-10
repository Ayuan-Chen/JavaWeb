package RentCar;

import java.util.Scanner;

public class MotoRentText {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Motofuwu rentFuwu=new Motofuwu();
        //购置汽车
        rentFuwu.init();
        //定义用户需要输入的信息
        String pingPai=" ";
        String type=" ";
        int zuoWei=0;

        //收集客人信息
        System.out.println("------------------------欢迎光临--------------------------");
        System.out.println("请输入您要租赁的汽车类型 1.轿车 2.客车");
        int choos1=input.nextInt();
        if(choos1==1) {
            //租赁轿车
            System.out.println("请输入您要租赁的轿车品牌 1.宝马 2.别克");
            int no=input.nextInt();
            if(no==1) {
                pingPai="宝马";
                System.out.println("请输入您要租赁的宝马车型 1.X6 2.550i");
                int n=input.nextInt();
                type=(n==1)?"X6":"550i";

            }else {
                pingPai="别克";
                System.out.println("请输入您要租赁的别克车型 1.林荫大道 2.GL8");
                int n=input.nextInt();
                type=(n==1)?"林荫大道":"GL8";

            }
        }else if(choos1==2) {
            //租赁客车
            System.out.println("请输入您要租赁的轿车品牌 1.金杯 2.金龙");
            int no=input.nextInt();
            if(no==1) {
                pingPai="金杯";
                System.out.println("请输入您要租赁的金杯座位数 1.16 2.32");
                int n=input.nextInt();
                zuoWei=(n==1)?16:32;

            }else {
                pingPai="金龙";
                System.out.println("请输入您要租赁的金龙座位数 1.16 2.32");
                int n=input.nextInt();
                zuoWei=(n==1)?16:32;

            }
        }
        //租车&计算金额
        Motoqiche moto=rentFuwu.xunzhao(pingPai, type, zuoWei);

        System.out.println("租车成功，请按如下车牌提车"+moto.getMotoID());

        System.out.println("请输入您租赁的天数");
        int day=input.nextInt();
        double summoney=moto.renMoney(day);
        System.out.println("需要支付"+summoney+"元");

    }

}

