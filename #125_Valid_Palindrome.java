public class Solution {
    public boolean isPalindrome(String s) {
        
        int start=0, end=s.length()-1;
       
      
        
        while(start<end)
            {
                while(isValidCharacter(s.charAt(start))==false && start <end)
                start++;
                
                
                while(isValidCharacter(s.charAt(end))==false && start <end)
                end--;
                
                
                
                // both chars are valid then perform check
             
                    if(s.charAt(start)!=s.charAt(end))
                        
                     {   if(isCharacter(s.charAt(start))==true && isCharacter(s.charAt(end))==true)
                        
                        {
                            if(s.charAt(start)-s.charAt(end)==32 || s.charAt(start)-s.charAt(end)==-32)
                            {
                        start++; end--;
                         
                             }
                        else
                            return false;
                            
                        }
                        
                        else
                        return false;
                        
                     }
                     
                     
                     else
                     
                  {  start++;
                    end--;
            }
                
                
            }
                
             
            
        return true;
            
        
        
    }
    
    public boolean isValidCharacter(char c)
    {
        if((c>= '0' && c<= '9') || (c >= 'a' && c <='z') || (c>= 'A' && c<='Z'))
            return true;
            
        return false;
        
    }
    
    public boolean isCharacter(char c)
    {
        if( (c >= 'a' && c <='z') || (c>= 'A' && c<='Z'))
            return true;
            
        return false;
    }
    
    
}
