#!/usr/bin/python
import matplotlib.pyplot as plt

#BEST Graph
Counts_BEST=[]
bst=[]
a=0
file=open("PowerAVLOutputs/min.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_BEST.append(float_count)
	bst.append(a)
	a+=1

#Average Graph
Counts_AVG=[]
avg=[]
b=0
file=open("PowerAVLOutputs/avg.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_AVG.append(float_count)
	avg.append(b)
	b+=1

#Worst Graph
Counts_WORST=[]
worst=[]
c=0
file=open("PowerAVLOutputs/max.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_WORST.append(float_count)
	worst.append(c)
	c+=1

plt.title('Graph of Number of Count Operations Against Number of Sampled Data Items for AVLTree')

plt.subplot(3,1,1)
plt.ylabel('No. of Count Operations')
plt.xlabel('No. of Sampled Data Items')
plt.plot(bst,Counts_BEST, 'g--'  )
#plt.plot(avg,Counts_AVG, 'b--'  )
plt.subplot(3,1,2)
plt.plot(avg,Counts_AVG, 'b--'  )
plt.subplot(3,1,3)
plt.plot(worst,Counts_WORST, 'r--'  )
plt.show()
