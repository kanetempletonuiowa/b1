package production.mock;

import production.Master;
import production.Production;
import production.Task;


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
        Production.getMaster().output(toPrint);
    }

}
