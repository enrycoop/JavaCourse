package Enumaration;

// Versione breve
/* public enum Color {
    RED,GREEN,BLUE
} */

//versione più complessa

public enum Color {
    RED("red"),GREEN("green"),BLUE("blue");

    private String value;

    Color(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}