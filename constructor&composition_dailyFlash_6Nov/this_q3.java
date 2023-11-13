/*3) Guess the output of the following program and reason*/

class ConstructorDemo {

	int rollNum;

	ConstructorDemo() {
	       	rollNum =100;
	}

	ConstructorDemo(int rnum) {

		//this();
		rollNum = rollNum+ rnum; 
		//this();
       	}

	int getRollNum() { 
		
		return rollNum;
	}

	void setRollNum(int rollNum) { 
		
		this.rollNum = rollNum; 
	}

	public static void main(String args[]){
	       
		ConstructorDemo obj = new ConstructorDemo(12);

		System.out.println(obj.getRollNum());
       	}
}
