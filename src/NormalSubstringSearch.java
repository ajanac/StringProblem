
public class NormalSubstringSearch {
	boolean hasSubstring(char[]string1,char[]pattern){
		System.out.println(string1.length+" "+pattern.length);
		int i=0;
		int j=0;
		int k=0;
		while(i<string1.length & j<pattern.length){
			if(string1[i]==pattern[j]){
				i++;
				j++;
				
			}else{
				j=0;
				k++;
				i=k;
				}
		}
		System.out.println("i="+i+"j="+j+"k="+k);
		if(j==pattern.length)
			return true;
		return false;
	}

}
