Assuming pairs[i][j] is the list of pairs that we are given. Supposing a chain with n number of pairs ends at pairs[i], 
we also assume that pairs[i][1]<pairs[j][0], if this is true, it will be possible to increase the length of this chain to n+1. 
We are letting lc[i] be the length of the longest chain. Whenever the last element of the chain meets the rules to have an extra 
element added after it, the answer will be
lc[j]=max(lc[j],dp[i]+1)
