package xdean.checker.junit;

import static javax.lang.model.element.Modifier.PUBLIC;
import static javax.lang.model.element.Modifier.STATIC;

import org.junit.Before;

import xdean.annotation.processor.toolkit.annotation.MetaFor;
import xdean.deannotation.checker.CheckMethod;
import xdean.deannotation.checker.CheckModifier;
import xdean.deannotation.checker.CheckType;

@MetaFor(Before.class)
@CheckMethod(modifier = @CheckModifier(require = PUBLIC, forbid = STATIC), returnType = @CheckType(void.class), argCount = 0)
@interface CheckBefore {

}
