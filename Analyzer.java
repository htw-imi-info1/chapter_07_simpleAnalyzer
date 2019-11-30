import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.IntStream;
/**
 * Analyzer analyzes website traffic data.
 *
 * @author Linda
 * @version 20191123
 */
public class Analyzer
{
    ArrayList<Visit> visits;
    
    /**
     * Constructor for objects of class Analyzer
     */
    public Analyzer()
    {
        visits = new ArrayList<>();
    }

    /*
     * The following method simulates fetching data by creating some random test
     * Visits that can be analyzed
     */
    public void fetchData() {
        int year = 2019;
        int month = 11;
        int day;
        int hour;
        Random random = new Random();
        for(int i = 0; i < 1000; i++) {
            hour = random.nextInt(24);
            day = random.nextInt(30) + 1;
            String date = day + "/" + month + "/" + year;
            visits.add(new Visit(date, hour));
        }
    }
    
    /*
     * The following method prints the logged visits
     */
    public void printAll() {
        for(Visit visit: visits) {
            System.out.println(visit.getDate() + " " + visit.getHour());
        }
    }
    
    /*
     * The following method calls a method to analyze logged visits
     * and then calls a method to print the results.
     */
    public void analyze(String date) {
        int[] counts = getHourlyCounts(date);
        printArray(counts);
        //printArrayWithIndex(counts);
    }
    
        /*
     * The following method gets the amount of visits per hour 
     * for a specific day
     */
    public int[] getHourlyCounts(String date) {
        // CREATING AN ARRAY
        // declaration: type[] name
        // creation: name = new type[size]
        int[] hourlyCounts = new int[24];
        
        // What is the highest index in the array created above?
        
        // What is the current value of the 0th element of said array?
        
        // If we created the following array: 
        // String[] array = new String[10]; 
        // what would the current value of the 0th element be?
        
        // I could also declare an array like so:
        // int[] array = { 0, 0, 0, and so on }
        // or like so:
        // int[] array;
        // array = new int[] { 0, 0, 0, and so on} 
        
        // when testing a method in BlueJ and needing to enter 
        // an array parameter, you would enter
        // new int[] {your elements, ...}
        
        visits.stream()
        .filter(visit -> visit.getDate().equals(date))
        .forEach(visit -> {
            // FILLING AN ARRAY
            // name[index] = newValue;
            int hour = visit.getHour();
            hourlyCounts[hour]++;
        });
    
        return hourlyCounts;
    }
    
    /*
     * The following method prints the elements of an array
     */
    public void printArray(int[] array) {
        // ITERATING THROUGH ARRAYS - For Each loop
        for(int number: array) {
            System.out.println(number);
        }
    }
    
    /*
     * The following method prints elements of an array with 
     * their indices
     */
    public void printArrayWithIndex(int[] array) {
        // ITERATING THROUGH ARRAYS - For loop
        // Getting the length of an array: name.length
        // Can the length ever change?
        for(int index = 0; index < array.length; index++) {
            // READING AN ARRAY
            // name[index]
            System.out.println(index + " ___ " + array[index]);
        }
    }
}
