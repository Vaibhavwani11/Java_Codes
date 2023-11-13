import java.text.SimpleDateFormat;
import java.util.Date;
class Date_class_demo {
    public static void main(String[] args) {

        Date d= new Date();
        System.out.println("Current date and time is: "+d);
        SimpleDateFormat sdf= new SimpleDateFormat("dd--MM--yyyy  hh-mm-ss"); //MM is month; mm is minutes;
        String s= sdf.format(d);

        System.out.println(s);
    }
}
