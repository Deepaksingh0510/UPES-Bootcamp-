class rotateArr {

    void rotate(int arr[]) {
        int[] num = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                num[0] = arr[arr.length - 1];
            } else {
                num[i] = arr[i - 1];
            }
        }

        for (int x : num) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {9, 4, 10, 12};

        rotateArr r = new rotateArr();
        r.rotate(arr);
    }
}
