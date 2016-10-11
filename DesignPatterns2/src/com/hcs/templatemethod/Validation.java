package com.hcs.templatemethod;

public abstract class Validation {

    protected abstract boolean check(char c);

    public final boolean validate(String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (!this.check(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
