package com.example.myfx;

import java.io.*;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class filehandlingpractice {
    public static void main(String[] args) {
        Student s = new Student(91, "danial", 3.7);

        filewrite();
        read();
        try {
            FileOutputStream obj = new FileOutputStream("C:/Users/wajid/Desktop/obj.txt");
            ObjectOutputStream writer = new ObjectOutputStream(obj);

            writer.writeObject(s);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Student st;
        try {
            FileInputStream inobj = new FileInputStream("C:/Users/wajid/Desktop/obj.txt");
            ObjectInputStream inobj1 = new ObjectInputStream(inobj);
            st = (Student) inobj1.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (st != null) {
            System.out.println("Student ID: " + st.getId());
            System.out.println("Student Name: " + st.getName());

        } else {
            System.out.println("Failed to read the student object from the file.");
        }

    }





    public  static void read(){
        try {
            Scanner reader= new Scanner(Paths.get("C:/Users/wajid/Desktop/file.txt"));
            while (reader.hasNext()) {
                String firstname = reader.next();
                String Lastname = reader.next();
                String petname = reader.next();
                System.out.println(firstname);
                System.out.println(Lastname);
                System.out.println(petname);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static void filewrite(){
        try {
            Formatter writer = new Formatter("C:/Users/wajid/Desktop/file.txt");
            writer.format("%s %s %s \n","danial","wajid","meow");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        }
}
