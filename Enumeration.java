import java.util.Scanner;
public class Enumeration {
    public enum DayofWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean isworkday(){
            return (this!=SUNDAY && this!=SATURDAY);
        }
    }
    public static void main(String[] args){
        System.out.println("Is Monday a workday?"+DayofWeek.MONDAY.isworkday());
    }


}
/*Is Monday a workday?true*/

