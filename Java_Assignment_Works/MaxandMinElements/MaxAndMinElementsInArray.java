// 3. Write a loop to find the maximum and minimum values in an array.

public class MaxAndMinElementsInArray {
    
    public static void main (String[] args) {
        
        int a[] = {50,40,30,20,60};

        int max = a[0];

        for (int i=1; i<a.length; i++)
        {
            if (a[i] > max)
            { 
                max = a[i];
            }
        }
        System.out.println ("Maximum Element in array is:" + max);

        int min = a[0];

        for (int i=1; i<a.length; i++)
        {
            if (a[i] < min)
            { 
                min = a[i];
            }
        }
        System.out.println ("Minimum Element in array is:" + min);
      }

    }
