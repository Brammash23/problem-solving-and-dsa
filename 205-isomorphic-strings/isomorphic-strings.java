class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap <Character,Integer> first = new HashMap<>();
        HashMap <Character,Integer> second = new HashMap<>();


        if(s.length() != t.length())
        {
            return false;
        }

        for(int i=0;i<s.length();i++)
        {
            
            if(!first.getOrDefault(s.charAt(i),-1).equals(second.getOrDefault(t.charAt(i),-1)))
            {
                return false;
            }
            first.put(s.charAt(i),i);
            second.put(t.charAt(i),i);

        }

        return true;
        
    }
}