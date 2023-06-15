import java.util.LinkedList;
public class MyTest {
        public static LinkedList<String> getStringsStartingWithPri(String[] array) {
            LinkedList<String> resultList = new LinkedList<>();

            for (String str : array) {
                if (str.startsWith("при")) {
                    resultList.add(str);
                }
            }

            return resultList;
        }

        public static void main(String[] args) {
            String[] array = {"пришел", "поехал", "приехал", "проехал"};
            LinkedList<String> result = getStringsStartingWithPri(array);

            System.out.println(result);
        }
    }

