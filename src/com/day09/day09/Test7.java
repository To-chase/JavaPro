package com.day09.day09;


import com.day09.day09.til7.Coder;
import com.day09.day09.til7.Company;
import com.day09.day09.til7.Employee;
import com.day09.day09.til7.Manager;

public class Test7 {
    public static void main(String[] args) {
        Company company=new Company();
        Employee employee=new Manager("张小强",9000d);
        Employee employee1=new Coder("李小亮",5000d);
        company.playSalary(employee);
        company.playSalary(employee1);

    }
}
