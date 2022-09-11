package com.rick.pattern_06_command.d01_command_object.light;

import com.rick.pattern_06_command.d01_command_object.Command;

/**
 * @Author: Rick
 * @Date: 2022/9/11 15:18
 */
// 这是一条命令，因此要实现Command接口
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
