n1 = 130
n2 = 0
while n1>=65:
   n1 = n1 - (0.13*n1)
   n2 = n2 + 1
print("CAFFEINE VALUES")
print("One cup: less than 65 mg. will remain after " + str(n2)+ " hours.")
n1 = 130
n2 = 24
while n2 > 0:
   n1 = n1 - (0.13*n1)
   n2 = n2 - 1
n1 = str(round(n1,2))
print("One cup: " + str(n1) + " mg. will remain after 24 hours.")

res = 0
z = 130
n2 = 25
while n2>0:
   n2 = n2 - 1
   res = z + res - 0.13*res

res = str(round(res,2))
print("Hourly cups: "+ str(res)+ " mg. will remain after 24 hours.")
