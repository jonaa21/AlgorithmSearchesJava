package sr.unasat.common;

public class CompareTo {

    public static int execute(int value1, int value2) {
        if (value1 != value2) {
            return (value1 > value2) ? 1 : -1;
        }
        return 0;
    }

    public static int execute(String value1, String value2) {

        if (!value1.equals(value2)) {
            int shortestLength = (value1.length() < value2.length()) ? value1.length() : value2.length();

            for (int i = 0; i < shortestLength; i++) {
                //Methode 1
                /*if (value1.charAt(i) > value2.charAt(i)){
                    return 1;
                }
                if (value1.charAt(i) < value2.charAt(i)){
                    return -1;
                }*/

                //Methode 2
                if (value1.charAt(i) > value2.charAt(i)){
                    return (value1.charAt(i) > value2.charAt(i)) ? 1 : -1;
                }
            }
            return value1.length() > value2.length() ? 1 : -1;
        }
        return 0;
    }
}

