'''
Created on Apr 23, 2026

@author: prasa
'''



birthyear = input("Enter your birthyear :")
age = 2026 - int(birthyear)
print(age)

first = input  ("Enter first number:")
second = input ("Enter second number:")
sum=float(first)+float(second)
print("Sum is :"+str (sum))

course ="python for beginners"
print(course.upper())
print(course)
print(course.replace('for', '4'))
print('python' in course)

print(10 // 3)
print(10 % 3)
print (10/3)


weight = int (input ("Weight:"))
unit= input ("'K'gs or 'L'bs:")
if unit.upper()== "K":
    converted = weight/0.45
    print("Weight in Lbs:" + str(converted))
    
else:
    converted =weight * 0.45
    print("Weight in Kgs :"+ str(converted))
    
    
    numbers = [1,2,3,4,5]
    for item  in numbers:
         print("item is:" + str(item))
    
    
    
    
    i=0
    while (i < len (numbers)):         
        print( numbers[i])
        i=i+1
     
    
    
    numbers = range(5,10,2)
    for number in range(5):
      print(number)
    
    
    def add(a: float, b: float) -> float:
        return a+b
        
        
    print(add (10,20))
        
    
    