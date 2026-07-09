public class Main {
    public static void main (String[] args){
        int[] nums={4,6,9,26,19,64};
        int target =19;
        int ans=Problem.linearSearch(nums,target);
        System.out.println(ans);
    }
   
}
class Problem{
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
        }