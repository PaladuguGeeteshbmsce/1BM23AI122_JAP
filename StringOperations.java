
import java.util.Scanner;

public class StringOperations {
    public static void main(String [] args){
        StringBuffer sb1=new StringBuffer();
        System.out.println("the capacity of  stringbuffer sb1 is "+sb1.capacity());
        StringBuffer sb2=new StringBuffer("hello");
        System.out.println("the capacity of  stringbuffer sb1 is "+sb2.capacity());

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the feedback string");
        String feedback=sc.nextLine();
        StringBuffer reversedbuffer=new StringBuffer(feedback);
        reversedbuffer.reverse();
        String finalstring=reversedbuffer.toString().toUpperCase();
        System.out.println("the feedback string after reversing and converting it into uppercase :"+finalstring);

        System.out.println("enter the string to be appended");
        String appendstring=sc.nextLine();
        StringBuffer finalbuffer=new StringBuffer(finalstring);
        finalbuffer.append(appendstring);

        System.out.println("after appending the string to reversed uppercase buffer : "+finalbuffer);
    }
}
/*the capacity of  stringbuffer sb1 is 16
the capacity of  stringbuffer sb1 is 21
enter the feedback string
geetesh
the feedback string after reversing and converting it into uppercase :HSETEEG
enter the string to be appended
chowdary
after appending the string to reversed uppercase buffer : HSETEEGchowdary

Process finished with exit code 0
*/
