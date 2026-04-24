class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int workingYears = currentYear - this.hireYear;

        if (workingYears < 10) {
            return this.salary * 0.05;
        } else if (workingYears < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double totalSalary = this.salary + raise;
        double salaryWithTaxAndBonus = this.salary - tax + bonus;

        String result = "Adı : " + this.name + "\n";
        result += "Maaşı : " + this.salary + "\n";
        result += "Çalışma Saati : " + this.workHours + "\n";
        result += "Başlangıç Yılı : " + this.hireYear + "\n";
        result += "Vergi : " + tax + "\n";
        result += "Bonus : " + bonus + "\n";
        result += "Maaş Artışı : " + raise + "\n";
        result += "Vergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus + "\n";
        result += "Toplam Maaş : " + totalSalary;

        return result;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kemal", 2000.0, 45, 1985);
        System.out.println(emp1);

        System.out.println("\n====================\n");

        Employee emp2 = new Employee("Ahmet", 1500.0, 50, 2015);
        System.out.println(emp2);

        System.out.println("\n====================\n");

        Employee emp3 = new Employee("Mehmet", 800.0, 38, 2018);
        System.out.println(emp3);
    }
}