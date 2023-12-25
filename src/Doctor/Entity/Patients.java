/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "patients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patients.findAll", query = "SELECT p FROM Patients p"),
    @NamedQuery(name = "Patients.findByPatientID", query = "SELECT p FROM Patients p WHERE p.patientID = :patientID"),
    @NamedQuery(name = "Patients.findByFirstName", query = "SELECT p FROM Patients p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Patients.findByLastName", query = "SELECT p FROM Patients p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Patients.findByDateOfBirth", query = "SELECT p FROM Patients p WHERE p.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "Patients.findByGender", query = "SELECT p FROM Patients p WHERE p.gender = :gender"),
    @NamedQuery(name = "Patients.findByPhoneNumber", query = "SELECT p FROM Patients p WHERE p.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Patients.findByEmail", query = "SELECT p FROM Patients p WHERE p.email = :email")})
public class Patients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PatientID")
    private Integer patientID;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "DateOfBirth")
    private Date dateOfBirth;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "Email")
    private String email;
    @Column(name = "MedicalHistory")
    private String medicalHistory;
    @Column(name = "DiagnosisDetails")
    private String diagnosisDetails;
    @Column(name = "PrescriptionDetails")
    private String prescriptionDetails;

    public Patients() {
    }

    public Patients(Integer patientID) {
        this.patientID = patientID;
    }

    public Patients(Integer patientID, String firstName, String lastName, Date dateOfBirth, String gender, String phoneNumber, String email, String medicalHistory, String diagnosisDetails, String prescriptionDetails) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.medicalHistory = medicalHistory;
        this.diagnosisDetails = diagnosisDetails;
        this.prescriptionDetails = prescriptionDetails;
    }

    public Patients(int aInt, String string, String string0, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getDiagnosisDetails() {
        return diagnosisDetails;
    }

    public void setDiagnosisDetails(String diagnosisDetails) {
        this.diagnosisDetails = diagnosisDetails;
    }

    public String getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(String prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientID != null ? patientID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patients)) {
            return false;
        }
        Patients other = (Patients) object;
        if ((this.patientID == null && other.patientID != null) || (this.patientID != null && !this.patientID.equals(other.patientID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doctor.Patients[ patientID=" + patientID + " ]";
    }
    
    
}
