class Solution {
public:
    int possibleStringCount(string word) {
        int count=0;

        for(int i=1; i<word.size(); i++){
            if(word[i-1]==word[i]){
                count++;
            }
        }

        return count+1;
    }
};
