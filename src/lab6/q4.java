package lab6;

public class q4 {
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
public q4 insert(q4 list, int data)
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
public static q4 delete(q4 list,int data) {
Node point=list.head;
Node rev= null;
if(point.data==data) {
list.head=point.next;
}
else {
while(point.data!=data) {
rev=point;
point=point.next;
}
rev.next=point.next;
}
return list;
}
 public static q4 greater(q4 lista) {
Node curr=lista.head;

while(curr.next!=null) {




if(curr.data<curr.next.data) {
delete(lista,curr.data);
}


curr=curr.next;

}
return lista;

 }
 public static void show(q4 list)
 {
  Node n = list.head;
  while(n!=null)
  {
   System.out.println(n.data);
   n = n.next;
  }
 }
 public static void main(String[] args) {
  q4 a = new q4();
 
  a.insert(a,21);
  a.insert(a, 6);
  a.insert(a, 8);
  a.insert(a, 25);
  a.insert(a, 2);
  a.insert(a, 4);
  a.insert(a, 10);
  a.insert(a, 12);
  greater(a);
  show(a);
 

 }
 }
