package com.sda.bobb.advanced;

import com.sda.bobb.advanced.recap.*;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class MavenMain {

    public static void main(String[] args) {

        String name = "  ";

        System.out.println(name.isEmpty());

        boolean isBlank = StringUtils.isBlank(name);
        System.out.println(isBlank);

        Person firstPerson = new Person("David", 23, Gender.MALE);
        System.out.println(firstPerson);

        Person secondPerson = new Person();

        secondPerson.setAge(23);
        secondPerson.setName("David");
        secondPerson.setGender(Gender.MALE);
        System.out.println(secondPerson);

        // == numai la primitive, nu si la obiecte
        // la obiecte .equals

        if (firstPerson.equals(secondPerson)) {
            System.out.println("\n" + "Are equal");
        } else {
            System.out.println("\n" + "Not equal");
        }

        Professor firstProfessor = new Professor("Andrew", 28, Gender.MALE, "Science", 0);

        List<Integer> firstStudentGrades = new ArrayList<>();

        firstStudentGrades.add(7);
        firstStudentGrades.add(8);
        firstStudentGrades.add(9);

        Student firstStudent = new Student("Damon", 21, Gender.MALE, firstStudentGrades);

        System.out.println(firstStudent);

        Director firstDirector = new Director("Popescu", 45, Gender.MALE, "Social Sciences", 0);

        firstProfessor.pay(3000.99);
        firstDirector.pay(4500.45);

        System.out.println(firstProfessor);
        System.out.println(firstDirector);

        Professor secondProfessor = new Professor("Ionescu", 45, Gender.MALE, "Music", 4050);
        Professor thirdProfessor = new Professor("Grigorescu", 40, Gender.FEMALE, "Math", 4500);
        Professor fourthProfessor = new Professor("Traian", 35, Gender.MALE, "History", 5300);

        List<Professor> professorList = new ArrayList<>();

        professorList.add(secondProfessor);
        professorList.add(thirdProfessor);
        professorList.add(fourthProfessor);

        System.out.println(professorList.get(professorList.size() - 1));

        Set<Professor> professorSet = new HashSet<>();

        professorSet.addAll(professorList);


        System.out.println("\n" + professorSet + "\n");

        Map<String, Professor> professorMap = new HashMap<>();

        professorMap.put("Tasnad", secondProfessor);
        professorMap.put("Cluj-Napoca", thirdProfessor);
        professorMap.put("Bucuresti", fourthProfessor);
        professorMap.put("Bucuresti", firstProfessor);

        for (Map.Entry<String, Professor> entry: professorMap.entrySet()) {
            System.out.println("\n" + entry.getKey());
            System.out.println("\n" + entry.getValue());
        }

//        System.out.println(professorMap);

    }
}
