class q8
{
    public static int[] twoSum(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    int a[] ={i,j};
                    return a;
                }
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};
       int target =13;
        int[] indices = twoSum(nums, target);
        if (indices != null) {
            System.out.println("Indices:[ " + indices[0] + ", " + indices[1]+"]");
        } 
        else 
        {
            System.out.println("Cannot find the two numbers");
        }
    }
    
}