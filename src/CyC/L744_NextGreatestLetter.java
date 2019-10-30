package CyC;

public class L744_NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int l = 0,r = len-1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (letters[mid]<=target){
                l = mid+1;
            }
            else
                r=mid-1;
        }
        return l<letters.length?letters[l]:letters[0];
    }
    public static void main(String[] args) {
       char[] letters = {'c', 'f', 'j'};
       char target = 'c';
       char result = new L744_NextGreatestLetter().nextGreatestLetter(letters,target);
       System.out.println(result);
    }
}
