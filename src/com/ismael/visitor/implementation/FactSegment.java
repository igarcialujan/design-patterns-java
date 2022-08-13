package com.ismael.visitor.implementation;

public class FactSegment extends Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
