//5. Write a C++ program that calculates the volume of a sphere, cube &
//cylinder.

// Sphere:
// ---------------------------------------
// Input the radius of a sphere : 6
// The volume of a sphere is : 904.32
// Cube:
// ---------------------------------------
// Input the side of a cube : 5
// The volume of a cube is : 125
// Cylinder:A=2πrh+2πr2
// -----------------------------------------
// Input the radius of the cylinder : 6
// Input the height of the cylinder : 8
// The volume of a cylinder is : 904.32


#include<iostream>
using namespace std;

void Sphere(int ino)
{
    float isphere = (4/3 * (3.14 * ino*ino*ino) );

    cout<<"The Area of the sphere is : "<<isphere <<endl;

}

void Cube(int ino)
{
    float icube = (ino * ino * ino );

    cout<<"The cube  of the number is : "<<icube  <<endl ;
    
}

void Cylinder(int ino , int h)
{   
    float icylinder = (2 * 3.14 * ino * h)  + (2 * 3.14 * ino * ino);

    cout<<"The area  of the cylinder is : "<< icylinder <<endl;
    
}

int main()
{
    int ino = 5;
    int h = 15;

    Sphere(ino);

    Cube(ino);

    Cylinder(ino , h);
}


