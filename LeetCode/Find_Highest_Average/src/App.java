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

        Map<String, Double> helperStruct = new HashMap<>();

        String ans = "";
        double highest = 0.0;

        for (String student : records) {
            String[] studentRec = student.split(": ");

            if (helperStruct.get(studentRec[0]) == null) {
                helperStruct.put(studentRec[0], Double.parseDouble(studentRec[1]));
            } else {
                helperStruct.put(studentRec[0],
                        ((helperStruct.get(studentRec[0]) + Double.parseDouble(studentRec[1]))) / 2);
            }

            double studentAvg = helperStruct.get(studentRec[0]);

            if (studentAvg > highest) {
                highest = studentAvg;
                ans = studentRec[0];
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
