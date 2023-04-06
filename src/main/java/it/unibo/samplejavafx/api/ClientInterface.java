package it.unibo.samplejavafx.api;

public interface ClientInterface {
    int getId();
    String getName();
    String getSurname();
    String getEmail();

    void setName(String name);
    void setSurname(String surname);
    void setEmail(String email);

    void deleteClient();
}
