import java.util.HashMap;

public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&& i-map.get(nums[i])<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
