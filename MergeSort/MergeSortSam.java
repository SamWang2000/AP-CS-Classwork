/*
 *Sam Wang
Mr.Daniel
Merge Sort
 */
package mergesortsam;


import java.util.Arrays;

/**
 *
 * @author asus
 */
public class MergeSortSam {
/**
 *Precondition: B and A must be the same size
 * @author asus
     * @param A
 */
    public static void merge (int [] unsorted, int first, int mid, int last, int[] sorted){
       int i = first, j = mid;
            int k = 0;
            while (i < mid && j < last)
                if (unsorted[i] < unsorted[j])
                    sorted[k++] = unsorted[i++];
                else
                    sorted[k++] = unsorted[j++];

            while (i < mid)
                sorted[k++] = unsorted[i++];
            while (j < last)
                sorted[k++] = unsorted[j++];

            for (int v = 0; v < k; v++)
                unsorted[first + v] = sorted[v];  
    }
    public static void merge_sort(int [] unsorted,int first, int last, int[]sorted){
         if (first + 1 < last)
            {
                int mid = (first + last) / 2;
                
                merge_sort(unsorted, first, mid, sorted);
                merge_sort(unsorted, mid, last, sorted);
                merge(unsorted, first, mid, last, sorted);
            }
    }
    public static void main(String[] args) {
   int[] x = { 6, 2, 4, 1, 5, 9 };
            int[] sorted = new int[x.length];
            merge_sort(x, 0, x.length, sorted);
            for (int i = 0; i < sorted.length; i++)
            {if (x[i]>0)
                System.out.println(Arrays.toString(x));
                }
        }
    }
    

