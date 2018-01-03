//reverseStr 메소드는 String형 변수 str을 매개변수로 입력받습니다.str에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 String을 리턴해주세요.
//str는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.예를들어 str이 Zbcdefg면 gfedcbZ을 리턴하면 됩니다.

import java.util.Arrays;

public class Case002 {


    public String reverseStrToBuilder(String str) {
        char[] result = str.toCharArray();
        Arrays.sort(result);
        return new StringBuilder(new String(result)).reverse().toString();
    }


    public String reverseStr(String str) {

        char[] result = str.toCharArray();
        char t;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (((int) result[i]) < ((int) result[j])) {
                    t = result[i];
                    result[i] = result[j];
                    result[j] = t;
                }
            }
        }
        return new String(result);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Case002 rs = new Case002();
        System.out.println(rs.reverseStr("Zbcdefg"));
    }
}