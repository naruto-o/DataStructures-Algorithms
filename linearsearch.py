def linear_search(list1,n,key):

    #Searching list sequentially
    for i in range(0,n):
        if(list1[i]==key):
            return i
    return -1

list1 = [1,2,3,4,5,6,7,8,9,"geeks","lol"]
key = "geeks"
n = len(list1)
res = linear_search(list1, n, key)
if (res==-1):
    print("element not found")
else:
    print("element found at index",res)