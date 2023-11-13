class Attendance{

	public static void main(String [] args){
		int presentDays=60;
		int totalDays=80;
		
		float attendance=(100*presentDays/totalDays);
	
		System.out.println("Student's attendance is "+attendance);
		System.out.println("Processing...");
		
		if(attendance>=75){
			System.out.println("The student is eligible for the Exam.");
		}		
		else{
			System.out.println("The student is not eligible for the Exam.");
		}
	}
}