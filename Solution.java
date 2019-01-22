/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numb1 = Integer.parseInt(reader.readLine());
        int numb2 = Integer.parseInt(reader.readLine());
        int numb3 = Integer.parseInt(reader.readLine());
        
        int count = 0;
        
        if(numb1 > 0 ){
            count ++;
        }
        if(numb2 > 0 ){
            count ++;
        }
        if(numb3 > 0 ){
            count ++;
        }
        System.out.println(count);
    }
    
}
