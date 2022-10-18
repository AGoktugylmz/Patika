public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    Employee ( String name,double salary, int workHours , int hireYear){
        this.hireYear =hireYear;
        this.workHours=workHours;
        this.salary=salary;
        this.name=name;
    }
    private double raiseSalary (){
        int yearT = 2021 - hireYear;
        if ( 0<yearT && yearT < 10)
            return salary *0.05;
        else if ( yearT < 20 )
            return salary * 0.1;
        else
            return salary * 0.15;
    }
    private double tax () {
        if (salary >= 1000)
            return salary * 0.03;
        return 0;
    }
    private double bonus () {
        if (workHours >40)
            return (workHours -40)*30;
        return 0;
    }
    public String toString () {
        String sonuç = "";
        sonuç += "\nAdı : " +name+ "\nMaaşı : " +salary + "\nÇalışma Saati : " +workHours +"\nBaşlangıç Yılı : " +hireYear +"\nVergi : " +tax()
        + "\nBonus : " +bonus() +"\nMaaş Artışı : " +raiseSalary()+ "\nVergi ve Bonuslar ile birlikte maaş : " +(salary + tax())+"\nToplam Maaş : " +(salary +tax()+bonus());
        return sonuç;

    }
}