package scanning_input;

import java.util.ArrayList;
import java.util.Scanner;

/*
Guest list of a hotel
There is a hotel that may accommodate 4 guests. Each line of input contains the name or the names of the guests arrived at the hotel on a certain day.

Read the names of the guests from the input and output each name in a separate line and in reverse order starting with the last arrived guest. Note that the order of the arriving guests and the number of days are not pre-defined.


Sample Input:
Jane Kate
John
Mary

Sample Output:
Mary
John
Kate
Jane


Sample Input:
Joseph
Piotr Eugene
Jack

Sample Output:
Jack
Eugene
Piotr
Joseph
 */


public class GuestList {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            nameList.add(scanner.next());
        }
        if (!nameList.isEmpty()) {
            for (int i = nameList.size() - 1; i >= 0; i--) {
                System.out.println(nameList.get(i));
            }
        }
    }
}
