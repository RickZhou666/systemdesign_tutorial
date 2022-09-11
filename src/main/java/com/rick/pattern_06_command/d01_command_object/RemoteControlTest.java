package com.rick.pattern_06_command.d01_command_object;

import com.rick.pattern_06_command.d01_command_object.garagedoor.GarageDoor;
import com.rick.pattern_06_command.d01_command_object.garagedoor.GarageDoorUpCommand;
import com.rick.pattern_06_command.d01_command_object.light.Light;
import com.rick.pattern_06_command.d01_command_object.light.LightOnCommand;

/**
 * @Author: Rick
 * @Date: 2022/9/11 15:21
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("light test");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor("garage test");
        GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);

        remote.setSlot(lightOn);
        remote.buttonWasPressed();

        remote.setSlot(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
