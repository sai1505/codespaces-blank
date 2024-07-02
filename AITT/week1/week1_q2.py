def maxMin(num):
    MaxVal=num[len(num)-1]
    MinVal=num[0]
    for i in range(len(num)):
        if(num[i]>MaxVal):
            MaxVal=num[i]
        elif(num[i]<MinVal):
            MinVal=num[i]
    print("Max Value :",MaxVal)
    print("Min Value :",MinVal)
a=list(map(int,input("Enter the list : ").split()))
maxMin(a)