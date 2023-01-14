/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package dependency.methodinjection;

import java.util.Map;

/**
 * @author yuyifan
 * @version $Id: CommandManagerWithMethodInjection.java, v 0.1 2023-01-08 10:53 下午 yuyifan Exp $$
 */
public abstract class CommandManagerWithMethodInjection {


    public Object process(Map commandState) {
        // grab a new instance of the appropriate Command
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();
    }

    protected abstract Command createCommand();


}