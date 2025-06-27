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

>Loads a CSV dataset with user-item interactions
>Computes Pearson Correlation similarity between users
>Finds nearest user neighbors (using NearestNUserNeighborhood)
>Recommends items based on neighbors' preferences
>Fully Maven-based with Mahout 0.9 dependency

#Technologies

>Java 8+
>Apache Mahout 0.9
>Maven
>VS Code (IDE)

#Dataset Format

>CSV format:
userID,itemID,preference
1,101,4.0
1,102,3.0
2,101,5.0
3,103,2.0
...

Ensure data.csv is placed in src/main/resources/.

#How to Run

cd MavenJavaProject
mvn clean compile exec:java -DskipTests

#OUTPUT










