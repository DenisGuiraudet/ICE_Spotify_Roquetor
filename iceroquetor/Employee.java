package com.springangular4.model;
import java.io.Serializable;
public class Employee implements Serializable {
private static final long serialVersionUID = -8809089768201955649L;
private Long id;
private String firstName;
private Long phoneNo;
private String email;
public Employee(){}
public Employee(Long id, String firstName, Long phoneNo, String email) {
super();
this.id = id;
this.firstName = firstName;
this.phoneNo = phoneNo;
this.email = email;
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public Long getPhoneNo() {
return phoneNo;
}
public void setPhoneNo(Long phoneNo) {
this.phoneNo = phoneNo;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
}