
package bubble;

public class bubble {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [] num = new int [100] ;
        int tmp ;
        
        for(int i = 0 ; i < num.length ; i++)
        {
            num[i] = (int)(Math.random()*100);
        }
        boolean exchange = true ;
        for(int i =num.length-1; i>0 ; --i)
        {
            
            for(int j = 0 ; j < i;++j )
            {
                
                if(num[j] > num[j+1])
                {
                    tmp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = tmp ;
                    exchange = false;
                }
                
            }
            if(exchange)
                break ;
            
        }
        
        for(int i =0 ; i<num.length ; i++)
        {
            System.out.println("  "+num[i]);
            
        }

	}

}
