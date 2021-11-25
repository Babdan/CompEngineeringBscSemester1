print("Python")
print("Python"[1], "Python"[5], "Python"[2: 4])
str1 = "Hello World!"
print(str1.find('W'))
print(str1.find('x'))
# example 2
numberOfGees = "Good Doggie".upper().count('G')
print(numberOfGees)
# example 3
fullName = input("Enter a full name: ")
n = fullName.rfind(" ")
print("Last name:", fullName[n + 1:])
print("First name(s):", fullName[:n])
# example 4
print(int("23"))
print(float("23"))
print(eval("23"))
print(eval("23.5"))
x = 5
print(eval("23 + (2 * x)"))
# example 5
quotation = ("Well written code is its own " +
             "best documentation.")
# example 6
print("Hello", "World!", sep="**")
print("Hello", "World!", sep="")
print("1", "two", 3, sep=" ")
# example 7
print("01234567890123456")
print("a\tb\tc")
print("a\tb\tc".expandtabs(5))
print("Nudge, \tnudge, \nwink, \twink.".expandtabs(11))
# example 8
print("0123456789012345678901234567")
print("Rank".ljust(5), "Player".ljust(20), "HR".rjust(3), sep="")
print('1'.center(5), "Barry Bonds".ljust(20), "762".rjust(3), sep="")
print("2".center(5), "Hank Aaron".ljust(20), "755".rjust(3), sep="")
print('3'.center(5), "Babe Ruth".ljust(20), "714".rjust(3), sep="")
# example 9
print("0123456789012345678901234567")
print("{0:^5s}{1:<203}{2:>3s}".format("Rank", "Player", "HR"))
print("{0:^5n}{1:<203}{2:>3n}".format(1, "Barry Bonds", 762))
print("{0:^5n}{1:<205}{2:>3n}".format(2, "Hank Aaron", 755))
print("{0:^5n}{1:<203}{2:>3n}".format(3, "Babe Ruth", 714))
