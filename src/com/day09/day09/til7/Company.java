package com.day09.day09.til7;

public class Company implements Money {
    double total=1000000d;
    @Override
    public void playSalary(Employee employee) {

      if(employee instanceof Manager){
          total-=employee.salary;
          System.out.println("给"+employee.name+"发工资:"+employee.salary+",公司剩余资产:"+total);
      }else if(employee instanceof  Coder){
          total-=employee.salary;
          System.out.println("给"+employee.name+"发工资:"+employee.salary+",公司剩余资产:"+total);
      }

    }

}
