import java.util.*;

public class largest {

    static int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,arr[i]);
        }

        return max;

    }
}