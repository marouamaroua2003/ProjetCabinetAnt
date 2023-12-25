/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor.Service;

import Doctor.DatabaseConnection;
import Doctor.Entity.Patients;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class GestionPatient {

    public GestionPatient() {
    }
    
    /**
     *
     * @return
     */
  public List<Patients> getAllPatients() {
        List<Patients> patientsList = new ArrayList<>();
        DatabaseConnection db = new DatabaseConnection();

        try (Connection connection = db.getConnection();
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM patients";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Patients patient = new Patients(
                        resultSet.getInt("patientID"),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getDate("dateOfBirth"),
                        resultSet.getString("gender"),
                        resultSet.getString("phoneNumber"),
                        resultSet.getString("email"),
                        resultSet.getString("medicalHistory"),
                        resultSet.getString("diagnosisDetails"),
                        resultSet.getString("prescriptionDetails")
                );
                patientsList.add(patient);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des patients : " + e.getMessage());
        }

        return patientsList;
    }
}
