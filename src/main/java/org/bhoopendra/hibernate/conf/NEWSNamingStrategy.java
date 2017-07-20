package org.bhoopendra.hibernate.conf;

import org.hibernate.internal.util.StringHelper;

public class NEWSNamingStrategy {

	public String classToTableName(String className) {
		return tableName(StringHelper.unqualify(className).toUpperCase());
	}

	public String propertyToColumnName(String propertyName) {
		return propertyName.toUpperCase();
	}

	public String tableName(String tableName) {
		return "NEWS_" + tableName;
	}

	public String columnName(String columnName) {
		return columnName.toUpperCase();
	}

	public String collectionTableName(String ownerEntity, String ownerEntityTable, String associatedEntity,
			String associatedEntityTable, String propertyName) {
		return null;
	}

	public String joinKeyColumnName(String joinedColumn, String joinedTable) {
		return null;
	}

	public String foreignKeyColumnName(String propertyName, String propertyEntityName, String propertyTableName,
			String referencedColumnName) {
		return null;
	}

	public String logicalColumnName(String columnName, String propertyName) {
		return null;
	}

	public String logicalCollectionTableName(String tableName, String ownerEntityTable, String associatedEntityTable,
			String propertyName) {
		return null;
	}

	public String logicalCollectionColumnName(String columnName, String propertyName, String referencedColumn) {
		return null;
	}

}
