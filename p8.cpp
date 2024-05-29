#include<iostream>
using namespace std;

int main()
{
    int *wildPtr;


    int localVar = 10;
    wildPtr = &localVar;

    cout<< "Value of wild pointer : " << *wildPtr << endl;

    return 0;
}