public class DerTeppich {

    public static void rhombs(int m, int n) {
        //m ist die Größe der Raute n die Anzahl der Rauten
        int w = (m*n)+n-1;


        final int mid = (m + 1) / 2;
        int mid1 = (m + 1) / 2;
        int mid2 = (m + 1) / 2;
        for (int a = 1; a <= n; a++) {
            for (int i = 1; i <= m; i++) {
                if (i <= mid) {
                    for (int o = 1; o <= n; o++) {
                        for (int j = 1; j <= m; j++) {
                            if (j < mid1 || j > mid2) {
                                System.out.print(".");
                            } else
                                System.out.print("0");
                        }
                        if(o != n)
                            System.out.print(".");

                    }
                    System.out.println();
                    mid1--;
                    mid2++;
                    if (i == mid) {
                        mid1++;
                        mid2--;
                    }
                } else {

                    mid1++;
                    mid2--;
                    for (int o = 1; o <= n; o++) {
                        for (int k = 1; k <= m; k++) {
                            if (k < mid1 || k > mid2) {
                                System.out.print(".");

                            } else
                                System.out.print("0");

                        }
                        if(o != n)
                            System.out.print(".");

                    }
                    System.out.println();
                }

            }
            for(int h = 0; h < w; h++){
                System.out.print(".");
            }
            System.out.println();
        }


    }
}
