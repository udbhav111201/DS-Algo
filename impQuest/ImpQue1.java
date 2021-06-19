package impQuest;

import java.util.Arrays;
import java.util.Scanner;

public class ImpQue1 {

	public static void main(String[] args) {

int arr[] = new int[15];
Scanner sc = new Scanner(System.in);
for(int i=0;i<15;i++) {
	arr[i]= sc.nextInt();
} Arrays.sort(arr);

for (int i=0;i<15;i++)
{System.out.println(arr[i]);
	}

}}
