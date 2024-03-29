package IC.AST;

import java.util.List;

import IC.Symbols.StatementBlockSymbolTable;

/**
 * Statements block AST node.
 * 
 * @author Tovi Almozlino
 */
public class StatementsBlock extends Statement {

	private List<Statement> statements;

	public Object accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public <D, U> U accept(PropagatingVisitor<D, U> v, D context) {
		return v.visit(this, context);
	}

	/**
	 * Constructs a new statements block node.
	 * 
	 * @param line
	 *            Line number where block begins.
	 * @param statements
	 *            List of all statements in block.
	 */
	public StatementsBlock(int line, List<Statement> statements) {
		super(line);
		this.statements = statements;
	}

	public List<Statement> getStatements() {
		return statements;
	}

	StatementBlockSymbolTable symbolTable;

	public StatementBlockSymbolTable getStatementsBlockSymbolTable() {
		return symbolTable;
	}

	public void setBlockSymbolTable(StatementBlockSymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}

}
