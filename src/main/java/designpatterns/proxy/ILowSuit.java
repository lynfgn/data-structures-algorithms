package designpatterns.proxy;

/**
 * @author zcj
 * @date 2020/1/615:54
 */
public interface ILowSuit {
    /**
     * 提起诉讼
     * @param proof 证据
     */
    void submit(String proof);

    /**
     * 法院裁决
     */
    void defend();
}
