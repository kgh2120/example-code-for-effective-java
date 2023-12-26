package com.qq.samplecodeforej.week5;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;

public class Main {


    public static void main(String[] args) {
        Optional<String> stringOptional = null;
        String orElseThrow = stringOptional.orElseThrow(); // NPE...

        OptionalInt optionalInt = OptionalInt.empty();



    }
}
