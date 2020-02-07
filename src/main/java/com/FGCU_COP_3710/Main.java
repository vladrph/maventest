package com.FGCU_COP_3710;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException, CsvValidationException {
    try {
      String path = "SEOExample";
      // Scanner reader = new Scanner("SEOExample.csv");

      CSVReader temp = new CSVReader(new FileReader("SEOExample"));

      String[] SEOExample;  // Creates ann array of values
      while ((SEOExample = temp.readNext()) != null) {

        System.out.println(
            SEOExample[0] + " " + SEOExample[1] + " " + SEOExample[2] + " " + SEOExample[3] + " "
                + SEOExample[4]
                + " " + SEOExample[5] + " " + SEOExample[6] + " " + SEOExample[7] + " "
                + SEOExample[8] + " " + SEOExample[9]);

        System.out.println(
            "--------------------------------------------------------------------------------------");
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
