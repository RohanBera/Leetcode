int sumOfUnique(int *nums, int numsSize)
{
    int freq[100] = {0};
    int sum = 0;

    for (int i = 0; i < numsSize; i++)
    {
        freq[nums[i] - 1]++;
    }

    for (int i = 0; i < 100; i++)
    {
        if (freq[i] == 1)
        {
            sum += i + 1;
        }
    }

    return sum;
}