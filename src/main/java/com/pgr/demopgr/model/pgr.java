package com.pgr.demopgr.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class pgr {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    private String phone;

    @NotBlank(message = "Grievance cannot be blank")
    private String grievance;

    @NotNull(message = "Date of submission cannot be null")
    private LocalDate dateofsubmission;

    // Constructor with parameters
    public pgr(String name, String address, String phone, String grievance, LocalDate dateofsubmission) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.grievance = grievance;
        this.dateofsubmission = dateofsubmission;
    }

    // Default constructor
    public pgr() {
    }

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGrievance() {
        return grievance;
    }

    public void setGrievance(String grievance) {
        this.grievance = grievance;
    }

    public LocalDate getDateofsubmission() {
        return dateofsubmission;
    }

    public void setDateofsubmission(LocalDate dateofsubmission) {
        this.dateofsubmission = dateofsubmission;
    }

    @AssertTrue(message = "Date of submission must be today's date")
    public boolean isDateOfSubmissionToday() {
        return dateofsubmission != null && dateofsubmission.equals(LocalDate.now());
    }
    
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private int id;

    // @NotBlank(message = "Name cannot be empty")
    // private String name;

    // @NotBlank(message = "Address cannot be empty")
    // private String address;

    // @Pattern(regexp = "^[0-9]{10}$", message = "Phone number is invalid. It must be exactly 10 digits.")
    // private String phone;
    // @NotBlank(message = "Grievance cannot be blank")
    // private String grievance;
    // // @Past(message = "Date of Birth should be a past date")
    // // private LocalDate dateOfBirth;
    // // @NotBlank(message = "Date of Birth cannot be empty")
    // // private LocalDate dateOfBirth;
    // // @Past(message = "Date of S should be a past date")
    // @NotNull(message = "Date of submission cannot be null")
    // private LocalDate dateofsubmission;
    // // Getters and Setters

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getAddress() {
    //     return address;
    // }

    // public void setAddress(String address) {
    //     this.address = address;
    // }
   
    // public String getPhone() {
    //     return phone;
    // }

    // public void setPhone(String phone) {
    //     this.phone = phone;
    // }
    // public pgr(String grievance) {
    //     this.grievance = grievance;
    // }

    // // Getter and Setter for grievance
    // public String getGrievance() {
    //     return grievance;
    // }

    // public void setGrievance(String grievance) {
    //     this.grievance = grievance;
    // }
    
    // public LocalDate getdateofsubmission() {
    //     return dateofsubmission;
    // }

    // public void setdateofsubmission(LocalDate dateofsubmission) {
    //     this.dateofsubmission = dateofsubmission;
    // } 
}
