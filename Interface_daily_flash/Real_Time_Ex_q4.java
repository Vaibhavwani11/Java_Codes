/*4. Write a java program having two interfaces, one extending the other, then a class
implementing the second interface. (Use real-time examples.*/

interface UGC{

	void exam_Mode();
}
interface University extends UGC{

	void exam_Mode();
}
class College implements University{

	public void exam_Mode(){
	
		System.out.println("Online Exam");
	}
}
class Student{

	public static void main(String [] args){
	
		University st=new College();
		st.exam_Mode();
	}
}
