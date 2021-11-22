spy = float(input("Enter amount invested in SPY: "))
if spy <= 0:
    exit(print("Value must be positive."))
qqq = float(input("Enter amount invested in QQQ: "))
if qqq <= 0:
    exit(print("Value must be positive."))
eem = float(input("Enter amount invested in EEM: "))
if eem <= 0:
    exit(print("Value must be positive."))
vxx = float(input("Enter amount invested in VXX: "))
if vxx <= 0:
    exit(print("Value must be positive."))
total = spy + qqq + eem + vxx
print("ETF", "PERCENTAGE", sep='\t')
print("-" * 20)
print("SPY", "{:.2%}".format(spy / total), sep='\t')
print("QQQ", "{:.2%}".format(qqq / total), sep='\t')
print("EEM", "{:.2%}".format(eem / total), sep='\t')
print("VXX", "{:.2%}".format(vxx / total), sep='\t')
print("{0:s}: ${1:,.2f}".format("TOTAL AMOUNT INVESTED", total))
