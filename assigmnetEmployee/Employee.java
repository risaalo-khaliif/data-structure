public class Employee {

        protected String employeeId;
        protected String name;
        protected String department;
        protected double basicSalary;

        public Employee(String employeeId, String name, String department, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.basicSalary = basicSalary;
        }

        public double calculateSalary() {
            return basicSalary;
        }

        public void displayInfo() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
        }
    }


    class FullTimeEmployee extends Employee {
        private double allowance;

        public FullTimeEmployee(String employeeId, String name, String department,
                                double basicSalary, double allowance) {
            super(employeeId, name, department, basicSalary);
            this.allowance = allowance;
        }

        @Override
        public double calculateSalary() {
            return basicSalary + allowance;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Category: Full-Time Employee");
            System.out.printf("Monthly Salary: $%.2f%n%n", calculateSalary());
        }
    }


    class PartTimeEmployee extends Employee {
        private int hoursWorked;
        private double hourlyRate;

        public PartTimeEmployee(String employeeId, String name, String department,
                                int hoursWorked, double hourlyRate) {
            super(employeeId, name, department, 0);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Category: Part-Time Employee");
            System.out.printf("Monthly Salary: $%.2f%n%n", calculateSalary());
        }
    }


    class Manager extends Employee {
        private double bonus;

        public Manager(String employeeId, String name, String department,
                       double basicSalary, double bonus) {
            super(employeeId, name, department, basicSalary);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return basicSalary + bonus;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Category: Manager");
            System.out.printf("Monthly Salary: $%.2f%n%n", calculateSalary());
        }
    }

