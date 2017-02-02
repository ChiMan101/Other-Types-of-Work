
public class main {
	
	public static int[] doSort(int[] myRandList)
	{
		int tmp = 0;
		for(int i = 0; i < myRandList.length -1; i++)
		{
			for(int k = 0; k < myRandList.length- i - 1; k++)
			{
				if(myRandList[k] > myRandList[k + 1] )
				{
					tmp = myRandList[k];
					myRandList[k] = myRandList[k + 1];
					myRandList[k + 1] = tmp;
				}
			}
		}
		
		return myRandList;
	}
	public static void main(String[] args) 
	{
		int[] randList =  new int[10];
		
		
		for(int i = 0; randList.length > i; i++)
		{
			randList[i] = (int) (Math.random()*100)+1;
			System.out.print(randList[i]+ " ");
		}
		
		int[] orgList = doSort(randList);
		
		System.out.println("\n\nSORTED LIST (with the bubbles)!\n");
		
		for(int j = 0; orgList.length > j; j++)
		{
			System.out.print(orgList[j]+ " ");
		}
	}

}
