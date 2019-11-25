Assuming mfw(r,c) is the minimum total wight of a given falling path starting at (r,c) and going all the way until the bottom row. 
Recursive ecuation can be obtained from mfw(r,c)=A[r][c]+min(mfw(r+1,c-1), mfw(r+1,c), mfw(r+1,c+1)) and the answer is given by 
min mfw(0,c). Dynamic programing helps because the solution of subproblems can be used to solve larger instances of the problem.
In this case, there will be no extra array or data structure the original given array A, will eventually turn into mfw.
