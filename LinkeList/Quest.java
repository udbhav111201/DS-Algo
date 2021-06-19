package LinkeList;



public class Quest {
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		   ListNode l3 = new ListNode();
		        ListNode headr = new ListNode(0,null);
		       
		        int head = 0;
		        if(l3==null){
		            l3.val= (l1.val+l2.val)%10;
		                head = (l1.val+l2.val)/10;
		            headr = l3.next;
		            l1=l1.next;
		            l2 = l2.next;
		        }
		        
		        while(l1.next!=null && l2.next!=null){
		            headr.val =(l1.val+l2.val+head)%10;
		            head =(l1.val+l2.val+head)/10;
		            headr= headr.next;
		            l1=l1.next;
		            l2 = l2.next;
		        }
		        if(head != 0){
		        headr.val = head;}
		        return l3;
		        
		    }
}
