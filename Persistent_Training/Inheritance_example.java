
public class Bicycle{

    public int gear;
    int speed;
    
    public Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void speedUp(){

        speed++;
    }
    public void getInfo(){

        System.out.println(gear+" "+speed);
    }
}
class MountainBike extends Bicycle{

    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        //1st line of constructor is super()
        //jar apan parent mdhe explicitly constructor lihla asel tr child class chya constructor mdhe explicitly super la call dyava lagto
        super(gear, speed);
        this.seatHeight=seatHeight;
    }
    public void getInfo(){

        System.out.println(gear+" "+speed+" "+seatHeight);
    }
    public void adjustHeight(){
        seatHeight++;
    }
}
class Caller{

    public static void main(String [] args){

        System.out.println(gear+" "+speed);

        Bicycle b=new Bicycle(1, 15);
        b.getInfo();
        b.speedUp();
        b.getInfo();


        MountainBike mb= new MountainBike(2, 20, 5);
        mb.getInfo();
        mb.adjustHeight();
        mb.getInfo();
    }
}