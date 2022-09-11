package com.rick.pattern_06_command.d01_command_object;

import com.rick.pattern_06_command.d01_command_object.hottub.Hottub;
import com.rick.pattern_06_command.d01_command_object.hottub.HottubOffCommand;
import com.rick.pattern_06_command.d01_command_object.hottub.HottubOnCommand;
import com.rick.pattern_06_command.d01_command_object.light.Light;
import com.rick.pattern_06_command.d01_command_object.light.LightOffCommand;
import com.rick.pattern_06_command.d01_command_object.light.LightOnCommand;
import com.rick.pattern_06_command.d01_command_object.macro.MacroCommand;
import com.rick.pattern_06_command.d01_command_object.stereo.Stereo;
import com.rick.pattern_06_command.d01_command_object.stereo.StereoOffCommand;
import com.rick.pattern_06_command.d01_command_object.stereo.StereoOnCommand;
import com.rick.pattern_06_command.d01_command_object.tv.TV;
import com.rick.pattern_06_command.d01_command_object.tv.TVOffCommand;
import com.rick.pattern_06_command.d01_command_object.tv.TVOnCommand;

/**
 * @Author: Rick
 * @Date: 2022/9/11 17:28
 */
public class RemoteLoaderMacro {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);


        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);


        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("---- Pushing Macro on ----");
        remoteControl.onButtonWasPressed(0);

        System.out.println("---- Pushing Macro off ----");
        remoteControl.offButtonWasPressed(0);

    }
}
