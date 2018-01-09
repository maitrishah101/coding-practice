class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int num2 = 0;
        int multiplier1 = 1;
        int multiplier2 = 1;
        while(l1 != null){
            num1 = multiplier1*l1.val + num1;
            multiplier1 *= 10;
            l1 = l1.next;
        }
        while(l2 != null){
            num2 = multiplier2*l2.val + num2;
            multiplier2 *= 10;
            l2 = l2.next;
        }
        int number = num1 + num2;
        ListNode added = new ListNode(number % 10);
        ListNode pointer = added;
        if(number < 10){
        	return added;
        }
        while(number > 0){
            pointer.next = new ListNode(number % 10);
            pointer = pointer.next;
            number /= 10;
        }
        return added.next;
    }

}
