package org.workshop.framework;

public interface Scenario<In, Out> {
    Out run(In in);
}
