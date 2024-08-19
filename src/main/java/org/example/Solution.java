package org.example;

    public class Solution {
        public int maximumWealth(int[][] accounts) {
            int maxWealth = 0;

            // Outer loop to iterate over each customer
            for (int i = 0; i < accounts.length; i++) {
                int currentWealth = 0;

                // Inner loop to iterate over each bank for the current customer
                for (int j = 0; j < accounts[i].length; j++) {
                    currentWealth += accounts[i][j];
                }

                // Update the maximum wealth if the current customer's wealth is greater
                if (currentWealth > maxWealth) {
                    maxWealth = currentWealth;
                }
            }

            return maxWealth;
        }
}
