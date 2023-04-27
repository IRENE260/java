4. 
 import java.util.Scanner;
class binary 
{
    int binarySearch(int array[], int n, int element ) 
    {
	int low=0,high=n-1,mid;
	while (low <= high) 
    	{
	    mid = (low + high)/ 2;
	    if (array[mid] == element)
		return (mid+1);;
      	    else if (array[mid] < element)
            	low = mid + 1;
      	    else
            	high = mid - 1; 
    	}
    	return -1;
    }
    public static void main(String args[]) 
    {
	binary obj = new binary();
	Scanner input = new Scanner(System.in);
    	int n = array.length;
	System.out.print("Enter the size:");
	int n=input.nextInt();
	int[] array = new int[n];
	System.out.print("Enter the elements:");
	for(int i=0;i<n;i++)
	    array[i] = input.nextInt();
	System.out.println("Enter element to be searched:");
    	int element = input.nextInt();
    	int result = obj.binarySearch(array, n, element);
    	if (result == -1)
      	    System.out.println("Not found");
    	else
	    System.out.println("Element found at index " + result);
    }
}
1.
import java.util.Scanner;
class list
{
    class Node
    {
	int info;
	Node prev, next;
	public Node(int info)
	{
	    this.info = info;
	}
    }
    Node head=null, tail = null;
    void InsertFirst(int item)
    {
	Node p = new Node(item);
	p.info = item;
	p.prev = null;
	p.next = head;
	if(head==null)
	    head=tail=p;
	else
	    head.prev = p;
	    head = p;
    }
    void InsertBefore(int item, int item1)
    {
	Node curr = head;
	Node p ;
	p= new Node(item);
	while(curr!=null && curr.info!=item1)
	    curr = curr.next;
	if(curr == null)
	    System.out.print("Element not present");
	else
	{
	    p.info = item;
	    p.next = curr;
	    p.prev = curr.prev;
	    if(curr == null)
	    {
		head=p;
	    }
	    else
	    {
		curr.prev.next = p;
	    }
		curr.prev =p;
	}
    }
	
    void InsertAfter(int item, int item1)
    {
	Node curr = head;
	Node p = new Node(item);
	while(curr!=null && curr.info!=item1)
	{
	    curr = curr.next;
	}
	if(curr == null)
		System.out.print("Element not present");
	else
	{
	    p.info = item;
	    p.prev = curr;
	    p.next = curr.next;
	    if(curr.next == null)
	    {
		tail = p;
	    }
	    else
	    {
		curr.next.prev = p;
	    }
	    curr.next = p;
	}
    }
    public void Delete(int item)
    {
	Node curr = head;
	while(curr!=null && curr.info != item)
	{
	    curr = curr.next;
	}
	if(curr == null)
	    System.out.print("No element");
	else 
	{		
	    if(curr == head)
	    {
		head = curr.next;
	    }
	    else
	    {
		curr.prev.next=curr.next;
	    }
	    if(curr == tail)
	    {
		tail = curr.prev;
	    }
	    else
	    {
		curr.next.prev=curr.prev;
	    }
	    System.out.print("List after Deletion is : ");
	    Display();
	}
    }
	
    public void Display()
    {
	Node curr = head;
	while(curr!=null)
	{
	    System.out.print(curr.info);
	    curr=curr.next;
	    if(curr!=null)
	    {
		System.out.print("->");
	    }
	}
    }
	
    public static void main(String[] args)
    {
	int ch,item,item1,o;
	list e = new list();
	Scanner sc = new Scanner(System.in);
	do
	{
	    System.out.print("\nOptions are : \n1. Insert \n2. Display \n3. Delete\n4.Exit\n Enter your Option : ");
	    ch = sc.nextInt();
	    switch(ch)
	    {
		case 1:
		{
		    System.out.print("Enter the item to be inserted : ");
		    item = sc.nextInt();
		    System.out.print("\n 1.At Beginning \t 2.Before Any Element \t 3.After any Element\nEnter your Choice : ");
		    o = sc.nextInt();
		    switch(o)
		    {
			case 1: e.InsertFirst(item);
				break;
			case 2: System.out.print("\n Enter the Before Element : ");
				item1 = sc.nextInt();
				e.InsertBefore(item,item1);
				break;
			case 3:	System.out.print("\n Enter the After Element : ");
				item1 = sc.nextInt();
				e.InsertAfter(item,item1);
				break;
		    }
		} 
		break;
		case 2: e.Display(); 
			break;			
		case 3:
			System.out.print("Enter the element to be deleted : ");
			item = sc.nextInt();
			e.Delete(item);
			break;
		case 4: break;
			default : System.out.print("Wrong option"); break;
	    }
	}while(ch!=4);
    }
}
3.
import java.util.Scanner;
class qsort
{
    public static void main(String[] args)
    {
	qsort q = new qsort();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of element in the array : ");
	int n = sc.nextInt();
	int[] a = new int[n];
	System.out.print("Enter the array elements : ");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	q.qsort(a,0,n-1);
	q.print(a,n);
    }

    void qsort(int a[], int l, int r )
    { 
	int x;
	if(l<r)
	{
	    x = partition(a,l,r);
	    qsort(a,l,x-1);
	    qsort(a,x+1,r);
	}
    }

    int partition(int a[],int l, int r)
    {
	int key = a[l];
	int i=l+1,j=r;
	while(i<j)
	{
	    while(a[i]<=key && i<r)
		i++;
	    while(a[j]>key && j>l)
		j--;
	    if(i<j)
	    {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	    }
	}
	int temp = a[l];
	a[l]=a[j];
	a[j]=temp;
	return j;
    }

    void print(int a[], int n)
    {
	System.out.print("The Sorted Array is ");
	for(int i=0;i<n;i++)
		System.out.format("%d ",a[i]);
	System.out.println();
    }
}
