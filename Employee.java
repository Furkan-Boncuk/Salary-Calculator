public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int hireYear, int workHours, double salary) {
        this.name = name;
        this.hireYear = hireYear;
        this.workHours = workHours;
        if (salary < 0) {
            System.out.println("Entered Invalid Value");
        } else {
            this.salary = salary;
        }
    }

    public double tax() {
        double tax = 0;
        if (salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    public int bonus() {
        int bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        double raise;
        int workingYear = (2022 - hireYear);
        if (workingYear < 10) {
            raise = (salary * 0.05);
        } else if (workingYear < 20) {
            raise = (salary * 0.10);
        } else{
            raise = (salary * 0.15);
        }
        return raise;
    }

    public String toString() {
        return "Name: " + name
                 + "\nSalary: " + salary
                 + "\nWork Hours: " + workHours
                 + "\nHire Year: " + hireYear
                 + "\nTax: " + tax()
                 + "\nBonus: " + bonus()
                 + "\nSalary Raise: " + raiseSalary()
                 + "\nSalary with Tax and Bonus: " + (salary - tax() + bonus())
                 + "\nTotal Salary: " + (salary + raiseSalary());
    }
}
