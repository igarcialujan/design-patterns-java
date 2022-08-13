package com.ismael.command.implementation;

public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected VideoEditor videoEditor;
    protected History history;

    public AbstractUndoableCommand(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        // Another application of the template method pattern. This method
        // is defining a template for executing commands.
        doExecute();

        history.push(this);
    }

    protected abstract void doExecute();
}
