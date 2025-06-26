package com.devopss;

import java.io.File;
import java.util.List;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;


public class App {
    public static void main(String[] args) {
        try {
            // Load dataset
            File file = new File("src/main/resources/data.csv");
            DataModel model = new FileDataModel(file);

            // Build similarity and neighborhood
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);

            // Build recommender
            GenericUserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // Recommend for user 1 (change as needed)
            int userId = 2;
            List<RecommendedItem> recommendations = recommender.recommend(2, 2);

            System.out.println("Recommendations for user " + userId + ":");
            if (recommendations.isEmpty()) {
                System.out.println("No recommendations available.");
            } else {
                for (RecommendedItem item : recommendations) {
                    System.out.printf("Item ID: %d | Score: %.2f%n", item.getItemID(), item.getValue());
                }
            }

        } catch (Exception e) {
            System.out.println("An error occurred while generating recommendations: " + e.getMessage());
        }
    }
}
