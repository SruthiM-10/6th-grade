package JavaPrograms;

/*
Lucy wants to calculate her bonus points while shopping N things and N <= 100. They are all bakery, produce, or drinks.
If bakery, she gets 5 bonus points per dollar.
If produce, she gets 2 bonus points per dollar.
If drinks, she gets 1 bonus points per dollar.

She earns bonus points when she spends more than M points in one shopping. You will first read N and then N numbers,
corresponding to the amount Lucy spends on each item. After that, you will read M and the type of shopping items, shown by
the numbers 1,2, or 3. 1 means they're are all bakery, 2 means they're all produce, and 3 means they are all drinks.

Output the total bonus points.
 */

import java.util.*;
public class shopping
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), sum = 0;
        int[] shoppings = new int[n];
        for(int i = 0; i < n; i++) { shoppings[i] = scan.nextInt(); }
        int m = scan.nextInt();
        int type = scan.nextInt();
        for(int i = 0; i < n; i++){
            if (shoppings[i] > m){
                if (type == 1)
                    sum += 5 * (shoppings[i]);
                if (type == 2)
                    sum += 2 * (shoppings[i]);
                if (type == 3)
                    sum += shoppings[i];
            }
        }
        System.out.println(sum);
    }
}

