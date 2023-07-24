public class GettingToTheTop {

    /*
    * As a new fitness tracking startup, we want to create a feature that counts the number of distinct ways
    * our users can climb a ladder.  The ladder has n rungs and our users can climb either 1, 2 or 3 steps at a time.
    * We need you to create a function that takes in the number of rungs and returns the number of distinct patterns
    * our users can climb the ladder. This will enable us to track the progress of our users  and provide them with
    * personalized fitness plans.
    *
    * Example 1:
    *   n = 4;
    *   expectedOutput = 7
    *
    * Example 2:
    *   n = 5;
    *   expectedOutput = 13;
    * */
    public static void main(String[] args){
        System.out.println(countDistinctWays(3));
        System.out.println(countDistinctWays(-1));
        System.out.println(countDistinctWays(4));
        System.out.println(countDistinctWays(6));
    }
    public static int countDistinctWays(int n){

        if( n < 1){
            return 0;
        }
        if(n < 3){
            return n;
        }

        int[] cache = new int[n+1];
        cache[1] = 1;
        cache[2] = 2;
        cache[3] = 4;

        for(int i = 4; i <= n; i++){
            cache[i] = cache[i-1] + cache[i-2] + cache[i-3];
        }

        return cache[n];
    }
}
