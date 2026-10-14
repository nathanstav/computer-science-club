#include <iostream>
#include <vector>

using namespace std;

bool searchMatrix(vector<vector<int>>& matrix, int target) {
    int i = 0;
    int n = matrix[0].size();
    while (i < matrix.size()) {
        if (target < matrix[i][n - 1] && target > matrix[i][0]) {
            for (int j = 1; j < n - 1; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
            return false;
            }
        else if (target == matrix[i][n - 1] || target == matrix[i][0]) {
            return true;
        }
        i++;
    }

    return false;
}

int main() {
    vector<vector<int>> input = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
    cout << boolalpha << searchMatrix(input, 3) << endl;
}