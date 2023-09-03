package com.autoclipper.si.infra.db.model;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

@Generated
@EqualsAndHashCode(callSuper=true)
@Table(name = "set_customer")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SetCustomer extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id" , nullable = false)
    private Integer customerId;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false, insertable=false, updatable = false)
    private SetUser userId;
    @ManyToOne
    @JoinColumn(name = "lead_id", referencedColumnName = "lead_id", nullable = false, insertable=false, updatable = false)
    private SetLeads leadId;
    @Column(name = "customer_cpf_cnpj", nullable = false)
    private String customerCpfCnpj;
    @Column(name = "customer_name", nullable = false)
    private String customerName;
    @Column(name = "customer_phone", nullable = false)
    private String customerPhone;
    @Column(name = "customer_address", nullable = false)
    private String customerAddress;
    @Column(name = "customer_cep", nullable = false)
    private String customerCep;
}