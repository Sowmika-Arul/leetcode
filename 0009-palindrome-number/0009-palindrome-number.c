bool isPalindrome(int x){
    long int rev=0;
    int pal=x,i=0,rem;
if(x<0)
{
    return false;
}
else
{
    while(pal!=0)
    {
        rem=pal%10;
        if(rem==0&&i==0)
        {
          return false;
        }
        rev=(rev*10)+rem;
        pal=pal/10;
        i++;
    }
    if(rev==x)
    {
        return true;
    }
}
 return 0;
}