'''
file1 = open("elenco_lauree.txt")
lines = file1.read()
file2 = open("elenco_lauree_nuovo.txt","w")
lines = lines.split("\n")
for elem in lines:
    if(elem=="Laurea magistrale"):
        break
    print(elem[13:],file=file2)

file1 = open("elenco_lauree_magistrali.txt")
file2 = open("temp","w")
lines = file1.read()
lines = lines.split("\n")
for elem in lines:
    elem = "LM - " + elem
    print(elem,file=file2)

file1.close()
file2.close()

file2 = open("temp")
file1 = open("elenco_lauree_magistrali.txt","w")
lines = file2.read().split("\n")
for elem in lines:
    print(elem,file=file1)
file1.close()
file2.close()

'''
file1 = open("elenco_lauree_triennali.txt")
file2 = open("temp","w")
lines = file1.read().split("\n")
for elem in lines:
    if(elem[7:9]=="in"):
        elem = elem[10:]
    else:
        elem = "Laurea" + elem[6:]
    print(elem,file=file2)