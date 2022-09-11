package com.rick.pattern_06_command.d01_command_object;

import com.rick.pattern_06_command.d01_command_object.ceilingfan.CeilingFan;
import com.rick.pattern_06_command.d01_command_object.ceilingfan.CeilingFanOffCommand;
import com.rick.pattern_06_command.d01_command_object.ceilingfan.CeilingFanOnCommand;
import com.rick.pattern_06_command.d01_command_object.garagedoor.GarageDoor;
import com.rick.pattern_06_command.d01_command_object.garagedoor.GarageDoorDownCommand;
import com.rick.pattern_06_command.d01_command_object.garagedoor.GarageDoorUpCommand;
import com.rick.pattern_06_command.d01_command_object.light.Light;
import com.rick.pattern_06_command.d01_command_object.light.LightOffCommand;
import com.rick.pattern_06_command.d01_command_object.light.LightOnCommand;
import com.rick.pattern_06_command.d01_command_object.stereo.Stereo;
import com.rick.pattern_06_command.d01_command_object.stereo.StereoOffCommand;
import com.rick.pattern_06_command.d01_command_object.stereo.StereoOnWithCDCommand;

/**
 * @Author: Rick
 * @Date: 2022/9/11 16:20
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        // all light command object
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // ceiling fan switcher
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // garage
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        // stereo
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        // ====================================
        // Lambda expression start.....
        // ====================================
        // remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        // remoteControl.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        // remoteControl.setCommand(2, () -> ceilingFan.on(), () -> ceilingFan.off());
        // remoteControl.setCommand(3, () -> garageDoor.up(), () -> garageDoor.down());
        // remoteControl.setCommand(4, stereoOnWithCD, () -> stereo.off());
        // ====================================
        // Lambda expression end.....
        // ====================================

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);

    }
}
