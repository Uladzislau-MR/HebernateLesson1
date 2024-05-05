package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name="item")
public class Item {
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person owner;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Person getOwner() {
        return owner;
    }



    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Column(name = "item_name")
    private String itemName;

    public Item() {
    }

    public Item(String itemName) {
        this.itemName = itemName;
    }



    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return
               ", id=" + id +

               ", itemName='" + itemName
               ;
    }
}
