grammar newSPC;

ctl_spec : 'SPEC' ctl_expr;

ctl_expr      : var_id
              | number
              | subrange
              | FALSEEXP
              | TRUEEXP
              ;

