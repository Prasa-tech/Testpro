a=10
b=5

addition=a+b
sub=a-b
multi=a*b
div=a/b
power=a**b 


print(addition)
print(sub)
print(multi)
print(div)
print(power)

age= 28
isHappy= True

if age >21:
    print('you are old!')
elif age ==18:
    print('You are getting old')
else:
    print('you are still young')


if isHappy :
       print('You are happy!')
else:
        print('You are not happy!')
        
        
for i in range(3):
    print ('Hello', i+1)
print(range(3))

k = 0
while k < 5:
    k=k+1
    print(k)  
    
    
#while True:
#    user_input = input ('enter something >>')   
#    if user_input == '0':
#        print('We are done here.')
#        break
    
    
    
def say_hello(name):
   print ('Hey There',name) 
   
say_hello('Mario')
say_hello('Luigi')


def get_internet():
    pass
def run_game():
    pass



number=input('please provide a number>>')
try: 
    print(10 + int(number))
except:
    print('that is not a valid number!')


    