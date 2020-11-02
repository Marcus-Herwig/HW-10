package practice;

import java.util.ArrayList;
import java.util.Random;

public class Driver
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		Player Marcus = new Player(r.nextInt(30));
		Player John = new Player(r.nextInt(30));
		Player Nick = new Player(r.nextInt(30));
		Player Bill = new Player(r.nextInt(30));
		Player Bob = new Player(r.nextInt(30));
		Player Jim = new Player(r.nextInt(30));
		Player Tom = new Player(r.nextInt(30));
		Player Chad = new Player(r.nextInt(30));
		Player Brad = new Player(r.nextInt(30));
		Player Tim = new Player(r.nextInt(30));
		Player Cory = new Player(r.nextInt(30));
		ArrayList temp = new ArrayList();
		temp.add(Marcus.getAge());temp.add(John.getAge());temp.add(Nick.getAge());temp.add(Bill.getAge());temp.add(Bob.getAge());temp.add(Jim.getAge());temp.add(Tom.getAge());temp.add(Chad.getAge());temp.add(Brad.getAge());temp.add(Tim.getAge());temp.add(Cory.getAge());
		
		
		
		Integer[] playerAges = (Integer[]) temp.toArray(new Integer[0]);
		
		mergeSort(playerAges, 0, playerAges.length-1);
		for(int i: playerAges)
		{
			System.out.println(i);
		}
		int age = 21;  
	    int last=playerAges.length-1;  
	    binarySearch(playerAges,last,age);
		
	}
	static void binarySearch(Integer array[], int lastIndex, int searchAge)
	{  
		int firstIndex = 0;
		int middle = (firstIndex + lastIndex)/2;  
		while( firstIndex <= lastIndex )
		{  
			if ( array[middle] < searchAge )
			{
				firstIndex = middle + 1;     
		    }
			else if ( array[middle] == searchAge )
			{  
				System.out.println("There is a player that is " + searchAge + " years old");  
		        break;  
		    }
			else
			{
				lastIndex = middle - 1;  
		    }  
		    middle = (firstIndex + lastIndex)/2;  
		}  
		   if ( firstIndex > lastIndex )
		   {  
		      System.out.println("No players are " + searchAge + " years old");  
		   }  
	}  
	
	
	static void mergeSort(Integer[] ar, int begin, int end)
	{
		if(begin != end)
		{
			int begin1 = begin;
			int end1 = begin + ((end - begin)/2);
			int begin2 = end1 + 1;
			int end2 = end;
			mergeSort(ar, begin1, end1);
			mergeSort(ar, begin2, end2);
			merge(ar, begin1, end1, begin2, end2);
		}
	}
	
	static void merge(Integer[] ar, int begin1, int end1, int begin2, int end2)
	{
		int[] temp = new int[end2 - begin1 + 1];
		int pos1 = begin1;
		int pos2 = begin2;
		for(int i = 0; i < temp.length; i++)
		{
			if(pos1 <= end1 && pos2 <= end2)
			{
				if(ar[pos1] < ar[pos2])
				{
					temp[i] = ar[pos1];
					pos1++;
				}
				else
				{
					temp[i] = ar[pos2];
					pos2++;
				}
			}
			else
			{
				//either pos1 or pos2 is off the end of their list and the other guy is the 
				//default winner
				if(pos1 > end1)
				{
					temp[i] = ar[pos2];
					pos2++;
				}
				else
				{
					temp[i] = ar[pos1];
					pos1++;
				}
			}
		} //end of for loop
		
		//copy temp back over ar from begin1 to end2
		int posInTemp = 0;
		for(int i = begin1; i <= end2; i++)
		{
			ar[i] = temp[posInTemp];
			posInTemp++;
		}
	}
	
	static int factorialRecursive(int val)
	{
		return (val == 1) ? 1 :val * factorialRecursive(val - 1);
	}
	
	static int factorialIterative(int val)
	{
		int temp = 1;
		for(int i = val; i >= 1; i--)
		{
			temp = temp * i;
		}
		return temp;
	}
	
	static void displayArray(int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i]);
		}
	}

}