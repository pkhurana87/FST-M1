newlist = list(input("Enter list: "))
c=0
print(newlist)
for item in newlist:
  print(item) 
  c=int(item)+c
 
print("Sum of numbers in list: "+str(c))