User_number = input("Take the number as input ")




def fib(User_number):
    number1 = 0
    number2 = 1
    sum = 0
    while(sum < int(User_number)):
        print(sum,end= " ")
        sum = number1 + number2
        number1 = number2
        number2 = sum
        

y = fib(User_number)






