#!/usr/bin/python
import matplotlib.pyplot as plt

#BEST Graph AVL
Counts_BEST=[]
bst=[]
a=0
file=open("PowerAVLOutputs/min.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_BEST.append(float_count)
	bst.append(a)
	a+=1

#Average Graph AVL
Counts_AVG=[]
avg=[]
b=0
file=open("PowerAVLOutputs/avg.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_AVG.append(float_count)
	avg.append(b)
	b+=1

#Worst Graph AVL
Counts_WORST=[]
worst=[]
c=0
file=open("PowerAVLOutputs/max.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_WORST.append(float_count)
	worst.append(c)
	c+=1

#BEST Graph BST
CountsBST_BEST=[]
bst_BST=[]
a_BST=0
file=open("PowerBSTOutputs/min.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_BEST.append(float_count)
	bst_BST.append(a_BST)
	a_BST+=1

#Average Graph BST
CountsBST_AVG=[]
avg_BST=[]
b_BST=0
file=open("PowerBSTOutputs/avg.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_AVG.append(float_count)
	avg_BST.append(b_BST)
	b_BST+=1

#Worst Graph BST
CountsBST_WORST=[]
worst_BST=[]
c_BST=0
file=open("PowerBSTOutputs/max.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_WORST.append(float_count)
	worst_BST.append(c_BST)
	c_BST+=1


plt.title('Graph of Number of Count Operations Against Number of Sampled Data Items for AVLTree')
plt.subplot(3,1,1)
plt.plot(bst,Counts_BEST, 'g--'  )
plt.plot(bst_BST,CountsBST_BEST, 'k--'  )
plt.ylabel('Best Case')

plt.subplot(3,1,2)
plt.ylabel('No. of Count Operations')
plt.plot(avg,Counts_AVG, 'b--'  )
plt.plot(avg_BST,CountsBST_AVG, 'k--'  )

plt.subplot(3,1,3)
plt.plot(worst,Counts_WORST, 'r--'  )
plt.plot(worst_BST,CountsBST_WORST, 'k--'  )
plt.xlabel('No. of Sampled Data Items')
plt.ylabel('Worst Case')

plt.show()
