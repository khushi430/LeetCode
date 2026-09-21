class Solution {
    public String reverseWords(String s) {
        

        char[] arr = s.toCharArray();

        int left = 0;

        for (int right = 0; right <= arr.length; right++) {

            if (right == arr.length || arr[right] == ' ') {

                int start = left;
                int end = right - 1;

                while (start < end) {

                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;

                    start++;
                    end--;
                }

                left = right + 1;
            }
        }

        return new String(arr);
    }
}
    
