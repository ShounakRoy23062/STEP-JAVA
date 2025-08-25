public class Bonus {

    public static void main(String[] args) {
        double[][] employeeData = generateData(); // [salary, years of service]
        double[][] bonusData = calculateBonus(employeeData); // [old salary, bonus, new salary]

        // Print the table and total calculations
        displayResults(bonusData);
    }

    // Generate 10 random employees with salary and years of service
    public static double[][] generateData() {
        double[][] data = new double[10][2]; // [][0] = salary, [][1] = years of service

        for (int i = 0; i < 10; i++) {
            int salary = (int)(Math.random() * 50000) + 50000; // random 5-digit salary (50000 to 99999)
            int years = (int)(Math.random() * 10) + 1; // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][3]; // [][0] = old salary, [][1] = bonus, [][2] = new salary

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            int years = (int)data[i][1];
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }

        return result;
    }

    // Display the result table and totals
    public static void displayResults(double[][] result) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Emp\tOld Salary\tBonus\t\tNew Salary");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", (i+1), result[i][0], result[i][1], result[i][2]);
            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Total\t%.2f\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);
    }
}
