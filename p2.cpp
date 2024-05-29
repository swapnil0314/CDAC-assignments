//2. Write a program in C++ to print the sum of two numbers and swap them
//as well.


#include<iostream>
using namespace std;

   int sum(int ino1 , int ino2)
    {
        int i = ino1+ino2;

        return i;
    }

    void swap(int ino1 , int ino2)
    {
        

        int i = ino1; 
        ino1 = ino2;
        ino2 = i;

        cout<<"The numbers after swappnig are : "<< ino1 ;
        cout<<"The numbers after swappnig are : "<< ino2 ;

    }

int main()
{
    int ino1 = 18;
    int ino2 = 03;

    sum(ino1,ino2);

    int isum = sum(ino1,ino2);
    
        cout<<"The sum of the two number is : "<<isum <<" ";


    swap(ino1 , ino2);
}