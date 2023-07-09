package find extra char in string;


class hashMap
{

static char findExtraCharcter(char []strA, char[] strB)
{
	// store string values in map
	int[] m1 = new int[256];

	// store second string in map with frequency
	for (int i = 0; i < strB.length; i++)
		m1[strB[i]]++;

	// store first string in map with frequency
	for (int i = 0; i < strA.length; i++)
		m1[strA[i]]--;

	for (int i=0;i<m1.length;i++)
	{

		// if the frequency is 1 then this
		// character is which is added extra
		if (m1[i]== 1)
			return (char) i;
	}
	return Character.MIN_VALUE;
}

// Driver code
public static void main(String[] args)
{
	// given string
	String strA = "abcd";
	String strB = "cbdad";

	// find Extra Character
	System.out.println(findExtraCharcter(strA.toCharArray(), strB.toCharArray()));
	}
}

// This code is contributed by 29AjayKumar
