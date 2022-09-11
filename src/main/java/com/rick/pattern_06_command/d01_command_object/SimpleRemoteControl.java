package com.rick.pattern_06_command.d01_command_object;

/**
 * @Author: Rick
 * @Date: 2022/9/11 15:21
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
