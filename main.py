#John Sheehan
#Code Formatter

stack = []

file = open('Runner.java', 'r')

count = 0

while True:
    
    
    c = file.read(1)
    if not c:
        break
    
    if c == '{':
        stack.append(c)
        count += 1
        print(count)
    
    elif c == '}':
        stack.pop()
        count -= 1
        print(count)
        
if stack.count('{') == 0:
    print("Program is balanced")       