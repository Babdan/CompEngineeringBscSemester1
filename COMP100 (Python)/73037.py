principal_amt = eval(input("Enter the amount of the loan: "))
if principal_amt<0:
	exit(print("Loan amount cannot be a negative number."))
rate = eval(input("Enter the interest rate: "))
if rate<0 or rate>100:
	exit(print("Interest rate must be between 0 and 100."))
loan = eval(input("Enter the duration in months: "))
if loan<=0:
	exit(print("Duration must be at least one month."))

monthlyRate = rate / 1200
realizedInterest = (monthlyRate+(monthlyRate/(((1+monthlyRate)**loan)-1)))
monthlyPayment = ((principal_amt * realizedInterest*(1 + realizedInterest)**loan)/((1+realizedInterest)**loan))
totalInterest = ((loan * monthlyPayment) - principal_amt)
print ("Monthly payment:", '${:,.2f}'.format(monthlyPayment))
print("Total interest paid: ${:,.2f}".format(totalInterest))
