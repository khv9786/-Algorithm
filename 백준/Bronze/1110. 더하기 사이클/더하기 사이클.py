Num = int(input())
n= Num
finish = 0

while True:
    a = n//10
    b = n%10
    c = (a+b)%10
    n = b*10 + c
    finish += 1
    
    if(n == Num):
        break
        
print(finish)
    