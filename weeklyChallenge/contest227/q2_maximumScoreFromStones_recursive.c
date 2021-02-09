int max(int A, int B, int C)
{
    if (A >= B && A >= C)
        return A;
    else if (B >= A && B >= C)
        return B;
    else // (C >= A && C >= B)
        return C;
}

int min(int a, int b)
{
    if (a <= b)
        return a;
    else
        return b;
}

int middle(int a, int b, int c)
{
    if (a == 0)
        return min(b, c);
    else if (b == 0)
        return min(a, c);
    else
        return min(a, b);
}

int maximumScore(int a, int b, int c)
{
    if ((a && b && c) != 0)
        return 1 + max(maximumScore(a - 1, b - 1, c), maximumScore(a, b - 1, c - 1), maximumScore(a - 1, b, c - 1));
    else if (a == 0 || b == 0 || c == 0)
        return middle(a, b, c);
    else
        return 0;
}

// Time limit exceeded :(
