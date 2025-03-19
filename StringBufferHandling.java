import java.util.Scanner;
public class StringBufferHandling {
    public static void main(String[] args){
        StringBuffer sb1=new StringBuffer();
        System.out.println("Capacity of stringbuffer object sb1:"+sb1.capacity());
        StringBuffer sb2= new StringBuffer("Hello");
        System.out.println("capacity of StrtingBuffer object sb2:"+sb2.capacity());
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string :");
        String inputstring=scanner.nextLine();

        StringBuffer reversedBuffer=new StringBuffer(inputstring);
        reversedBuffer.reverse();
        String reversedUpperCase=reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed string in uppercase:"+reversedUpperCase);

        System.out.print("Enter a string to Append:");
        String appendString =scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("String after appending :"+reversedBuffer);

        scanner.close();

    }
}
