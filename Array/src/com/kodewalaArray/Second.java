package com.kodewalaArray;

public class Second 
{
public static void main(String[] args)
{
	int[] arr = {12, 45, 7, 33, 90};

	int first = arr[0];
	int second = arr [0];

	for (int i = 0; i < arr.length; i++)
	{
	    if (arr[i] > first)
	    {
	        second = first;       
	        first = arr[i];       
	    }
	    else if (arr[i] > second && arr[i] != first)
	    {
	        second = arr[i];
	    }
	}

	System.out.println("Largest : " + first);
	System.out.println("Second largest : " + second);   
}
}
