package com.learning.a2zcj.basics.inq;

public class DuplicateCharacterInString {

	public void getDuplicateAlphabetInString(String input)
	{
		char[] chararr=input.toCharArray();
		
		int count;
		for(int i=0;i<chararr.length-1;i++)
		{
			count=1;
			for(int j=i+1; j<chararr.length;j++)
			{
				if(chararr[i]!='@')
				{
					if(chararr[i]==chararr[j])
					{
						count++;
						chararr[j]='@';
					}
				}
				
			}
			if(chararr[i]!='@')
			{
				System.out.println(chararr[i]+ " : "+count);
			}			
		}
		
		
	}
	
}
