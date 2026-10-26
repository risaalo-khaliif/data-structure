Questions and Answers
1. Identify the superclass and subclasses.
Superclass: Employee
Subclasses: FullTimeEmployee, PartTimeEmployee, and Manager
2. Explain how inheritance reduces code duplication.

Inheritance allows subclasses to reuse common attributes and methods from the parent class (Employee). Instead of rewriting employee ID, name, department, and salary-related code in every class, these members are defined once in the superclass and inherited by all subclasses.

3. Identify the method that demonstrates polymorphism.

The method calculateSalary() demonstrates polymorphism because each subclass provides its own implementation of the method, but it is called using an Employee reference.

4. Explain why @Override is used.

@Override tells the compiler that a method is intended to replace a method from the parent class. It helps detect errors if the method name or parameters do not match the superclass method.