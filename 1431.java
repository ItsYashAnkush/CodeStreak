# Kids With the Greatest Number of Candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list=new ArrayList<>();
        int max=0;
        int sum=0;

        for(int i=0;i<candies.length;i++)
        {
              if(candies[i]>max)
              {
                max=candies[i];
              }
        }
        for(int j=0;j<candies.length;j++)
        {
            sum=candies[j]+extraCandies;

            if(sum>=max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}
