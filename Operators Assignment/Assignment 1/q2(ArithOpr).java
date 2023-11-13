class Arithmatic{
	int num1=20;
	int num2=10;
	int exp=0;
	
	void Add(){
		exp=num1+num2;
		System.out.println("Addition="+exp);
	}
	void Sub(){
		exp=num1-num2;
		System.out.println("Subtraction="+exp);
		
	}
	void Mult(){
		exp=num1*num2;
		System.out.println("Multiplication="+exp);		
	}
	void Div(){
		exp=num1/num2;
		System.out.println("Division="+exp);
	}
	void Mod(){
		exp=num1%num2;
		System.out.println("Modulus="+exp);
	}
public static void main(String[]args){
	Arithmatic obj=new Arithmatic();
	obj.Add();
	obj.Sub();
	obj.Mult();
	obj.Div();
	obj.Mod();
	}
}