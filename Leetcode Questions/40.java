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
