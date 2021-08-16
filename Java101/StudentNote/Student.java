package com.studentMarkAutomation;

public class Student {

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int courseAverage;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public double calculateACourseAverage(int note, int verbalNote){


        double average = (note * 0.20) + (verbalNote * 0.80);

        return average;
    }

    public void addBulkExamNote(int matNote, int matVerbalNote, int fizikNote, int fizikVerbalNote, int kimyaNote, int kimyaVerbalNote) {

        if ((matNote >= 0 && matNote <= 100) && (matVerbalNote >= 0 && matVerbalNote <= 100)) {
            this.mat.note = matNote;
            this.mat.verbalNote = matVerbalNote;
        }

        if ((fizikNote >= 0 && fizikNote <= 100) && (fizikVerbalNote >= 0 && fizikVerbalNote <= 100)) {
            this.fizik.note = fizikNote;
            this.fizik.verbalNote = fizikVerbalNote;
        }

        if ((kimyaNote >= 0 && kimyaNote <= 100) && (kimyaVerbalNote >= 0 && kimyaVerbalNote <= 100)) {
            this.kimya.note = kimyaNote;
            this.kimya.verbalNote = kimyaVerbalNote;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (calculateACourseAverage(this.fizik.note, this.fizik.verbalNote)
                        + calculateACourseAverage(this.kimya.note, this.kimya.verbalNote)
                        + calculateACourseAverage(this.mat.note, this.mat.verbalNote)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
