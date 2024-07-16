package report.uz.report.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer amount;

    private Integer price;

    private Date expireDate;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Input input;

    public InputProduct() {
    }

    public InputProduct(Long id, Integer amount, Integer price, Date expireDate, Product product, Input input) {
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.expireDate = expireDate;
        this.product = product;
        this.input = input;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDAte(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }
}
