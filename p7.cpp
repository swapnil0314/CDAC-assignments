#include <iostream>
using namespace std;
int main()
{
    int *intPtr = nullptr;
    double *doublePtr = nullptr;
    char *charPtr = nullptr;
    float *floatPtr = nullptr;


    intPtr = new int;
    doublePtr = new double;
    charPtr = new char;
    floatPtr = new float;

    *intPtr = 18;
    *doublePtr = 3.142;
    *charPtr = 'A';
    *floatPtr = 9.81f;

    cout<< "Integer pointer (intPtr):  " << intPtr << ", Value : " << *intPtr << endl;
    cout<< "Double pointer (doublePtr):  " << doublePtr << ", Value : " << *doublePtr << endl;
    cout<< "Char pointer (charPtr):  " << intPtr << ", Value : " << *charPtr << endl;
    cout<< "Float pointer (floatPtr):  " << floatPtr << ", Value : " << *floatPtr << endl;

    delete intPtr;
    delete doublePtr;
    delete charPtr;
    delete floatPtr;

    return 0;
}