package it.unibo.cinema.api;

public interface Client {
    int getId();
    String getName();
    String getSurname();
    String getEmail();

    void setId(int id);
    void setName(String name);
    void setSurname(String surname);
    void setEmail(String email);

    void deleteClient(int id);
}
