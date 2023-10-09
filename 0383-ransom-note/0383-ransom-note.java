class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char a[]=new char[26];

        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            a[ch-'a']++;
        }

        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            int idx=ch-'a';
            if(a[idx]>0){
                a[idx]--;
            }
            else return false;
        }
        return true;
    }
}