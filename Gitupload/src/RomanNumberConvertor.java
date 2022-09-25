public class RomanNumberConvertor {
    public static void intToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String s = "";
        for(int i = 0 ; i< values.length;i++){
            while (num >= values[i]){
                num -= values[i];
                s += romanLiterals[i];
            }
        }
        System.out.println("Roman Representation of "+num+" is " + s);
//        System.out.println(Math.PI * y * y );
    }
}