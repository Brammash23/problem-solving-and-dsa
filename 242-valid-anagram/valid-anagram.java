class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> StringMap = new HashMap<>();

        if(s.length() != t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
        StringMap.put(s.charAt(i),StringMap.getOrDefault(s.charAt(i),0) + 1);
        } 

        for(int j=0;j<t.length();j++)
        {
        if(!StringMap.containsKey(t.charAt(j)))
        {
            return false;
        }
        StringMap.put(t.charAt(j),StringMap.getOrDefault(t.charAt(j),0) - 1);
        } 

                for(int count:StringMap.values())
        {
        if(count !=0)
        { return false;}
        }



        return true;

        
    }
}