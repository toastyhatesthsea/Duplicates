package Dupes;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class Duplicates
{


    public int removeDuplicates(int[] nums) {
        int i = nums.length > 1 ? 1 : 0;

        for (int j = i + 1; j < nums.length; j++)
        {
            if (nums[i] != nums[j])
            {
                nums[i] = nums[j];
                i++;

                int k = j;

                while (k + 1 < nums.length && nums[k + 1] == nums[j])
                {
                    k++;
                }
                j = k;
            }
        }
        return i;
    }

}

class DupeTest
{
    public static void main(String[] argsg)
    {
        Duplicates dupes = new Duplicates();

        int test[] = {2, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        int[] meows = {-5, -5, -5, -5, -4, -4, -2, -2, -2, -2, -1, -1, -1, 0, 0, 0};

        dupes.removeDuplicates(meows);
    }
}