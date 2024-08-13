class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<ArrayList<Integer> > ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        findNumbers(ans, target, temp);
        return ans;
    }
    public static void findNumbers(ArrayList<ArrayList<Integer> > ans, ArrayList<Integer> arr, int target, ArrayList<Integer> temp){
        if(sum == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < arr.size(); i++){
            if(sum - arr.get(i) == 0){
                 temp.add(arr.get(i));
                findNumbers(ans, arr, sum - arr.get(i),temp);
                return ans;
            }
        }
        return ans;
    }
}


// Chat GPT
// import java.util.*;

// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         Arrays.sort(candidates); // Sort the array to handle duplicates and simplify the process
//         List<List<Integer>> ans = new ArrayList<>();
//         findNumbers(candidates, target, 0, new ArrayList<>(), ans);
//         return ans;
//     }
    
//     private void findNumbers(int[] candidates, int target, int start, List<Integer> temp, List<List<Integer>> ans) {
//         if (target == 0) {
//             ans.add(new ArrayList<>(temp)); // Found a valid combination
//             return;
//         }
        
//         for (int i = start; i < candidates.length; i++) {
//             if (i > start && candidates[i] == candidates[i - 1]) {
//                 continue; // Skip duplicates
//             }
//             if (candidates[i] > target) {
//                 break; // No need to continue if the current number exceeds the target
//             }
//             temp.add(candidates[i]);
//             findNumbers(candidates, target - candidates[i], i + 1, temp, ans); // Move to the next index
//             temp.remove(temp.size() - 1); // Backtrack
//         }
//     }
// }
