package Praticeprogram;


public class ArmstrongNo {
public static void main(String[] args) {
int no=153;
int temp1=no;
int length=0;
while(temp1!=0) {
	temp1=temp1/10;
	length=length+1;
}
int temp2=no;
int rem;
int arm=0;


while(temp2!=0) {
	rem=temp2 %10;
	int mul=1;
	for(int i=1;i<=length;i++) {
		mul=mul*rem;
	}
	arm=arm+mul;
	temp2=temp2/10;
}
if(no==arm) {
	System.out.println(no+ " is armstrong");
}
else {
	System.out.println(no+ " is not armstrong");
}
}
}

