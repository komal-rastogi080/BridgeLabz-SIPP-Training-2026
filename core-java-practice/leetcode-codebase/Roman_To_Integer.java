class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='I'){
                ans+=1;
            }
            else if(i > 0 && s.charAt(i)=='V' && s.charAt(i-1)=='I')
            ans+=3;
            else if(s.charAt(i)=='V')
            ans+=5;
            else if(i > 0 && s.charAt(i)=='X' && s.charAt(i-1)=='I')
            ans+=8;
            else if(s.charAt(i)=='X')
            ans+=10;
            else if(i > 0 && s.charAt(i)=='L' && s.charAt(i-1)=='X')
            ans+=30;
            else if(s.charAt(i)=='L')
            ans+=50;
            else if(i > 0 && s.charAt(i)=='C' && s.charAt(i-1)=='X')
            ans+=80;
            else if(s.charAt(i)=='C')
            ans+=100;
            else if(i > 0 && s.charAt(i)=='D' && s.charAt(i-1)=='C')
            ans+=300;
            else if(s.charAt(i)=='D')
            ans+=500;
            else if(i > 0 && s.charAt(i)=='M' && s.charAt(i-1)=='C')
            ans+=800;
            else if(s.charAt(i)=='M')
            ans+=1000;
        }
        return ans;
    }
}