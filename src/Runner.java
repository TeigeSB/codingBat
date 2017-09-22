
import java.util.*;

public class Runner {

    //your main containing tests and output
    public void main(String[] args) {

        System.out.println(stringTimes("Hi", 2));
        System.out.println(helloName("Jim"));
        System.out.println(start1(start1, start2));
        System.out.println(specialEleven(33));
        System.out.println(closeFar(1, 4 ,5));
        System.out.println(xyzThere("abc.xyzxyz"));
        System.out.println(countEvens(countEven));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
        System.out.println(fix34(red));
    }


    //your codingbat method here - must match
    // the method name from codingbat

    int[] red = new int[] {1,2,3,4,4,3,0};
    int[] start1 = new int[] {1, 2, 3};
    int[] start2 = new int[] {1, 3};
    int[] countEven = new int[] {2, 1, 2, 3, 4};


    public String stringTimes(String str, int n) {
        String newStr= "";
        for(int i = 0; i < n; i++) {

            newStr += str;

        }

        return newStr;

    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public int start1(int[] a, int[] b) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 1) {
                count += 1;
            }

        }

        for (int i = 0; i < b.length; i++) {

            if (b[i] == 1) {
                count += 1;
            }

        }

        return count;
    }

    public boolean specialEleven(int n) {
        boolean isEleven;

        if (n % 11 == 0) {

            isEleven = true;

        } else if (n % 11 == 1) {

            isEleven = true;

        } else {

            isEleven = false;

        }

        return isEleven;
    }

    public boolean closeFar(int a, int b, int c) {

        if (Math.abs(a - b) <= 1 && Math.abs(a - c) > 1 && Math.abs(b - c) > 1) {

            return true;

        } else if (Math.abs(b - c) <= 1 && Math.abs(b - a) > 1 && Math.abs(c - a) > 1) {

            return true;

        } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) > 1 && Math.abs(b - c) > 1) {

            return true;

        } else {

            return false;

        }


    }

    public boolean xyzThere(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.contains("xyz") == true) {

                if (str.indexOf(".") == -1 && str.contains("xyz") == true) {

                    return true;

                } else if (str.lastIndexOf(".") == str.lastIndexOf("xyz") - 1) {

                    return false;

                } else {

                    return true;

                }
            }
        }

        return false;

    }

    public int countEvens(int[] nums) {

        int even = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] % 2 == 0) {

                even++;

            }

        }

        return even;

    }

    public boolean equalIsNot(String str) {

        int n = str.length();
        int not = 0;
        int is = 0;

        for (int i = 0; i < n; i++) {

            if (i < n - 1) {

                String newStr = str.substring(i,i+2);

                if (newStr.equals("is")) {

                    is++;

                }

            }
            if (i < n - 2) {

                String newStr2 = str.substring(i,i+3);

                if (newStr2.equals("not")) {

                    not++;

                }


            }

        }

        if (not == is) {

            return true;

        } else {

            return false;

        }
    }

    public int[] fix34(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 3) {

                int saved = nums[i + 1];
                nums[i + 1] = 4;

                for (int p = i + 2; p < nums.length; p++) {

                    if (nums[p] == 4) {

                        nums[p] = saved;

                    }

                }

            }

        }

        return nums;

    }





    // next codingbat method here


}
