// Last updated: 8/8/2026, 9:08:34 AM
1class Solution {
2    public boolean isPalindrome(String ss) {
3        String s=ss.toLowerCase();
4        StringBuilder sb=new StringBuilder();
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            if(Character.isLetterOrDigit(ch)){
8                sb.append(ch);
9            }
10        }
11        String res=sb.toString();
12        String com="";
13        for(int i=res.length()-1;i>=0;i--){
14            char ch=res.charAt(i);
15            com=com+ch;
16        }
17        if(res.equals(com)){
18            return true;
19        }
20        else{
21            return false;
22        }
23    }
24}