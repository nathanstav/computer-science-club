#include <iostream>
#include <vector>

using namespace std;


bool canJump(vector<int>& nums) {
    int reach = 0;

    int i = 0;
    while (i < nums.size() && i <= reach) {
        if (reach >= nums.size() - 1)
            return true;
        if (i + nums[i] > reach)
            reach = i + nums[i];
        ++i;
    }
    return false;
}

// testcases all pass in Leetcode, faster than Java so I figured it was worth
// trying
