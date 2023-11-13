import java.util.*;
class ITCompany{
    String name=null;
    int empCnt=0;

    ITCompany(String name,int empCnt){

        this.name=name;
        this.empCnt=empCnt;
    }
    void Info(){
        System.out.println("Comp Name="+name+", Employees="+empCnt);
    }
}
class ArrayList_impcode {
        public static void main(String [] arsg){
            
            ArrayList al=new ArrayList();
            al.add(new ITCompany("Microsoft",4000));
            al.add(new ITCompany("Google",3500));
            al.add(new ITCompany("Apple",5000));
            al.add(new ITCompany("Amazon",6000));

            System.out.println(al);

            Iterator i=al.iterator();
            while(i.hasNext()){
                
                ITCompany obj=i.next();
                obj.Info();
                //System.out.println(i.next());
            }
        }
}
