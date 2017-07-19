package org.bhoopendra.hibernate.beans;

import java.io.Serializable;
import java.util.Set;

public class Category implements Serializable {
	private static final long serialVersionUID = -764864347811810103L;
	private String name;
	private Category parentCategory;
	private Set<Category> childCategories;
	private Set<Item> items;
	public Set<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childCategories == null) ? 0 : childCategories.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parentCategory == null) ? 0 : parentCategory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (childCategories == null) {
			if (other.childCategories != null)
				return false;
		} else if (!childCategories.equals(other.childCategories))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parentCategory == null) {
			if (other.parentCategory != null)
				return false;
		} else if (!parentCategory.equals(other.parentCategory))
			return false;
		return true;
	}
}
