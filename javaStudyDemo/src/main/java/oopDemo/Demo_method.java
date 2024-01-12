package oopDemo;
public class Demo_method {
    public static int getSum(){
        int sum =0;
        for(int i=1;i<=10;i++){
            sum +=i;
        }
        return sum;
    }

    public static String getStr(String a, String b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println(getStr("tom ", "come here"));
    }
}


