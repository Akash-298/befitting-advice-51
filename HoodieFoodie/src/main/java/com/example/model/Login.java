package com.example.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Login {
    @Id
    @GeneratedValue(generator = "UUID",strategy = GenerationType.IDENTITY)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private String userid;
    private String userName;
    private String password;

//    public Login() {
//    }
//
//    public Login(String userid, String userName, String password) {
//        this.userid = userid;
//        this.userName = userName;
//        this.password = password;
//    }
//
//    public String getUserid() {
//        return userid;
//    }
//
//    public void setUserid(String userid) {
//        this.userid = userid;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "Login{" +
//                "userid='" + userid + '\'' +
//                ", userName='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
