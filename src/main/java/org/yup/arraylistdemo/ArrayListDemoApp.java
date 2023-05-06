package org.yup.arraylistdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListDemoApp {

    public static void main(String[] args){

        try {
            FileReader fileOnComputer = new FileReader("employees.csv");
            BufferedReader readTheLines = new BufferedReader(fileOnComputer);

            readTheLines.readLine();

            ArrayList<String> studentNames = new ArrayList<>();

            String theLine;
//list before we add
            System.out.println(studentNames);
            while ((theLine = readTheLines.readLine()) !=null){
                //splitting theLine we ready file into pieces that represent
                //the employee
                String[] emData = theLine.split("\\|");

                studentNames.add(emData[1]);

            }
//list after we add things
            System.out.println(studentNames);
            studentNames.remove(6);
            System.out.println(studentNames);
            studentNames.remove(5);
            System.out.println(studentNames);
            //to change names on the list, first the position then to what
            studentNames.set(0, "Eric Schwartz");
            System.out.println(studentNames);
            //to remove all the names on the list
            studentNames.clear();
            System.out.println(studentNames);

        }catch (IOException e){
            System.out.println("not found");
        }

    }
}
