class StateCapital{

	String State=null;
	String city;

	StateCapital(String State,String city){
	
		this.State=State;
		this.city= city;	
	}
}
class India{

	public static void main(String [] args){

		StateCapital c1= new StateCapital("Maha","Mumbai");
		StateCapital c2= new StateCapital("Goa","Panji");
		StateCapital c3= new StateCapital("Keral","Thiruanantapuram");
		StateCapital c4= new StateCapital("TamilNadu","Chennai");
		StateCapital c5= new StateCapital("Karnataka","Banalore");

		StateCapital arr[]= new StateCapital[5];

		arr[0]=c1;
		arr[1]=c2;
		arr[2]=c3;
		arr[3]=c4;
		arr[4]=c5;

		System.out.println(c1.State); //Maha

		for(int i=0; i<arr.length; i++){
		
			System.out.println(arr[i].State+":"+arr[i].city);
		}
	}
}
