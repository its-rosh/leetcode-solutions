#include<iostream>;
#include<bits/stdc++.h>
using namespace std;

// Paste the LeetCode function here
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
};

int main() {
    Solution obj;

    // Test input (you can change this anytime)
    vector<int> nums = {2,2,1,1,1,2,2};

    cout << obj.majorityElement(nums);
}
