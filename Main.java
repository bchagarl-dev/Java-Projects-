import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filename = "grades.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line; List<Double> grades = new ArrayList<>();
            while ((line = br.readLine()) != null) { grades.add(Double.parseDouble(line)); }
            double avg = grades.stream().mapToDouble(d -> d).average().orElse(0);
            double max = grades.stream().mapToDouble(d -> d).max().orElse(0);
            double min = grades.stream().mapToDouble(d -> d).min().orElse(0);
            System.out.println("Average: " + avg + ", Max: " + max + ", Min: " + min);
        } catch (IOException e) { e.printStackTrace(); }
    }
}
