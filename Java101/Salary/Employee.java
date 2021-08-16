package com.salary;

public class Employee {

    String name;
    double salary;
    double weeklyWorkingHours;
    int hireYear;

    public Employee(String name, double salary, double weeklyWorkingHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.weeklyWorkingHours = weeklyWorkingHours;
        this.hireYear = hireYear;

    }

    public double tax(){

        if (this.salary < 1000){

            return 0;
        }else {

            return (this.salary*0.03);
        }
    }

    public double bonus(){
        if (this.weeklyWorkingHours > 40){

            return (weeklyWorkingHours - 40)*30;
        }else {
            return 0;
        }
    }

    public double raiseSalary(int year){
        if (year - this.hireYear < 10){

            return (this.salary*0.05);

        }else if(year - this.hireYear > 9 && year - this.hireYear <= 20){

            return (this.salary*0.10);

        }else if(year - this.hireYear > 19){

            return (this.salary*0.15);

        }else {
            return 0;
        }
    }

    public double totalSalary(){

         return this.salary + (bonus() + raiseSalary(2021)) + tax();

    }

    @Override
    public String toString() {


        return "Employee{" +
                "name='" + name + '\'' +
                "\n salary=" + salary +
                "\n weeklyWorkingHours=" + weeklyWorkingHours +
                "\n hireYear=" + hireYear +
                "\n tax= " + tax() +
                "\n bonus= " + bonus() +
                "\n maaş artışı= " + raiseSalary(2021) +
                "\n vergi ve bonuslar ile birlikte maaş= " + (bonus() + tax() + salary) +
                "\n toplam maaş= " + totalSalary() +
                '}';
    }
}



























