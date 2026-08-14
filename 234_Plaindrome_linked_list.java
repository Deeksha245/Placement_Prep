class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast= head,slow=head;
        Stack<Integer> stack = new Stack<>();
        while(fast!=null && fast.next != null)// dont reverse the condition it will throw error
        {
            fast= fast.next.next;
            stack.push(slow.val);
            slow = slow.next;

        }
        if(fast!=null)
            slow=slow.next;
        while(slow!= null)
        {   if(stack.pop() !=slow.val)
                return false;
            slow= slow.next;

        }
        return true;

        
    }
}
