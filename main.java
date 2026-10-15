package hospital;

public class main {
    public static void main(String[] args) {


        Outpatient op = new Outpatient("risaalo", 20, 30);

        System.out.println("===== OUTPATIENT =====");
        op.Display();

        System.out.println();


        Inpatient ip = new Inpatient("khaliif=", 20, 50, 5);

        System.out.println("===== INPATIENT =====");

    }
}

