import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int no = in.nextInt();
    ArrayList<Integer> data = new ArrayList<>();

    for (int i=0;i<no;i++){
        int newint = in.nextInt();
        data.add(newint);
    }
    
    int maxValue = 0; 
    int maxCount = 0;

    for (int j = 0; j < no; j++) {
       int count = 0;
       for (int k = 0; k < no; k++) {
          if (data.get(k) == data.get(j))
          ++count;
       }

       if (count > maxCount) {
          maxCount = count;
          maxValue = data.get(j);
       }
    }

    System.out.println(maxValue);

    in.close();
    
  }
}
