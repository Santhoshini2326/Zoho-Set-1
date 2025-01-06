import java.util.*;
public class Zigzag {
    public static void main(String[] args) 
    {
    Scanner sc= new Scanner(System.in);
        String str = sc.next();
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            if(i==j || (i+j)== str.length()-1)
            {
                System.out.print(str.charAt(j));
            }
            else
            {
                System.out.print(" ");
            }
        System.out.println("");
        }
        
    }
} 
/*import java.util.*;
public class Zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        for (int i = 0; i < n; i++) { // Outer loop for rows
            for (int j = 0; j < n; j++) { // Inner loop for columns
                // Check both diagonal conditions in a single loop
                if (i == j || i + j == n - 1) {
                    System.out.print(str.charAt(j)); // Print character for either diagonal
                } else {
                    System.out.print(" "); // Print space otherwise
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}*/
