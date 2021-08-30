import pandas
dataframe = pandas.read_csv('User_Details.csv')
print(dataframe)
print(dataframe["Usernames"])

print(dataframe[1:2])

print(dataframe.sort_values("Usernames"))

print(dataframe.sort_values("Passwords"))