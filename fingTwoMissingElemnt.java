
class fingTwoMissingElemnt {

    void find(int arr[], int N) {

        int xor = 0;

        for (int x : arr) {
            xor ^= x;
        }

        for (int i = 1; i <= N; i++) {
            xor ^= i;
        }

        int y = xor & (-xor);// different bit

        int x1 = 0;
        int x2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((y & arr[i]) == 0) {
                x1 ^= arr[i];
            } else {
                x2 ^= arr[i];
            }
        }

        for (int i = 1; i <= N; i++) {
            if ((i & y) == 0) {
                x1 ^= i;
            } else {
                x2 ^= 1;
            }
        }

        System.out.print("Missing no: "+ x1 + " "+ x2);
    }

    public static void main(String args[]) {

        int N = 8;
        int arr[] = {1, 3, 4, 5, 7, 8};

        fingTwoMissingElemnt f = new fingTwoMissingElemnt();
        f.find(arr, N);
    }
}
