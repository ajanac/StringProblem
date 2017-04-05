package kmppattern;

public class KMPPatternSearch {
	// function to create a temporary array
	private int[] computePrefixArray(char pattern[]){
		int[]prefix=new int[pattern.length];
		int j=0;
		for(int i=1;i<pattern.length;){
			if(pattern[i]==pattern[j]){
				prefix[i]=j+1;
				i++;
				j++;
			}
			else{
				if(j!=0)
					j=prefix[j-1];
				else{
					prefix[i]=0;
					i++;
				}
			}	
		}
		return prefix;
	}
	//KMP algorithm for pattern matching
	
	boolean hasSubstring(char[] text, char[]pattern){
		int prefixArray[]=computePrefixArray(pattern);
		// index variables
		int i=0;
		int j=0;
		int k=0;
		while(i<text.length& j<pattern.length){
			if(text[i]==pattern[j]){
				i++;
				j++;
			}
			else{
				if(j!=0){
					j=prefixArray[j-1];
				}
				else{
					i++;
				}
			}
		}
		if(j==pattern.length)
			return true;
	return false;	
	}

}
