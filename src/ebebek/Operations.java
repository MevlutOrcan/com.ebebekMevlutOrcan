package ebebek;

import java.util.Scanner;

public class Operations {

    public void operations(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n************** WELCOME TO WORKER INFORMATION PRINT PROGRAMME **************\n");

        System.out.println("Enter the Name Please");
        String name = scan.nextLine();

        System.out.println("Enter the Salary Please");
        double salary=scan.nextDouble();

        System.out.println("Enter the Work Hours Please");
        int workHours= scan.nextInt();

        System.out.println("Enter the Hire Year Please");
        int hireYear= scan.nextInt();

        POJO pojo=new POJO(name,salary,workHours,hireYear);
        System.out.println(pojo);

        System.out.println("\nDo You Want To Continue?\nFor 'Yes' Enter 'Y' Please\nFor 'No' Enter 'N' Please");
        String choosing=scan.next().substring(0,1);
        if (choosing.equalsIgnoreCase("y")){
            operations();
        }else System.out.println("\n\n******* THANK YOU FOR CHOOSING US *******");

    }
}
