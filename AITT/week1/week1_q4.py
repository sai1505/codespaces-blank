def prime(a):
    c=0;l=[]
    for i in range(len(a)):
        if(a[i]==1):
            continue
        for j in range(2,len(a)):
            if(a[i]%j==0 and a[i]/j!=1):
                c=0;break
            else:
                c+=1
        if(c>0):
            l.append(a[i])
    return l
a=list(map(int,input("Enter the list : ").split()));print(prime(a))