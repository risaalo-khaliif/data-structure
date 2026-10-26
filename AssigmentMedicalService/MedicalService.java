package assigments;

public abstract class MedicalService {

        protected String serviceId;
        protected String serviceName;
        protected double baseCost;

        public MedicalService(String serviceId, String serviceName, double baseCost) {
            this.serviceId = serviceId;
            this.serviceName = serviceName;
            this.baseCost = baseCost;
        }

        // Abstract Method
        public abstract double calculateTotalCost();

        // Concrete Method
        public void displayServiceInfo() {
            System.out.println("Service ID: " + serviceId);
            System.out.println("Service: " + serviceName);
            System.out.printf("Total Cost: $%.2f%n%n", calculateTotalCost());
        }
    }

    // Consultation Class
    class Consultation extends MedicalService {
        private double doctorFee;

        public Consultation(String serviceId, double baseCost, double doctorFee) {
            super(serviceId, "Consultation", baseCost);
            this.doctorFee = doctorFee;
        }

        @Override
        public double calculateTotalCost() {
            return baseCost + doctorFee;
        }
    }

    // Laboratory Test Class
    class LaboratoryTest extends MedicalService {
        private double testCharge;

        public LaboratoryTest(String serviceId, double baseCost, double testCharge) {
            super(serviceId, "Laboratory Test", baseCost);
            this.testCharge = testCharge;
        }

        @Override
        public double calculateTotalCost() {
            return baseCost + testCharge;
        }
    }

    // Ultrasound Class
    class Ultrasound extends MedicalService {
        private double additionalFee;

        public Ultrasound(String serviceId, double baseCost, double additionalFee) {
            super(serviceId, "Ultrasound", baseCost);
            this.additionalFee = additionalFee;
        }

        @Override
        public double calculateTotalCost() {
            return baseCost + additionalFee;
        }
    }

