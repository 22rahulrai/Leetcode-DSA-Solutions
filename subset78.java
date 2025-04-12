package questions.leetcode;
//public List<List<Integer>> subsets(int[] nums) {
//    List<List<Integer>> list = new ArrayList<>();
//    Arrays.sort(nums);
//    backtrack(list, new ArrayList<>(), nums, 0);
//    return list;
//}
//
//private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
//    list.add(new ArrayList<>(tempList));
//    for(int i = start; i < nums.length; i++){
//        tempList.add(nums[i]);
//        backtrack(list, tempList, nums, i + 1);
//        tempList.remove(tempList.size() - 1);
//    }
//}
//
//
//
//
//
//The code you've shared is a Java method that solves the Combination Sum problem, a classic problem in combinatorial searching. The goal is to find all unique combinations in a given array `nums` where the candidate numbers sum to a given target `target`. Each number in `nums` may be used multiple times (hence, "combination" with repetition).
//
//Here's a breakdown of the method:
//
//        1. `public List<List<Integer>> combinationSum(int[] nums, int target)`: This is the main method that takes an array of integers `nums` and a target sum `target`. It returns a list of lists of integers, where each inner list represents a combination that sums to `target`.
//
//        2. `List<List<Integer>> list = new ArrayList<>();`: Initializes an empty list to store the combinations that sum to `target`.
//
//        3. `Arrays.sort(nums);`: Sorts the input array `nums`. This is not strictly necessary for the correctness of the algorithm but can be useful if you want the combinations to be generated in a sorted order or if you want to optimize the algorithm to stop early when the sum exceeds the target.
//
//4. `backtrack(list, new ArrayList<>(), nums, target, 0);`: Calls the recursive backtracking method to generate the combinations. The method is called with an empty `tempList` (to start building a new combination), the `nums` array, the `target` (which remains the same), and `0` as the `start` index.
//
//5. The `backtrack` method is a private helper method that does the actual work:
//        - It takes the `list` to store the combinations, a `tempList` to build the current combination, the `nums` array, the remaining sum `remain`, and the `start` index to consider in `nums`.
//        - If `remain < 0`, it means the current combination's sum has exceeded the target, so the method returns to backtrack.
//        - If `remain == 0`, it means the current combination's sum equals the target, so a new ArrayList is created from `tempList` and added to the result `list`.
//        - Otherwise, it iterates through `nums` from `start` to the end of the array:
//        - Adds `nums[i]` to the current combination (`tempList`).
//        - Recursively calls itself with the updated `remain` and `i` as the new `start` (to allow reusing the same element).
//        - Removes the last element from `tempList` to backtrack and try the next element in `nums`.
//
//        6. Finally, the main method returns the list of combinations.
//
//This algorithm efficiently finds all combinations that sum to the target by using a backtracking approach, which is a form of depth-first search that incrementally builds candidates to the solutions, and abandons a candidate ("backtracks") as soon as it determines that the candidate cannot possibly be completed to a valid solution.


//To solve this problem, we will use a backtracking approach as discussed earlier. Below is a complete Java program with a `main` function that reads input, calls the method to generate subsets, and prints the result.
//
//        ```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class subset78 {
    public static void main(String[] args) {
        // Read the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        // Generate and print the subsets
        List<List<Integer>> subsets = subsets(nums);
        System.out.println("All possible subsets are:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

//Here's a brief explanation of the program:
//
//        1. The `main` method starts by reading the input from the user using a `Scanner` object. It asks for the number of elements in the array and then reads the elements into an array `nums`.
//
//        2. It then calls the `subsets` method with the `nums` array as the argument.
//
//        3. The `subsets` method implements the backtracking algorithm to generate all possible subsets of the input array.
//
//        4. The `backtrack` method is a private helper method that does the actual work of generating subsets using backtracking.
//
//        5. Finally, the `main` method prints all the subsets generated by the `subsets` method.
//
//To run the program, you would compile and execute it, and then follow the prompts to enter the input. For example, if you enter the input for the array `[1, 2, 3]`, the program will output all possible subsets as shown in your example.