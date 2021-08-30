list_numbers = [1,3,4]


def sumOfList(list_number):  
    sum = 0  
    for numbers in list_numbers:
        sum = sum + numbers
    return sum
y = sumOfList(list_numbers)
print("Sum of list {}".format(y))
