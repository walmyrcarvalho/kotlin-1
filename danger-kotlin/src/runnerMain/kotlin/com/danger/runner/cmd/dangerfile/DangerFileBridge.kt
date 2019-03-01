package com.danger.runner.cmd.dangerfile

import com.danger.runner.cmd.ICmd
import com.danger.runner.cmd.kscript.KScriptBridge

interface DangerFileBridge {
    val kscript: KScriptBridge
    val cmd: ICmd

    fun compile(): DangerFileBridge
    fun edit()
    fun execute(inputJson: String, outputJson: String)
}