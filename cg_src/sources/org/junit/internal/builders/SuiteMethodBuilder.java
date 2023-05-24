package org.junit.internal.builders;

import org.junit.internal.runners.SuiteMethod;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;
/* JADX WARN: Classes with same name are omitted:
  gencallgraphv3.jar:junit-4.13.2.jar:org/junit/internal/builders/SuiteMethodBuilder.class
 */
/* loaded from: gencallgraphv3.jar:org.junit_4.13.2.v20211018-1956.jar:org/junit/internal/builders/SuiteMethodBuilder.class */
public class SuiteMethodBuilder extends RunnerBuilder {
    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> each) throws Throwable {
        if (hasSuiteMethod(each)) {
            return new SuiteMethod(each);
        }
        return null;
    }

    public boolean hasSuiteMethod(Class<?> testClass) {
        try {
            testClass.getMethod("suite", new Class[0]);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }
}