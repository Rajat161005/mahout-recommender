#Mahout Recommender System

This project implements a User-Based Collaborative Filtering Recommender System using Apache Mahout. 
It was developed as part of my internship assignment and demonstrates the use of machine learning for personalized recommendations in Java with Maven

#Project Structure

MavenJavaProject/
|── src/
│   ├── main/
│   │   |__ java/com/devopss/App.java     # Main logic for recommendations
│   │   |__ resources/data.csv            # Input dataset (user-item ratings)
|__ pom.xml                               # Maven project file
|__ README.md                             # This file

#Features

1.Loads a CSV dataset with user-item interactions
2.Computes Pearson Correlation similarity between users
3.Finds nearest user neighbors (using NearestNUserNeighborhood)
4.Recommends items based on neighbors' preferences
5.Fully Maven-based with Mahout 0.9 dependency

#Technologies

1.Java 8+
2.Apache Mahout 0.9
3.Maven
4.VS Code (IDE)

#Dataset Format

#CSV format:
userID,itemID,preference
1,101,4.0
1,102,3.0
2,101,5.0
3,103,2.0
...

Ensure data.csv is placed in src/main/resources/.

#How to Run

(1)cd MavenJavaProject then
(2)mvn clean compile exec:java -DskipTests

#OUTPUT

#Terminal Output
![Image](https://github.com/user-attachments/assets/2be4324a-3aae-40f1-88fe-fa7d883d5d48)

#Sample Output
Recommendations for user 2:
Item ID: 105 | Score: 5.00

#Output Explained
(a)User ID 3 is given recommendations based on the similarity with other users.
(b)Items with the highest predicted score are suggested using user-based filtering.











