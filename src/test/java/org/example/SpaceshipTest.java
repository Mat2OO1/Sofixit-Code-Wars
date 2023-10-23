package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpaceshipTest {

    @Test
    void shouldThrowAnExceptionWhenEmptyListIsGiven() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Spaceship.material(new int[]{}));
    }

    @Test
    void shouldCalculateMaterial1() {
        int[] spaceship1 = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] spaceship2 = new int[]{0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
        int[] spaceship3 = new int[]{4, 2, 0, 3, 2, 5};
        int[] spaceship4 = new int[]{6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3};
        int[] spaceship5 = new int[]{6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0};

        Assertions.assertEquals(6, Spaceship.material(spaceship1));
        Assertions.assertEquals(8, Spaceship.material(spaceship2));
        Assertions.assertEquals(9, Spaceship.material(spaceship3));
        Assertions.assertEquals(83, Spaceship.material(spaceship4));
        Assertions.assertEquals(50, Spaceship.material(spaceship5));

    }


}