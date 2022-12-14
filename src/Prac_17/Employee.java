package Prac_17;

public class Employee {

    String name;
    String rank;

    //int salary;
    int Basesalary = 2695;
    int WorkExpirience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setWorkExpirience(int WorkExp) {
        this.WorkExpirience = WorkExp;
    }
    public int getSalary(){
        return ((Basesalary*(WorkExpirience*10))/100)*85;
    }

    /*public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }*/
}