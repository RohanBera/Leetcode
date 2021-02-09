int maxAbsoluteSum(int *nums, int numsSize)
{
    int sum, max = 0;
    for (int i = 2; i <= numsSize; i++)
    {
        for (int j = 0; j <= numsSize - i; j++)
        {
            sum = 0;

            for (int k = 0; k < i; k++)
            {
                sum += nums[k + j];
            }

            if (max < abs(sum))
            {
                max = abs(sum);
            }
        }
    }
    return max;
}

// time limit exceeded :(