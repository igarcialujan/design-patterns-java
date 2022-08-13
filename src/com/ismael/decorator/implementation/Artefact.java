package com.ismael.decorator.implementation;

public class Artefact implements AbstractArtefact {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
