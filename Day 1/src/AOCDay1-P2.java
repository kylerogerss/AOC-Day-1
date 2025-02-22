import java.util.*;

public class Day1p2 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) break;
            String[] nums = input.split("\\s+");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            array1.add(a); //add left to array 1
            array2.add(b); //add right to array 2
        }

        Collections.sort(array1);
        Collections.sort(array2);

        
        long similarityScore = similarityScore(array1, array2);
        System.out.println(similarityScore);
    }

    public static long similarityScore(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        long similarityScore = 0;
        for (int i = 0; i < array1.size(); i++) {
            similarityScore += (array1.get(i) * Collections.frequency(array2, i));
        }
        return similarityScore;
    }
}
