#program which will take a list of numbers and return the minimum, maximum and avarage of all the numbers in the list after entering negative values to end the program
count = 0
total = 0
print("(Enter -1 to terminate entering numbers.)")
num = eval(input("Enter a nonnegative number: "))
min = num
max = num
if num < 0:
    exit(print("Count has to be greater than 0 or greater than 0"))
while num != -1:
    count += 1
    total += num
    if num < min:
     min = num
    if num > max:
     max = num
    num = eval(input("Enter a nonnegative number: "))
if count > 0:
    print("Minimum:", min)
    print("Maximum:", max)
    print("Avarage:", total / count)
else:
    print("No nonnegative numbers were entered.")
