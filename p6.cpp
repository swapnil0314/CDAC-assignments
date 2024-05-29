#include<iostream>
#include<vector>
#include<string>

using namespace std;

//struct Book: Defines a structure named Book which groups together different data types into a single type.
struct Book
{
    string title;
    string author;
    int id;
    float price;
};

//void addBook(vector<Book>& inventory): Function to add a new book to the inventory. 
//It takes a reference to a vector of Book objects as a parameter.
void addBook(vector<Book> &inventory)
{
    Book newBook;
    cout<< "Enter book title: ";
    cin.ignore();      //cin.ignore();: Ignores any leftover newline character in the input buffer from previous cin operations.
    getline(cin , newBook.title);   //getline(cin, newBook.title);: Reads the entire line of text for the book's title.

    cout<< "Enter book author: ";
    getline(cin , newBook.author);

    cout<< "Enter book id : ";
    cin>> newBook.id;

    cout<< "Enter book price: ";
    cin>> newBook.price;

    inventory.push_back(newBook); //inventory.push_back(newBook);: Adds the new book to the inventory vector.
    cout<< "Book added successfully ! "<<endl;

}


void displayBooks(const vector<Book> &inventory)
{
    if (inventory.empty())
    {
        cout<< "No Books in inventory. "<< endl;
        return;
    }

    for (const auto& book : inventory )
    {
        cout<< "Title: " << book.title << endl;
        cout << "Author: " << book.author << endl;
        cout << "ID: " << book.id << endl;
        cout << "Price: $" << book.price << endl;
        cout << "-----------------------" << endl;
    }
      
}

void searchBookById(const vector<Book>& inventory, int id) {
    for (const auto& book : inventory) {
        if (book.id == id) {
            cout << "Book found!" << endl;
            cout << "Title: " << book.title << endl;
            cout << "Author: " << book.author << endl;
            cout << "ID: " << book.id << endl;
            cout << "Price: $" << book.price << endl;
            return;
        }
    }
    cout << "Book with ID " << id << " not found." << endl;
}
int main()
{
    vector<Book> inventory;

    int choice;
    while (true)
    {
        cout<< "\nBook Inventory Management System" <<endl;

        cout<< "1. Add a new book "<<endl;
        cout<< "2. Display all Books" <<endl;
        cout<< "3. Search for a book by ID" <<endl;
        cout<< "4. Exit"<<endl;
        cout<< "Enter your choice : ";

        cin>> choice;

        switch (choice)
        {
        case 1:
            addBook(inventory);
            break;
        
         case 2:
            displayBooks(inventory);
            break;
        
         case 3:
            int searchId;
            cout<< "Enter book Id to search : ";
            cin>> searchId;

            searchBookById(inventory , searchId);
            break;

         case 4:
           
            cout<< "Exiting the program . " << endl;
            return 0;
        
        default:
            cout<< "Invalid choice : "<< endl;
        }

    }
    

}