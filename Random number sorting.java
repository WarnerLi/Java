
import java.util.Random;
public class java_rnd
{
    
    public static void main(String[] args)
    {
        //Random rnd = new Random();
        int [] num = new int [10] ;
        int tmp ;
        
        for(int i = 0 ; i < num.length ; i++)
        {
            num[i] = (int)(Math.random()*10);
        }
        
        for(int i =num.length-1; i>0 ; i--)
        {
            boolean sss = false ;
            for(int j = 0 ; j < i;j++ )
            {
                
                if(num[j] > num[j+1])
                {
                    tmp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = tmp ;
                    
                }
                if( !sss)
                    break ;
            }
            
        }
        
        for(int i =0 ; i<num.length ; i++)
        {
            System.out.println("  "+num[i]);
            
        }
        
    }
    
}


