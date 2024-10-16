import java.sql.Timestamp;
import java.util.Scanner;

public class SCMD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        config conf = new config();

        System.out.print("Student First Name: ");
        String fname = sc.next();
        System.out.print("Student Last Name: ");
        String lname = sc.next();
        System.out.print("Student Email: ");
        String email = sc.next();
        System.out.print("Student Status (e.g., enrolled, graduated): ");
        String status = sc.next();
        System.out.print("Diagnosis: ");
        String diagnosis = sc.next();
        System.out.print("Treatment: ");
        String treatment = sc.next();
        System.out.print("Medication: ");
        String medication = sc.next();
        System.out.print("Dosage: ");
        String dosage = sc.next();
        System.out.print("Healthcare Provider Name: ");
        String provider = sc.next();

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        String sql = "INSERT INTO StudentMedicalRecords (firstName, lastName, email, status, diagnosis, treatment, medication, dosage, provider, timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        conf.addRecord(sql, fname, lname, email, status, diagnosis, treatment, medication, dosage, provider, timestamp);
    }
}
