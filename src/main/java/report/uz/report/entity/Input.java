package report.uz.report.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp date;

    private Integer factureNumber;

    private String code;

    @ManyToOne
    private WareHouse wareHouse;

    @ManyToOne
    private Supplier supplier;

    @ManyToOne
    private Currency currency;

    public Input() {
    }

    public Input(Long id, Timestamp date, Integer factureNumber, String code, WareHouse wareHouse, Supplier supplier, Currency currency) {
        this.id = id;
        this.date = date;
        this.factureNumber = factureNumber;
        this.code = code;
        this.wareHouse = wareHouse;
        this.supplier = supplier;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Integer getFactureNumber() {
        return factureNumber;
    }

    public void setFactureNumber(Integer factureNumber) {
        this.factureNumber = factureNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
