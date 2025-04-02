import java.util.Scanner;
class Student{
    int marks;
}
public class Record{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int n = 5;
        Student obj[] = new Student[n];
        for (int i =0;i<n;i++){
            obj[i] = new Student();
            obj[i].marks = scanner.nextInt();
            System.out.println("Student "+ (i+1) +" Marks is :" +obj[i].marks);

        }
        int highestscore = obj[0].marks;
        int totscore = 0;
        for(int i = 0;i<n;i++){
            totscore = totscore + obj[i].marks;
            if (obj[i].marks > highestscore){
                highestscore = obj[i].marks;
            }
        }
        System.out.println("Statastics :");
        System.out.println("Highest score :"+highestscore);
        System.out.println("Total score :" +totscore);

    }
}
/*13
Student 1 Marks is :13
25
Student 2 Marks is :25
45
Student 3 Marks is :45
85
Student 4 Marks is :85
100
Student 5 Marks is :100
Statastics :
Highest score :100
Total score :268

Process finished with exit code 0
*/
