public class Name {

    public static void name(String name){
        if (!Character.isUpperCase(name.charAt(0))){
            throw new RuntimeException("You have to start with a capital you bastard!!");
        }
    }

    public static boolean checkLastChar(String name){
        if (name.charAt(name.length()-1) == '.'){
            return true;
        }
        else return false;
    }
}
