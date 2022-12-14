package Prac_27.task2;

import Prac_27.task2.NewMap;

public class Number2 {
    public static void main(String[] args) {
        NewMap map = new NewMap();
        map.addValues("SurnameOne","NameOne");
        map.addValues("SurnameTwo","NameTwo");
        map.addValues("SurnameThree","NameThree");
        map.addValues("SurnameFour","NameFour");
        map.addValues("SurnameFive","NameFive");
        map.addValues("SurnameSix","NameSix");
        map.addValues("SurnameThree","NameSeven");
        map.addValues("SurnameEight","NameEight");
        map.addValues("SurnameNine","NameNine");
        map.addValues("SurnameTen","NameTen");
        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
    }
}

