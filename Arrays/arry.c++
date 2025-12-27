#include <bits/stdc++.h>
using namespace std;

/*
LeetCode: 169. Majority Element
Difficulty: Easy

Problem:
Given an array nums of size n, return the majority element.
The majority element appears more than n/2 times.

Approach:
Boyer–Moore Voting Algorithm

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }
};

int main() {
    Solution obj;

    // Test case (you can change this)
    vector<int> nums = {2, 2, 1, 1, 1, 2, 2};

    cout << "Majority Element: " << obj.majorityElement(nums) << endl;

    return 0;
}
