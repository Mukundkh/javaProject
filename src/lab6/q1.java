package lab6;

public class q1 {
Node head;
static class Node
{
 int data;
 Node next;
 Node(int d)
 {
  data = d;
  next = null;
 }
}
public q1 insert(q1 list, int data)
{
 Node new_node = new Node(data);
 if(list.head==null)
 {
  list.head = new_node;
 }
 else
 {
  Node n = list.head;
  while(n.next!=null)
  {
   n = n.next;
  }
  n.next = new_node;
 }
 
 return list;
}
public static q1 final1(q1 list) {
Node r= null;
Node curr=list.head;


while(curr.next!=null) {
r=curr;
curr=curr.next;

}
curr.next=list.head;
list.head=curr;
r.next=null;

return list;
 



}
public void show(q1 list)
{
 Node n = list.head;
 while(n!=null)
 {
  System.out.println(n.data);
  n = n.next;
 }
}
public static void main(String[] args) {
 q1 a = new q1();
 a.insert(a, 1);
 a.insert(a, 2);
 a.insert(a, 3);
 a.insert(a, 4);
 final1(a);
a.show(a);
 
 // TODO Auto-generated method stub

}

}

