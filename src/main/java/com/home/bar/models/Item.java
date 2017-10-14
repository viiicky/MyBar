package com.home.bar.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Domain object to represent an <i>item</i>.
 * Ex: Whisky, Ice, Beer, Vodka, Sprite, Lime etc.
 * <p>
 * Note: For current use case, no need of `category` column. In future if needed, there can be a different table `Category`,
 * and a new column in `Item` table can be introduced which references the categories from Category table.
 */
@Entity
public class Item {

    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
