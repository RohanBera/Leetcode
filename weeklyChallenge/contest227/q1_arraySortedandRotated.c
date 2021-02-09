bool check(int *nums, int numsSize)
{
    int A[numsSize];

    if (numsSize <= 2)
        return true;

    for (int i = 0; i < numsSize; i++)
    {
        for (int j = 0; j < numsSize; j++)
        {
            A[j] = nums[(j + i) % numsSize];
            if (j > 0 && A[j] < A[j - 1])
            {
                break;
            }
            if (j == numsSize - 1)
                return true;
        }
    }
    return false;
}