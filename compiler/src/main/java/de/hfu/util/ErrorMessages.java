package de.hfu.util;

public final class ErrorMessages {
    private ErrorMessages() {
    }

    public static final String DEF_OR_DEC_MISSING = "Keyword 'Def' Or Forward Decleration Missing";
    public static final String FUN_ALREADY_IMPLEMENTED = "Function Is Already Implemented";
    public static final String RET_VAR_NOT_EXIST = "Variable in Return Statement does not exist";
    public static final String PARAM_DEF_DEC_NAMES = "Function Parameters In Definition and Decleration Have Unequal Names";
    public static final String PARAM_DEF_DEC_COUNT = "Function Declaration And Function Definition Have An Unequal Number Of Parameters";
    public static final String FUN_ALREADY_DEF = "Function Already Defined";
    public static final String PARAM_NEED_UNIQUE_NAME = "Each Parameter Needs An Unique Name";
    public static final String TOO_MANY_DEF_DEC_FUN = "Function Already Defined or Too Many Forward Declerations";
    public static final String FUN_NOT_IMPLEMENTED = "Function %s not implemented or contains errors!";

    public static final String VAR_ALREADY_DEF = "Variable %s is already defined.";
    public static final String VAR_NOT_DEF = "Variable %s is not defined.";
    public static final String FORBIDDEN_VAR_WRITE = "Variable %s can not be written to.";
    public static final String FUN_NOT_DEF = "Function %s is not defined or declared.";
    public static final String FUN_CALL_NOT_ENOUGH_PARAMS = "Call Of Function %s does not have the correct number of parameters.";

    public static final String LOOP_VAR_IN_WHILE = "Using a loop variable inside a while will result in a endless loop";
}
