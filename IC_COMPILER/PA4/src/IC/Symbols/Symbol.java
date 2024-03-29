package IC.Symbols;

public class Symbol {
	String name;
	// Field, Method, Local Variable, Etc
	SymbolKind kind;
	// int, string, etc
	int symbolTypeId;
	int lineNumber;

	// In case this symbol has a scope (class, method, etc), this is it
	private SymbolTable scope;

	public Symbol(String name, SymbolKind kind, int symbolTypeIndex,
			int lineNumber) {
		this.name = name;
		this.kind = kind;
		this.symbolTypeId = symbolTypeIndex;
		this.lineNumber = lineNumber;
	}

	public int getTypeId() {
		return symbolTypeId;
	}

	public SymbolKind getKind() {
		return kind;
	}

	public String getName() {
		return name;
	}

	public SymbolTable getScope() {
		return scope;
	}

	public void setScope(SymbolTable scope) {
		this.scope = scope;

	}
}
