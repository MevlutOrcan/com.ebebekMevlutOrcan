package ebebek;

import java.util.Scanner;

public class POJO {

    private String name = "Isim Girilmedi";
    private double salary;
    private int workHours;
    private int hireYear;
    static Scanner scan = new Scanner(System.in);

    public POJO(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public POJO() {
    }

    public double tax() {

        double taxAmount = 0;
        if (salary > 1000) {
            taxAmount = salary * 3 / 100;
        }

        return taxAmount;
    }

    public int bonus() {

        int bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {

        double riseAmount = 0;
        if (hireYear > 2021) {
            System.out.println("Enter a Valid Year Please");
            hireYear = scan.nextInt();
        }
        if (2021 - hireYear < 10) {
            riseAmount = ( bonus() + salary-tax()) * 5 / 100;
        } else if (2021 - hireYear < 20) {
            riseAmount = ( bonus() + salary-tax() ) * 10 / 100;
        } else {
            riseAmount = ( bonus() + salary-tax() ) * 15 / 100;
            //riseAmount = salary* 15 / 100;
            //requirement e uymasi icin 54.satiri aktif 55. satiri pasif yapiniz(Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunacak.)
            //onrek ciktiya uymasi icin 54.satiri pasif 55. satiri aktif yapiniz(Toplam Maaş : 2390.0)
        }

        return riseAmount;

    }


    @Override
    public String toString() {
        return
                "Name                      : " + name +
                        "\nSalary                    : " + salary +
                        "\nWork Hours                : " + workHours +
                        "\nHire Year                 : " + hireYear +
                        "\nTax                       : " + tax() +
                        "\nBonus                     : " + bonus() +
                        "\nRaise Amount              : " + raiseSalary() +
                        "\nSalary with tax and bonus : " + (salary + bonus() - tax())+
                        "\nTotal Salary              : " + (salary + raiseSalary() + bonus())
                //"\nTotal Salary              : " + (salary + raiseSalary() + bonus()-tax())
                //ornek ciktiya uymasi icin 77. satiri pasif 78. satiri aktif ediniz
                //verilen requirement a uymasi icin 77. satir aktif 78. satir pasif olmali
                        ;
    }
}
//Vergi ve bonuslarla birlikte maaş için: vergi, bonus ve çalışanın kendi maaşı ile bulunacak.
//Toplam maaş: çalışanın kendi maaşı +artış+ bonus