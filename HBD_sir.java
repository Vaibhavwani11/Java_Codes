class Birthday extends Thread{

	public void run(){

	System.out.print("!! HAPPY BIRTHDAY !! \n\n");

	for(int i=0; i<8; i++){
	
		for(int j=0; j<13; j++){
		
			if(i==0){
				if(j>=0 && j<4)
					System.out.print("*");
				else if(j>=4 && j<6)
					System.out.print(" ");
				else if(j==6)
					System.out.print("*");
				else if(j>6 && j<9)
					System.out.print(" ");
				else if(j>=9 && j<13)
					System.out.print("*");
	
			}	
			else if(i>0 && i<3){
			
				if(j==0){
					System.out.print("\n");
					System.out.print("*");
				}else if(j>0 && j<6)
					System.out.print(" ");
				else if(j==6)
					System.out.print("*");
				else if(j>6 && j<9)
					System.out.print(" ");
				else if(j==9)
					System.out.print("*");
				else if(j>9 && j<12)
					System.out.print(" ");
				else if(j==12)
					System.out.print("*");

			}
			else if(i==4){
				
				if(j>=0 && j<4){
					if(j==0)
						System.out.print("\n*");
					else
						System.out.print("*");
				}
				else if(j>=4 && j<6)
					System.out.print(" ");
				else if(j==6)
					System.out.print("*");
				else if(j>6 && j<9)
					System.out.print(" ");
				else if(j>=9 && j<13)
					System.out.print("*");
			
			}
			else if(i>4 && i<7){
			
				if(j>=0 && j<3)
					if(j==0)
						System.out.print("\n ");
					else	
						System.out.print(" ");
				else if(j==3){
					System.out.print("*");
				}else if(j>3 && j<6)
					System.out.print(" ");
				else if(j==6)
					System.out.print("*");
				else if(j>6 && j<9)
					System.out.print(" ");
				else if(j==9)
					System.out.print("*");
				else if(i==5 && j==10)
					System.out.print("*");
				else if(i==6 && j==12)
					System.out.print(" *");
			}
			else if(i==7){
				
				if(j>=0 && j<4){
					if(j==0)
						System.out.print("\n*");
					else
						System.out.print("*");
				}
				else if(j>=4 && j<6)
					System.out.print(" ");
				else if(j==6)
					System.out.print("*");
				else if(j>6 && j<9)
					System.out.print(" ");
				else if(j==9)
					System.out.print("*");
				else if(j>9 && j<12)
					System.out.print(" ");
				else if(j==12)
					System.out.print("*\n");
			}
		}
		try{
			sleep(1000);
		}
		catch(InterruptedException ie){
		
		}
	}
}
}
class Today{

	public static void main(String [] args){
	
		Birthday obj=new Birthday();
		obj.start();
	}
}
