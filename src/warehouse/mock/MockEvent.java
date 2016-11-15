package warehouse.mock;

import warehouse.event.Event;

/*
    MockEvent
    @author: Kane Templeton
    an example of an event that prints text
    using the PrintTask Task
*/

public class MockEvent extends Event {

    public MockEvent(int t, String s) {
        super("Mock Event", t, new PrintTask(s));
    }

}
