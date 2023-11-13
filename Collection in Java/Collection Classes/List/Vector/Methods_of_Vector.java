import java.util.Vector;

public class Methods_of_Vector {
    
    public static void main(String [] args){
        
        Vector v=new Vector();
        v.addElement(1);
        v.addElement(3);
        v.addElement("Vaibhav");

        //1)size()
        System.out.println(v.size());//3
        //2)isEmpty()
        System.out.println(v.isEmpty());//false
        //3)elementAt(index)
        System.out.println(v.elementAt(2));
        //4)setElementAt(Object obj, int index);
        v.setElementAt("Core2Web",1);
        System.out.println(v);
        //5)removeElementAt(int index)
        v.removeElementAt(0);
        System.out.println(v);
        //6)removeElement(Object o)
        v.removeElement("Core2web");
        System.out.println(v);
        //7)removeRange
        v.removeRange(0,2);  //error:removeRange method is Protected
        //que: why it is protected..while all other methods are public.
        }
}
