package io.lumstudio.yohub.common.shell

/**
 * 读取处理器平台
 * Created by helloklf on 2017/6/3.
 */

class PlatformUtils(
    private val keepShellStore: KeepShellStore
) {
    companion object {
        private var cpu: String? = null
    }

    //获取CPU型号，如msm8996
    fun getCPUName(): String {
        if (cpu == null) {
            cpu = PropsUtils(keepShellStore).getProp("ro.board.platform")
        }

        return cpu!!
    }
}
