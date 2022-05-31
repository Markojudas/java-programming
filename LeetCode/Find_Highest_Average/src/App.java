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

        String answer = solution(records);
        String answer2 = solution(records2);

        System.out.println(answer);
        System.out.println(answer2);
    }
}
