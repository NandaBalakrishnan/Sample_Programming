#first method
t=str(input())
print(''.join(sorted(set(t),key=t.index)))

#**********************************************
#second method

from collections import OrderedDict
t=str(input())
print(''.join(OrderedDict.fromkeys(t)))

