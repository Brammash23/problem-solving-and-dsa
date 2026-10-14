class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> MagazineMap = new HashMap<>();

        // for(char piece : magazine)
        // {
        //     MagazineMap.put(piece,MagazineMap.getOrDefault(piece,0)+1);
        // }


for (char piece : magazine.toCharArray()) {
    MagazineMap.put(piece, MagazineMap.getOrDefault(piece, 0) + 1);
}

        for(char ransom : ransomNote.toCharArray())
        {
            if(MagazineMap.getOrDefault(ransom,0) == 0)
            {
                return false;
            }
            MagazineMap.put(ransom,MagazineMap.getOrDefault(ransom,0)-1);
        }

        return true;

      
        
    }
}