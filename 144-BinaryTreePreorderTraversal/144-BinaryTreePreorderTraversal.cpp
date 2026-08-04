// Last updated: 4/8/2026, 11:15:33 pm
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
14    vector<int> preorderTraversal(TreeNode* root) {
15        vector<int> list  ;
16        helper( root , list ) ;
17        return list ;
18    }
19
20    void helper( TreeNode* root , vector<int>& list ){
21        if( root==nullptr) return ;
22
23        list.push_back(root->val) ;
24
25        helper( root->left , list ); 
26        helper( root->right, list ) ;
27    }
28};