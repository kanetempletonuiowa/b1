package warehouse.mock;

import warehouse.event.Event;

//a basic "event" that prints text

public class MockEvent extends Event {

    public MockEvent(int t, String s) {
        super("Mock Event", t, new PrintTask(s));
    }

}
