import java.util.*;
class Solution {
    public String sortSentence(String s) {
    StringTokenizer st = new StringTokenizer(s);   
    int n=st.countTokens();
    String a[]=new String[n];
    while(st.hasMoreTokens())
    {
        String k=st.nextToken();
        String m=k.substring(0,k.length()-1);
        a[Character.getNumericValue(k.charAt(k.length()-1))-1]=m;
    }
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < a.length; i++) {
        stringBuilder.append(a[i]+" ");
    }
    return stringBuilder.toString().trim();
    }
}

/*
class Solution {
    public String sortSentence(String s) {
        String [] arr=s.split(" ");
        HashMap<Integer,String> mp=new HashMap<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            int l=arr[i].length();
            int ch=(int)(arr[i].charAt(l-1)-'0');
            mp.put(ch,arr[i].substring(0,l-1));    
        }
        for(int i=1;i<=mp.size();i++){
            res.append(mp.get(i));
            res.append(" ");
        }
        return res.toString().trim();        
    }
}
*/
