package b32900_Exp027_InterpretorPatternSQL;

import java.util.List;

interface Expression {
    List<String> interpret(Context ctx);
}