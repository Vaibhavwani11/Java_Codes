class Core2web{
	static int totalStudCount=2500;
	int batchCount=0;
	
	void dispStudCount(){
		System.out.println("Total Students="+totalStudCount);
		System.out.println("Batch Student count="+batchCount);
	}
}	
class C2WappAdmin{
	static int logincount=1200;
	int videoCount=0;
	
	void dispStat(){
		System.out.println("Total login Count="+logincount);
		System.out.println("Video Count="+videoCount);
	}
}
class Mentor{
	public static void main(String[] args){
		Core2web java9_10=new Core2web();
		java9_10.batchCount=370;
		java9_10.dispStudCount();

		Core2web PPA5=new Core2web();
		PPA5.batchCount=290;
		PPA5.dispStudCount();

		C2WappAdmin Python0=new C2WappAdmin();
		Python0.videoCount=25;
		Python0.dispStat();
	
		C2WappAdmin OS=new C2WappAdmin();
		OS.videoCount=150;
		OS.dispStat();
	}
}