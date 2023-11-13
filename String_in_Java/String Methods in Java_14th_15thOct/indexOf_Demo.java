//Return Type= int
class indexOf_Demo{

	public static void main(String [] args){
		
		String s1=new String("Bielearn");
		String s2=new String("Biencaps");
		String s3=new String("MegaTechz");
		
		System.out.println(s1.indexOf('l'));   //3
		System.out.println(s2.indexOf("B"));   //0
		System.out.println(s2.indexOf('e'));   //2 (Returns first index of 'e')
		System.out.println(s2.indexOf('e',3)); //check for index of e after 3rd index
		System.out.println(s3.indexOf("Tech"));//4
		System.out.println(s3.indexOf("Techz",5)); //index of Techz after 5th index

	}
}
