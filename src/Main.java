//public class Main {
//    public static void main(String[] args) {
//
//        int n = 3;
//        System.out.println("PATTERN 1");
//        pattern1(n);
//        System.out.println();
//        System.out.println("PATTERN 2");
//        pattern2(n);
//        System.out.println();
//        System.out.println("PATTERN 3");
//        pattern3(n);
//        System.out.println();
//        System.out.println("PATTERN 4");
//        pattern4(n);
//        System.out.println();
//        System.out.println("PATTERN 5");
//        pattern5(n);
//        System.out.println();
//        System.out.println("PATTERN 6");
//        pattern6(5);
//        System.out.println();
//        System.out.println("PATTERN 7");
//        pattern7(5);
//        System.out.println();
//        System.out.println("PATTERN 8");
//        pattern8(5);
//        System.out.println();
//        System.out.println("PATTERN 9");
//        pattern9(5);
//        System.out.println();
//        System.out.println("PATTERN 10");
//        pattern10(5);
//        System.out.println();
//        System.out.println("PATTERN 11");
//        pattern11(10);
//        System.out.println();
//    }
//
//    public static void pattern1(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pattern2(int n) {
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pattern3(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int k = 1; k < n - i; k++) {
//                System.out.print(" _ ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pattern4(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int k = 1; k < n - i; k++) {
//                System.out.print(" _ ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for (int i = n; i > 0; i--) {
//            for (int k = 0; k < n - i; k++) {
//                System.out.print(" _ ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pattern5(int n) {
//        for (int i = 1; i < n; i++) {
//            for (int k = 0; k < n - i; k++) {
//                System.out.print(" - ");
//            }
//            for (int j = 1; j < 2 * i; j++) {
//                System.out.print(" * ");
//            }
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" - ");
//            }
//            System.out.println();
//        }
//        for (int i = n; i > 0; i--) {
//            for (int k = 0; k < n - i; k++) {
//                System.out.print(" - ");
//            }
//            for (int j = 1; j < 2 * i; j++) {
//                System.out.print(" * ");
//            }
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" - ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pattern6(int n) {
//        for (int i = 1; i < n; i++) {
//            helper_pattern6(n,i);
//        }
//        for (int i = n; i > 0; i--) {
//            helper_pattern6(n,i);
//        }
//    }
//
//    public static void helper_pattern6(int n,int i) {
//            for (int k = 0; k < n-i; k++) {
//                System.out.print(" - ");
//            }
//            for (int j = 1; j < 2 * i; j++) {
//                System.out.print(" * ");
//            }
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" - ");
//            }
//            System.out.println();
//    }
//
//    public static void pattern7(int n){
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n; j++) {
//                if(i==1 || j==1|| i==n || j==n){
//                    System.out.print(" * ");
//                }
//                else{
//                    System.out.print(" - ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    public static void pattern8(int n){
//        for (int i = 1; i <n ; i++) {
//            for (int j = 1; j < n-i ; j++) {
//                System.out.print(" - ");
//            }
//            for (int j = 1; j < 2*i ; j++) {
//                System.out.print(" * ");
//            }
//            for (int j = 1; j < n-i; j++) {
//                System.out.print(" - ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pattern9(int n){
//        for (int i = n-1; i >0 ; i--) {
//            for (int j = 1; j < n-i; j++) {
//                System.out.print(" - ");
//            }
//            for (int j = 1; j <2*i ; j++) {
//                System.out.print(" * ");
//            }
//            for (int j = 1; j < n-i; j++) {
//                System.out.print(" - ");
//            }
//        System.out.println();
//        }
//    }
//
//    public static void pattern10(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void pattern11(int n){
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j <=n/2; j++) {
//                if(i==0 || j==0 || i==n/2 || j==n/2){
//                    if(i==0 && (j==0 || j==n/2))
//                       System.out.print("  ");
//                    else
//                        System.out.print(" * ");
//                }
//                else
//                System.out.print("   ");
//            }
//        System.out.println();
//        }
//    }
//}
//
