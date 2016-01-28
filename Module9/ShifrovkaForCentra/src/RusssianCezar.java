/**
 * Created by Arlekino on 1/28/2016.
 */
package ua.arlekinoo.lecture9;
import java.util.ArrayList;
import java.util.List;
public class RusssianCezar {
    List<Character> alphabet = new ArrayList<Character>();
    private  final static char[] PUNCTUATION = {'.', ',', ';', ':', '!', '?', '-'};
    RusssianCezar() {
        for (char c = '0'; c <= '9'; c++) {
            alphabet.add(c);
        }
    }
    String encrypt(String text, int m, int k) {
        int n = alphabet.size();
        m = m % n;
        k = k % n;
        if (gcd(n, m) != 1) {//проверка простоты n относительно m
            return null;
    }
        StringBuilder cryptogram = new StringBuilder();
        //блок шифрования данных
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            index = (index * m + k) % n;
            cryptogram.append(alphabet.get(index));
        }
        return cryptogram.toString();
}
public String decrypt(String text, int m, int k){
int n = alphabet.size();
    m = m % n;
    k = k % n;
    int reversedM = -1;//обратное к m
    //находим обратное к m
    for (int i = 0; i < n; i++) {
        if ((i * m) % n == 1) {
            reversedM = i;
            break;
        }
    }
    StringBuilder newText = new StringBuilder();
    //блок дешифрования данных
    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        int index = alphabet.indexOf(c);
        index = (((index - k) * reversedM) % n + n) % n;
        newText.append(alphabet.get(index));
    }
    return newText.toString();
}
    //алгоритм поиска наибольшего общего делителя
    private static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else  {
                b %= a;
            }
        }
        return  a + b;
    }
}