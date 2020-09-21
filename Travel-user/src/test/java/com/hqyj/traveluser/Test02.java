package com.hqyj.traveluser;

import org.junit.Test;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/17
 */
public class Test02 {
    @Test
    public void testBig() {
        System.out.println(bigAdd("135", "531"));
    }

    public static String bigAdd(String a, String b) {
        char[] charsA = new StringBuilder(a).reverse().toString().toCharArray();
        char[] charsB = new StringBuilder(b).reverse().toString().toCharArray();

        int maxLength = Math.max(charsA.length, charsB.length);

        int[] result = new int[maxLength + 1];

        int temp = 0;
        for (int i = 0; i <= maxLength; i++) {
            temp = result[i];

            if (i < charsA.length) {
                temp += charsA[i] - '0';
            }

            if (i < charsB.length) {
                temp += charsB[i] - '0';
            }

            if (temp >= 10) {
                temp -= 10;
                result[i + 1] = 1;
            }

            result[i] = temp;

        }

        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (int i = maxLength; i >= 0; i--) {
            if (result[i] == 0 && flag) {
                continue;
            }

            flag = false;
            sb.append(result[i]);
        }

        return sb.toString();

    }
}
