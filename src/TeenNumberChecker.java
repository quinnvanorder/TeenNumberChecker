public class TeenNumberChecker {
    public static boolean hasTeen (int first, int second, int third){
        return (isTeen(first) || isTeen(second) || isTeen(third));
    }

    public static boolean isTeen (int input) {
        if (input >= 13 && input <= 19){
            return true;
        }
        else {
            return false;
        }
    }
}
