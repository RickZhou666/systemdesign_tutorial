package com.rick.pattern_06_command.d01_command_object;

/**
 * @Author: Rick
 * @Date: 2022/9/11 15:17
 */
public interface Command {
    public void execute();

    // 与execute形成镜像
    public void undo();
}
