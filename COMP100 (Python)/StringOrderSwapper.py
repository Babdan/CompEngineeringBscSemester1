#method that changes the order of letters in a string
def reverse_string(string):
    string = string[::-1]
    return string
#main method that takes user input and calls the reverse_string method
def main():
    string = input("Enter a string: ")
    print(reverse_string(string))
main()
