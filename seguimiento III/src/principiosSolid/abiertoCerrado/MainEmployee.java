package principiosSolid.abiertoCerrado;

public class MainEmployee {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 3000);
        Employee partTime = new PartTimeEmployee("Bob", 20, 120);

        System.out.println(fullTime.name + "'s Salary: $" + fullTime.calculateSalary());
        System.out.println(partTime.name + "'s Salary: $" + partTime.calculateSalary());
    }
}
