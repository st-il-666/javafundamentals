package javaclasses;

import java.math.BigInteger;

public class Student {
    private int id, course;
    private BigInteger phoneNumber;
    private String name, surname, middleName, address, faculty, group, dateOfBirth;

    Student(int id, BigInteger phoneNumber, int course, String name, String surname, String middleName, String address, String faculty, String group, String dateOfBirth) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.faculty = faculty;
        this.group = group;
        this.dateOfBirth = dateOfBirth;
    }

    Student(int id, String name, String surname, String middleName, String faculty) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.faculty = faculty;
    }

    Student(int id, int course, String name, String surname, String middleName, String faculty) {
        this.id = id;
        this.course = course;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.faculty = faculty;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigInteger getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", course=" + course +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'';
    }

}
