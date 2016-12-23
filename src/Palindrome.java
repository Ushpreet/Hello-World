
public class Palindrome{  
	
	public static void PalindromeExample()
	{
		  int r,sum=0,temp;    
		  int n=645;
		  
		  temp=n;    
		  while(n>0){    
			  
		   r=n%10;  		
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		  
		   System.out.println("The number is a palindrome ");    
		  else    
		   System.out.println("The number is not a palindrome ");    
		
	}
	
	public static void HelloWorld()
	{
		int[] numbers = new int[]{1,2};
	       
        for(int i=0; i < numbers.length; i++){
        	if(numbers[i]%2 == 0)
                System.out.println(numbers[i] + " is even number.");
              else
                System.out.println(numbers[i] + " is odd numbersfsdf.");
              
                       
        }
	}
	
	 public static void main(String args[]){  
		 
		  Palindrome pal1 = new Palindrome();
		  pal1.PalindromeExample();
		  pal1.HelloWorld();
	 }
} 