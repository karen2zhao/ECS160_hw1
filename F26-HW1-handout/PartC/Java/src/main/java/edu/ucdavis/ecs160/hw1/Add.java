package edu.ucdavis.ecs160.hw1;

public class Add extends BinaryExpr {
    public Add(Expr left, Expr right) {
        super(left, right);
    }

    @Override
    public <R> R accept(ExprVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
