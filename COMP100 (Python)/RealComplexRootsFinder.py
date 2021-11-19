import math
import cmath

#method that calculats real roots and complex roots of a quadratic equation
def quadratic_roots(a, b, c):
    #calculate the discriminant
    d = (b**2) - (4*a*c)
    if d >= 0:
        #calculate the real roots
        print("The real roots are:")
        x1 = (-b + math.sqrt(d))/(2*a)
        x2 = (-b - math.sqrt(d))/(2*a)
    elif d < 0:
        #calculate the complex roots
        print("The complex roots are:")
        x1 = (-b + cmath.sqrt(d))/(2*a)
        x2 = (-b - cmath.sqrt(d))/(2*a)
    #return the roots
    return x1, x2
def main():
    #get the coefficients
    a = float(input("Coefficient of a: "))
    b = float(input("Coefficient of b: "))
    c = float(input("Coefficient of c: "))
    #call the quadratic_roots function
    x1, x2 = quadratic_roots(a, b, c)
    #print the roots
    print(x1, x2)
main()
