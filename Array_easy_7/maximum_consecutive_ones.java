package Array_easy_7;

public class maximum_consecutive_ones {
    static int maxConsecutiveOnes(int nums[], int n){
        int maxi = 0; 
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                cnt++;
                maxi = Math.max(maxi, cnt);//, check if this new cnt is now bigger than the best we've recorded,if yes update maxi
            }
            else{
                cnt = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int n = nums.length;

        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes(nums, n));
    }
}
