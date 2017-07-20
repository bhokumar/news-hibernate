package org.bhoopendra.hibernate.conf;

import org.hibernate.cfg.NamingStrategy;
import org.hibernate.internal.util.StringHelper;

public class NEWSNamingStrategy implements NamingStrategy {

	@Override
	public String classToTableName(String className) {
		return tableName(
				StringHelper.unqualify(className).toUpperCase() );
	}

	@Override
	public String propertyToColumnName(String propertyName) {
		return propertyName.toUpperCase();
	}

	@Override
	public String tableName(String tableName) {
		return "NEWS_"+tableName;
	}

	@Override
	public String columnName(String columnName) {
		return columnName.toUpperCase();
	}

	@Override
	public String collectionTableName(String ownerEntity, String ownerEntityTable, String associatedEntity,
			String associatedEntityTable, String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String joinKeyColumnName(String joinedColumn, String joinedTable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String foreignKeyColumnName(String propertyName, String propertyEntityName, String propertyTableName,
			String referencedColumnName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logicalColumnName(String columnName, String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logicalCollectionTableName(String tableName, String ownerEntityTable, String associatedEntityTable,
			String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logicalCollectionColumnName(String columnName, String propertyName, String referencedColumn) {
		// TODO Auto-generated method stub
		return null;
	}

}
