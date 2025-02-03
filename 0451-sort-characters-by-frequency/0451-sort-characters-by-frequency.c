char* frequencySort(char* s) {
    int freq[128] = {0};
    char ans[strlen(s)+1];
    for(int i = 0; i < strlen(s); i++)
    freq[(int)s[i]]++;
    for(int i = 0 ; i < strlen(s);)
    {
        int max = 0;
        int ind = 0;
        for(int j = 0; j < 128; j++)
        {
            if(max < freq[j])
            {
            max = freq[j];
            ind = j;
            }
        }
        while(freq[ind] > 0)
        {
           ans[i++] = (char)ind;
           freq[ind]--;
        }
    }
     ans[strlen(s)] = '\0';  // Null-terminate the string
        strcpy(s, ans);   // Copy result back to original input string
        return s;
}