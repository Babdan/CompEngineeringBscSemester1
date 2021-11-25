#function sum_greater(arr, thresh), which takes a list of integers arr, and returns the sum of values greater than or equal to a given threshold value, thresh.
def sum_greater(arr, thresh):
    sum = 0
    for i in arr:
        if i >= thresh:
            sum += i
    return sum
#method that takes user input list untill user presses enter, and calls sum_greater function
def main():
    arr = []
    while True:
        try:
            x = int(input("Enter an integer: "))
            arr.append(x)
        except ValueError:
            break
    thresh = int(input("Enter a threshold: "))
    print(sum_greater(arr, thresh))
main()
