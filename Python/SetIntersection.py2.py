"""Sample code to read in test cases:"""

import sys

def setIntersection(strint):
    set1, set2 = strint.split(";")
    set1 = set1.split(",")
    set2 = set2.split(",")
    intersect = (set(set1) and set(set2)) - (set(set1)^set(set2))
    list(intersect).sort()
    result = ",".join(intersect)
    if result == "":
        return "\n"
    return result


test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    # ignore test if it is an empty line
    # 'test' represents the test case, do something with it
    # ...
    # ...
    print setIntersection(test)
    
test_cases.close()
