package com.bridgelabz.empwagecomputation;

public class EmpWageBuilder {

    public static int IS_FULL_TIME =1;
    public static int EMP_PER_HOUR =20;
    public static void main(String[] args) {

        int empWage=0;
        int empHrs=0;

        int empCheck = (int) Math.floor(Math.random() * 10) %2;
        if ( empCheck == IS_FULL_TIME)
            empHrs =8;
        else
            empHrs =0;

        empWage = empHrs * EMP_PER_HOUR;
        System.out.println("Emp WAGE :"+ empWage);



    }

}
