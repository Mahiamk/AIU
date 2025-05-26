#Create a list of three names 
"""
subjects = ["Biology", "Artficial Intelligence", "Machine Learning"]
print(subjects[1])
numbers = [1, 2, 2, 4, 3, 4, 5, 5]
new_numbers = []
for i in numbers:
  if i not in new_numbers:
    new_numbers.append(i)
print(new_numbers)

fruits = ("apple", "banana", "cherry")
print(fruits[-1])


myTuple = ("apple", "banana", "cherry")
myList=list(myTuple)
myList[1] = "orage"
myTuple = tuple(myList)
print(myTuple)


colors = {"red", "green", "blue"}
colors.add("gray")
print(colors)

set1={1, 2,3,4,5,7,9}
set2={1, 2,3,4,5,6,8}
updateset1=set1-set2
updateset2=set2-set1
print(updateset1)
print(updateset2)

carInformation = {
    "brand": "lamborghini",
    "model": "aventador",
    "year": 2021,
    "color": "black",
    "price": 400000,
}
print(carInformation["model"])
"""
student1 = {
    "name": "Anwar",
    "age": 20,
    "major": "Computer Science",
    "future study": "AI Engineer",
    "university": "Albukhary International University",
    "hobby": "Video Game",    
}
student1["age"] = 21
del student1["hobby"]
for key, value in student1.items():
    print(f"{key}: {value}")
