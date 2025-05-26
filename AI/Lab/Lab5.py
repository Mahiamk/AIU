'''
df=pd.read_csv("Salary_Data (1).csv")
print(df[["YearsExperience", "Salary"]])


df = pd.DataFrame(data)
df.to_csv("students_small.csv", index=False)
MyData= pd.read_csv("students_small.csv")
print(MyData)
'''
"""
data = {
    "Name": ["Anwar", "Robe", "Kedir", "Esmail", "Kane"],
    "Age": [20, 22, 23, 23, 20],
    "Grade": ["A", "B", "A", "C", "B"]
}
df = pd.DataFrame(data)
df.to_csv("students.csv", index=False)
pd.read_csv("students.csv")
print(df.head(3))
print(df[["Name","Grade"]])
"""
"""
products = {
    "Product Name": ["Laptop", "Smartphone", "Headphones", "Monitor", "Keyboard"],
    "Price": [1200.00, 800.00, 150.00, 300.00, 50.00],
    "Stock Quantity": [10, 25, 50, 15, 40]
}

df = pd.DataFrame(products)

df.to_csv("products.csv", index=False)
df = pd.read_csv("products.csv")

print("Product Data:")
print(df)
"""
import pandas as pd

df = pd.read_csv("products.csv")

print(df[["Product Name", "Stock Quantity"]])
high_stock = df[df["Stock Quantity"] > 50]
print(high_stock[["Product Name", "Stock Quantity"]])
