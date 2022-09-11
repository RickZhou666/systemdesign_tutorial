package com.rick.pattern_06_command.d01_command_object.stereo;

import com.rick.pattern_06_command.d01_command_object.Command;

/**
 * @Author: Rick
 * @Date: 2022/9/11 17:32
 */
public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {

    }
}
