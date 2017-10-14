package com.home.bar.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Domain object to represent a <i>product</i> available on the menu in the bar.
 * <p>
 * All products must have a primary <i>item</>.
 * Additionally the products can have a {@link Set} of add on <i>item</i>s.
 * <p>
 * Ex: Possible products can be:
 * 1. Beer(primary item) with Ice(add ons)
 * 2. Beer(primary item) (no add ons)
 * 3. Whisky(primary item) with Ice(add ons)
 * 4. Vodka(primary item) with Sprite, Lime, Ice(add ons)
 * <p>
 * <p>
 * There is one to many relationship between the {@link #primaryItem} and product, which means:
 * a product will have exactly one item which will act as primary item. However, a given item can be a primary item for many products.
 * <p>
 * As stated in the explanation, each example product above have exactly one primary item.
 * But a given item, <i>beer</i> in this case, is serving as primary item for many products (Product# 1 and Product# 2).
 * <p>
 * <p>
 * There is many to many relationship between {@link #addOnItems} and product, which means:
 * A given product can have many items as add ons, and a given item can serve as add on for many products.
 * <p>
 * As stated in the explanation,
 * a given example product above have many add ons like <i>sprite</i>, <i>lime</i> and <i>ice</i> for Product# 4,
 * and a given item is serving as add on for many products, like <i>ice</i> in Product# 1, Product# 2, and Product# 4
 *
 * @see Item
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @ManyToOne
    private Item primaryItem;

    @ManyToMany
    private Set<Item> addOnItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getPrimaryItem() {
        return primaryItem;
    }

    public void setPrimaryItem(Item primaryItem) {
        this.primaryItem = primaryItem;
    }

    public Set<Item> getAddOnItems() {
        return addOnItems;
    }

    public void setAddOnItems(Set<Item> addOnItems) {
        this.addOnItems = addOnItems;
    }
}
