package org.objectweb.asm;
/* loaded from: gencallgraphv3.jar:asm-9.4.jar:org/objectweb/asm/AnnotationVisitor.class */
public abstract class AnnotationVisitor {
    protected final int api;
    protected AnnotationVisitor av;

    /* JADX INFO: Access modifiers changed from: protected */
    public AnnotationVisitor(int api) {
        this(api, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AnnotationVisitor(int api, AnnotationVisitor annotationVisitor) {
        if (api != 589824 && api != 524288 && api != 458752 && api != 393216 && api != 327680 && api != 262144 && api != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + api);
        }
        if (api == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = api;
        this.av = annotationVisitor;
    }

    public AnnotationVisitor getDelegate() {
        return this.av;
    }

    public void visit(String name, Object value) {
        if (this.av != null) {
            this.av.visit(name, value);
        }
    }

    public void visitEnum(String name, String descriptor, String value) {
        if (this.av != null) {
            this.av.visitEnum(name, descriptor, value);
        }
    }

    public AnnotationVisitor visitAnnotation(String name, String descriptor) {
        if (this.av != null) {
            return this.av.visitAnnotation(name, descriptor);
        }
        return null;
    }

    public AnnotationVisitor visitArray(String name) {
        if (this.av != null) {
            return this.av.visitArray(name);
        }
        return null;
    }

    public void visitEnd() {
        if (this.av != null) {
            this.av.visitEnd();
        }
    }
}