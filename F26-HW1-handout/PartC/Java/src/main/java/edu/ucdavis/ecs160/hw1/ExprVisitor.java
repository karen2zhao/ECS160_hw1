package edu.ucdavis.ecs160.hw1;

public interface ExprVisitor<R> {
    R visit(Num num);
    R visit(Add add);
    R visit(Sub sub);
    R visit(Mult mult);
    R visit(Div div);
}
