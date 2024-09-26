 public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    long small=0;
    long large=0;
    for(int i=0;i<arr.size()-1;i++){
        small+=arr.get(i);
    }
     for(int i=1;i<arr.size();i++){
        large+=arr.get(i);
    }
    System.out.print(small+" "+large);
    }

}
