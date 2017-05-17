package io.restall.monorepo.liba;

import io.restall.monorepo.libb.Util;

public class Service {

    private final Util util;

    public Service(Util util) {
        this.util = util;
    }

    public String message() {
        return util.transform("dlrow");
    }
}
