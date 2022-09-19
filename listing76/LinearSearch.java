class LinearSearch
{
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 1, 4, 4, 2, 5, -3, 6, 2};
        int x = 10;
 
        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }

    class GFG
{
 
    public static void search(int arr[], int search_Element)
    {
        int left = 0;
        int length = arr.length;
        int right = length - 1;
        int position = -1;
 
        // run loop from 0 to right
        for (left = 0; left <= right;)
        {
             
            // if search_element is found with left variable
            if (arr[left] == search_Element)
            {
                position = left;
                System.out.println(
                    "Element found in Array at "
                    + (position + 1) + " Position with "
                    + (left + 1) + " Attempt");
                break;
            }

            if (arr[right] == search_Element)
            {
                position = right;
                System.out.println(
                    "Element found in Array at "
                    + (position + 1) + " Position with "
                    + (length - right) + " Attempt");
                break;
            }
             
            left++;
            right--;
        }
 
        if (position == -1)
            System.out.println("Not found in Array with "
                               + left + " Attempt");
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5 };
        int search_element = 5;
       
        search(arr,search_element);
    }
}
}
