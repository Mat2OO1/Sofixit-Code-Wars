package org.example;

/**
 * Spaceship class represents a model of spaceship
 */
class Spaceship {

    /**
     * Calculate the amount of material which the spaceship can hold or transport based on an array of height values.
     *
     * @param spaceship An array of height values representing the blocks on the image.
     * @return The capacity of the spaceship in terms of material it can transport.
     * @throws IllegalArgumentException If the input array is empty.
     */
    public static int material(int[] spaceship) {
        if (spaceship.length == 0) {
            throw new IllegalArgumentException("The length of the array must be greater than 0");
        }

        int capacity = 0;
        int previousMaxValue = 0;
        int partialCapacity = 0;
        int lastAddedIndex = 0;

        for (int i = 0; i < spaceship.length; i++) {
            if (spaceship[i] >= previousMaxValue) {
                previousMaxValue = spaceship[i];
                capacity += partialCapacity;
                partialCapacity = 0;
                lastAddedIndex = i;
            } else if (i == spaceship.length - 1) {
                // If we reach the end but still have remaining partial capacity,
                // restart from the last added index but check for maxValue - 1
                i = lastAddedIndex;
                partialCapacity = 0;
                previousMaxValue--;
            } else {
                partialCapacity += previousMaxValue - spaceship[i];
            }
        }
        return capacity;
    }
}