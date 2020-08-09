package JumpingClouds;

public class Solution {
	public static void main(String[] args) {
		int[] c={0,0,0,0,1,0,1,0,0,0,1};
		int totalJumpCount=jumpingOnClouds(c);
		System.out.println(totalJumpCount);
		
	}
	static int jumpingOnClouds(int[] c) {
        int jumpCount=0;
       
        for(int i=0;i<c.length-1;i++)
        {
            if(i<c.length-2 && c[i]==0 && c[i]==c[i+2])
            {
                i=i+1;    
                jumpCount++;           
            }
            else if(i<c.length-1 && c[i]==0 && c[i]==c[i+1])
            {                  
                jumpCount++;   
            }
            
        }
        return jumpCount;
    }
}
