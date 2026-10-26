package assigments;

public class main {
    public class HospitalBillingSystem {
        public static void main(String[] args) {

            MedicalService consultation =
                    new Consultation("S001", 15, 10);

            MedicalService labTest =
                    new LaboratoryTest("S002", 10, 8);

            MedicalService ultrasound =
                    new Ultrasound("S003", 30, 10);

            MedicalService[] services = {
                    consultation,
                    labTest,
                    ultrasound
            };

            double totalBill = 0;

            System.out.println("===== HOSPITAL BILLING SYSTEM =====\n");

            for (MedicalService service : services) {
                service.displayServiceInfo();
                totalBill += service.calculateTotalCost();
            }

            System.out.println("------------------------------");
            System.out.printf("Total Hospital Bill: $%.2f%n", totalBill);
        }
    }
}


