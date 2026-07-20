package dev.srm.springboot_learn1.utils;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class RandomUtils {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private static final String[] firstNames = {"Santiago", "Eduardo", "Samuel", "Nicolás", "Reynaldo"};
    private static final String[] lastNames = {"Rivera", "López", "Coral", "Rodríguez", "Ibarra"};
    private static final String[] emails = {
            "srm@gmail.com", "edu@gmail.com", "and@gmail.com", "cor@gmail.com", "ib@gmail.com",
            "rive@gmail.com", "lop@gmail.com", "nico@gmail.com", "sam@gmail.com", "rey@gmail.com"
    };

    public static int getAtomicId() {
        return counter.incrementAndGet();
    }

    public static String getRandomEmail() {
        return emails[getRandomInt(0, emails.length - 1)];
    }

    public static String getRandomFirstName() {
        return firstNames[getRandomInt(0, firstNames.length - 1)];
    }

    public static String getRandomLastName() {
        return lastNames[getRandomInt(0, lastNames.length - 1)];
    }

    public static int getRandomInt(int start, int end) {
        return new Random().nextInt(start, end);
    }
}
