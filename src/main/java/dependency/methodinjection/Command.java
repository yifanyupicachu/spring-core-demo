/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency.methodinjection;

import java.util.Map;

/**
 * @author yuyifan
 * @version $Id: Command.java, v 0.1 2023-01-08 10:35 下午 yuyifan Exp $$
 */
public class Command {

    private Map state;

    public Object execute() {
        System.out.println("Command#execute");
        return "123";
    }

    /**
     * Getter method for property state.
     *
     * @return property value of state
     */
    public Map getState() {
        return state;
    }

    /**
     * Setter method for property state.
     *
     * @param state value to be assigned to property state
     */
    public void setState(Map state) {
        this.state = state;
    }
}