package warehouse.mock;

import warehouse.Master;
import warehouse.event.Task;


/*
    PrintTask
    @author: Kane Templeton
    task for the MockEvent class
*/


public class PrintTask implements Task {
    
    private String toPrint;
    
    public PrintTask(String s) {
        toPrint=s;
    }

    /*
        fire()
        @author: Kane Templeton
        print text using Master's output method
    */
    public void fire() {
        Master.output(toPrint);
    }

}
