package com.example;

import java.util.ArrayList;
import java.util.List;

class Resume {
    String name;
    String email;
    String skills;

    public Resume(String name, String email, String skills) {
        this.name = name;
        this.email = email;
        this.skills = skills;
    }

    public String display() {
        return "Name: " + name + ", Email: " + email + ", Skills: " + skills;
    }
}

public class App {
    private static List<Resume> resumes = new ArrayList<>();

    public static void addResume(String name, String email, String skills) {
        resumes.add(new Resume(name, email, skills));
    }

    public static List<Resume> getResumes() {
        return resumes;
    }

    public static void main(String[] args) {
        addResume("Dhanush", "dhanush@gmail.com", "Java, Maven, Jenkins");
        addResume("Kumar", "kumar@gmail.com", "Python, DevOps");

        for (Resume r : resumes) {
            System.out.println(r.display());
        }
    }
}
