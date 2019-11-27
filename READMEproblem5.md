Assuming ms[i][j] is the answer for a given problem with the integers s1 and s2. 
If there is a case where one of the given strings is empty, we can obtain the answer of the problem with the following recursive equation 
ms[i][s2.length()]=ms[i+1][s2.length()]+s1.codePointAt(i). If the strings happen to have the same character in the same intex, 
we use the following recursive equation ms[i][j]=ms[i+1][j+1]. For every other case, one of the two characters will be deleted, 
so the minimum answer will be ms[i][j].
Since this problem is a bit similar to the edit distance problem, we can use a 2D array to store the answer of smaller instances 
of the problem, and avoid having to compute the same operation several times.    
