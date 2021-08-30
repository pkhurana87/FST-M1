def Sum(number):
    if number == 0:
        return number
    else:
        return number + Sum(number-1)

number = 1
y = Sum(number)
print("Sum of number {}".format(y))
    