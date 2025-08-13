import java.util.HashMap;
public class FirstUniqueElement {
    public static int firsUnique(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for(int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 0, 4};
        System.out.println(firsUnique(nums));
    }

}
