import java.util.*;

/**
 *
 */
class Test {
    public static void main(String[] args) {
        String str1 = "(()";
        String str2 = ")(()())";
        String str3 = "(()())";
        String str4 = ")(";

        Test test = new Test();

        ArrayList<Character> response = test.filter(str4);


        StringBuilder st = new StringBuilder();
        st.append("Вывод: ");
        st.append(response.size());
        st.append(" -");
        for (Character character : response) st.append(character);


        System.out.println(st);

    }


    public ArrayList<Character> filter(String str){

        char[] chars = str.toCharArray();
        ArrayList<Character> answer = new ArrayList<>();

        for(int y =0; y<chars.length; y++){
            answer.add(y,null);
        }

        for(int i = 0; i < chars.length; i++){
            if (chars[i] == '(') {
                for(int j = i+1; j<chars.length; j++) {
                    if (chars[j] == ')') {
                        answer.set(i, chars[i]);
                        answer.set(j, chars[j]);
                        chars[i]='X';
                        chars[j]='X';
                        break;

                    }
                }
            }
        }
        answer.removeIf(Objects::isNull);
        return answer;
        }


        Object ob1 = new Object();
        Object ob2 = new Object();

        Map aar = new TreeMap();

}





