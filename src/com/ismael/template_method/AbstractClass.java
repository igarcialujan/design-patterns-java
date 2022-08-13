package com.ismael.template_method;

// In this example AbstractClass simulates a Task
public abstract class AbstractClass {
    private AuditTrail auditTrail;

    public AbstractClass() {
        auditTrail = new AuditTrail();
    }

    public AbstractClass(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();

        doExecute();
    }

    protected abstract void doExecute();
}
