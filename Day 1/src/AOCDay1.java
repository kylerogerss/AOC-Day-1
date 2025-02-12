import java.util.*;

public class AOCDay1 {
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
            array1.add(a);
            array2.add(b);
        }

        Collections.sort(array1);
        Collections.sort(array2);

        int totalDistance = calculateTotalDistance(array1, array2);
        System.out.println("Total distance between pairs: " + totalDistance);

        sc.close();
    }

    public static int calculateTotalDistance(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        int totalDistance = 0;
        for (int i = 0; i < array1.size(); i++) {
            totalDistance += Math.abs(array1.get(i) - array2.get(i));
        }
        return totalDistance;
    }
}
