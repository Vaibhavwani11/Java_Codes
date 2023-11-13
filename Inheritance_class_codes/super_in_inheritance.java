class Figure{
    
    int l,b,side;
    Figure(int l,int b){
        this.l=l;
        this.b=b;
    }
    Figure(int side){
        this.side=side;
    }
    void fig(){
        System.out.println("In Figure");
    }
}
class Rectangle extends Figure{
    
    Rectangle(int l,int b){
        super(l,b);
    }
    Rectangle(int side){
        super(side);
    }
    void area(){
        System.out.println("Area of Rectangle: "+(l*b));
    }
}
class Square extends Rectangle{

    Square(int side){
        super(side);
    }
    void sqr(){
        System.out.println("Area of Square: "+(side*side));
    }
}
class Call{
    public static void main(String[] args) {
        
        Square obj=new Square(5);
        obj.sqr();

        Rectangle obj2=new Rectangle(10, 20);
        obj2.area();
    }
}