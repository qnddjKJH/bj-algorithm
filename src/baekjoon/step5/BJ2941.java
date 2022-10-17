package src.baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == 'c') {			// 만약 ch 가 c 라면?
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {		//만약 ch 다음 문자가 '=' 이라면?
                        // i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
                        i++;
                    }
                    else if(str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if(ch == 'd') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'z') {
                        if(i < str.length() - 2) {
                            if(str.charAt(i + 2) == '=') {	// dz= 일 경우
                                i += 2;
                            }
                        }
                    }

                    else if(str.charAt(i + 1) == '-') {	// d- 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 'l') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {	// lj 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 'n') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {	// nj 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 's') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {	// s= 일 경우
                        i++;
                    }
                }
            }

            else if(ch == 'z') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {	// z= 일 경우
                        i++;
                    }
                }
            }

            count++;

        }
        System.out.println(count);
    }
}

/*
    c   -, =
    d   -, z=
    l   j
    n   j
    s   =
    z   =
 */