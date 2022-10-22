package ebebek;

import java.util.Scanner;

public class Operations {

    public void operations(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\n************** WELCOME TO WORKER INFORMATION PRINT PROGRAMME **************\n");

        String name = null;
        double salary= 0;
        int workHours= 0;
        int hireYear= 0;
        try {
            System.out.println("Enter the Name and Click Enter Please");
            name = scan.nextLine();

            System.out.println("Enter the Salary and Click Enter Please");
            salary = scan.nextDouble();

            System.out.println("Enter the Work Hours and Click Enter Please");
            workHours = scan.nextInt();

            System.out.println("Enter the Hire Year and Click Enter Please");
            hireYear = scan.nextInt();
        } catch (Exception e) {
            System.out.println("We Are Sorry\nIncorrect Entry!");
        }

        POJO pojo=new POJO(name,salary,workHours,hireYear);
        System.out.println(pojo);

        System.out.println("\nDo You Want To Continue?\nFor 'Yes' Enter 'Y' and Click Enter Please\nFor 'No' Enter 'N' and Click Enter  Please");
        String choosing=scan.next().substring(0,1);
        if (choosing.equalsIgnoreCase("y")){
            operations();
        }else System.out.println("\n\n******* THANK YOU FOR CHOOSING US *******");

    }
}
