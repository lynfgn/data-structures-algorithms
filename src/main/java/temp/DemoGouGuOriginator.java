package temp;

/**
 * 计算勾股元祖
 * @date 2020/3/119:53
 */
public class DemoGouGuOriginator {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                for (int z = j; z < 1000; z++) {
                    if (i * i + j * j == z * z && i + j + z <= 1000) {
                        System.out.println(i + " " + j + " " + z);
                    }
                }
            }
        }
    }
}
