/* author: Jack Farah
*  level: easy
*  description: Finding up to 5 numbers in the range of 1-1000
*  that are divisible by 3 and 5 than adding them together for a sum.
 */

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int count =0;

        for(int i = 1; i <= 1000 ; i++){
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.print(i +", ");
                    sum += i;
                    count++;
                }
                if(count == 5){
                    System.out.print("\b\b");
                    break;
                }
        }
        System.out.println("");
        System.out.println(sum);

    }
}
