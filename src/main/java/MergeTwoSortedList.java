import java.util.List;


public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3= new ListNode();
        ListNode k = list3;

        ListNode i=list1,j=list2;

        while(i!=null && j!=null){
            if(i.val>j.val){
                k.next= new ListNode();
                k.next.val=j.val;
                j=j.next;
                k=k.next;
            }
            else{
                k.next= new ListNode();
                k.next.val=i.val;
                i=i.next;
                k=k.next;
            }
        }

        while(i!=null){
            k.next= new ListNode();
            k.next.val=i.val;
            i=i.next;
            k=k.next;
        }
        while(j!=null){
            k.next= new ListNode();
            k.next.val=j.val;
            j=j.next;
            k=k.next;
        }
        list3=list3.next;
        k=list3;
        while(k!=null){
            System.out.println(k.val);
            k=k.next;
        }

        return list3;
    }
}
