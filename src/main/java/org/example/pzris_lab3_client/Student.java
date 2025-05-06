package org.example.pzris_lab3_client;

import lombok.*;

import lombok.Data;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer studentGroup;
    private String paidForm;

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public Integer getStudentGroup() { return studentGroup; }
    public String getPaidForm() { return paidForm; }
    
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setStudentGroup(Integer studentGroup) { this.studentGroup = studentGroup; }
    public void setPaidForm(String paidForm) { this.paidForm = paidForm; }
}


