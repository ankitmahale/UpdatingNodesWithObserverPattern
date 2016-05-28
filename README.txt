CS542 Design Patterns
SPRING 2016
PROJECT <3> README FILE

Due Date: PROJECT DUE DATE:March 22, 2016
Submission Date: March 22, 2016
Grace Period Used This Project:0 days
Grace Period Remaining: 0 days
Author(s): Ankit Mahale
e-mail(s): amahale2@binghamton.edu


PURPOSE:
To implement Observer Pattern

PERCENT COMPLETE:
I believe I have completed 100% of this project


FILES:


SAMPLE OUTPUT:
[java] 0 1 2 3 4 5 6 7 8 9 

     [java] 0 1 2 3 4 5 6 7 8 9 

     [java] 0 1 2 3 4 5 6 7 8 9 

     [java] Sum of nodes of main Tree:45
     [java] Sum of nodes of main Tree:45
     [java] Sum of nodes of main Tree:45
     [java] 5 6 7 8 9 10 11 12 13 19 

     [java] 0 1 2 3 4 5 6 7 8 9 

     [java] 5 6 7 8 9 10 11 12 13 14 

     [java] Sum of nodes of main Tree:100
     [java] Sum of nodes of 1st Backup Tree:45
     [java] Sum of nodes of 2nd Backup Tree:95

To clean:

ant -buildfile src/build.xml clean

To COMPILE:
ant -buildfile src/build.xml all

To RUN by specifying arguments from command line:

ant -buildfile src/build.xml run -Darg0=bstInput.txt -Darg1=5


To create tarball for submission
ant -buildfile src/build.xml tarzip


Datastructure:
HashMap: Since I needed to store two values per node-the observer and the filter
Complexity: big O(1)
