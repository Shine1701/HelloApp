<<<<<<< HEAD
#include <iostream>
using namespace std;

int main(int argc, char* argv[])
{
    if(argc > 1)
    {
        cout << "Hello " << argv[1] << endl;
    }
    else
    {
        cout << "Hello World" << endl;
    }

    return 0;
=======
class HelloApp
{
    public static void main(String[] args) 
    {
        if(args.length > 0) 
        {
            System.out.println("Hello " + args[0]);
        } 
        else 
        {
            System.out.println("Hello World");
        }
    }
>>>>>>> feature/UC3
}