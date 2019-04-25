package ai171.kurlik.kurswork.Entitys;

import ai171.kurlik.kurswork.Entitys.enums.UserRole;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "iduser")
    private Integer iduser;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "lastName")
    @NonNull
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "birthDate")
    @NonNull
    private Timestamp birthDate;

    @Column(name = "telephoneNumber")
    @NonNull
    private String telephoneNumber;

    @Column(name = "email")
    @NonNull
    private String email;

    @Column(name = "login")
    @NonNull
    private String login;

    @Column(name = "password")
    @NonNull
    private String password;

    @Column(name = "role")
    @NonNull
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = "department")
    private String department;

    @Column(name = "adress")
    private String adress;

    @Column(name = "active")
    private boolean active;




    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isActive() { return active; }

    public void setActive(boolean active) { this.active = active; }
}
