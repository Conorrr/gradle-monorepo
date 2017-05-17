package io.restall.monorepo.libb;

public class Service {

    private final Util util;

    public Service(Util util) {
        this.util = util;
    }

    public String message() {
        return util.transform("dlrow");
    }
}
