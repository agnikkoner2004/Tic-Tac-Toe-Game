package Data_Structure.Backtrack;

public class Subsets {


    public static void findSubsets(String sub, String str, int i) {
        if (i == sub.length()) {
            if(str.length() == 0) {
                System.out.println("NULL");
            } else {
                System.out.println(str);
            }
            return;
            
        }
        // Exclude the current character and move to the next
        findSubsets(sub, str, i + 1);
        // Include the current character and move to the next
        findSubsets(sub , str+sub.charAt(i), i + 1);
    }
    public static void main(String[] args) {
        String sub="abc";
        findSubsets(sub, "", 0);
    }
}
