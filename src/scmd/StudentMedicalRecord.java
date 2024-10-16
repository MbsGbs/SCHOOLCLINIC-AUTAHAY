
package scmd;

public class StudentMedicalRecord {
    private String firstName;
    private String lastName;
    private String email;
    private String status;
    private String diagnosis;
    private String treatment;
    private String medication;
    private String dosage;
    private String healthcareProvider;

    // Constructor to initialize medical records
    public StudentMedicalRecord(String firstName, String lastName, String email, String status,
                                String diagnosis, String treatment, String medication, String dosage, String provider) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medication = medication;
        this.dosage = dosage;
        this.healthcareProvider = provider;
    }

    // Getters for each property
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getStatus() { return status; }
    public String getDiagnosis() { return diagnosis; }
    public String getTreatment() { return treatment; }
    public String getMedication() { return medication; }
    public String getDosage() { return dosage; }
    public String getHealthcareProvider() { return healthcareProvider; }
}
