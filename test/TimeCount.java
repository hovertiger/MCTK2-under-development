/**
 * 简单时间记数
 */
public class TimeCount {
    String name;
    Long beginTime, endTime;

    /**
     * 构造函数
     * @param name 主题
     */
    public TimeCount(String name) {
        if (name == null || name == "")
            name = "unnamed";
        this.name = name;
    }

    /**
     * 标记开始时间
     */
    public TimeCount markBegin() {
        this.beginTime = System.currentTimeMillis();
        return this;
    }

    /**
     * 标记结束时间
     */
    public TimeCount markEnd() {
        this.endTime = System.currentTimeMillis();
        return this;
    }


    /**
     * 打印耗时
     */
    public void print() {
        if (beginTime == null) {
            System.out.println(String.format("[%s]:please mark begin！", this.name));
            return;
        }
        if (endTime == null) {
            System.out.println(String.format("[%s]:please mark end)！", this.name));
            return;
        }
        long useTime = endTime - beginTime;
        System.out.println(String.format("[%s]use time:%s seconds", this.name, ((useTime / 1000) + "." + (useTime % 1000))));
    }
}