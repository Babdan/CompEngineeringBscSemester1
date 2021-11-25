initialDeposit = eval(input("Enter amount deposited: "))
balance = initialDeposit
interest = "Enter annual rate of interest; such as .02, .03, or .04: "
annualRateOfInterest = eval(input(interest))
print("\n{0}{1:>15}".format("Year", "Balance"))
year = 1
for year in range(1, 5):
    balance += balance * annualRateOfInterest
    print("{0:>2}{1:>12}{2:<13}".format(year, "$", balance))
