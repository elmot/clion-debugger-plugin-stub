@file:Suppress("UnstableApiUsage", "unused")

package com.jetbrains.clion.bugeater.debugger

import com.intellij.platform.dap.DapClient
import com.intellij.platform.dap.DapEventConsumer
import org.eclipse.lsp4j.debug.*

/**
 * Just an emtpy stub to be sure that DAP implementation is accessible.
 *
 */
class DummyDapUsage {
    
    fun doNoting() {
        DapClient(object : DapEventConsumer {
            override fun initialized() = Unit
            
            override fun capabilities(capabilitiesEventArguments: CapabilitiesEventArguments?) {
            }

            override fun thread(threadEventArguments: ThreadEventArguments?) {
            }

            override fun stopped(stoppedEventArguments: StoppedEventArguments?) {
            }

            override fun continued(continuedEventArguments: ContinuedEventArguments?) {
            }

            override fun terminated(terminatedEventArguments: TerminatedEventArguments?) {
            }

            override fun breakpoint(breakpointEventArguments: BreakpointEventArguments?) {
            }

            override fun process(processEventArguments: ProcessEventArguments?) {
            }

            override fun exited(exitedEventArguments: ExitedEventArguments?) {
            }

            override fun output(outputEventArguments: OutputEventArguments?) {
            }

            override fun progressStart(progressStartEventArguments: ProgressStartEventArguments?) {
            }

            override fun progressUpdate(progressUpdateEventArguments: ProgressUpdateEventArguments?) {
            }

            override fun progressEnd(progressEndEventArguments: ProgressEndEventArguments?) {
            }
        })
    }
}
