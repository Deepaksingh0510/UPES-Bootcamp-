
class validPalindrome {

    boolean check(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder str = new StringBuilder(s).reverse();

        if (str.toString().equals(s)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        validPalindrome v=new validPalindrome();
        System.out.println(v.check(s));
    }
}
