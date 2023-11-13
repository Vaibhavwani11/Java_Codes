
class banTikTok{
	static int active_users=2200000;
	int totalDownloads=3000000;
	
	void statistics(){
		System.out.println("Number of active users="+active_users);
		System.out.println("Total downloads="+totalDownloads);
	}
}
class buyIndianProd{
	static int total_users=100000;
	int Indian_brands=590;

	void newStatistics(){
		System.out.println("Number of users increased="+total_users);
		System.out.println("Indian Brands="+Indian_brands);		
	}
}
class BoycottChinaprod{
	public static void main(String[] args){
		banTikTok happyPpl =new banTikTok();
		happyPpl.active_users=0;
		happyPpl.statistics();
	
		banTikTok sadTiktokers =new banTikTok();
		sadTiktokers.active_users=210;
		sadTiktokers.statistics();
			
		buyIndianProd madeinInd=new buyIndianProd();
		madeinInd.total_users=200000;
		madeinInd.newStatistics();
		
	}
}