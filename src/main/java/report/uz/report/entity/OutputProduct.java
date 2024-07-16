package report.uz.report.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class OutputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer amount;

    private Integer price;

    private Date expireDate;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Output output;

    public OutputProduct() {
    }

    public OutputProduct(Long id, Integer amount, Integer price, Date expireDate, Product product, Output output) {
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.expireDate = expireDate;
        this.product = product;
        this.output = output;
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

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }
}
