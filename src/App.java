import java.util.*;
import java.util.stream.Collectors;

public class App {

    static class Solution {


        public List<String> letterCombinations(String digits){
            int l = digits.length();
            List<String> result = new ArrayList<>();
            Map<String,String> lettercombination = new HashMap<>();

            lettercombination.put("1","");
            lettercombination.put("2","abc");
            lettercombination.put("3","def");
            lettercombination.put("4","ghi");
            lettercombination.put("5","jkl");
            lettercombination.put("6","mno");
            lettercombination.put("7","pqrs");
            lettercombination.put("8","tuv");
            lettercombination.put("9","wxyz");


            switch (l) {
                case 1 -> {
                    if (digits.equals("1")) {
                        return result;
                    }
                    result.addAll(Arrays.asList(lettercombination.get(digits).split("")));
                    return result;
                }
                case 2 -> {
                    String[] div1 = lettercombination.get(
                            String.valueOf(digits.charAt(0))
                    ).split("");
                    String[] div2 = lettercombination.get(
                            String.valueOf(digits.charAt(1))
                    ).split("");
                    for (String fdiv : div1) {
                        for (String sdiv : div2) {
                            result.add(fdiv + sdiv);
                        }
                    }
                    return result;
                }
                case 3 -> {
                    String[] div3 = lettercombination.get(
                            String.valueOf(digits.charAt(0))
                    ).split("");
                    String[] div4 = lettercombination.get(
                            String.valueOf(digits.charAt(1))
                    ).split("");
                    String[] div5 = lettercombination.get(
                            String.valueOf(digits.charAt(2))
                    ).split("");
                    for (String fdiv : div3) {
                        for (String sdiv : div4) {

                            for (String tdiv : div5) {

                                result.add(fdiv + sdiv + tdiv);

                            }

                        }
                    }
                    return result;
                }
                case 4 -> {
                    String[] div6 = lettercombination.get(
                            String.valueOf(digits.charAt(0))
                    ).split("");
                    String[] div7 = lettercombination.get(
                            String.valueOf(digits.charAt(1))
                    ).split("");
                    String[] div8 = lettercombination.get(
                            String.valueOf(digits.charAt(2))
                    ).split("");
                    String[] div9 = lettercombination.get(
                            String.valueOf(digits.charAt(3))
                    ).split("");
                    for (String fdiv : div6) {
                        for (String sdiv : div7) {

                            for (String tdiv : div8) {
                                for (String qdiv : div9) {
                                    result.add(fdiv + sdiv + tdiv + qdiv);
                                }
                            }

                        }
                    }
                }
            }



            return result;


        }
    }

    public static void main(String []args){


        Solution s = new Solution();
        System.out.println(s.letterCombinations("2"));

        System.out.println(s.letterCombinations("2345"));
    }
}
