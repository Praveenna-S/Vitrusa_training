package com.training.w_1;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Optional;
 
public class OptionalDemo {
 
    public static final List<String> NAMES = Arrays.asList("APJ", "VIKAS", "JCBose", "DRDO", "PSLV", "Agni");
 
    public static String pickNameOldWay(final List<String> names, final String startingLetter) {
        String pickedName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                pickedName = name;
                break;
            }
        }
        return pickedName != null ? pickedName : "There is no name starting with letter '" + startingLetter + "'.";
    }
 
    public static String pickNameWithIsPresent(final List<String> names, final String startingLetter) {
        final Optional<String> pickedName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
        return pickedName.isPresent() ? pickedName.get()
                : "There is no name starting with letter '" + startingLetter + "'.";
    }
 
    public static String pickNameWithOrElse(final List<String> names, final String startingLetter) {
        final Optional<String> pickedName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
        return pickedName.orElse("There is no name starting with letter '" + startingLetter + "'.");
 
    }
 
    public static void pickNameCallingMethodOldWay(final List<String> names, final String startingLetter) {
        String pickedName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                pickedName = name;
                break;
            }
        }
        if (pickedName != null) {
            printMessage(pickedName);
        }
    }
 
    public static void printMessage(final String name) {
        System.out.println(String.format("First name with '" + name.substring(0, 1) + "' is %s", name));
    }
 
    public static void pickNameCallingMethodNewWay(final List<String> names, final String startingLetter) {
        final Optional<String> pickName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
        pickName.ifPresent(OptionalDemo::printMessage);
    }
 
    public static String pickNameThrowExceptionOldWay(final List<String> names, final String startingLetter) {
        String pickedName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                pickedName = name;
                break;
            }
        }
        if (pickedName == null) {
            //throw new NotFoundException("There is no name starting with letter '" + startingLetter + "'.");
        }
        return pickedName;
    }
}