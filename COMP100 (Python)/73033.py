price = float(input("Enter price of item: "))
pounds = float(input("Enter pounds: "))
ounces = float(input("Enter ounces: "))
weightInOunces = 16 * pounds + ounces
pricePerOunce = price / weightInOunces
if ounces >15:
    print("There are 16 ounces in 1 pound. Please enter weight of 16 ounces or more in pound form.")
else:
    print("Price per ounce: ${0:.2f}".format(pricePerOunce))