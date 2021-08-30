Play = "Yes"

while Play == "Yes":
    User1 = input("First user enters:")
    User2 = input("Second user enters:")
    if(User1=="R"):
        if User2 == "S":
            print("User1 wins with rock")
        elif User2 == 'P':
            print('User 2 wins wit Paper')
        elif User2 == 'R':
            print("Draw")
        else:
            print('Invalid input')
    elif User1 == 'S':
        if User2 == "R":
            print("User1 wins with Paper")
        elif User2 == 'P':
            print('User 1 wins with scissor')
        elif User2 == 'S':
            print("Draw")
        else:
            print('Invalid input')
    elif User1 == 'P':
        if User2 == "R":
            print("User2 wins with rock")
        elif User2 == 'S':
            print('User 2 wins with scissor')
        elif User2 == 'P':
            print("Draw")
        else:
            print('Invalid input')
    else: 
        print("Invalid input")
    Play = input("Another round to play: ")
else:
    print("User doesn't want to play")