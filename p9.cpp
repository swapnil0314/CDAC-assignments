
#include <iostream>
using namespace std;

int main()
{
    int *ptr;

    ptr = new int ;

    if (ptr == nullptr)
    {
        cerr<< "Memory allocation failed. " <<endl;
        return 1;
    }
    
    *ptr = 18;

    cout<< "value stored at adress" << ptr << ": " << *ptr << endl;

    delete ptr;

    return 0;
}