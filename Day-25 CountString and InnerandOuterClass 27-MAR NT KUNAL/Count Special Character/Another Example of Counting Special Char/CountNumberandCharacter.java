public class CountNumberandCharacter {

    public static void main(String[] args){

        String email = "Kunal978899@gmail.com";

        email = email.replaceAll("\\s", "");

        int charactercount = 0;
        int numbercount = 0;

        for (char c : email.toCharArray()){
            if (Character.isLetter(c)){
                charactercount++;
            }else if (Character.isDigit(c)) {
                numbercount++;
            }
        }
        System.out.println("Total number of characters in a email: " + charactercount);
        System.out.println("Total number of integers in a email: " + numbercount);
    }
}
