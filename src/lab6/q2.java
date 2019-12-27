package lab6;

public class q2 {
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
public q2 insert(q2 list, int data)
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
public static q2 intersection(q2 lista,q2 listb) {
Node curr1=lista.head;
Node curr2=listb.head;
q2 b = new q2();
while(curr1!=null) {

curr2=listb.head;
while(curr2!=null) {

if(curr1.data==curr2.data) {
b.insert(b,curr1.data);


}
curr2=curr2.next;
}
curr1=curr1.next;
}
return b;

}
public void show(q2 list)
{
 Node n = list.head;
 while(n!=null)
 {
  System.out.println(n.data);
  n = n.next;
 }
}
public static void main(String[] args) {
q2 a = new q2();
q2 c = new q2();
q2 d = new q2();
a.insert(a, 1);
a.insert(a, 2);
a.insert(a, 3);
a.insert(a, 4);
a.insert(a, 6);
c.insert(c, 2);
c.insert(c, 4);
c.insert(c, 6);
d=intersection(a,c);
d.show(d);

}
}

