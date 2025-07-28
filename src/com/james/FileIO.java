package com.james;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        try {
            File textFile = new File("/home/james/Desktop/test_file.txt");
            if(textFile.createNewFile()) {
                System.out.println("File created " + textFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("/home/james/Desktop/test_file.txt");
            fileWriter.write("Founded in 2016, Kimangu Day Secondary School began its journey from modest origins, starting with just 33 students and 4 dedicated teachers. Since then, it has steadily grown to become one of the most respected and high-performing academic institutions in Rongai Sub County, Nakuru.\n" +
                    "\n" +
                    "The school was established with a clear and compelling vision: to offer quality education to the youth of Rongai and its neighboring communities, equipping them with the knowledge, skills, and values needed to become responsible citizens and capable future leaders of our country.\n" +
                    "\n" +
                    "Throughout the years, Kimangu Day has consistently upheld strong academic standards, while placing equal emphasis on the holistic development of each learner. We are deeply committed to fostering character, encouraging leadership potential, and nurturing the unique talents of our students. Today, we are proud to serve a vibrant student body of over 500 learners, guided every day by our core values of excellence, integrity, and responsibility, which remain at the heart of everything we do.");
            fileWriter.close();
            System.out.println("Successfully written to file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        try {
            File textFile = new File("/home/james/Desktop/test_file.txt");
            Scanner scanner = new Scanner(textFile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        File myObj = new File("/home/james/Desktop/test_file.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }
}
