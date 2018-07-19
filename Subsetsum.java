/*I/p: 3 
1
2
3
0/p: 3 2 1*/

import java.util.*;

public class Subsetsum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        scan.close();
        
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}