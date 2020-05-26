package freemarker.entity;

import java.util.Date;
import java.util.Map;

public class Computer {
    private String sn;//序列号
    private String model;//型号
    private int state;//状态1-在用 2-闲置 3-报废
    private String user;//使用人
    private Date dop;//采购日期
    private Float price;//购买价格
    private Map info;//电脑配置信息

    public Computer() {
    }

    public Computer(String sn, String model, int state, String user, Date dop, Float price, Map info) {
        this.sn = sn;
        this.model = model;
        this.state = state;
        this.user = user;
        this.dop = dop;
        this.price = price;
        this.info = info;
    }

    public String getSn() {
        return sn;
    }

    public Computer setSn(String sn) {
        this.sn = sn;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Computer setModel(String model) {
        this.model = model;
        return this;
    }

    public int getState() {
        return state;
    }

    public Computer setState(int state) {
        this.state = state;
        return this;
    }

    public String getUser() {
        return user;
    }

    public Computer setUser(String user) {
        this.user = user;
        return this;
    }

    public Date getDop() {
        return dop;
    }

    public Computer setDop(Date dop) {
        this.dop = dop;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public Computer setPrice(Float price) {
        this.price = price;
        return this;
    }

    public Map getInfo() {
        return info;
    }

    public Computer setInfo(Map info) {
        this.info = info;
        return this;
    }
}
