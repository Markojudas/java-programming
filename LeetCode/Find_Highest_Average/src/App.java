import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {

    /*
     * Find the student with the highest score average:
     * 
     * example 1)
     * records = ["John: 5", "Michael: 4", "Ruby: 2", "Ruby: 5", "Michael: 5"]
     * Answer: "John"
     * Reason:
     * John's average: 5
     * Michael's average: (4+5)/ 2 = 4.5
     * Ruby's average: 2 / 2 = 1
     * 
     * 
     * records = ["Kate: 5", "Kate: 5", "Maria: 2", "John: 5", "Michael: 4",
     * "John: 4"]
     * 
     */

    public static String solution2(String[] records) {
        String ans = "";
        double highest = 0;

        ArrayList<Double> score_occurr;
        Map<String, ArrayList<Double>> students = new HashMap<>();

        for (String student : records) {

            String[] studentRecords = student.split(": ");

            String name = studentRecords[0];
            double score = Double.parseDouble(studentRecords[1]);

            if (students.get(name) == null) {
                score_occurr = new ArrayList<>();
                score_occurr.add(score); // the score
                score_occurr.add(1.0); // the occurrance
                students.put(name, score_occurr);
            } else {
                double currentScore = getValue(students, name, 0);
                double occurance = getValue(students, name, 1) + 1;

                students.get(name).set(1, occurance);
                students.get(name).set(0, (currentScore + score) / occurance);
            }

            double currentAvg = getValue(students, name, 0);

            if (currentAvg > highest) {
                highest = currentAvg;
                ans = name;
            }
        }

        print_student_avg_occurrance(students);

        return ans;
    }

    public static double getValue(Map<String, ArrayList<Double>> students, String student, int idx) {

        return students.get(student).get(idx);
    }

    public static void print_student_avg_occurrance(Map<String, ArrayList<Double>> students) {

        String name;
        double avg;
        double occurance;

        for (String key : students.keySet()) {
            name = key;
            avg = students.get(key).get(0);
            occurance = students.get(key).get(1);

            System.out.println("Student Name: " + name);
            System.out.println("Occurance: " + occurance);
            System.out.println("Average Score: " + avg);
            System.out.println();
        }

    }

    public static String solution(String[] records) {

        // Map that stores the average score of the students
        Map<String, Double> studentAverage = new HashMap<>();

        // Map that stores the number of time the student is read
        Map<String, Integer> studentOccurance = new HashMap<>();

        String ans = "";
        double highest = 0.0;

        for (String student : records) {

            // split the string to get the name and score
            String[] studentRec = student.split(": ");

            String name = studentRec[0];
            Double score = Double.parseDouble(studentRec[1]);

            // if it is the first time seeing this student...
            // set the student score and mark the occurance of the student
            // else, add the scores and get the average
            if (studentAverage.get(name) == null) {
                studentAverage.put(name, score);
                studentOccurance.put(name, 1);
            } else {
                studentOccurance.put(name, studentOccurance.get(name) + 1);
                studentAverage.put(name, (studentAverage.get(name) + score) / studentOccurance.get(name));

            }
            // debug statement
            // System.out.println(studentRec[0] + " appears on the array " +
            // studentOccurance.get(studentRec[0]) +
            // " times and has an average of: " + studentAverage.get(studentRec[0]));

            // Once the hashmap is set with the final average for each student...
            // lets see which one has the highest
            double studentAvg = studentAverage.get(name);

            if (studentAvg > highest) {
                highest = studentAvg;
                ans = name;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {

        String[] records = {
                "John: 5",
                "Micheal: 4",
                "Ruby: 2",
                "Ruby: 5",
                "Micheal: 5"
        };

        String[] records2 = {
                "Kate: 5",
                "Kate: 5",
                "Maria: 2",
                "John: 5",
                "Michael: 4",
                "John: 4"
        };

        String answer = solution2(records);
        String answer2 = solution2(records2);

        System.out.println(answer);
        System.out.println(answer2);
    }
}
