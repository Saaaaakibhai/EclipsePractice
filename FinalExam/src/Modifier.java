class Modifier {


    public static void change(int[] x, int[] y) {
        x[0] = x[0] - 10;
        y[0] = y[0] + 10;
    }

    public static void main(String[] args) {
        int[] x = {40};
        int[] y = {20};


        Modifier.change(x, y);
        System.out.println("x = " + x[0]);
        System.out.println("y = " + y[0]);
    }
}