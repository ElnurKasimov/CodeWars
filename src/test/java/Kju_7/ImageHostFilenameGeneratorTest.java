package Kju_7;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ImageHostFilenameGeneratorTest {
    private static ImageHostFilenameGenerator.PhotoManager photoManager;

    @BeforeAll
    public static void init() {
        photoManager = new ImageHostFilenameGenerator.PhotoManager();
        Set<String> names = photoManager.getNames();
        names.add("JHGFRD");
        names.add("ADSGRE");
        names.add("LNCFGU");
        names.add("PEKGIT");
        names.add("NQTWRE");
        photoManager.setNames(names);
    }


    @Test
    public void testThatForEachNameItsLengthIsEqualSix() {
        assertTrue(photoManager.getNames().stream().allMatch(n -> n.length() == 6));
    }

    @Test
    public void testThatGenerateNameCreateNamesWithLengthSixCharacter() {
        //given when
//        photoManager = new ImageHostFilenameGenerator.PhotoManager();
//        Set<String> actual = photoManager.getNames();
//        //then
//        assertNotNull(actual);
    }

    @Test // TODO parametrized
    public void testThatNameWasUniqueWorkCorrect() {
        //given when
//        photoManager = new ImageHostFilenameGenerator.PhotoManager();
//        Set<String> actual = photoManager.getNames();
//        //then
//        assertNotNull(actual);
    }

    @Test // TODO parametrized
    public void testThatAddNameWasWorkCorrect() {
        //given when
//        photoManager = new ImageHostFilenameGenerator.PhotoManager();
//        Set<String> actual = photoManager.getNames();
//        //then
//        assertNotNull(actual);
    }


    // this test has to be launched the last
    @Test
    public void testThatFieldOfPhotoManagerInstanceIsNotNullForNewInstance() {
        //given when
        photoManager = new ImageHostFilenameGenerator.PhotoManager();
        Set<String> actual = photoManager.getNames();
        //then
        assertNotNull(actual);
    }



}