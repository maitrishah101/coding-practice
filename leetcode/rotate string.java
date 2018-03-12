class Solution {
    public boolean rotateString(String A, String B) {
        return (B + B).contains(A);
    }
}
