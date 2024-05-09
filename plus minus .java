  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float p=0;
    float n=0;
    float z=0;
    float s=arr.size();
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)>0)
        p++;
        else if(arr.get(i)<0)
        n++;
        else
        z++;
    }
    float a=p/s;
    float b=n/s;
    float c=z/s;
    System.out.println(a);
        System.out.println(b);
    System.out.println(c);
    }
