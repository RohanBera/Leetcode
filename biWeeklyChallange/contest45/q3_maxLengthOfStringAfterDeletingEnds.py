class Solution:
    def minimumLength(self, s: str) -> int:
        if (s == 'a' or s == 'b' or s == 'c'):
            return 1

        while (1):
            if s == 'a' or s == 'b' or s == 'c':
                return 1

            if (s[0] == s[-1]):
                temp = s[0]

                while s[0] == temp:
                    s = s[1:]
                    if s == '':
                        return 0

                while s[-1] == temp:
                    s = s[:-1]
            else:
                return len(s)
