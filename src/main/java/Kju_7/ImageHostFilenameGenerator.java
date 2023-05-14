package Kju_7;

//You are developing an image hosting website.
//
// You have to create a function for generating random and unique image filenames.
// Create a function for generating a random 6 character string which will be used to access the photo URL.
// To make sure the name is not already in use, you are given access to an PhotoManager object.
// You can call it like so to make sure the name is unique
//
// at this point, the website has only one photo, hosted on the 'ABCDEF' url
// photoManager.nameExists("ABCDEF"); // returns true
// photoManager.nameExists("BBCDEF"); // returns false
// Note: We consider two names with same letters but different cases to be unique.

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ImageHostFilenameGenerator {

    public static String generateName(PhotoManager photoManager) {
        StringBuilder name = new StringBuilder();
        Random random = new Random();
        do {
            for (int i = 0; i < 6; i++) {
                char letter = (char) (random.nextInt(26) + 'A');
                name.append(letter);
            }
        } while (!nameWasUnique(name.toString(), photoManager));
        addName(name.toString(), photoManager);
       return name.toString();
    }

    public static boolean nameWasUnique(String name, PhotoManager photoManager) {
        Set<String> names = photoManager.getNames();
        return !photoManager.getNames().contains(name);
    }

    public static void addName (String name, PhotoManager photoManager) {
        Set<String> names = photoManager.getNames();
        if (nameWasUnique(name, photoManager)) {
        names.add(name);
        photoManager.setNames(names);
        }
    }

    public static class PhotoManager {
        private Set<String> names = new HashSet<>();

        public void setNames(Set<String> names) {
            this.names = names;
        }
        public Set<String> getNames() {
            return this.names;
        }
    }

    public static void main(String[] args) {
        PhotoManager photoManager = new PhotoManager();
        generateName(photoManager);
        System.out.println("1. photoManager.getNames() = " + photoManager.getNames());
        generateName(photoManager);
        System.out.println("2. photoManager.getNames() = " + photoManager.getNames());
        generateName(photoManager);
        System.out.println("3. photoManager.getNames() = " + photoManager.getNames());
        generateName(photoManager);
        System.out.println("4. photoManager.getNames() = " + photoManager.getNames());
    }
}
