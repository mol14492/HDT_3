import java.util.ArrayList;
/**
 * @@ codigo radixSort:
 * 
 * S.A.2011.s.f."Java Program to Implement Radix Sort".http://www.sanfoundry.com/java-program-implement-radix-sort/[28 julio 2016]
 *  
 */
public class RadixSort {

	public RadixSort() {
		// TODO Auto-generated constructor stub
	}

	public void radixSort(int [] a){

        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[3000];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[3000];

            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 3000]++;
            for (i = 1; i < 3000; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 3000]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 3000;
        }
    }
    }

