/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.InputMismatchException;

/**
 *
 * @author mostafahassan
 */
public class Employee {

    int id;
    String name, address, rank;
    int hours_worked, overtime_worked;
    double total_salary;

    public Employee() {
        this.id = 0;
        this.name = "";
        this.address = "";
        this.rank = "";
        this.hours_worked = 0;
        this.overtime_worked = 0;
        this.total_salary = 0;
        
    }

    ;
    public Employee(int id, String name, String address, String rank, int hours_worked, int overtime_worked) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rank = rank;
        this.hours_worked = hours_worked;
        this.overtime_worked = overtime_worked;

    }
    //Accessors

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRank() {
        return rank;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public int getOvertime_worked() {
        return overtime_worked;
    }

    public double getTotal_salary() {
        return total_salary;
    }
    //End accessros

    //mutators
    public void setId(int id) throws InputMismatchException {
        if (id < 0) {
            throw new InputMismatchException("Id can't be a negitive number");
        } else {
            this.id = id;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setHours_worked(int hours_worked) throws InputMismatchException {
        if (hours_worked < 0) {
            throw new InputMismatchException("Hours Worked can't be a negitive number");
        } else {
            this.hours_worked = hours_worked;
        }
    }

    public void setOvertime_worked(int overtime_worked) throws InputMismatchException {
        if (overtime_worked < 0) {
            throw new InputMismatchException("OverTime Worked can't be a negitive number");
        } else {
            this.overtime_worked = overtime_worked;
        }
    }

    public void setTotal_salary(double total_salary) {
        this.total_salary = total_salary;
    }
    //end mutators
}
