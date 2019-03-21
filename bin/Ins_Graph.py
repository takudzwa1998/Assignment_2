#!/usr/bin/python
import matplotlib.pyplot as plt

#Min_Insert Graph AVL
Counts_BEST=[]
bst=[]
a=0
file=open("PowerAVLOutputs/min_insertion_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_BEST.append(float_count)
	bst.append(a)
	a+=1

#Min_Insert Graph BST
CountsBST_BEST=[]
bst_BST=[]
a_BST=0
file=open("PowerBSTOutputs/min_insertion_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_BEST.append(float_count)
	bst_BST.append(a_BST)
	a_BST+=1


#Average_Insert Graph AVL
Counts_AVG=[]
avg=[]
b=0
file=open("PowerAVLOutputs/avg_insertion_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_AVG.append(float_count)
	avg.append(b)
	b+=1

#Average_Insert Graph BST
CountsBST_AVG=[]
avg_BST=[]
b_BST=0
file=open("PowerBSTOutputs/avg_insertion_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_AVG.append(float_count)
	avg_BST.append(b_BST)
	b_BST+=1

#Max_insert Graph AVL
Counts_WORST=[]
worst=[]
c=0
file=open("PowerAVLOutputs/max_insertion_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	Counts_WORST.append(float_count)
	worst.append(c)
	c+=1


#Max_insert Graph BST
CountsBST_WORST=[]
worst_BST=[]
c_BST=0
file=open("PowerBSTOutputs/max_insertion_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_WORST.append(float_count)
	worst_BST.append(c_BST)
	c_BST+=1


plt.title('Graph of Number of Count Operations Against Number of Sampled Data Items for AVLTree')
plt.subplot(3,1,1)
plt.plot(bst,Counts_BEST, 'b--'  )
plt.plot(bst_BST,CountsBST_BEST, 'k--'  )
plt.ylabel('Best Case')

plt.subplot(3,1,2)
plt.ylabel('No. of Count Operations')
plt.plot(avg,Counts_AVG, 'b--'  )
plt.plot(avg_BST,CountsBST_AVG, 'k--'  )
plt.ylabel('Average Case')

plt.subplot(3,1,3)
plt.plot(worst,Counts_WORST, 'b--'  )
plt.plot(worst_BST,CountsBST_WORST, 'k--'  )
plt.xlabel('No. of Sampled Data Items')
plt.ylabel('Worst Case')

plt.show()
