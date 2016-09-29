#include <iostream> 
#include <string>
using namespace std;

int unique_check (long num) 
{
        string str = to_string(num);
        int flag = 0;
        for (int i = 0; i < 9; i++) 
        {
                for (int j = i+1; j < 10; j++) 
                {
                        if (str[i] == str[j])
                        {
                                flag = 1;
                                break;
                        }
                }
        }
        if(flag==0) return 1;
        else return 0;
}

int main()
{
        long i, j, n, c = 0;

        for (i=1000000080; i<=9999999990; i+=90) 
        {
                for (n=i,j=10; j>1; n/=10,j--) 
                        if (n%j) break;
                if (j==1 && unique_check(i))
                {
                        cout << "Answer is : " << i << endl;
                        break;
                }
        }
        return 0;
}

