public class findIndexOfFirstOccurenceString {
    int find(String haystack, String needle){
        int index=haystack.indexOf(needle);

        return index;
    }

    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="sad";

        
        findIndexOfFirstOccurenceString f=new findIndexOfFirstOccurenceString();
        System.out.print(f.find(haystack, needle));

    }
}
