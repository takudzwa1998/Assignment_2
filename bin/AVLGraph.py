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

#Min_search Graph AVL
CountsBST_BEST=[]
bst_BST=[]
d=0
file=open("PowerAVLOutputs/min_search_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_BEST.append(float_count)
	bst_BST.append(d)
	d+=1

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

#Average_search Graph AVL
CountsBST_AVG=[]
avg_BST=[]
e=0
file=open("PowerAVLOutputs/avg_search_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_AVG.append(float_count)
	avg_BST.append(e)
	e+=1


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

#Max_search Graph AVL
CountsBST_WORST=[]
worst_BST=[]
f=0
file=open("PowerAVLOutputs/max_search_counts.txt", "r")
for line in file.readlines():
	float_count=int(line)
	CountsBST_WORST.append(float_count)
	worst_BST.append(f)
	f+=1


plt.title('Graph of Number of Count Operations Against Number of Sampled Data Items for AVLTree')
plt.subplot(3,1,1)
plt.plot(bst,Counts_BEST, 'b--'  )
plt.plot(bst_BST,CountsBST_BEST, 'k--'  )
plt.ylabel('Best Case')

plt.subplot(3,1,2)
plt.ylabel('Average Case')
plt.plot(avg,Counts_AVG, 'b--'  )
plt.plot(avg_BST,CountsBST_AVG, 'k--'  )

plt.subplot(3,1,3)
plt.plot(worst,Counts_WORST, 'b--'  )
plt.plot(worst_BST,CountsBST_WORST, 'k--'  )
plt.xlabel('No. of Sampled Data Items')
plt.ylabel('Worst Case')

plt.show()
