package it.unibo.samplejavafx.db;

//import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.*;

public class ConnectionDb {
    // Definisci i parametri di connessione al tuo database di Azure SQL
    final static String connectionUrl = "jdbc:sqlserver://servercinema.database.windows.net:1433;database=DbCinema;user=pippo@servercinema;password=Alvaro1!;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

    public static void main(String[] args) {
        // Crea la connessione al database di Azure SQL
        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            System.out.println("Connessione al database di Azure SQL Server riuscita.");

            // Crea lo statement per eseguire la query sul database
            try (Statement statement = connection.createStatement()) {
                String query = "";

                // Esegui la query e gestisci il risultato
                try (ResultSet resultSet = statement.executeQuery(query)) {
                    while (resultSet.next()) {
                        System.out.println("Prova riuscita: " + resultSet);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Errore durante la connessione al database di Azure SQL Server.");
            e.printStackTrace();
        }
    }
}
