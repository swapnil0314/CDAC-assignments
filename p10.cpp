#include<iostream>
using namespace std;

void processPointer(int *ptr)
{
    if (ptr != nullptr)
    {
        cout<< "Processing the pointer with value : " << *ptr << endl;
    }
    else
    {
        cout<< "Pointer is NULL . Cannot Process. "<< endl;
    }
    
}


int main()
{
    int *ptr = nullptr;

    processPointer(ptr);

    ptr = new int;
    *ptr = 18;

    processPointer(ptr);

    delete ptr;

    return 0 ;
}