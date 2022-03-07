class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int indexB = -1;
        
        for(int i = 0; i<n ; i++){
            if(s.charAt(i)=='b'){
                indexB = i;
                break;
            }
            
        }
        if(indexB == -1)
            return true;
        
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i)== 'a'){
                return i<indexB;
             
            }
        }
       
        return true;
    }
}