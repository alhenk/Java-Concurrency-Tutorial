package Chapter_7_ExecutorFramework.Part_9_Custom_Executor;

import java.util.concurrent.Executor;

class SimpleExecutor implements Executor {
    public void execute(Runnable r) {
        r.run();
    }
}