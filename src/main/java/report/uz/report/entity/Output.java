package report.uz.report.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp date;

    private Integer factureNumber;

    private String code;

    @ManyToOne
    private WareHouse wareHouse;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Currency currency;

    public Output() {
    }

    public Output(Long id, Timestamp date, Integer factureNumber, String code, WareHouse wareHouse, Client client, Currency currency) {
        this.id = id;
        this.date = date;
        this.factureNumber = factureNumber;
        this.code = code;
        this.wareHouse = wareHouse;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
