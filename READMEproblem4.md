Assuming as is a 1D array with n elements. We begin with the range (0,n-1), n being the number of elements in a given array. 
The resulting range will only depend on the range (0,i) . Therefore, we can use dynamic programing to solve the problem. 
as[i] stores the number of arithmetic slices that may occur in only the range (k,i). K will represent the minimum possible index. 
When we are looking at the ith element, we check if the element satisfies the common difference criteria. If it does, 
we will have to add 1+as[i-1] new arithmetic slices.
