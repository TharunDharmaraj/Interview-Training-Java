package caterpillar;

// Java program to count occurrences of pattern
// in a text.

class KMP {
    int KMPSearch(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();

        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int lps[] = new int[M];
        int j = 0; // index for pat[]

        // Preprocess the pattern (calculate lps[]
        // array)
        computeLPSArray(pat, M, lps);

        int i = 0; // index for txt[]
        int res = 0;
        int next_i = 0;

        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                // When we find pattern first time,
                // we iterate again to check if there
                // exists more pattern
                j = lps[j - 1];
                res++;

                // We start i to check for more than once
                // appearance of pattern, we will reset i
                // to previous start+1
                if (lps[j] != 0)
                    i = ++next_i;
                j = 0;
            }

            // mismatch after j matches
            else if (i < N
                    && pat.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return res;
    }

    void computeLPSArray(String pat, int M, int lps[]) {
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to M-1
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else // (pat[i] != pat[len])
            {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (len != 0) {
                    len = lps[len - 1];

                    // Also, note that we do not increment
                    // i here
                } else // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    // Driver program to test above function
    public static void main(String args[]) {
        String txt = "geeksforgeeks";
        String pat = "geeks";
        int ans = new KMP().KMPSearch(pat, txt);
        System.out.println(ans);
    }
}
