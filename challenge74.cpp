#include <iostream>
#include <vector>
#include <ranges>
using namespace std;


int egghunt(vector<vector<int>> input) {
    vector<vector<int>> ranges;



    for (int i = 0; i < input.size(); i++) {
        for (int j = input[i][0]; j <= input[i][1]; j++) {
            ranges[i].push_back(j);
        }
    }

    for (int i = 0; i < ranges.size(); i++) {
        for (int j = 0; j < ranges[i].size(); j++) {
            cout << ranges[j][i];
        }
        cout << endl;
    }

    return 0;
}

int main() {
    vector<vector<int>> input = {{1, 3}, {2, 4}, {2, 5}};
    cout << egghunt(input);

    return 0;
}