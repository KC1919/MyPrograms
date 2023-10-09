class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char a[]=new char[26];

        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            a[ch-'a']++;
        }

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(a[ch-'a']>0){
                a[ch-'a']--;
            }
            else return false;
        }
        return true;
    }
}