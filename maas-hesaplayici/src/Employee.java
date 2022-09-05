public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    Employee e1;
    Employee e2;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax;
        if (salary > 1000) {
            tax = salary * 0.03;
        } else {
            tax = 0;
        }
        return tax;
    }


    double bonus() {
        double bonus;

       if (workHours > 40){
           bonus = (workHours-40)*30;
       } else {
            bonus = 0;
       }
       return bonus;
    }

   double raiseSalary() {
        double raise = 0;

        if (2022-hireYear < 10){
            raise = salary*0.05;
        }
        if (2022-hireYear > 9 && 2022-hireYear < 20){
            raise = salary*0.1;
        }
        if (2022-hireYear >=20){
            raise = salary*0.15;
        }
        return raise;
   }

   void getInfo(){
        double total = salary-tax() + bonus() + raiseSalary();
       System.out.println("==============================");
       System.out.println("Ad Soyad: " + this.name);
       System.out.println("İşe girdiği yıl: " + this.hireYear);
       System.out.println("Haftalık çalışma saati: " + this.workHours);
       System.out.println("Brüt maaş: " + this.salary + "₺");
       System.out.println("Vergi: " + this.tax()+ "₺");
       System.out.println("Bonus: " + this.bonus()+ "₺");
       System.out.println("Artış miktarı: " + raiseSalary()+ "₺");
       System.out.println("Net maaş: " + total+ "₺");
   }


}



