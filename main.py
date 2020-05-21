#John Sheehan
#Code Formatter

stack = []

try:
    infile = open("Runner.java", "r")
except:
    print("Could not read file")

try:
    outfile = open("Formatted_Runner.java", "w")
except:
    print("Could not create output file")


#Read file line by line and format each line accordingly
while True:
    
    line = infile.readline()  
    line.strip()
    if not line:
        break
    
    if '{' in line and len(line) > 1:
        #Replace first instance of { with null character
        #Print { on the next line
        line = line.replace('{', '', 1)
        outfile.writelines([line, '{\n'])
        
    else:
        outfile.write(line) 

infile.close()
outfile.close()    