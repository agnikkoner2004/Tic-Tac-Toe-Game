#include<stdio.h>
#include<string.h>

// Function to find the length of the LCS using Dynamic Programming
int lcs(char* X, char* Y, int m, int n) {
    int dp[m+1][n+1]; // Create a 2D array for storing subproblem results

    // Initialize the table
    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            if (i == 0 || j == 0) {
                dp[i][j] = 0; // If one of the strings is empty, LCS length is 0
            } else if (X[i-1] == Y[j-1]) {
                dp[i][j] = 1 + dp[i-1][j-1]; // If characters match, increment LCS length
            } else {
                dp[i][j] = (dp[i-1][j] > dp[i][j-1]) ? dp[i-1][j] : dp[i][j-1]; // Otherwise, take max of two options
            }
        }
    }
    return dp[m][n]; // Return the LCS length for the entire strings
}

int main() {
    char X[] = "AGGTAB";
    char Y[] = "GXTXAYB";
    int m = strlen(X); // Length of X
    int n = strlen(Y); // Length of Y

    printf("Length of LCS is %d\n", lcs(X, Y, m, n)); // Calculate and print the LCS length
    return 0;
}
