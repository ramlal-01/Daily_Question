// Last updated: 5/8/2026, 12:09:36 am
1/**
2 * Definition for a binary tree node.
3 * struct TreeNode {
4 *     int val;
5 *     TreeNode *left;
6 *     TreeNode *right;
7 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
8 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
9 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
10 * };
11 */
12class Solution {
13public:
14    vector<vector<int>> levelOrder(TreeNode* root) {
15        vector<vector<int>> list;
16
17        if (root == nullptr)
18            return list;
19
20        queue<TreeNode*> q;
21        q.push(root);
22
23        while (!q.empty()) {
24            int size = q.size();
25            vector<int> res;
26
27            for (int i = 0; i < size; i++) {
28                TreeNode* node = q.front();
29                q.pop();
30
31                res.push_back(node->val);
32
33                if (node->left != nullptr)
34                    q.push(node->left);
35
36                if (node->right != nullptr)
37                    q.push(node->right);
38            }
39
40            list.push_back(res);
41        }
42
43        return list;
44    }
45};