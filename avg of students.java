class avg{
public static void main(String args[])
{
int i, n=5,avg=0;
int a[]=new int[n];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
a[4]=50;
for(i=0;i<n;i++)
avg=avg+a[i];
System.out.println("avg of("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+"is="+avg/n);
}
}
