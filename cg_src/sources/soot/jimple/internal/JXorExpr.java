package soot.jimple.internal;

import soot.Type;
import soot.Unit;
import soot.Value;
import soot.baf.Baf;
import soot.jimple.ExprSwitch;
import soot.jimple.Jimple;
import soot.jimple.XorExpr;
import soot.util.Switch;
/* loaded from: gencallgraphv3.jar:soot/jimple/internal/JXorExpr.class */
public class JXorExpr extends AbstractJimpleIntLongBinopExpr implements XorExpr {
    public JXorExpr(Value op1, Value op2) {
        super(op1, op2);
    }

    @Override // soot.jimple.internal.AbstractBinopExpr, soot.jimple.BinopExpr
    public final String getSymbol() {
        return " ^ ";
    }

    @Override // soot.util.Switchable
    public void apply(Switch sw) {
        ((ExprSwitch) sw).caseXorExpr(this);
    }

    @Override // soot.jimple.internal.AbstractJimpleIntLongBinopExpr
    protected Unit makeBafInst(Type opType) {
        return Baf.v().newXorInst(getOp1().getType());
    }

    @Override // soot.jimple.internal.AbstractBinopExpr, soot.Value
    public Object clone() {
        return new JXorExpr(Jimple.cloneIfNecessary(getOp1()), Jimple.cloneIfNecessary(getOp2()));
    }
}