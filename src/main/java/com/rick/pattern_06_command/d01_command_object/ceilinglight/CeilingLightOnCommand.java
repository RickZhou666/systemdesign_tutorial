package com.rick.pattern_06_command.d01_command_object.ceilinglight;

import com.rick.pattern_06_command.d01_command_object.Command;

/**
 * @Author: Rick
 * @Date: 2022/9/11 16:13
 */
public class CeilingLightOnCommand implements Command {
    CeilingLight ceilingLight;

    public CeilingLightOnCommand(CeilingLight ceilingLight) {
        this.ceilingLight = ceilingLight;
    }

    @Override
    public void execute() {
        ceilingLight.on();
    }

    @Override
    public void undo() {
        ceilingLight.on();
    }
}
