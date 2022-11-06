import java.io.IOException;
import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) throws IOException {
            String[] strR = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            String[] strR2 = {
                    "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X",
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
            String[] strROp = {"+", "-", "*", "/"};
            String[] strArr;
            String str3;

            char op;
            Scanner r = new Scanner(System.in);
            if (r.hasNextByte()) {
                byte num1;
                byte num2;
                try {
                    String str = r.nextLine();
                    strArr = str.split(" ", 3);
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
                    if ((op == '-' || op == '+') ||  (op == '/' || op == '*')){
                        if (op == '+'){
                            System.out.println(num1 + num2);
                        }else if (op == '-'){
                            System.out.println(num1 - num2);
                        }else if (op == '*'){
                            System.out.println(num1 * num2);
                        }else {
                            System.out.println(num1 / num2);
                        }
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Exception thrown");
                }//--------------------------------------------------------------------------------------------------------
            }else {
                String str1;
                String str2;

                int numStr1 = 0;
                int numStr2 = 0;
                int numStrRes;
                String strRes = null;
                try {
                    String str = r.nextLine();
                    strArr = str.split(" ", 3);
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
                    if ((op == '-' || op == '+') ||  (op == '/' || op == '*')) {
                        if (op == '+'){
                            numStrRes = (numStr1 + numStr2) - 1;
                            strRes = strR[numStrRes];
                            System.out.println(strRes);
                        }else if (op == '-'){
                            numStrRes = (numStr1 - numStr2) - 1;
                            strRes = strR[numStrRes];
                            System.out.println(strRes);
                        }else if (op == '*'){
                            numStrRes = (numStr1 * numStr2) - 1;
                            strRes = strR2[numStrRes];
                            System.out.println(strRes);
                        }else {
                            numStrRes = (numStr1 / numStr2) - 1;
                            strRes = strR[numStrRes];
                            System.out.println(strRes);
                        }
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Exception thrown");
                }
            }
        }
}

