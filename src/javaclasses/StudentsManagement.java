package javaclasses;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class StudentsManagement {
    static ArrayList<Student> studentList = StudentList.addStudents();
    private static java.util.Comparator<? super Student> Comparator;

    public static void main(String[] args) throws ParseException {
        printStudentsFromFaculty("Economics");
        printStudentsForEachFacultyAndCourse();
        printStudentsAfterAGivenYear(1996);
        printStudentsFromAGivenGroup("Group 55BB");
    }

    public static void printStudentsFromFaculty(String faculty) {
        System.out.println("List of the " + faculty + " faculty:");
        for (Student s : studentList) {
            if (s.getFaculty().equals(faculty)) {
                System.out.println(s.toString());
            }
        }
    }

    public static void printStudentsForEachFacultyAndCourse() {
        System.out.println("\nSorted by courses and faculties:");
        List<Student> sortedListByCourse = studentList.stream().sorted(java.util.Comparator.comparingInt(Student::getCourse)).collect(Collectors.toList());
        List<Student> sortedListByFaculty = sortedListByCourse.stream().sorted(java.util.Comparator.comparing(Student::getFaculty)).collect(Collectors.toList());
        sortedListByFaculty.forEach(System.out::println);
    }

    public static void printStudentsAfterAGivenYear(int year) throws ParseException {
        System.out.println("\nStudents that were born after " + year);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (Student s : studentList) {
            if (s.getDateOfBirth() != null) {
                LocalDate date = LocalDate.parse(s.getDateOfBirth(), formatter);
                if (date.getYear() > year) {
                    System.out.println(s.toString());
                }
            }
        }
    }

    public static void printStudentsFromAGivenGroup(String group) {
        System.out.println("\nStudents from " + group + " group: ");
        List<Student> students = studentList.stream()
                .filter((s) -> group.equals(s.getGroup()))
                .collect(Collectors.toList());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
