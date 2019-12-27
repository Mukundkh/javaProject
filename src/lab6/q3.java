package lab6;

public class q3 {
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
public q3 insert(q3 list, int data)
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
public static void same(q3 lista, q3 listb) {
int flag=0;
int l1=0;
int l2=0;
Node curr1=lista.head;
Node curr2=listb.head;
while(curr1!=null)
{
curr1=curr1.next;
l1=l1+1;

}
while(curr2!=null)
{
curr2=curr2.next;
l2=l2+1;

}
if(l1==l2) {
curr1=lista.head;
curr2=listb.head;
while(curr1!=null && curr2!=null) {
if(curr1.data!=curr2.data) {
flag=1;
break;

}
curr1=curr1.next;
curr2=curr2.next;

}

}
else {
flag=1;
}
if(flag==1) {
System.out.println("list is not same");
}
else {
System.out.println("list is Same");
}
}
public static void main(String[] args) {
q3 a = new q3();
q3 c = new q3();
a.insert(a, 1);
a.insert(a, 2);
a.insert(a, 3);


c.insert(c, 1);
c.insert(c, 3);
c.insert(c, 2);
same(a,c);

}


}
