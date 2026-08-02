class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
          if(root==null) return ans;
            Queue<TreeNode> qu=new LinkedList<>();
            qu.offer(root);
            while(!qu.isEmpty()){
            int n=qu.size();
            int lastval=0;
            for(int i=0;i<n;i++){
                TreeNode value=qu.poll();
                lastval=value.val;
                if(value.left!=null){
                    qu.add(value.left);
                }
                if(value.right!=null){
                    qu.add(value.right);
                }
            }
            ans.add(lastval);
            
            

        }
        return ans;

        
    }
}