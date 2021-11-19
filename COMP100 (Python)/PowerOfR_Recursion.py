#method that finds n to the power of r with recursion
def power(n,r):
    if r == 0:
        return 1
    else:
        return n * power(n,r-1)
#main method that takes user input and calls power method
def main():
    n = int(input("Enter a number: "))
    r = int(input("Enter a power: "))
    print("{} to the power of {} is {}".format(n,r,power(n,r)))
main()
