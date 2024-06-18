#include<iostream>
using namespace std;
void swap(int *a,int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
int main()
{
    //call by reference
    int x =10, y=20;
    cout<<"Value of x before swapping :"<<x<<endl;
    cout<<"Value of y before swapping :"<<y<<endl;
    swap(&x,&y);
    cout<<"Value of x after swapping :"<<x<<endl;
    cout<<"Value of y after swapping :"<<y<<endl;
}
