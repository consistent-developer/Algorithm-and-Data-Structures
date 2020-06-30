/*quetion ::

A positive integer d is said to be a factor of another positive integer N if when N is divided by d,
the remainder obtained is zero. For example,
for number 12, there are 6 factors 1, 2, 3, 4, 6, 12.
Every positive integer k has at least two factors, 1 and the number k itself.
Given two positive integers N and k,
write a program to print the kth largest factor of N.


Input Format: The input is a comma-separated list of positive integer pairs (N, k).

Output Format: The kth highest factor of N. If N does not have k factors, the output should be 1.

Constraints:

1<N<10000000000
1<k<600.

 */

import java.util.Scanner;

class Kt_laregest_factore_of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number,r,i,count=0;
        number = sc.nextInt();
        r = sc.nextInt();

        for(i=number; i>1; i--)
        {
            if((number%i)==0)
                count++;
            if(count == r)
            {
                System.out.println(i);
                break;
            }
        }

        if(count!=r)
            System.out.println(1);
    }
}
