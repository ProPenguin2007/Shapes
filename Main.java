

public class Main {
    public static void main(String[] args) {
        int[] numArray = new int[] {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
        int[] numArray2 = new int[] {1,2,3,4,5,6,7,8,9,10};
        
        int[] odd = new int[] {1,3,5,7,9,11,13};
        int[] even = new int[] {2,4,6,8,10};

        int[] test = new int[] {5,2,7,2,8,9,1,3,6};
        // Triangle tri = new Triangle(10,true);
        // Triangle tri2 = new Triangle(10,true);
        // Square sqr = new Square(5,true);
        // Diamond dia = new Diamond(10, true);
        // Shape[] shapes = new Shape[] {tri,sqr,dia,new Diamond(10, true)};
        // for (int i = 0; i < shapes.length; i++) {
        //     if (shapes[i] == dia) {
        //         ((Diamond)shapes[i]).thing();
        //     }
        //     else {
        //         shapes[i].draw();
        //     }
        // }
        // dia.draw();

        //square(100);
        //System.out.println(odd.length + even.length);
        for (int i = 0; i < test.length; i++) {
            int[] newTest = mergeSort(test);
            System.out.println(newTest[i]);
        }
        
        // System.out.println(fibonnacci(7));
        // System.out.println(factorial(3));
        // // System.out.println(binarySearch(numArray,13));
        // for (int i = numArray[0]; i < numArray[numArray.length - 1]; i++) {
        //     System.out.println(binarySearchRecursive(numArray, i, 0, numArray.length - 1));
        // }
        
        
        //System.out.println(Triangle.x);
    }

    public static int fibonnacci(int num) {
        int newNum;
        if (num == 1 || num == 2) {
            return 1;
        }
        else {
            newNum = fibonnacci(num - 2) +(fibonnacci(num - 1));
            return newNum;
        }

    }

    public static int factorial(int num) {
        int newNum;
        if (num == 1) {
            return 1;
        }
        else {
            newNum = factorial(num - 1) * num;
            return newNum;
        }
        
    }

    public static boolean binarySearch(int[] nums, int num) {
        int newPos;
        int start = 0;
        Integer prevStart = null;
        Integer prevEnd = null;
        int end = nums.length - 1;

        if (num == nums[nums.length - 1]) {
            return true;
        }
        while (true) {
            newPos = (start + end)/2;
            if (nums[newPos] == num) {
                return true;
            }
            else if (prevStart != null && start == prevStart) {
                return false;
            }
            else if (prevEnd != null && end == prevEnd) {
                return false;
            }
            else if (nums[newPos] > num) {
                prevEnd = end;
                end = newPos;
                // System.out.println(start);
                // System.out.println(end);
            }
            else {
                // System.out.println("start" + start);
                // System.out.println("end" + end);
                prevStart = start;
                start = newPos;
            }
            
        }
    }


    public static boolean binarySearchRecursive(int[] nums, int num,int start,int end) {
        boolean one = false;
        boolean two = false;
        if (nums[(start + end)/2] == num) {
            return true;
        }
        else if (num == nums[end]) {
            return true;
        }
        else if (num < nums[start] || num > nums[end]) {
            return false;
        }
        else if (start + 1 == end) {
            return false;
        }
        else {
            one = binarySearchRecursive(nums,num,(start + end)/2,end);
            two = binarySearchRecursive(nums,num,start,(start + end)/2 - 1);
            if (one == true || two == true) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void square(int n) {
        for(int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                for(int z = 0; z < n; z++) {
                    for(int c = 0; c < n; c++) {
                        System.out.print("*");
                    }
                }
            }
        }
        System.out.println("");
    }

    public static int[] merge(int[] array, int[] array2) {
        int[] newArray = new int[array.length + array2.length];
        int holdArray = 0;
        int holdArray2 = 0;
        int newArSize = 0;
        while (holdArray < array.length && holdArray2 < array2.length) {
            if (array2[holdArray2] > array[holdArray]) {
                newArray[newArSize] = array[holdArray];
                holdArray++;
                newArSize++;
            }
            else {
                newArray[newArSize] = array2[holdArray2];
                holdArray2++;
                newArSize++;
            }
        }

        while (holdArray < array.length) {
            newArray[newArSize] =  array[holdArray];
            holdArray++;
            newArSize++;
        }

        while (holdArray2 < array2.length) {
            newArray[newArSize] =  array2[holdArray2];
            holdArray2++;
            newArSize++;
        }

        return newArray;
    }

    public static int[] mergeSort(int[] nums) {
        int[] newNums = new int[nums.length/2];
        int newNum2Size; 
        if (nums.length % 2 == 1) {
            newNum2Size = nums.length/2 + 1;
        }
        else {
            newNum2Size = nums.length/2;
        }
        int[] newNums2 = new int[newNum2Size];
        int[] finalNums = new int[nums.length];
        int counter = 0;
        
        if (nums.length % 2 == 1) {
            newNums2[newNums2.length-1] = nums[nums.length-1];
        }
        if (nums.length == 1) {
            return new int[] {nums[0]};
        }
        else if (nums.length == 0) {
            return new int[] {};
        }
        else {
            for (int i = 0; i < nums.length - 1; i += 2) {
                newNums[counter] = nums[i];
                newNums2[counter] = nums[i + 1];
                counter++;
            }
            int [] output = mergeSort(newNums);
            int [] output2 = mergeSort(newNums2);
            
            finalNums = merge(output, output2);
            
            return finalNums;
        }
    }
}
