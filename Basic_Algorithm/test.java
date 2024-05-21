public class test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abc");
        System.out.println(stringBuilder.replace(1,3,stringBuilder.substring(0,1)));
    }
}
