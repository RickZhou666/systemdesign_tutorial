package com.rick.pattern_06_command.d01_command_object.stereo;

import com.rick.pattern_06_command.d01_command_object.Command;

/**
 * @Author: Rick
 * @Date: 2022/9/11 16:10
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
