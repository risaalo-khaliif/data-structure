# data structure
risaalo khaliif elmi c1240130

Description: Hospital Package Using Inheritance

This project is a Hospital Package system developed using Object-Oriented Programming (OOP) and Inheritance. It contains three classes: Patient, Outpatient, and Inpatient.

1. Patient Class

The Patient class is the superclass. It contains two protected variables: name and consultFee. The constructor initializes the patient’s name and consultation fee. The other two classes inherit these properties from the Patient class.

2. Outpatient Class

The Outpatient class is a subclass of Patient. It represents patients who visit the hospital for treatment without staying overnight. It has an additional variable called labCharge. The CalculateBill() method calculates the total bill by adding the consultation fee and laboratory charge. The Display() method displays the patient’s information and total bill.

3. Inpatient Class

The Inpatient class is another subclass of Patient. It represents patients who stay in the hospital for treatment. It contains two additional variables: roomCharge and numberOfDays. The CalculateBill() method calculates the total bill by multiplying the room charge by the number of days and adding the consultation fee. The Display() method displays the patient’s information, room charge, number of days, and total bill.

4. Main Method

The Main method creates objects for both Outpatient and Inpatient. It provides sample patient information, including names and charges, and calls the Display() method to show their details and total bills.
