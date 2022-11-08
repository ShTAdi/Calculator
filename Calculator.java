import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(System.in);
        String str = r.nextLine();
        try {
            calc(str);
                System.out.printf(calc(str));
        }catch (Exception e){
                System.out.println("Exception thrown");
        }
    }
    public static String calc (String input) throws IOException{
        try {//-------------------------------------------основной Try------------------------------
            String[] strArr = new String[0];
            String[] strR = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String[] strR2 = {
                    "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                    "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", // 20
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", // 30
                    "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXII", "XXXIII", "XXXIX", "XL", // 40
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", // 50
                    "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", // 60
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", // 70
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", // 80
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", // 90
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"// 100
            };
            strArr = input.split(" ", 3);
            byte num1 = 0;
            byte num2 = 0;
            String[] strROp = {"+", "-", "*", "/"};
            String str3;
            char op;
            if (Character.isDigit(input.charAt(0))) {//---------------if up----------------------------------
                num1 = Byte.parseByte(strArr[0]);
                num2 = Byte.parseByte(strArr[2]);
                if ((num1 >= 0 && num1 <= 10) && (num2 >= 0 && num2 <= 10)) {
                } else {
                    throw new Exception();
                }
                str3 = strArr[1];
                for (int i = 0; true; i++) {
                    if (str3.equals(strROp[i])) {
                        break;
                    }
                }
                op = (char) strArr[1].charAt(0);
                if ((op == '-' || op == '+') || (op == '/' || op == '*')) {
                    if (op == '+') {
                        input = Integer.toString(num1 + num2);
                    } else if (op == '-') {
                        input = Integer.toString(num1 - num2);
                    } else if (op == '*') {
                        input = Integer.toString(num1 * num2);
                    } else {
                        input = Integer.toString(num1 / num2);
                    }
                } else {
                    throw new Exception();
                }
                return input;
            } else {//--------if end/ Else up-----------------------------------------------------------------------------------
                String str1;
                String str2;
                int numStr1 = 0;
                int numStr2 = 0;
                int numStrRes;
                str1 = strArr[0];
                for (int i = 0; true; i++) {
                    if (str1.equals(strR[i])) {
                        numStr1 = ++i;
                        break;
                    }
                }
                str2 = strArr[2];
                for (int i = 0; true; i++) {
                    if (str2.equals(strR[i])) {
                        numStr2 = ++i;
                        break;
                    }
                }
                str3 = strArr[1];
                for (int i = 0; true; i++) {
                    if (str3.equals(strROp[i])) {
                        break;
                    }
                }
                op = (char) strArr[1].charAt(0);
                if ((op == '-' || op == '+') || (op == '/' || op == '*')) {
                    if (op == '+') {
                        numStrRes = (numStr1 + numStr2) - 1;
                        input = strR[numStrRes];
                    } else if (op == '-') {
                        numStrRes = (numStr1 - numStr2) - 1;
                        input = strR[numStrRes];
                    } else if (op == '*') {
                        numStrRes = (numStr1 * numStr2) - 1;
                        input = strR2[numStrRes];
                    } else {
                        numStrRes = (numStr1 / numStr2) - 1;
                        input = strR[numStrRes];
                    }
                } else {
                    throw new Exception();
                }
                return input;
            }//-------------------------------Else end---------------------------------------
        }catch (Exception e){
            try {
                throw e;
            } catch (Exception ex) {
                //throw new RuntimeException(ex);
                throw new IOException(e);
            }
        }
    }
}
