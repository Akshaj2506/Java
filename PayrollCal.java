import java.util.Scanner;

class Employee {
    private double basicPay;
    private double daPer;
    private double taPer;
    private double hraPer;

    public Employee(double basicPay, double daPer, double taPer, double hraPer) {
        this.basicPay = basicPay;
        this.daPer = daPer;
        this.taPer = taPer;
        this.hraPer = hraPer;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public double getDaPercentage() {
        return daPer;
    }

    public double getTaPercentage() {
        return taPer;
    }

    public double getHraPercentage() {
        return hraPer;
    }

    public double calculateGrossSalary() {
        double daAmount = basicPay * (daPer / 100);
        double taAmount = basicPay * (taPer / 100);
        double hraAmount = basicPay * (hraPer / 100);

        return basicPay + daAmount + taAmount + hraAmount;
    }
}

public class PayrollCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        double basicPay = scanner.nextDouble();

        System.out.print("Enter DA Percentage: ");
        double daPer = scanner.nextDouble();

        System.out.print("Enter TA Percentage: ");
        double taPer = scanner.nextDouble();

        System.out.print("Enter HRA Percentage: ");
        double hraPer = scanner.nextDouble();

        Employee employee = new Employee(basicPay, daPer, taPer, hraPer);

        System.out.println("Gross Salary: " + employee.calculateGrossSalary());

        scanner.close();
    }
}
