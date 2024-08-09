class Solution {
    public int solution(int left, int right) {
        
        int count = 0;
        int sum =0;

        for(int i=left; i<=right; i++){

            count=0;
            for(int j=1; j<=Math.sqrt(i); j++){

                if (i % j ==0) {
                    count+=2;
                    if(j*j==i){
                        count--;
                    }
                }
            }



            if(count%2==0){
                sum+=i;
            }else{
                sum-=i;
            }





        }
        
        return sum;

    }
}