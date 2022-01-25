package GFG.Bit;

//Party of Couples

public class findSingles {
    static int findSingle(int N, int arr[]){
        // code here
        int count = 0;
        for(int i=0;i<N;i++){
            count  ^= arr[i];
        }
        return count;
    }
}

