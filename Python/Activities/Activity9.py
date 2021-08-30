UserList1 = list(input("User first list input: "))
UserList2 = list(input("User first list input: "))
userList3 = list()
print(UserList1)
for i in UserList1:
    if int(i)%2!=0:
        userList3.append(int(i))

for j in UserList2:
     if int(j)%2==0:
        userList3.append(int(j))

print(userList3)