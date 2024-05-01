package Praticeprogram;

import java.util.Scanner;

public class RotateMatrixClockwise {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	
	int a[][]=new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			a[i][j]=sc.nextInt();			
		}
	}
	System.out.println("original matrix");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			
			System.out.print(a[i][j]);			
		}
		System.out.print("\n");
	}
	System.out.println("rotate matrix of 90 degree clockwise");
	for(int i=0;i<3;i++) {
		for(int j=2;j>=0;j--) {
			System.out.print(a[j][i]);
		}
		System.out.print("\n");
	}
	System.out.println("rotate matrix of 90 degree anti-clockwise");
	
	for(int i=2;i>=0;i--) {
		for(int j=0;j<3;j++) {
			System.out.print(a[j][i]);
		}
		System.out.print("\n");
	}
	
	
}
}
