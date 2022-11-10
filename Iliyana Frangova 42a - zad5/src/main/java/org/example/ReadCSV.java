package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {
    public static void main(String[] args) throws Exception
    {
//parsing a CSV file into Scanner class constructor
//        Scanner sc = new Scanner(new File("src/main/resources/nzbrat.csv"));
//        sc.useDelimiter(",");   //sets the delimiter pattern
//        while (sc.hasNext())  //returns a boolean value
//        {
//            System.out.print(sc.next());  //find and returns the next complete token from this scanner
//        }
//        sc.close();  //closes the scanner
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("src/main/resources/nzbrat.csv"))) {

            // CSV file delimiter
            String DELIMITER = ",";

            // read the file line by line
            String line;
            while ((line = br.readLine()) != null) {

                // convert line into columns
                String[] columns = line.split(DELIMITER);
                String name = columns[0];
                int age = Integer.parseInt(columns[1]);
                String city = columns[2];
                Person currentPerson = new Person(name, age, city);
                people.add(currentPerson);

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (Person p : people) {
            p.Print();
        }
    }
}
