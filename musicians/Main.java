package com.company;

public class Main {

    /*
                                        Person

                                        extends

                                        Artist

                    extends                                 extends

                    Musician (Eig. Band)                          Painter

            extends     extends     extends

         Bassist        Guitarist       Singer

         Erstelle eine Künstlerklasse (Artist)
         Erstelle eine Personenklasse (Person)
     */
    public static void main(String[] args) {
	// write your code here
        Band band = new Band("AC/DC");
        Bassist bassist = new Bassist("myBassist", 30, band);

        Guitarist guitarist = new Guitarist("myGuitar", 28, band);
        guitarist.switchGuitar();

        Singer singer = new Singer("mySinger", 27, band);

        Painter maler = new Painter("myPainter", 17);
        maler.setArtistName("picasso");

        Person person = new Person("franz", 40);

        System.out.println(person);
        System.out.println(bassist);
        System.out.println(guitarist);
        System.out.println(singer);
        System.out.println(maler);
    }
}
