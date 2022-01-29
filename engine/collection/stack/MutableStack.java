package engine.collection.stack;

import engine.collection.sequence.MutableSequence;
import engine.collection.trait.StackTrait;

public interface MutableStack<T> extends Stack<T>, MutableSequence<T>, StackTrait<T> {

}