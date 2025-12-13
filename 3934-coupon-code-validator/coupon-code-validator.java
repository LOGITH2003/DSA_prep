import java.util.regex.Pattern;
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> result = new ArrayList<>();
        TreeMap<String, List<String>> map = new TreeMap<>();

        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && validateBusinessLine(businessLine[i]) && validateCode(code[i])) {
                map.computeIfAbsent(businessLine[i], k -> new ArrayList<>())
                        .add(code[i]);
            }
        }
        
        for (List<String> codes : map.values()) {
            Collections.sort(codes);
            result.addAll(codes);
        }

        return result;
    }

    private boolean validateBusinessLine(String str){
        return switch (str) {
            case "pharmacy", "restaurant", "grocery", "electronics" -> true;
            default -> false;
        };
    }

    private boolean validateCode(String str){
        return Pattern.compile("^[a-zA-Z0-9_]+$").matcher(str).find();
    }
}