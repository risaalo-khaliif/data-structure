public class mainEmployee {


        static void main() {
            Employee[] employees = {
                    new FullTimeEmployee("Emp001", "Ahmed Ali", "IT", 600, 50),
                    new PartTimeEmployee("Emp002", "risaalo khaliif", "Finance",
                            400.0, 20, 12),
                    new Manager("Emp003", " aisho ",
                            "HR", 900.0, 300)};

            System.out.println("----- Employee Salary Report -----");
            for (Employee x : employees) {
                x.display();
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println();
            }

        }
    }
