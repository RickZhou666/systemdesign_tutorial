package com.rick.pattern_06_command.d01_command_object;

/**
 * @Author: Rick
 * @Date: 2022/9/11 16:01
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        // 绕开检查，分配一个noCommand
        // if (onCommands[slot] != null) {
        //     onCommands[slot].execute();
        // }
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];

    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + "\t\t\t\t" + offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommand.getClass().getSimpleName() + "\n");
        return stringBuffer.toString();
    }
}
