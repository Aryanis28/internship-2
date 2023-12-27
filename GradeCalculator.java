import java.util.Scanner;
public class GradeCalculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,sum;
        double average;
        String s1,s2,s3,s4,s5; 
        int m1,m2,m3,m4,m5;
        String grade;
        System.out.println("\n\n***************Welcome to Student grade calculator**********\n\n");
        System.out.println("Enter the subject to count your marks and grade\n");

        System.out.println("Enter the first subject:");
        s1=sc.nextLine();
        

        System.out.println("Enter the second subject:");
        s2=sc.nextLine();

        System.out.println("Enter the third subject:");
        s3=sc.nextLine();

        System.out.println("Enter the fourth subject:");
        s4=sc.nextLine();

        System.out.println("Enter the fifth subject:");
        s5=sc.nextLine();

        System.out.println("**********************");

        System.out.println("Enter the marks of:"+s1);
        m1=sc.nextInt();
        
        System.out.println("Enter the marks of:"+s2);
        m2=sc.nextInt();

        System.out.println("Enter the marks of:"+s3);
        m3=sc.nextInt();

        System.out.println("Enter the marks of:"+s4);
        m4=sc.nextInt();

        System.out.println("Enter the marks of:"+s5);
        m5=sc.nextInt();

        sum=m1+m2+m3+m4+m5;
        System.out.println("The sum of the marks is:"+sum);

        average=(m1+m2+m3+m4+m5)/5;
        System.out.println("The average is:"+average);
        

        if(average>=95 && average<=100)
        {
           grade="A+";
          
           System.out.println("\n**********The result is************\n");
           System.out.println("The sum of your marks is:"+sum);
           System.out.println("The average of your marks is:"+average);
           System.out.println("Your grade is:"+grade);

        }
       
        else if(average>=90 && average<=95)
        {
           grade="A";
          
           System.out.println("\n**********The result is************\n");
           System.out.println("The sum of your marks is:"+sum);
           System.out.println("The average of your marks is:"+average);
           System.out.println("Your grade is:"+grade);

        }

        else if(average>=80 && average<=90)
        {
           grade="B";
          
           System.out.println("\n**********The result is************\n");
           System.out.println("The sum of your marks is:"+sum);
           System.out.println("The average of your marks is:"+average);
           System.out.println("Your grade is:"+grade);

        }

        else if(average>=70 && average<=80)
        {
           grade="C";
          
           System.out.println("\n**********The result is************\n");
           System.out.println("The sum of your marks is:"+sum);
           System.out.println("The average of your marks is:"+average);
           System.out.println("Your grade is:"+grade);

        }

        else if(average>=60 && average<=70)
        {
           grade="C";
          
           System.out.println("\n**********The result is************\n");
           System.out.println("The sum of your marks is:"+sum);
           System.out.println("The average of your marks is:"+average);
           System.out.println("Your grade is:"+grade);

        }

        else if(average>=45 && average<=60)
        {
           grade="D";
          
           System.out.println("\n**********The result is************\n");
           System.out.println("The sum of your marks is:"+sum);
           System.out.println("The average of your marks is:"+average);
           System.out.println("Your grade is:"+grade);

        }

        else 
        {
           grade="You Failed the examination::BETTER LUCK NEXT TIME!! ";
          
           System.out.println("\n**********The result is************\n");
           System.out.println("The sum of your marks is:"+sum);
           System.out.println("The average of your marks is:"+average);
           System.out.println("Your grade is:"+grade);

        }

    }
}
