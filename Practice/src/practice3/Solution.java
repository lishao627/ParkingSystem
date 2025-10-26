package practice3;

public class Solution {
public String longestCommonPrefix(String[] strs) {
    if (strs==null||strs.length==0){
        return "";
    }
    String prefix=strs[0];
    int count==strs.length;
    for(int i=1;i<count;i++){
        prefix=longestCommonPrefix(prefix,strs);
        if(prefix.length()==0){
            break;
        }
    }
    return prefix;
}
public String  longestCommonPrefix(String s1, String s2) {
    int len1=s1.length();
}
}
