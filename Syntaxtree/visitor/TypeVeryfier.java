package Syntaxtree.visitor;

import java.util.Hashtable;

import utils.ErrorMessage;
import java.util.Hashtable;
import java.util.Iterator;

import Symbol.*;
import Syntaxtree.*;



public class TypeVeryfier implements TypeVisitor {
    ErrorMessage error = new ErrorMessage();
    public SymbolTable mainClass;
    public Hashtable<Symbol, SymbolTable> classList;
    public SymbolTable currentClass;
    public MethodTable currentMethod;

    public TypeVeryfier(SymbolTableVisitor v) {
        mainClass = v.mainClass;
        classList = v.classList;
    }


    public Type visit(Program n) {
        // this class have two attributes the main class and a list of class declarations
        // since this attributes do not have a type, we will just call the accept method for each
        // they are not like a Plus expression for exemple that have a explicit type, so this method
        // for this type will return null

        // first gonna look the accept method for the mainClass attribute
        n.m.accept(this);
        
        // Now gonna call the accept method for each element in the list of class declarations
        for (int i = 0; i < n.cl.size(); ++i) {
            n.cl.elementAt(i).accept(this);
        }

        return null;
    };

    public Type visit(MainClass n) {
        // the Main class have 3 attributes: two identifiers and one statement
        // this class do not have a explicit type
        // so the return type of this method it's null
        currentClass = mainClass;
        n.i1.accept(this);
        n.i2.accept(this);
        n.s.accept(this);
        
        return null;
    } ;
    public Type visit(ClassDeclSimple n) {
        currentClass = classList.get(Symbol.symbol(n.i.s));
        // this class have various attributes
        // an identifier, a list of declarations of variables and a list of methods
        // this class do not have a type so this method will return null 

        //calling accept for the identifier
        n.i.accept(this);

        //calling accept for the variables list
        for (int i = 0; i < n.vl.size(); ++i) {
            n.vl.elementAt(i).accept(this);
        }

        //calling accept for the methods list
        for (int i=0; i < n.ml.size(); ++i) {
            currentMethod = currentClass.getMetodos().get(i);
            n.ml.elementAt(i).accept(this);
            currentMethod = null;
        }
        currentClass = null;
        return null;
    };
    public Type visit(ClassDeclExtends n) {
        currentClass = classList.get(Symbol.symbol(n.i.s));
        //this class have many attributes
        // two identifiers, a variables list and a methods list
        // like in the other class declarions methods, since it does not have a type
        // this method will return null

        //calling the accept method for the two identifiers
        n.i.accept(this);
        n.j.accept(this);

        //calling the accept method for the variables declaration
        for (int i = 0; i < n.vl.size();  ++i) {
            n.vl.elementAt(i).accept(this);
        }

        //calling the accept method for the methods list
        for ( int i = 0; i < n.ml.size(); i++ ) {
            for (MethodTable mtd : currentClass.getMetodos()) {
                if (n.ml.elementAt(i).toString().equals(mtd.getNome())) {
                    currentMethod = mtd; currentMethod = currentClass.getMetodos().get(i);
                    n.ml.elementAt(i).accept(this);
                    currentMethod = null;
                }
            }

        }
        currentClass = null;

        return null;
    };
    public Type visit(VarDecl n) {
        // this class have two attributes its identifier and the type of the variable
        // this method will return null
        n.i.accept(this);
        n.t.accept(this);
        return null;
    };
    public Type visit(MethodDecl n) {
        //this classes havy many attributes first we have the type of the method
        // then we have the identifier, formallist, variables declaration list, statement list and an expression

        //calling the accept method for the type
        n.t.accept(this);
        //calling the accept method for the identifier
        n.i.accept(this);
        //calling the accept method for the formal list
        for (int i = 0; i < n.fl.size(); ++i) {
            n.fl.elementAt(i).accept(this);
        }
        //calling accept for the statement list
        for (int i = 0; i < n.sl.size(); ++i) {
            n.sl.elementAt(i).accept(this);
        }
        //calling accept for the variable list 
        for ( int i = 0; i < n.vl.size(); i++ ) {
            n.vl.elementAt(i).accept(this);
        }
        //calling accept for the expression
        n.e.accept(this);

        return null;
    };
    public Type visit(Formal n) {
        // this class have two attributes 
        // a type and an identifier
        // this method will return null since it does not have a type
        n.i.accept(this);
        n.t.accept(this);
        return null;
    };
    public Type visit(IntArrayType n) {
        // since it is a "primitive type" so we will return this type
        return new IntArrayType();
    };
    public Type visit(BooleanType n) {
         // since it is a "primitive type" so we will return this type
        return new BooleanType();
    };
    public Type visit(IntegerType n) {
        // since it is a "primitive type" so we will return this type
        return new IntegerType();
    };
    public Type visit(IdentifierType n) {
        // since it is a "primitive type" so we will return this type
        // but here we will return the n it self
        return n;
    };
    public Type visit(Block n) {
        //this class have a statement list
        for(int i = 0; i < n.sl.size(); ++i) {
            n.sl.elementAt(i).accept(this);
        } 
        return null;
    };
    public Type visit(If n) {
        // in this class we have one expression and two statement
        // we need to verify if the expression return a boolean, beacause this expression
        // is the codition of the if statement
        // but the if it self will return null in this method
        if (!(n.e.accept(this) instanceof BooleanType)) {
            error.showErrorMessage("The If codition must be of type Boolean");
        }
        // now we gonna call the accept method for the two statements of the if
        n.s1.accept(this);
        n.s2.accept(this);
        return null;
    };
    public Type visit(While n) {
        // this case is similar to the if method
        // we have one expression that must be a boolean
        // and we have one statement
        // but like in the case of the if, the while it self will return null
        // verifying the type of the expression
        if (!(n.e.accept(this) instanceof BooleanType)) {
            error.showErrorMessage("The While codition must be of type Boolean");
        }
        // calling the accept method for the statement
        n.s.accept(this);
        return null;
    };
    public Type visit(Print n) {
        // in this class we have an expression that will be printed
        // so we just need to call the accept method for this expression and verify if the type of the expression
        // is a type "printable"
        // and the return type of this method will be null, because the Print it self does not have a type
        Type variableToPrint_type = n.e.accept(this);
        if (!error.is_there_a_erro) 
            if (!(variableToPrint_type instanceof IntegerType || variableToPrint_type instanceof BooleanType || variableToPrint_type instanceof IdentifierType)) {
                error.showErrorMessage("Print received invalid type value");
            }
        return null;
    };
    public Type visit(Assign n) {
        // this classe have an identifier and an expression
        Type idType  = n.i.accept(this);
        Type expType = n.e.accept(this);
        String nomeId = n.i.s;
        try {
            if (!(expType.toString().equals(idType.toString()))) {
                error.showErrorMessage("Variable type is not the same as the assigned type: variable.");
            }

        } catch (Exception e) {
            System.out.println(" name: " + nomeId);
        }

        return null;
    };
    public Type visit(ArrayAssign n) {
        Type idType = n.i.accept(this);
        if (!idType.toString().equals("int[]")) {
            error.showErrorMessage("Identifier must be of type 'int[]'.");
        }
        if(!(n.e1.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Array position must be of type int.");
        } else if(!(n.e2.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to be inserted into the array must be of type 'int'.");
        }
        return null;
    };
    public Type visit(And n) {
        // this class is a simple and operation
        // so we need to verify if the two expressions are of type boolean
        if(!(n.e1.accept(this) instanceof BooleanType)) {
            error.showErrorMessage("Value to the left of the '&&' operation must be of type 'boolean'.");
        } else if(!(n.e2.accept(this) instanceof BooleanType)) {
            error.showErrorMessage("Value to the right of the '&&' operation must be of type 'boolean'.");
        }
        return new BooleanType();
    };
    public Type visit(LessThan n) {
        // this class is a simple less then operation
        // so we need to verify if the two expressions are of type int
        if(!(n.e1.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to the left of the '<' operation must be of type 'Integer'.");
        } else if(!(n.e2.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to the right of the '<' operation must be of type 'Integer'.");
        }
        return new BooleanType();
    };
    public Type visit(Plus n) {
        // this class is a simple plus operation
        // so we need to verify if the two expressions are of type int
        if(!(n.e1.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to the left of the '+' operation must be of type 'Integer'.");
        } else if(!(n.e2.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to the right of the '+' operation must be of type 'Integer'.");
        }
        return new IntegerType();
    };
    public Type visit(Minus n) {
        // this class is a simple Minus operation
        // so we need to verify if the two expressions are of type int
        if(!(n.e1.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to the left of the '-' operation must be of type 'Integer'.");
        } else if(!(n.e2.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to the right of the '-' operation must be of type 'Integer'.");
        }
        return new IntegerType();
    };
    public Type visit(Times n) {
        // this class is a simple Times operation
        // so we need to verify if the two expressions are of type int
        if(!(n.e1.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to the left of the '*' operation must be of type 'Integer'.");
        } else if(!(n.e2.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Value to the right of the '*' operation must be of type 'Integer'.");
        }
        return new IntegerType();
    };
    public Type visit(ArrayLookup n) {
        Type typeOne = n.e1.accept(this); 
        Type typeTwo = n.e2.accept(this);
        if(!(typeOne instanceof IntArrayType)) {
            error.showErrorMessage("Invalid identifier ArrayLookup.");
        }
        if(!(typeTwo instanceof IntegerType)) {
            error.showErrorMessage("Array position must be of type 'int'.");
        }
        return new IntegerType();
    };
    public Type visit(ArrayLength n) {
        Type type = n.e.accept(this);
        if(!(type instanceof IntArrayType)) {
            error.showErrorMessage("Invalid identifier ArrayLength.");
        }
        return new IntegerType();
    };
    public Type visit(Call n) {
        if (!(n.e.accept(this) instanceof IdentifierType)) {
            error.showErrorMessage("The expression is not an identifier");
        }
        Type objIdType = n.e.accept(this);
        SymbolTable objClassTable = classList.get(Symbol.symbol(objIdType.toString()));
        if (objClassTable == null) {
            error.showErrorMessage("The class was not declared.");
            return null;
        }
        MethodTable objMethodTable = null;
        for (MethodTable m : objClassTable.getMetodos()) {
            if (m.getNome().equals(n.i.s)) {
                objMethodTable = m;
                break;
            }
        }
        if (objMethodTable == null) {
            error.showErrorMessage("The method does not exist in the class.");
            return null;
        }
        if (n.el.size() != objMethodTable.getParametros().size()) {
            error.showErrorMessage("Incorrect number of parameters; were given as expected.");
      
        }
        for ( int i = 0; i < n.el.size(); i++ ) {
            Type paramType = n.el.elementAt(i).accept(this);
            String currentType = "";
            if (i < objMethodTable.getParametros().size()) {
                currentType = objMethodTable.getParametros().get(i).getTipo();
            }
            if (!currentType.equals(paramType.toString()) && currentType != "") {
                error.showErrorMessage("Parameter is not of the type." );
            }
        }
        if (objMethodTable.getTipo().equals("int")) {
            return new IntegerType();
        } else if (objMethodTable.getTipo().equals("int[]")) {
            return new IntArrayType();
        } else if (objMethodTable.getTipo().equals("boolean")) {
            return new BooleanType();
        } else {
            return new IdentifierType(objMethodTable.getTipo());
        } 
    };
    public Type visit(IntegerLiteral n) {
        return new IntegerType();
    };
    public Type visit(True n) {
        return new BooleanType();
    };
    public Type visit(False n) {
        return new BooleanType();
    };
    public Type visit(IdentifierExp n) {
        Identifier iaux = new Identifier(n.s);
        return iaux.accept(this);
    };
    public Type visit(This n) {
        return new IdentifierType(currentClass.getNome());
    };
    public Type visit(NewArray n) {
        if (!(n.e.accept(this) instanceof IntegerType)) {
            error.showErrorMessage("Expression within the new array must be of type 'int'.");
        }
        return new IntArrayType();
    };
    public Type visit(NewObject n) {
       Type objType = n.i.accept(this);
        boolean classExists = false;
        Iterator<Symbol> iterator = classList.keySet().iterator();
        while (iterator.hasNext()) {
            SymbolTable iteratorClass = classList.get(iterator.next());
            if (iteratorClass.getNome().equals(objType.toString())) {
                classExists = true;
                break;
            }
        }
        if (!classExists) {
            error.showErrorMessage("Object could not be created because the class was not declared.");
        }
        if (!(objType instanceof IdentifierType)) {
            error.showErrorMessage("Object identifier is invalid.");
        }
        return new IdentifierType(objType.toString());
    };
    public Type visit(Not n) {
        if (!(n.e.accept(this) instanceof BooleanType)) {
            error.showErrorMessage("Expression after 'Not' must be of type 'boolean'.");
        }
        return new BooleanType();
    };
    public Type visit(Identifier n) {
        String id = n.s;
        if (mainClass.mainArgs.get(0).equals(n.s)) {
            return null; 
        }
        Field field = null;
        if (currentMethod != null && currentMethod.containsInParams(id)) {
            for (int i = 0; i < currentMethod.getParametros().size(); ++i) {
                if (id.equals(currentMethod.getParametros().get(i).getNome())) {
                    field = currentMethod.getParametros().get(i);
                    break;
                }
            }
        } else if (currentMethod != null && currentMethod.containsInLocals(id)) {
            for (int i = 0; i < currentMethod.getVlocais().size(); ++i) {
                if (id.equals(currentMethod.getVlocais().get(i).getNome())) {
                    field = currentMethod.getVlocais().get(i);
                    break;
                }
            }
        } else {
            boolean foundAttribute = false;
            boolean foundClass = false;
            if (currentClass != null) {
                for (int i = 0; i < currentClass.getAtributos().size(); ++i) {
                    if (id.equals(currentClass.getAtributos().get(i).getNome())) {
                        field = currentClass.getAtributos().get(i);
                        foundAttribute = true;
                        break;
                    }
                }
                if (!foundAttribute) {
                    for (int i = 0; i < currentClass.getMetodos().size(); ++i) {
                        if (id.equals(currentClass.getMetodos().get(i).getNome())) {
                            field = currentClass.getMetodos().get(i);
                            foundAttribute = true;
                            break;
                        }
                    }
                }
            }
            if (!foundAttribute) {
                if (mainClass.getNome().equals(id)) {
                    field = new Field(Symbol.symbol(id), id);
                    foundClass = true;
                } else {
                    Iterator<Symbol> classIt = classList.keySet().iterator();
                    while (classIt.hasNext()) {
                        SymbolTable iteratorClass = classList.get(classIt.next());
                        if (iteratorClass.getNome().equals(id)) {
                            field = new Field(Symbol.symbol(id), id);
                            foundClass = true;
                            break;
                        }
                    }
                }
                if (!foundClass) {
                    error.showErrorMessage("Identifier was not declared in the scope");
                    return new IdentifierType(n.s);
                }
            }
        }
        return field.getTipo().equals("int[]") ? new IntArrayType() :
                field.getTipo().equals("int") ? new IntegerType() :
                field.getTipo().equals("boolean") ? new BooleanType() :
                new IdentifierType(field.getTipo());
        
    };
}
