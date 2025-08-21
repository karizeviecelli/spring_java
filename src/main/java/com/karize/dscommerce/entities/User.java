package com.karize.dscommerce.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;

    private String phone;
    private LocalDate birthDate;
    private String password;

    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>();

       public User(){
           
       }
       public User(String name, String email, String phone, LocalDate birthDate, String password) {
           this.name = name;
           this.email = email;
           this.phone = phone;
       }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
           this.email = email;

    }

    public String getName() {
            return name;
    }
    public void setName(String name) {
           this.name = name;
    }
    public String getPassword() {
           return password;
    }
    public void setPassword(String password) {
           this.password = password;
    }

    public String getPhone() {
           return phone;
    }
    public void setPhone(String phone) {
           this.phone = phone;
    }
    public LocalDate getBirthDate() {
           return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
           this.birthDate = birthDate;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
           return super.equals(obj);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDate=" + birthDate +
                ", password='" + password + '\'' +
                '}';
    }

    public List<Order> getOrders() {
        return orders;
    }
}
