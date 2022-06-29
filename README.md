# JavaSearchAlgorithm

This is a sample Java console project whose purpose is to create a search algorithm based on user input. 
It should generate list of suggestions by splitting user input into multiple parts: 
Example: userIput = "mouse", result should be = mo, mou, mous, mouse and based on these items whe should do starts with search on repository.

splitKeyword method accepts user input and performs operations needed to get example above.

search method accepts searchRepository and userInput and returns mathcing values based on splitKeyword above.

Time complexity of this algoritm is O(n2).
Reason for this is because we iterated keywords list and foreach keyowrd item we iterate searchRepository list so for every keyword item we will iterate many search items.
