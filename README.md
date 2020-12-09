# OrderedArrayList
First, my group and I were talking about NoNullArrayList and to first check for nulls, and if so throw an error.
For OrderedArrayList, me group and I were discussing potential methods for ensuring that it is least to greatest. We have no set 
way to do so, however, I feel that perhaps the best way is to look at each individual T then use the compare method and continue moving it to the right until it is less than another type. This is a working idea.
Moreover, we discuessed that we can't use a built in sort method. 
I was thinking since a compare method would return negative if a< b and positive if a>b, if the resulting value is less than 0
continue putting the T to the right, until either 0 or 1 is resulted from compare.
