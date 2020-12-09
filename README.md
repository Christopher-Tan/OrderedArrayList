# OrderedArrayList
As a group, we clarified that we should separate the two classes into two different files.
NoNullArrayList and OrderedArrayList should call super(). Because super() creates the same variables (even though they are private), we can call the same methods (no need for new instance variables)
Just test for null and return an error.