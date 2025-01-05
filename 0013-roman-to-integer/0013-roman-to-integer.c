int romancharToInt(char c)
{
    switch(c){
        case 'I' : return 1;
        case 'V' : return 5;
        case 'X' : return 10;
        case 'L' : return 50;
        case 'C' : return 100;
        case 'D' : return 500;
        case 'M' : return 1000;
        default : return 0;
    }
}
int romanToInt(char* s) {
   int n = strlen(s);
   int sum = 0;
   int current, next;
   for(int i = 0; i < n; i++)   {
    current = romancharToInt(s[i]);
    next = romancharToInt(s[i+1]);
    if(current < next)
    {
        i++;
        sum+= next - current;
    }
    else
        sum+=current;
   }
   return sum;
}