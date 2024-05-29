#include<iostream>
using namespace std;

// 8. Write a C++ program to compute the quotient and remainder.
// Sample Output:
// ------------------------------------
// Input the dividend : 25
// Input the divisor : 3
// The quotient of the division is : 8
// The remainder of the division is : 1


int main()
{
    int dividend ;
    int divisor;

   cout<<"Enter the dividend : ";
   cin>> dividend;

   cout<<"Enter the divisor : ";
   cin>> divisor;

   int quotient = dividend/divisor;
   int remainder = dividend%divisor;

   cout<< " THe quotient is : " << quotient;

   cout<< " THe remainder is : " << remainder;


}
