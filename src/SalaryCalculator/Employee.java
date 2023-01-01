package SalaryCalculator;
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double bonus;
    

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        double tax;
        if(this.salary>1000){
            tax=this.salary*0.03;
            
        }else{
            tax=0;
        }
        return tax;
    }
    
    double bonus(){
        double bonus;
        if(this.workHours>40){
            bonus=(this.workHours-40)*30;
        }else{
            bonus=0;
        }
        return bonus;
    }

    double raiseSalary(){
        double raiseSalary;
        int workYear=2021-this.hireYear;
        if(workYear<=9){
            raiseSalary=this.salary*0.05;
        }
        else if(workYear<9 && workYear<=19){
            raiseSalary=this.salary*0.1;
        }else{
            raiseSalary=this.salary*0.15;
        }
        return raiseSalary;
    }
    
    public String toString() {
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı :" + this.hireYear);
        System.out.println("Vergi :" + tax());
        System.out.println("Bonus :" + bonus());
        System.out.println("Maaş Artışı :" + raiseSalary());
        double netSalary=this.salary + bonus() - tax();
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + netSalary);
        double totalSalary=netSalary + raiseSalary();
        System.out.println("Toplam maaş :" +  totalSalary);
        
        return "==================";
    }
}
