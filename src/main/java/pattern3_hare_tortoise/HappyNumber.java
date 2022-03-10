package pattern3_hare_tortoise;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n,  fast = n;
        while(true){
            slow = findNext(slow);
            fast = findNext(fast);
            fast = findNext(fast);
            if(slow == fast){
                break;
            }
        }
        return slow == 1;
    }

    private int findNext(int n){
        int result = 0;
        while(n>0){
            result += (n%10)*(n%10);
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        HappyNumber app = new HappyNumber();
        System.out.println(app.isHappy(19));
        System.out.println(app.isHappy(23));
        System.out.println(app.isHappy(12));
        System.out.println(app.isHappy(2));
    }
}
