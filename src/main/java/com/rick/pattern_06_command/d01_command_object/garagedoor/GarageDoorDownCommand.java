package com.rick.pattern_06_command.d01_command_object.garagedoor;

import com.rick.pattern_06_command.d01_command_object.Command;

/**
 * @Author: Rick
 * @Date: 2022/9/11 15:28
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
