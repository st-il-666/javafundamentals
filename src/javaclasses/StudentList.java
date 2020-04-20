package javaclasses;

import java.math.BigInteger;
import java.util.ArrayList;

public class StudentList {

    public static ArrayList<Student> addStudents(){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, BigInteger.valueOf(296576454), 2, "Misha", "Jankovskij", "Sergeevich", "Minsk, Kazimirova 44-220", "Economics", "Group 20BB", "1995-09-21"));
        studentList.add(new Student(2, BigInteger.valueOf(295467364), 3, "Masha", "Pashkovskaya", "Dmitrievna", "Minsk, Kokovich 22-20", "Economics", "Group 10BB", "1995-08-19"));
        studentList.add(new Student(3, BigInteger.valueOf(446578756), 4, "Kostya", "Gavrilov", "Sergeevich", "Minsk, Rainisa 32-2100", "Law", "Group 33BB", "1994-07-15"));
        studentList.add(new Student(4, BigInteger.valueOf(445635647), 2, "Nastassia", "Murkina", "Vasilievna", "Minsk, Vaneeva 9-27", "Economics", "Group 55BB", "1998-06-14"));
        studentList.add(new Student(5, BigInteger.valueOf(449585759), 3, "Vanya", "Jyrnii", "Mihailovich", "Minsk, Partizanskaya 32-87", "Law", "Group 55BB", "1999-06-13"));
        studentList.add(new Student(6, BigInteger.valueOf(295674839), 4, "Vlad", "Krasivii", "Antonovich", "Minsk, Skriganova 2-112", "Law", "Group 77BB", "1995-05-21"));
        studentList.add(new Student(7, BigInteger.valueOf(295658392), 3, "Dima", "Nonich", "Sergeevich", "Minsk, Syrganova 4-2", "Law", "Group 55BB", "1996-04-21"));
        studentList.add(new Student(8, BigInteger.valueOf(290384755), 2, "Darina", "Novichok", "Dmitrievna", "Minsk, Pushkina 5-240", "Economics", "Group 54BB", "1997-03-30"));
        studentList.add(new Student(9, BigInteger.valueOf(445678903), 3, "Alesya", "Alekseeva", "Andreevna", "Minsk, Nemiga 55-1", "Economics", "Group 56BB", "1995-02-23"));
        studentList.add(new Student(10, BigInteger.valueOf(441234567), 2, "Pavel", "Daushko", "Vjacheslavovich", "Minsk, Pobediteley 33-1", "Law", "Group 20BB", "1998-01-12"));
        studentList.add(new Student(11,  "Sergei", "Daushko", "Vjacheslavovich", "Economics"));
        studentList.add(new Student(12, 2, "Vlad", "Morgan", "Ivanovich", "Law"));
        return studentList;
    }
}
