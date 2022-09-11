package com.rick.pattern_06_command.d01_command_object;

import com.rick.pattern_06_command.d01_command_object.light.Light;
import com.rick.pattern_06_command.d01_command_object.light.LightOffCommand;
import com.rick.pattern_06_command.d01_command_object.light.LightOnCommand;

/**
 * @Author: Rick
 * @Date: 2022/9/11 17:06
 */
public class RemoteloaderWithUndo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
    }
}
