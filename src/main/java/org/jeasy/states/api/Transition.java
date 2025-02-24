/*
 * The MIT License
 *
 *  Copyright (c) 2020, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package org.jeasy.states.api;

/**
 * Abstraction for a FSM transition.
 * <strong>Transitions are unique according to source state and triggering event type.</strong>
 *
 * @author Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 */
public interface Transition  {

    /**
     * Return transition name.
     * @return transition name
     */
    String getName();

    /**
     * Return transition source state.
     * @return transition source state
     */
    State getSourceState();

    /**
     * Return transition target state.
     * @return transition target state
     */
    State getTargetState();

    Long getPeriod();

    /**
     * Return fired event type upon which the transition should be made.
     * @return Event type class
     */
    Class<? extends Event> getEventType();

    /**
     * Return event handler to execute when an event is fired.
     * @return transition event handler
     */
    EventHandler getEventHandler();

    final class PeriodicEvent extends AbstractEvent {
        public PeriodicEvent() {
            super("PERIODIC_EVENT");
        }
    }

}
