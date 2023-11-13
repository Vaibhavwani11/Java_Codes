//StringBuffer is "Mutable" So, instead of making new object everytime changes are made in same string. for concat(),append()
class allMethods{

	public static void main(String [] args){
	
		StringBuffer sb1=new StringBuffer("Vaibhav");
	//length	
		System.out.println("Length= "+sb1.length());//7
	//charAt
		System.out.println("charAt 3= "+sb1.charAt(3));//b

	//append {string parameter}
		System.out.println("After append= "+sb1.append(" Wani"));//Vaibhav Wani
	
	//append {int parameter}
		System.out.println("Append int= "+sb1.append(11));//Vaibhav Wani11
	
	//append {char parameter}
		sb1.append('A');
		System.out.println("Append char= "+sb1);//Vaibhav Wani11A
	
	//append {object of another string as parameter}
		StringBuffer sb2=new StringBuffer("GOOGLE");
		sb1.append(sb2);
		System.out.println("Append object= "+sb1);//Vaibhav Wani11AGOOGLE
	
	//insert()
		sb1.insert(7,"Pradip");
		System.out.println("insert at 7th index= "+sb1);//VaibhavPradip Wani11AGOOGLE
	
	//delete()
		///sb1.delete(charAt(11));
		//System.out.println("delete at 14th= "+sb1);//VaibhavPradipWani11AGOOGLE
	
		sb1.delete(19,34);
		System.out.println("delete from 19th to 34th= "+sb1);//VaibhavPradipWani1
	//reverse()
		sb1.reverse();
		System.out.println("After reverse= "+sb1);//1inaW pidarPvahbiaV
	
	}
}
