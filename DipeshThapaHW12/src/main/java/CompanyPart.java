import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dipesh Thapa  
 * CSCI 295
 * HW 12 - Part Number Comparator
 * 
 */

 // PartNumber Comparator Tester 

public class CompanyPart {

    public static void main(String[] args) throws IOException {

        Scanner inFile = new Scanner(new File("partNumbers.txt"));
        ArrayList<String> parts = new ArrayList<>();

        while (inFile.hasNext()) {

            String part = inFile.next();
            parts.add(part);
        }

        inFile.close();

        parts.sort(new PartNumberComparator());
       
        parts.forEach((sortpart) -> {
            System.out.println(sortpart);
        });

    }

}
