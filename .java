import java.util.Scanner;
public class calculator {
    public static void main(String[] args) 
    {
        System.out.println("THIS BASIC PROJECT IS TO PERFORM BASIC CALCULATIONS IN JAVA!");
        System.out.print("Enter the first number!: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("Enter the second number!: ");
        int n2 = sc.nextInt();
        System.out.println("SELECT THE OPERATION TO BE DONE: ");
        System.out.println("1.ADDTION OF TWO NUMBERS");
        System.out.println("2.SUBTRACT TWO NUMBERS");
        System.out.println("3.MULTIPLY TWO NUMBERS");
        System.out.println("4.DIVISION OF TWO NUMBERS");
        int n3 = sc.nextInt();
        if(n3==1)
        {
            int cal = n1+n2;
            System.out.println("THE SUM : " + cal);
        }
        else if (n3==2)
        {
            int cal1 = n1-n2;
            System.out.println("THE SUBTRACTED VALUE : " + cal1);
        }
        else if (n3==3)
        {
            int cal2 = n1*n2;
            System.out.println("THE MULTIPLIED VALUE : " + cal2);
        }
        else if (n3==4)
        {
            int cal3 = n1/n2;
            System.out.println("THE DIVIDED VALUE : " + cal3);
        }
        else
        {
            System.out.println("PLEASE ENTER VALID OPERATION, THANK YOU!");
        }
    }
}
