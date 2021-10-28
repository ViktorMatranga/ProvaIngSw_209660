package unical.prova_int;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> array = Arrays.asList(4, 7, 3, 5,3, 5,9,14, 46);

        MyListUtil x = new MyListUtil();
        
        x.sort(array, 0);
        
        for (int i=0; i<array.size(); i++) {
        	System.out.println(array.get(i));
        }
    
    }
}
